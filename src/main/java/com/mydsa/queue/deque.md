# 🔁 Deque (Double-Ended Queue) – Java Implementation

This module includes two implementations of a **Deque**:

1. `DequeLinkedList.java` – using Doubly Linked List
2. `DequeArray.java` – using Circular Array with dynamic resizing

---

## 💡 What is a Deque?

A **Deque** (short for *Double-Ended Queue*) is a linear data structure that allows insertion and deletion from both **front** and **rear** ends.

### 🔄 Visual Diagram

````
Add Front Add Rear
↓ ↓
[30] [20] [10] [5] [1]
↑ ↑
Remove Front Remove Rear
````

- Supports both **FIFO** (queue) and **LIFO** (stack) operations.
- Useful for sliding window problems, palindromes, and task scheduling.

---

## ✅ Operations Supported

| Operation         | Description                          |
|------------------|--------------------------------------|
| `addFirst(x)`    | Add element to front                 |
| `addLast(x)`     | Add element to rear                  |
| `removeFirst()`  | Remove and return front element      |
| `removeLast()`   | Remove and return rear element       |
| `peekFirst()`    | Return front element without removing|
| `peekLast()`     | Return rear element without removing |
| `isEmpty()`      | Check if deque is empty              |
| `size()`         | Return number of elements            |

---

## 🧱 Implementations

### 1. `DequeLinkedList.java`

- Backed by a **doubly linked list**
- Efficient O(1) operations at both ends
- Dynamically grows with no size limit

### 2. `DequeArray.java`

- Backed by a **circular array**
- Uses modulo math to wrap front/rear
- Automatically resizes when full

---

## 🔨 Code Example

```java
DequeLinkedList deque1 = new DequeLinkedList();
deque1.addFirst(1);
deque1.addLast(2);
System.out.println(deque1.removeFirst()); // 1
System.out.println(deque1.peekLast());    // 2

DequeArray deque2 = new DequeArray();
deque2.addLast(10);
deque2.addFirst(5);
deque2.removeLast();                      // removes 10
System.out.println(deque2.peekFirst());   // 5
````

### ⚖️ Comparison Table

| Feature       | Linked List Deque   | Circular Array Deque     |
| ------------- | ------------------- | ------------------------ |
| Growth        | Dynamic             | Dynamic (resizable)      |
| Memory Usage  | More (node objects) | Less (primitive array)   |
| Wrap-around   | No                  | Yes (`%`-based indexing) |
| Random Access | No                  | No                       |
| Insert/Delete | O(1) at both ends   | O(1) avg, resizing O(n)  |
