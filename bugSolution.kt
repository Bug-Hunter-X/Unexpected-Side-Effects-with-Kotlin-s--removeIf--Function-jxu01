```kotlin
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val newList = list.filter { it <= 2 }
    println(list) // Output: [1, 2, 3, 4, 5] (Original list is unchanged)
    println(newList) // Output: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val newSet = set.filter { it <= 2 }.toSet() 
    println(set) // Output: [1, 2, 3, 4, 5] (Original set is unchanged)
    println(newSet) // Output: [1, 2]

    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c", 4 to "d", 5 to "e")
    val newMap = map.filter { it.key <= 2 }
    println(map) // Output: {1=a, 2=b, 3=c, 4=d, 5=e} (Original map is unchanged)
    println(newMap) // Output: {1=a, 2=b}

    // Using filter creates a new collection, preventing modification of the original.  This makes the code more predictable and avoids potential side effects.   
}
```