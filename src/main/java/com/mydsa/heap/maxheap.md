# 🔼 MyMaxHeap – Custom Max Binary Heap in Java

This module provides a clean, custom implementation of a **Max Binary Heap** in Java without using any built-in collections like `PriorityQueue` or `ArrayList`.

---

## 💡 What is a Max Heap?

A **Max Heap** is a complete binary tree where:

- Every parent node is **greater than or equal to** its child nodes.
- The **root** always contains the **maximum** value.
- Internally represented as a **contiguous array** for performance.

### ✅ Use Cases:
- Priority queue implementation
- Real-time max retrieval
- Scheduling and simulations
- Heap sort
- Algorithms like Huffman Encoding

---

## 🌲 Heap Visualization

### Binary Tree:
```
    30
    /  \
   15    20
   / \   /
  5  10 3
```
### Array Representation:
```
[30, 15, 20, 5, 10, 3]
```

### Index Rules:
| Relation       | Formula       |
|----------------|---------------|
| Left Child     | `2 * i + 1`   |
| Right Child    | `2 * i + 2`   |
| Parent         | `(i - 1) / 2` |

---

## ⚙️ Features & API

| Method         | Description                                | Time Complexity |
|----------------|--------------------------------------------|------------------|
| `insert(val)`  | Adds a value to the heap                   | O(log n)         |
| `peek()`       | Returns the largest value without removing | O(1)             |
| `remove()`     | Removes and returns the max value          | O(log n)         |
| `size()`       | Number of elements                         | O(1)             |
| `isEmpty()`    | Checks if heap is empty                    | O(1)             |

