package lectures.part1basics

//Call by name VS Call by Value
object CBNvsCBV extends  App{

  def calledByValue(x : Long): Unit = {
    println("by value " + x)
    println("by value " + x)
  }


  //Received parameter vy name. =>
  def calledByName(x: => Long) : Unit = {
    println("by name " + x)
    println("by name " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

}
