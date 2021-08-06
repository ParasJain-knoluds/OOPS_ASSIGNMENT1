import scala.collection.mutable.ListBuffer

class DoubleQueue(list:ListBuffer[Int]) extends Queue {
  for( i <- list.indices){
    list.update(i,2*list(i))
  }
}