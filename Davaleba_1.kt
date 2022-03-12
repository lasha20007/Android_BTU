fun main(){

    //Task 1
    println("\n-- Task 1 --\n")

    val numbers : IntArray = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    val answer = task1(numbers)
    println("\nanswer: $answer")

    //Task 2
    println("\n-- Task 2 --\n")

    val words = arrayOf("rogor", "xar", "ana")

    for(i in words) {
        if (task2(i))
            println("'$i' is palindrome")
        else
            println("'$i' is not palindrome")
    }
}

fun task1(numbers: IntArray): Int {
    var sum = 0
    var quantity = 0
    numbers.forEachIndexed { i, v ->
        if (i%2==0) {
            quantity += 1
            sum += v
        }
    }

    println("sum of even index numbers: $sum")
    println("quantity of even index numbers: $quantity")

    return sum/quantity
}

fun task2(word: String): Boolean {

    val len = word.length
    for (i in 0..len){
        if(i == len)
            break
        if(word[i] != word[len-i-1])
            return false
    }

    return true
}