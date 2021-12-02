
import scala.util.matching.Regex
import scala.io.Source

case class KnowledgeItem(id: String,
                       content: String)

case class DalaRecord(itemId: String,
                      numWords: Long = -1,
                      start: Long = -1,
                      end: Long = -1,
                      content: String = "")

object Text {
  val paragraphSplitter: Regex = """(\r\n|\r|\n)\s*(\r\n|\r|\n)*""".r
  val sentenceSplitter: Regex = """(\.\s+|\s*$)""".r
  val wordSplitter: Regex = """\s+""".r

  def splitIntoRecords (item: KnowledgeItem, minWordCount: Int, maxWordCount: Int): List[DalaRecord] = {
    println("Implement me!")
    List()
  }
}

object Main extends App {
  val filename = "Emotions.txt"
  val file = Source.fromFile(filename)
  val content = file.getLines.mkString;
  val item = KnowledgeItem(filename, content)

  for (record <- Text.splitIntoRecords(item, 165, 200)) println(record)
  file.close()
}
