package lectures.part1basics

object ValuesVariablesTypes extends App{

  val x: Int = 42;
  var y = 43;
  //VALS ARE INMUTABLE
  //Types of value are optional.
  //Compilar can infer types
  //x = 2;

  //Semicoln is not neccesary just for separate expressions.
  val aString: String = "Hello"

  val aBoolean: Boolean = true;
  val aChar: Char = 'a';
  val aShort: Short = 4613;
  val aLong: Long = 1l;
  val aFloat: Float = 1f;
  val aDouble: Double = 3.14;

  println(x);

  // Variables

  var aVariable: Int = 4;
  aVariable = 5 // Side Effects. Its not functional programming.

  //prefer vals over vars



  //Type Inference.
  // Val
  // The compiler infers the type from the right hand side.
  // in Recursive function the compiler can infer the type.

}
