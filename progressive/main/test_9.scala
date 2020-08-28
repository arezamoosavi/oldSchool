import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTest6 {

  def main(args: Array[String]) {

    def calSum1(num1: Int = 1, num2: Int = 2): Int = num1 + num2

    println("the sum of 5,8: "+calSum1(5,8))


    def calSum2(args : Int*): Int = {
      var sum = 0
      for (num <- args){
        sum +=num
      }
      return sum
    }

    println("the sum2 : "+calSum2(5,8,9,23,2334))


    def factorial(num :BigInt): BigInt = {
      if (num <=1)
        1
      else
        num*factorial(num-1)
    }

    println("factorial of 6 is: "+factorial(6))
  }
}
