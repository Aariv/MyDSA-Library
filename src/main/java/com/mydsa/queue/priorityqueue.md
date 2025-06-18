# 🥇 Priority Queue – Java Implementation

This module provides two implementations of a **Priority Queue**:

1. `PriorityQueueArray.java` – Based on **Min-Heap**
2. `PriorityQueueLinkedList.java` – Based on **Sorted Linked List**

---

## 💡 What is a Priority Queue?

A **Priority Queue** is a special type of queue where **elements are dequeued based on priority**, not insertion order.

Unlike FIFO queues, it always removes the element with the **highest priority** (for Max-Heap) or **lowest value** (for Min-Heap).

---

## 📊 Visual Example

````
Insert: [5, 3, 9, 1]

Min-Heap (Binary Tree):
1
/
3 9
/
5

Polling Order (min): 1 → 3 → 5 → 9
````

Or in Linked List (sorted on insert):
````
Head → [1] → [3] → [5] → [9]
````

---

## 🧱 Implementations

### ✅ 1. `PriorityQueueArray.java`

- Min-Heap using **binary heap array**
- Fast insert and delete: `O(log n)`
- Dynamically resizes the internal array

### ✅ 2. `PriorityQueueLinkedList.java`

- Maintains a **sorted linked list**
- Insert takes `O(n)`, but `poll()` is `O(1)`
- Easy to understand and test

---

## ✍️ Sample Usage

```java
PriorityQueueArray pq1 = new PriorityQueueArray();
pq1.insert(10);
pq1.insert(3);
pq1.insert(7);
System.out.println(pq1.poll()); // 3 (lowest value)

PriorityQueueLinkedList pq2 = new PriorityQueueLinkedList();
pq2.insert(5);
pq2.insert(2);
System.out.println(pq2.peek()); // 2
````

### Operations Supported

| Operation   | Description                         | Time Complexity (Array) | Time Complexity (LinkedList) |
| ----------- | ----------------------------------- | ----------------------- | ---------------------------- |
| `insert(x)` | Add an element to the queue         | O(log n)                | O(n)                         |
| `poll()`    | Remove and return highest priority  | O(log n)                | O(1)                         |
| `peek()`    | Return highest priority (no remove) | O(1)                    | O(1)                         |
| `size()`    | Return number of elements           | O(1)                    | O(n)                         |
| `isEmpty()` | Check if queue is empty             | O(1)                    | O(1)                         |
