package lectures.part2oop

object OObasics extends App {

  val person = new Person("Jhon", 26)
  var person2 = new Person("Diego")
  println(person.name)
  println(person2.name)
  person.greet("Daniel")

  val writer = new Writer("Mario", "Mendoza", 53);
  val novel = new Novel("Satanas", 2002, writer)

  println(novel.authorAge())
  println(novel.isWrittenBy().fullname())
  println(novel.copy(2015).yearOfRelease)
}


//Age is a class parameter but is not a field
//we need add val keyword befor of parameter
class Person(val name: String, age: Int) {
  // body class

  def greet(name : String) : Unit = println(s"${this.name} says hi $name")


  //Overloading constructor always needs call the main constructor.
  def this(name: String) = this(name, 0)
  def this() = this("Jhon Doe")
}

/*
  Novel and Writer
  Writer: first name, surnname, year.
    - method: fullname
  Novel : name, year of release, author
    -authorAge
    -isWrittenBy(author)
    -copy(new year of release) = new Instance of novel with new release
 */


class Writer(firstName: String, surname: String, val year: Int) {
  def fullname() : String = firstName + " " + surname;
}

class Novel(name : String, val yearOfRelease : Int, author: Writer) {
  def authorAge() : Int = author.year

  def isWrittenBy() : Writer = this.author

  def copy(newRelease:Int) : Novel = new Novel(this.name, newRelease, this.author)
}



/*
Counter class
  -receives an int value
  -method current count
  -method to increment/decrement => new counter
  -overload inc/dec to receive an amount
 */



