# 🔽 MyMinHeap – Custom Min Binary Heap in Java

This is a custom implementation of a **Min Binary Heap** in Java, built from scratch without using any `java.util` collections.

---

## 💡 What is a Min Heap?

A **Min Heap** is a complete binary tree where:

- Every node is **less than or equal to its children**.
- The **root** is always the **smallest** element.
- It is commonly used to implement **priority queues**.

### 📦 Use Cases:
- Dijkstra’s shortest path algorithm
- Scheduling systems
- Heap sort
- Real-time top-K queries

---

## 🌲 Heap Structure (Tree & Array Representation)

### Tree:
```
     3
    / \
   5     10 
  / \    / 
 20 30 15
```
### Array:
```
[3, 5, 10, 20, 30, 15]
```

### Index Rules:
| Node        | Formula       |
|-------------|---------------|
| Left Child  | `2 * i + 1`   |
| Right Child | `2 * i + 2`   |
| Parent      | `(i - 1) / 2` |

---

## ⚙️ Supported Operations

| Method         | Description                             | Time Complexity |
|----------------|-----------------------------------------|------------------|
| `insert(val)`  | Add value to heap, then bubble up       | O(log n)         |
| `peek()`       | Return smallest (min) value             | O(1)             |
| `remove()`     | Remove min value, then bubble down      | O(log n)         |
| `size()`       | Return number of elements               | O(1)             |
| `isEmpty()`    | Check if heap is empty                  | O(1)             |
