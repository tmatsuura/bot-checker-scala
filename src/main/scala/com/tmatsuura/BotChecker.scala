package com.tmatsuura

import java.io.File
import kantan.csv._
import kantan.csv.ops._

case class KnownBot(
    ua: String,
    isActive: Short,
    exceptionPattern: String,
    extraFlag1: Short,
    extraFlag2: Short,
    startOfString: Short,
    inactiveData: String,
)

class BotChecker private (checkers: Seq[String => Boolean]) {
  def isBot(ua: String): Boolean =
    checkers.exists(f => f(ua))
}

object BotChecker {
  implicit val knownBotDecoder: RowDecoder[KnownBot] =
    RowDecoder.decoder(0, 1, 2, 3, 4, 5, 6)(KnownBot.apply)

  private val occurAtStart = (x: String) =>
    (y: String) => y.toLowerCase startsWith x.toLowerCase
  private val appearAnywhere = (x: String) =>
    (y: String) => y.toLowerCase contains x.toLowerCase

  def from(file: File): BotChecker = {
    val checkers = file
      .asCsvReader[KnownBot](rfc.withCellSeparator('|'))
      .collect { case Right(a) => a }
      .filter(p => p.isActive == 1)
      .map(b =>
        b.startOfString match {
          case 1 => occurAtStart(b.ua)
          case 0 => appearAnywhere(b.ua)
        },
      )
      .toSeq
    new BotChecker(checkers)
  }

  def from(csv: String): BotChecker = {
    val checkers = csv
      .asCsvReader[KnownBot](rfc.withCellSeparator('|'))
      .collect { case Right(a) => a }
      .filter(p => p.isActive == 1)
      .map(b =>
        b.startOfString match {
          case 1 => occurAtStart(b.ua)
          case 0 => appearAnywhere(b.ua)
        },
      )
      .toSeq
    new BotChecker(checkers)
  }
}
