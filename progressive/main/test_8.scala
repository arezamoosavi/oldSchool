import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTest6 {

  def main(args: Array[String]) {

    val txtLine ="john is a good fella"

    println("8rd index is: "+ txtLine(8))

    println("concating: "+txtLine.concat(" and is student"))

    println("index of is: "+txtLine.indexOf("is"))


    val txtArray = txtLine.toArray

    for (v <- txtArray){
      println(v)
    }

  }
}
