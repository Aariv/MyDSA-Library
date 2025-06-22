# 🧮 MyPriorityQueue – Custom Priority Queue in Java

This module implements a **Priority Queue** using a custom-built **Max Binary Heap** (`MyMaxHeap`). It allows fast retrieval and removal of the **highest-priority element**, where higher values mean higher priority.

> 💡 Unlike Java’s `PriorityQueue`, this version uses a **max-heap** by default.

---

## 💡 What Is a Priority Queue?

A **Priority Queue** is a data structure where elements are ordered based on priority rather than insertion time.

- In a **Max Priority Queue**, the element with the **highest value** has the highest priority.
- Internally, it's implemented using a **binary heap** for optimal performance.

---

## 🔄 Visual Representation

### Binary Heap Tree:
````
     50
    /  \
   30    40
   / \    /
  10 20 15
````
### Array Representation:
````
[50, 30, 40, 10, 20, 15]
````

---

## ⚙️ API and Operations

| Method         | Description                                      | Time Complexity |
|----------------|--------------------------------------------------|------------------|
| `offer(val)`   | Add value with default priority (value = priority) | O(log n)         |
| `peek()`       | View the highest-priority element                | O(1)             |
| `poll()`       | Remove and return the highest-priority element   | O(log n)         |
| `isEmpty()`    | Return true if queue is empty                    | O(1)             |
| `size()`       | Number of elements in queue                      | O(1)             |

---