```kotlin
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeIf { it > 2 }
    println(set) // Output: [1, 2]

    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c", 4 to "d", 5 to "e")
    map.removeIf { it.key > 2 }
    println(map) // Output: {1=a, 2=b}

    //The issue is that `removeIf` modifies the collection in place. This is unexpected if you're not expecting it to modify the collection. 
    //In some cases, such as when passing a collection to a function that modifies it in place, this may lead to unexpected side effects.
    // A more functional approach would be to create a new collection with the filtered elements. 
}
```