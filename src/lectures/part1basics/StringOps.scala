package lectures.part1basics

object StringOps extends App {

  val str : String = "Hello, I am learning Scala.";
  println(str.charAt(2));
  println(str.split(" ").toList)

  val aNumberStrng : String = "45"
  var aNumberInt : Int = aNumberStrng.toInt

  println(str.reverse)
  println(str.take(2))

  //Scala-Specific; String interpolators
  //S-interpolators

  val name = "David"
  val age = 12
  //Put s before to indicate interpolators.
  val greeting = s"Hello, my name is $name and I am $age years old."
  val anotherGreeting = s"Hello, my name is $name and I am ${age + 1} years old."

  //F-Interpolator to apply format.
  val speed = 1.2f;
  val myth = f"$name%s can eat $speed%2.2f"
  println(myth)


  //raw-interpolator
  println(raw"This is a \n new line")
}
