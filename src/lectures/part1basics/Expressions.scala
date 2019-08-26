package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2;
  println(x)

  println(1 == x)
 // == != < > <= >=

  println(!(1 == x))
  // !  || &&

  var aVariable = 2;
  aVariable += 3;
  println(aVariable);
  //-= *= /= always with var (Variables)

  // Instructions (DO) vs Expresions


  //IF Expresion
  var aCondition = true;
  var aConditionValue = if(!aCondition) 5 else 3
  println(aConditionValue)



  //Avoid use loops. Its very specific of imperative program.
  var i = 0;
  while ( i < 10) {
    println(i);
    i += 1;
  }

  //Everything in Scala is a Expression.
  var aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue) //Expressions return Unit.

  // Side effects: println(), whiles, reassigning.


  //Code blocks
  //The value of the block is the value of the last expression.
  var aCodeBlock = {
    val y = 2;
    val z = y + 1;
    if(z == 2) "hello" else "good bye"
  }



}
