package lectures.part2oop

object MethodAnnotations extends App {

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = {
      movie == favoriteMovie
    }

    def hangOutWith(person: Person) : String = s"${this.name} is hanging out with ${person.name}"

    //Space between ! and :
    def unary_! : String = s"$name, what the heck?"

    def isAlive: Boolean = true;

    def apply() : String = s"Hi my name is $name and I like $favoriteMovie"
  }

  val marry = new Person("Mary", "Inception");
  println(marry.likes("Inception"))
  println(marry likes "Inception") //Infix notation = operator notation (syntastic sugar)
  //Just methods with single parameter.


  //"Operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(marry hangOutWith tom)

  // prefix notation
  val x = -1; //Equivalent
  val y = 1.unary_-;
  //Unary_prefix only works with - + ~ !

  println(!marry);
  println(marry.unary_!)


  // postfix notation. Only methjods without parameters.
  println(marry.isAlive)
  println(marry isAlive)

  // apply
  println(marry.apply())
  println(marry()) //Equivalent

}
