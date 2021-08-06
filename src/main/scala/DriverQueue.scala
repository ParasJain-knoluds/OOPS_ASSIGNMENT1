import scala.collection.mutable.ListBuffer

object DriverQueue extends App {

  val list = ListBuffer(5, 3, 1, 4, 6, 10)
  println("Originally the Queue is: ")
  for (i <- list.indices) print(list(i) + " ")

  var doubledList = new DoubleQueue(list) //Doubled the elements in the queue.
  println("\nAfter doubling the elements the Queue is: ")
  for (i <- list.indices) print(list(i) + " ")

  var squareQueue = new SquareQueue(list) //Squaring the elements in queue.
  println("\nAfter squaring the elements the Queue is: ")
  for (i <- list.indices) print(list(i) + " ")

  squareQueue.dequeue(list)
  println("\nThe Queue After dequeue an element : ")
  for (i <- list.indices) print(list(i) + " ")
  squareQueue.enqueue(list)
  println("\nAfter adding a element the Queue is: ")
  for (i <- list.indices) print(list(i) + " ")
}