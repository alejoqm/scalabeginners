package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorialFunction(aNumber: Float): Float =
    if(aNumber == 1) aNumber
    else {
      println("Computin factorial of " +  aNumber + " - I first factorial of  " + (aNumber-1))
      var result = aNumber * factorialFunction(aNumber - 1)
      println("Computed factorial of " + aNumber)
      result
    }

  //With 5000 is going to crash StackOverflowError.
  factorialFunction(10);


  //Tail Recursion = Use recursive  call
  def anotherFactorial(n: BigInt) : BigInt = {
    def factHelper(x: BigInt, accumulator: BigInt) : BigInt = {
      if(x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)
    }
    factHelper(n, 1);
  }

  /**
    * anotherFactorial(10);
    * factHelper(10, 1) = factHelper(9, 10 * 1)
    * factHelper(8, 9 * 10 * 1)
    * factHelper(7, 8 * 9 * 10 * 1)
    * factHelper(6, 7 * 8 * 9 * 10 * 1)
    *
    */

  println(anotherFactorial(5000));

  //add annotation @tailrec if is not tail rec the compilar is going to fail.
  //When you need loops, use tail recursion.

  def exchangeAxVB(a : Int, b : Int) : Unit = {
    var newA : Int = a + b;
    var newB : Int =  newA - b;
    newA -= newB;
    println("New a " + newA + " New B " + newB)
  }
  exchangeAxVB(8, 4)


  def concatString(text : String, n: Int) : String = {
    @tailrec
    def concatHelper(accumulator : String, i: Int) : String = {
      if(i <= 1) accumulator
      else concatHelper(accumulator + text, i - 1)
    }
    concatHelper(text, n);
  }

  @tailrec
  def concatStringSingle(text : String, n: Int, accumulator: String) : String = {
      if(n <= 1) accumulator
      else concatStringSingle(accumulator + text, n - 1, text + accumulator)
  }

  println(concatString("Hi!, ", 5));
  println(concatStringSingle("Hi!, ", 5, ""));


  def isPrime(number : Int) : Boolean = {
    def primeHelper(divisor : Int) : Boolean = {
      if(divisor <= 1) true
      else if(number % divisor == 0) false
      else primeHelper(divisor - 1)
    }
    primeHelper(number - 1)
  }

  println(if(isPrime(257)) "Its prime"
          else "Its not Prime");

  def fibonnaci(number : Int) : Int = {
    def fibonacciHelper(n: Int, accumulator : Int) : Int = {
      if(n <= 2) 1
      else accumulator + fibonacciHelper(n - 1, accumulator) + fibonacciHelper(n - 2, accumulator)
    }
    fibonacciHelper(number, 0);
  }

  def fibonacciWithTwoAccumulator(n: Int) : Int = {
    def fiboTailRec(i: Int, last: Int, nextToLast: Int) : Int = {
      if(i >= n) last
      else fiboTailRec(i + 1, last + nextToLast, last);
    }

    if(n <= 2) 1
    else fiboTailRec(2, 1, 1);
  }

  println(fibonacciWithTwoAccumulator(8))

  println(fibonnaci(8))

}
