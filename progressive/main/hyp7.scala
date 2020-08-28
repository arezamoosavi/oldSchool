import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object Traaaiit {

  def main(args: Array[String]) {

    def someFunc(n1: Int, n2 : Int)=try{
      (n1/n2)
    }catch {
      case ex: java.lang.ArithmeticException => "Can't divide by zero"
    }finally {
      println("Bye :))")
    }

    println("calc: 3/0: "+ someFunc(3,0))
    println("calc: 3000/666: "+ someFunc(3000,666))
  }
}
