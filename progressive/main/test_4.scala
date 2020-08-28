object ScalaTest4 {

    def main(args: Array[String]){

        var seqList = for {i <- 1 to 20 if (i%2) == 0} yield i


        for( i <- seqList)
            println("list item: "+ i)
            
    }
}
