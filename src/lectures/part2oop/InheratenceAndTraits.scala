package lectures.part2oop

object InheratenceAndTraits extends App{

  class Animal {
    def eat = println("nomnomnom")
  }

  class Cat extends  Animal {

  }

  val cat = new Cat();
  println(cat.eat)

  class Person(name: String, age: Int)

  class Adult(name:String, age: Int, idCard: String) extends Person(name, age)

  class Dog extends  Animal {

    override def eat = println("Dog eat")
  }

}
