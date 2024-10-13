fun main()
{
    val closedRange = 1..10
    val halfOpenRange = 1 until 10
    val decreasingRange = 10 downTo 1
    var sum = 0
    val count = 10
    for (a in closedRange)
    {
        print("$a ") // Output: 1 2 3 4 5 6 7 8 9 10
    }
    println()
    for (b in halfOpenRange)
    {
        print("$b ") // Output: 1 2 3 4 5 6 7 8 9
    }
    println()
    for (c in decreasingRange)
    {
        print("$c ") // Output: 10 9 8 7 6 5 4 3 2 1
    }
    println()
    for (i in 1..count)
    {
        print("$i ") // Output: 1 2 3 4 5 6 7 8 9 10
        sum += i
    }
    println("\n$sum") // Output: 55
    sum = 1
    var lastSum = 0
    repeat(10)
    {
        val temp = sum
        sum += lastSum
        lastSum = temp
    }
    println(sum) // Output: 89
    println(lastSum) // Output: 55
    sum = 0
    for (j in 1..count step 2)
    {
        print("$j ") // Output: 1 3 5 7 9
        sum += j
    }
    println("\n$sum") // Output: 25
    sum = 0
    for (k in count downTo 1 step 2)
    {
        print("$k ") // Output: 10 8 6 4 2
        sum += k
    }
    println("\n$sum") // Output: 30
    sum = 0
    for (row in 0 until 8)
    {
        if ((row % 2).equals(0))
        {
            continue
        }
        for (column in 0 until 8)
        {
            sum += row * column
        }
    }
    println(sum) // Output: 448
    sum = 0
    rowLoop@ for (row in 0 until 8)
    {
        columnLoop@ for (column in 0 until 8)
        {
            if (row.equals(column))
            {
                continue@rowLoop
            }
            sum += row * column
        }
    }
    println(sum) // Output: 322

//    When
    val number = 10
    when (number)
    {
        0 -> println("Zero")
        else -> println("Non-zero")
    }
    val string = "Dog"
    when (string)
    {
        "Cat", "Dog" -> println("Animal is a house pet.")
        else -> println("Animal isn't a house pet.")
    }
    val numberName = when (number)
    {
        2 -> "two"
        4 -> "four"
        6 -> "six"
        8 -> "eight"
        10 -> "ten"
        else ->
        {
            println("unknown number")
            "Unknown"
        }
    }
    println(numberName) // Output: ten
    val hourOfDay = 12
    val timeOfDay: String
    timeOfDay = when (hourOfDay)
    {
        0, 1, 2, 3, 4, 5 -> "Early morning"
        6, 7, 8, 9, 10, 11 -> "Morning"
        12, 13, 14, 15, 16, 17 -> "Afternoon"
        18, 19, 20, 21 -> "Evening"
        22, 23 -> "Late evening"
        else -> "INVALID HOUR!"
    }
    println(timeOfDay)
    when
    {
        number % 2 == 0 -> println("Even")
        else -> println("Odd")
    }
}