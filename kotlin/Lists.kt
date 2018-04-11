//////////////////////
// Tanner Kvarfordt //
// CS 4700          // 
// Dr. Dyreson      //
//////////////////////

// Do not remove or rename the package
package lists

/*
 * The following functions are helper functions that I am providing
 */

/*
 * Extend the List class with a "tail" getter to get the tail of a list.
 * Below is an example of how you would use tail
 *    val a = listOf(1,2,3)
 *    val t = a.tail
 *    println("tail of $a is $t") // prints [2,3]
 */
val <T> List<T>.tail: List<T>
get() = drop(1)

/*
 * Extend the List class with a "head" getter to get the head of a list.
 * Below is an example of how you would use head
 *    val a = listOf(1,2,3)
 *    val h = a.head
 *    println("head of $a is $h") // prints 1
 */
val <T> List<T>.head: T
get() = first()

/* 
 * The isPrime function takes as input an Int
 *      x : an Int object to test
 * and returns a Boolean
 *      true  if x is a prime
 *      false if x is not a prime
 */
fun isPrime(x : Int) : Boolean {
    for (i in 2..(x-1)) {
        if (x % i == 0) {
            return false
        }    
    }
    return true
}

// Provides a list of whole numbers from 1 to @n
//
// param n : how many numbers to include in the returned List
// return  : a list of whole numbers from 1 to @n
fun countingNumbers(n : Int?) : List<Int>? {
    if (n == null) return null
    if (n <= 0) return listOf<Int>()
    var list : MutableList<Int>? = mutableListOf<Int>()
    for (i in 1..n) {
        list?.add(i)
    }
    return list
}

fun evenNumbers(n : Int?) : List<Int>? {
    if (n == null) return null
    if (n <= 0) return listOf<Int>()
    return countingNumbers(n)?.filter { it % 2 == 0 }
}

/* The compose function takes as input
 *     f - A function that takes as input a value of type T and returns a value of type T
 *     g - A function that takes as input a value of type T and returns a value of type T
 *  and returns as output the composition of the functions
 *     f(g(x))
 */
fun<T> compose(f: (T)->T,  g:(T) -> T) : (T) -> T = { f(g(it)) }

