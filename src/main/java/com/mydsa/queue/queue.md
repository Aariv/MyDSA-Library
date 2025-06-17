# 🔄 Queue (FIFO) – Java Implementation

This module includes two queue implementations in Java:

1. `QueueLinkedList.java` – using Linked List
2. `QueueArray.java` – using Circular Array

---

## 💡 What is a Queue?

A **Queue** is a linear data structure that follows the **First-In First-Out (FIFO)** principle.  
The first element inserted is the first one removed.

### 🔁 Visual Diagram

````
[10] [20] [30] → [40] ← rear (enqueue)
↑
front (dequeue)
````
---

- `enqueue(x)` → add to rear
- `dequeue()` → remove from front
- `peek()` → view front
- `isEmpty()` / `size()`

---

## ✅ Implementations

### 1. Queue using Linked List

> File: `QueueLinkedList.java`

- Dynamic size
- Constant-time enqueue and dequeue
- Uses `Node` objects with `value` and `next` pointer

### 2. Queue using Circular Array

> File: `QueueArray.java`

- Backed by a fixed-size array with dynamic resizing
- Uses modulo (`%`) to wrap rear and front indices
- Efficient space usage and low memory fragmentation

---

## ⚙️ Code Examples

```java
QueueLinkedList q1 = new QueueLinkedList();
q1.enqueue(1);
q1.enqueue(2);
System.out.println(q1.dequeue()); // 1
System.out.println(q1.peek());    // 2

QueueArray q2 = new QueueArray();
q2.enqueue(10);
q2.enqueue(20);
q2.dequeue();                     // removes 10
System.out.println(q2.peek());    // 20
```

### 📚 Applications
- CPU/IO scheduling
- BFS traversal (graphs/trees)
- Web request handling
- Message queues
- Cache systems

## 📊 Comparison: Linked List Queue vs Circular Array Queue

| Feature         | Linked List Queue    | Circular Array Queue           |
| --------------- | -------------------- | ------------------------------ |
| Growth          | Dynamic              | Dynamic (via resizing)         |
| Memory usage    | More (Node objects)  | Less (primitive array)         |
| Wrap-around     | No                   | Yes (`%` based indexing)       |
| Time complexity | O(1) enqueue/dequeue | O(1) avg, but resizing is O(n) |
