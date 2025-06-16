# 📦 Array (Dynamic) – Custom Implementation in Java

This package contains a fully custom implementation of a **dynamic array**, mimicking the behavior of Java's `ArrayList`. It supports basic operations such as add, get, remove, resize, and size tracking — all without using `java.util.ArrayList`.

---

## 🧠 Key Features

- Dynamically resizes when full
- Fixed-size array under the hood
- Constant time access (`O(1)`), linear time insert/remove at middle
- Safe bounds-checking

---

## ✨ Supported Operations

| Method         | Description                                       |
|----------------|---------------------------------------------------|
| `add(int val)` | Adds an element to the end, resizes if full       |
| `get(int i)`   | Returns the element at index `i`                  |
| `removeAt(i)`  | Removes element at index `i` and shifts left      |
| `size()`       | Returns the current number of elements            |
| `capacity()`   | Returns the current internal array capacity       |
| `print()`      | Prints the array (for debugging and testing)      |

---

## ✅ Example Usage

```java
Array arr = new Array();
arr.add(10);
arr.add(20);
arr.add(30);
arr.removeAt(1); // removes 20
System.out.println(arr.get(1)); // 30
arr.print(); // Array: [10 30]
