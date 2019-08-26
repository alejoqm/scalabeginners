package lectures.part1basics

import lectures.part1basics.Functions.isPrime

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b;
  }

  println(aFunction("Hello", 3));


  def aParameterLessFunction() : Int = 42;
  println(aParameterLessFunction())
  println(aParameterLessFunction)


  def aRepeatedFunction(aString: String, n: Int) : String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n -1)
  }

  //Needs return type, the compilar can not infer that.
  println(aRepeatedFunction("Hello", 3))

  def aFunctionWithSideEffects(aString: String) : Unit = println(aString);

  def aBigFunction (n: Int): Int = {
     def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, n - 1);
  }
  println(aBigFunction(3));

  def factorialFunction(aNumber: Float): Float = {
    if(aNumber == 1) aNumber
    else aNumber * factorialFunction(aNumber - 1);
  }
  println(factorialFunction(5))
  println(factorialFunction(8))

  def fibonacciFunction(aNumber: Int) : Int = {
    if(aNumber == 1 || aNumber == 2) return 1;
    else fibonacciFunction(aNumber - 1) + fibonacciFunction(aNumber - 2);

  }
 //1 1 2 3 5 8 12 20
  println(fibonacciFunction(1))
  println(fibonacciFunction(2))
  println(fibonacciFunction(3))

  println(fibonacciFunction(4))
  println(fibonacciFunction(5))
  println(fibonacciFunction(6))
  println(fibonacciFunction(7))
  println(fibonacciFunction(8))
  println(fibonacciFunction(9))

  def isPrime(aNumber: Int) : String = {
    def isPrime(aNumber: Int, aDivisor: Int) : String = {
      if(aDivisor == 1 || aNumber == 1)
        aNumber + " Its Prime Number"
      else if(aNumber % aDivisor == 0)
        aNumber + " Its not a Prime Number"
      else
        isPrime(aNumber, aDivisor - 1)
    }
    isPrime(aNumber, aNumber - 1);
  }

  println(isPrime(1))
  println(isPrime(7))
  println(isPrime(8))

  println(isPrime(13))

  println(isPrime(25))

}
