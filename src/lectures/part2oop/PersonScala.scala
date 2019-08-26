package lectures.part2oop

object PersonScala extends App {


  class Person(name: String, nickName:String = "", val age: Int = 0) {

    def +(nickname : String) : Person = {
      new Person(this.name, nickname)

    }

    def + : Person = new Person(this.name, nickName, this.age + 1)

    def this(name: String) = this(name, "", 0);

    def this(name: String, nickName: String) = this(name, nickName, 0)

    override def toString: String = this.name.concat(nickName);

    def learns(value : String) : String = s"$name is learning $value"
    def learns : String = this learns "Scala"

    def apply(times : Int) : String = s"$name watched inception $times times"

  }

  val mary = new Person("mary");

  val mary2 = mary + "The RockStar";
  println(mary2 toString)

  val mary3 = mary2+ ;
  println(mary3.age)


  val mary4 = mary3+ ;
  println(mary4.age)

  println(mary learns "English")
  println(mary learns)

  println(mary.apply(3))

}
