fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val list2 = mutableListOf(1, 2, 3, 4, 5)
    list2.removeIf { it % 2 == 0 }
    println(list2) // Output: [1,3,5]
    //To create a new list with even numbers removed, use filter:
    val list3 = listOf(1,2,3,4,5).filter { it % 2 != 0 }
    println(list3) //Output: [1,3,5]
} 