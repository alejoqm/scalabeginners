package lectures.part2oop

object Objects extends  App {

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY (STATIC)


  object Person {
    val N_EYES = 2;


    def canFly : Boolean = false;
  }

  class Person {
    //Instance level functionality
  }

  println(Person.N_EYES)
  println(Person canFly)


  // Scala object = Singleton Instance.
  val mary = Person
  var john = Person
  println(mary == john)


  //Scala applications -= Scala object with.
  //def main(args: Array[String]) : Unit


}
