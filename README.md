# Kotlin `removeIf` Gotcha: Unexpected In-Place Modification

This repository demonstrates a potential pitfall when using the `removeIf` function in Kotlin.  `removeIf` modifies the collection directly, which can lead to unexpected behavior, especially when dealing with shared collections or when expecting immutable results. This example shows how to avoid this issue by using functional approaches.

## Problem

The `removeIf` function in Kotlin modifies the original collection. This can lead to unexpected side effects if the collection is shared or if the programmer expects the function to return a new collection.