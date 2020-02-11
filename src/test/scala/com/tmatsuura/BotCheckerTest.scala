package com.tmatsuura

import org.scalatest.matchers.should.Matchers
import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatest.propspec.AnyPropSpec

class BotCheckerTest
    extends AnyPropSpec
    with TableDrivenPropertyChecks
    with Matchers {
  val botChecker = BotChecker.from(
    """1job|1||0|0|0
      |abilon|1||0|0|0
      |abot|1||0|0|0
      |accoona-ai-agent|1||0|0|0
      |agentname|1||0|1|0
      |aipbot|1||0|0|0
      |aladdino|1||0|0|0
      |apachebench|1||0|0|0
      |aport|1||0|2|0
      |appie|1||0|0|0
      |applesyndication|1||0|0|0
      |arachnia|1||0|0|0
      |aranha|1||0|0|0
      |ask jeeves|1||0|0|0
      |ask+jeeves|1||0|0|0
      |asterias|1||0|0|0
      |atomz|1||0|0|0
      |avantgo|1||0|2|0
      |b2w|1||0|0|0
      |backweb|1||0|1|0
      |baidu|1||0|0|0
      |becomebot|1||0|0|0
      |BIMBO|1||0|1|0
      |blitzbot|1||0|0|0
      |bloglines|1||0|0|0
      |bordermanager|1||0|2|0
      |bumblebee|1||0|2|0
      |CE-Preload|1||0|1|0
      |change detection|1||0|0|0
      |change+detection|1||0|0|0
      |changedetection|1||0|2|0
      |charlotte|1||0|1|0
      |check_http|1||0|0|0
      |chkd|1||0|0|0
      |coast|1||0|0|0
      |combine|1||0|0|0
      |contype|1||0|0|0
      |convera|1||0|0|0
      |cosmos|1||0|0|0
      |crawler|1||0|2|0
      |crescent|1||0|1|0
      |curl|1||0|0|0
      |dialer|1||0|1|0
      |Download Ninja|1||1|1|0
      |Download+Ninja|1||1|1|0
      |dts agent|1||0|2|0
      |dts+agent|1||0|2|0
      |emailsiphon|1||0|0|0
      |eNews Creator|1||0|1|0
      |eNews+Creator|1||0|1|0
      |favorg|1||0|0|0
      |feedonfeeds|1||0|0|0
      |fetch|1||0|2|0
      |Firehunter|1||0|1|0
      |flashget|1||0|0|0
      |frontier|1||0|2|0
      |geniebot|1||0|0|0
      |getright|1||0|1|0
      |go!zilla|1||0|1|0
      |golem|1||0|1|0
      |gomezagent|1||0|2|0
      |googlebot|1||0|2|0
      |grabber|1||0|0|0
      |grub|1||0|0|0
      |gulliver|1||0|0|0
      |harvest|1||0|1|0
      |htdig|1||0|0|0
      |httrack|1||0|1|0
      |ia_archive|1||0|0|0
      |ibot|1||0|0|0
      |ichiro|1||0|0|0
      |ideare|1||0|0|0
      |IEAutoDiscovery|1||0|0|0
      |iltrovatore-setaccio|1||0|0|0
      |indy library|1||0|2|0
      |indy+library|1||0|2|0
      |infolink|1||0|1|0
      |inktomi search|1||0|0|0
      |inktomi+search|1||0|0|0
      |internet ninja|1||1|1|0
      |internet+ninja|1||1|1|0
      |internetseer|1||0|0|0
      |ipsentry|1||0|0|0
      |irlbot|1||0|0|0
      |isilo|1||0|0|0
      |jakarta|1||0|0|0
      |jobo|1||0|0|0
      |justview|1||0|1|0
      |keynote|1||0|2|0
      |kilroy|1||0|1|0
      |kinja|1||0|0|0
      |lachesis|1||0|0|0
      |larbin|1||0|2|0
      |libwww-perl|1||0|1|0
      |linkbot|1||0|2|0
      |linkchecker|1||0|2|0
      |linklint|1||0|0|0
      |linkscan|1||0|0|0
      |linkwalker|1||0|0|0
      |lisa|1||0|0|0
      |lwp|1||0|2|0
      |lydia|1||0|0|0
      |MacReport|1||0|1|0
      |magenta|1||0|0|0
      |magus bot|1||0|0|0
      |magus+bot|1||0|0|0
      |mediapartners-google|1||0|0|0
      |mfc_tear_sample|1||0|0|0
      |microsoft scheduled cache content download service|1||0|0|0
      |microsoft url control|1||1|2|0
      |microsoft+scheduled+cache+content+download+service|1||0|0|0
      |microsoft+url+control|1||1|2|0
      |mirago|1||0|0|0
      |missigua|1||0|0|0
      |miva|1||0|0|0
      |mj12bot|1||0|0|0
      |mobipocket webcompanion|1||0|2|0
      |mobipocket+webcompanion|1||0|2|0
      |monitor|1||0|1|0
      |monster|1||0|1|0
      |mozilla/5.0 (compatible; msie 5.0)|1||0|2|0
      |mozilla/5.0+(compatible;+msie+5.0)|1||0|2|0
      |ms frontpage|1||0|1|0
      |MS Search|1||0|1|0
      |ms+frontpage|1||0|1|0
      |MS+Search|1||0|1|0
      |MSNPTC|1||1|1|0
      |nbot|1||0|0|0
      |netmechanic|1||0|0|0
      |newsbot|1||0|0|0
      |newsnow|1||0|0|0
      |nextgensearchbot|1||0|0|0
      |ng/2.0|1||0|0|0
      |nomad|1||0|1|0
      |npbot|1||0|2|0
      |nutch|1||0|0|0
      |nutscrape|1||0|0|0
      |ocelli|1||0|0|0
      |omniexplorer|1||0|0|0
      |openfind|1||0|0|0
      |oracle ultra search|1||0|0|0
      |oracle+ultra+search|1||0|0|0
      |patric|1||0|1|0
      |perman surfer|1||0|1|0
      |perman+surfer|1||0|1|0
      |pioneer|1||0|1|0
      |pluck|1||0|0|0
      |plumtree|1||0|0|0
      |polybot|1||0|0|0
      |pompos|1||0|0|0
      |port huron labs|1||0|0|0
      |port+huron+labs|1||0|0|0
      |powermarks|1||0|1|0
      |psbot|1||0|0|0
      |pulpfiction|1||0|0|0
      |rpt-http|1||0|2|0
      |rss client|1||0|0|0
      |rss+client|1||0|0|0
      |rssmaker-ng|1||0|0|0
      |rssreader|1||0|0|0
      |rufusbot|1||0|0|0
      |schmozilla|1||0|0|0
      |scooter|1||0|0|0
      |seekbot|1||0|0|0
      |sherlock|1||0|0|0
      |shopwiki|1||0|0|0
      |slurp|1||0|2|0
      |slysearch|1||0|0|0
      |snooper|1||0|0|0
      |sohu|1||0|0|0
      |spider|1||0|2|0
      |spike|1||0|1|0
      |spyder|1||0|2|0
      |stackrambler|1||0|0|0
      |stuff|1||0|2|0
      |sucker|1||0|1|0
      |taz|1||0|1|0
      |teleport|1||0|2|0
      |templeton|1||0|1|0
      |/teoma|1||0|0|0
      |thunderstone|1||0|1|0
      |t-h-u-n-d-e-r-s-t-o-n-e|1||0|1|0
      |topix|1||0|0|0
      |ukonline|1||0|0|0
      |ultraseek|1||0|0|0
      |urchin|1||0|0|0
      |urlcheck|1||0|0|0
      |vagabondo|1||0|0|0
      |versus|1||0|0|0
      |voyager|1||0|2|0
      |web downloader|1||0|1|0
      |web+downloader|1||0|1|0
      |webauto|1||0|1|0
      |webcapture|1||0|2|0
      |webcheck|1||0|0|0
      |webclipping.com|1||0|0|0
      |WebCopier|1||1|1|0
      |webcrawl|1||0|2|0
      |webdup|1||0|2|0
      |webinator|1||0|2|0
      |website extractor|1||0|2|0
      |website+extractor|1||0|2|0
      |webtool|1||0|1|0
      |webtrends|1||0|0|0
      |webwasher|1||0|0|0
      |webzip|1||0|1|0
      |wget|1||0|2|0
      |worm|1||0|2|0
      |xenu|1||0|0|0
      |yacy|1||0|0|0
      |yandex|1||0|0|0
      |zealbot|1||0|0|0
      |zeus|1||0|0|0
      |zipppbot|1||0|0|0
      |zyborg|1||0|0|0
      |ez publish link validator|1||0|0|0
      |ez+publish+link+validator|1||0|0|0
      |Goldfire|1||0|0|0
      |SiteVigil|1||0|0|0
      |EmailSmartz|1||0|0|0
      |iOpus-I-M|1||0|0|0
      |BITS|1||0|0|0
      |heritrix|1||0|0|0
      |Freedom|1||0|2|0
      |yahoofeedseeker|1||0|2|0
      |internal zero-knowledge agent|1||0|2|0
      |internal+zero-knowledge+agent|1||0|2|0
      |NaverBot|1||0|2|0
      |SurveyBot/|1||0|2|0
      |Liferea|1||0|2|0
      |YahooSeeker|1||0|2|0
      |FindLinks|1||0|2|0
      |psycheclone|1||0|0|0
      |oodlebot|1||0|2|0
      |mackster|1||0|2|0
      |AdsBot-Google|1||0|1|0
      |InnovantageBot|1||0|2|0
      |192.comAgent|1||0|0|0
      |NASA Search|1||0|0|0
      |KHTE|1||0|2|0
      |KTXN|1||0|2|0
      |AutoMapIt|1||0|2|0
      |Advanced Email Extractor|1||0|2|0
      |Advanced+Email+Extractor|1||0|2|0
      |MSRBOT|1||0|2|0
      |Moreoverbot|1||0|2|0
      |news reader|1||0|2|0
      |news+reader|1||0|2|0
      |webbot|1||0|2|0
      |FeedFetcher|1||0|2|0
      |HTTP-WebTest|1||0|2|0
      |Forex Trading Network Organization|1||0|2|0
      |Forex+Trading+Network+Organization|1||0|2|0
      |newstin|1||0|2|0
      |search_comments\at\sensis\dot\com\dot\au|1||0|0|0
      |panscient.com|1||0|2|0
      |Snoopy|1||0|2|0
      |JDXROBOT|1||0|2|0
      |bot/1.0|1||0|2|0
      |Jumpbot|1||0|2|0
      |N-central|1||0|2|0
      |Globrix|1||0|2|0
      |AOL_CAP|1||0|2|0
      |Pagebull|1||1|2|0
      |UniversalSearch|1||0|2|0
      |Hoopla|1||1|2|0
      |Maxamine|1||0|2|0
      |Argus|1||0|2|0
      |Google Wireless Transcoder|1||0|1|0
      |Google+Wireless+Transcoder|1||0|1|0
      |ClickAJob|1||1|2|0
      |JobRapido|1||0|2|0
      |WebNews Arianna|1||1|2|0
      |WebNews+Arianna|1||1|2|0
      |CogisumBot|1||1|2|0
      |Python-urllib|1||1|2|0
      |LiteFinder|1||0|2|0
      |iSearch|1||0|2|0
      |http://bot.ims.ca|1||0|2|0
      |Pricerunner|1||0|2|0
      |System Center Operations Manager|1||1|2|0
      |System+Center+Operations+Manager|1||1|2|0
      |nettraffic sensor|1||0|2|0
      |nettraffic+sensor|1||0|2|0
      |D1GArabicEngine|1||0|2|0
      |JoeDog|1||1|2|0
      |ShablastBot|1||1|2|0
      |websitepulse|1||1|2|0
      |BitvoUserAgent|1||0|2|0
      |Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;1813)|1||0|2|0
      |Mozilla/4.0+(compatible;+MSIE+6.0;+Windows+NT+5.1;1813)|1||0|2|0
      |Swish-e|1||1|2|0
      |ContentSmartz|1||1|2|0
      |Quintura-crw|1||1|2|0
      |Paros|1||0|2|0
      |MSNRV|1||0|2|0
      |Kalooga|1||1|2|0
      |Watchmouse|1||1|2|0
      |PureLoad|1||1|2|0
      |Proximic|1||0|2|0
      |Powerset|1||0|2|0
      |Yahoo-RichAbstracts|1||0|2|0
      |Scoutjet|1||0|2|0
      |Twiceler|1||1|2|0
      |Twingly|1||0|2|0
      |Attributor|1||0|2|0
      |Pingdom|1||1|2|0
      |Europarchive|1||0|2|0
      |Search-Engine-Studio|1||1|2|0
      |Yanga|1||1|2|0
      |Webmetrics|1||0|2|0
      |irc search|1||1|2|0
      |irc+search|1||1|2|0
      |vivisimo|1||0|2|0
      |onkosh|1||0|2|0
      |holmes|1||1|2|0
      |AlertSite|1||0|2|0
      |Sphere Scout|1||1|2|0
      |Sphere+Scout|1||1|2|0
      |Yahoo Pipes|1||0|2|0
      |Yahoo+Pipes|1||0|2|0
      |SimplePie|1||1|2|0
      |Drupal|1||1|2|0
      |HTMLParser|1||1|2|0
      |Busiversebot|1||1|2|0
      |Watchfire WebXM|1||1|2|0
      |Watchfire+WebXM|1||1|2|0
      |SnapPreviewBot|1||0|2|0
      |SnapBot|1||0|2|0
      |DAUMOA|1||0|2|0
      |SkreemRBot|1||0|2|0
      |C4BOT|1||1|2|0
      |LucidMedia ClickSense|1||1|2|0
      |LucidMedia+ClickSense|1||1|2|0
      |Nielsen ADR|1||0|2|0
      |Nielsen+ADR|1||0|2|0
      |evrinid|1||0|2|0
      |robtexbot|1||0|2|0
      |FDM 3.x|1||1|2|1
      |FDM+3.x|1||1|2|1
      |WebGrab|1||1|2|1
      |iSense|1||0|2|0
      |business-semantics|1||1|2|0
      |Trovit|1||0|2|0
      |RiverglassScanner|1||1|2|0
      |Wepbot|1||1|2|0
      |MLBot|1||1|2|0
      |Siteimprove|1||1|2|0
      |Ruby|1||0|2|0
      |Apache-HttpClient|1||1|2|0
      |SiteAlarm|1||0|2|0
      |archive.org|1||0|2|0
      |VocusBot|1||0|2|0
      |echo|1|bonecho|0|1|0
      |fast|1|fastbar|0|0|0
      |motor|1|motorola|0|1|0
      |obot|1|robotics|0|0|0
      |pita|1|hospital|0|1|0
      |robot|1|robotics|0|2|0
      |spinne|1|spinner|0|2|0""".stripMargin,
  )

  val testGroups = Table(
    ("UA", "expected"),
    (
      """Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)""",
      true,
    ),
    (
      """Mozilla/5.0 (Mediapartners-Google; +https://support.google.com/adsense/answer/99376?hl=ja)""",
      true,
    ),
  )

  property("isBot") {
    forAll(testGroups) { (ua: String, expected: Boolean) =>
      botChecker.isBot(ua) should be(expected)
    }
  }
}
