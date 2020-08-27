object ScalaTest {

    def main(args: Array[String]){

        var seqList = for {i <- 1 to 20 if (i%2) == 0} yield i

        val
        for( i <- seqList)
            println("list item: "+ i)
            
    }
}
