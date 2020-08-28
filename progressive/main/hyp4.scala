import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object HypCls {

  def main(args: Array[String]) {


    val rythem = new Tool("rythem", "madness")
    println(rythem.history)


    val booby = new Tool("booby", "nicebb")
    booby.weight = 55.009
    println(booby.history)

  }


  abstract class Rocks(var name: String){
    var weight: Double
    def history: String


  }
  class Tool(name: String, typo: String) extends Rocks(name){

    var weight = 44.9
    def history: String = {
      s"Hey this tool is ${this.weight} and types of ${this.typo}"
    }
  }
}
