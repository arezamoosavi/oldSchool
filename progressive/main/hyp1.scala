import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTest6 {

  def main(args: Array[String]) {

    val fArray = new Array[Int](20)

    val gArray = Array("Mac", "Yolla")

    val bArray = ArrayBuffer[String]()

    bArray.insert(0, "Hey you")

    bArray += "New to you"

    bArray ++= Array("egg", "salaaad")

    bArray.insert(1, "ytii", "uiaa", "inmm")

    bArray.remove(1)

    for (item <- bArray)
      println("items in bArray: " + item)

    for (j <- 0 to (fArray.length - 1)) {
      fArray(j) = j
      println(fArray(j))
    }

    val nUtt = for (numb <- fArray) yield pow(2, numb)

    nUtt.foreach(println)
  }
}
