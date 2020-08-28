import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTest6 {

  def main(args: Array[String]) {

    var tupleMerge = (106, "newLine", 777)

    tupleMerge.productIterator.foreach{ i => println(i)}

    println(tupleMerge.toString())

  }
}
