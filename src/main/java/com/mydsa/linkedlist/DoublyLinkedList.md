# Doubly Linked List in Java

A clean, testable implementation of a **Doubly Linked List** in Java, with unit tests and educational diagrams.

---

## 🔍 What Is a Doubly Linked List?

A **Doubly Linked List (DLL)** is a linear data structure where each node contains:

- A value (`value`)
- A pointer to the next node (`next`)
- A pointer to the previous node (`prev`)

---

## 🔗 Diagram

null ← [5] ⇄ [10] ⇄ [20] ⇄ [30] → null


Each node connects **both ways**, enabling:

✅ Bidirectional traversal  
✅ Efficient insertions/deletions at both ends  
🚫 Slightly more memory (extra pointer)

---

## 📦 Features

| Method                 | Description                         |
|------------------------|-------------------------------------|
| `add(int val)`         | Add to tail                         |
| `addFirst(int val)`    | Add to head                         |
| `removeAt(int index)`  | Remove node at index                |
| `get(int index)`       | Get value at index                  |
| `printForward()`       | Print from head to tail             |
| `printBackward()`      | Print from tail to head             |
| `size()`               | Return number of elements           |

---

## 🧪 Sample Usage

```java
DoublyLinkedList dll = new DoublyLinkedList();

dll.add(10);
dll.add(20);
dll.addFirst(5);
dll.add(30);

dll.printForward();   // Forward: 5 ⇄ 10 ⇄ 20 ⇄ 30 ⇄ null
dll.printBackward();  // Backward: 30 ⇄ 20 ⇄ 10 ⇄ 5 ⇄ null

dll.removeAt(2);      // Remove value 20
System.out.println("Size: " + dll.size());
