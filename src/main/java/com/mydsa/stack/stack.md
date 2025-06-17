# 🧱 Stack (LIFO) – Java Implementation

This module provides two implementations of a **Stack** data structure in Java:

1. Using **Linked List**
2. Using **Dynamic Array**

---

## 🔄 What Is a Stack?

A **Stack** is a linear data structure that follows the **Last In First Out (LIFO)** principle.  
The element added last is removed first.

### 🔗 Diagram
````
Top → [30]
↑
[20]
[10] ← Bottom
````
---

## ✨ Core Operations

| Operation   | Description                         |
|------------|-------------------------------------|
| `push(x)`  | Add element to the top              |
| `pop()`    | Remove and return top element       |
| `peek()`   | View top element (without removal)  |
| `isEmpty()`| Check if stack is empty             |
| `size()`   | Returns number of elements          |

---

## 🚀 Implementations

### ✅ 1. Stack using Linked List

> File: `StackLinkedList.java`

- Each node has a value and a pointer to the next node
- Fast insertions/removals (O(1))
- Dynamic size (no fixed capacity)

### ✅ 2. Stack using Dynamic Array

> File: `StackArray.java`

- Backed by a resizable `int[]`
- Automatically resizes on overflow
- Simple and cache-friendly

---

## 🧪 Sample Code

```java
StackLinkedList stack1 = new StackLinkedList();
stack1.push(10);
stack1.push(20);
System.out.println(stack1.pop()); // 20
System.out.println(stack1.peek()); // 10

StackArray stack2 = new StackArray();
stack2.push(1);
stack2.push(2);
System.out.println(stack2.pop()); // 2
System.out.println(stack2.size()); // 1
