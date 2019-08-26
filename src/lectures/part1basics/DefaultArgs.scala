package lectures.part1basics

object DefaultArgs extends App {

  def trFactorial(n: Int, acc: Int = 1) : Int = {
    if(n <= 1) acc
    else trFactorial(n - 1, n * acc)
  }

  val fact10 = trFactorial(10, 1)
  val fact11 = trFactorial(11)


  def savePicture( format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("Saving pictures")
  savePicture();
  savePicture(width = 800)

}
