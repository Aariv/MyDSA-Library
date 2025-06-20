# 🌳 MyBinarySearchTree – Custom BST Implementation in Java

This module implements a custom **Binary Search Tree (BST)** from scratch. It supports basic operations like insertion, deletion, search, and different traversals (in-order, pre-order, post-order).

---

## 💡 What is a Binary Search Tree?

A **Binary Search Tree** is a tree data structure where:

- Each node has **at most two children**: left and right.
- For any given node:
    - Left subtree contains nodes with **smaller** values.
    - Right subtree contains nodes with **larger** values.

---

## 🧠 Visual Diagram

### Tree:

```
        40
       /  \
     20    60
    / \    / \
   10 30  50 70
```


### InOrder (LNR): `10 20 30 40 50 60 70`
### PreOrder (NLR): `40 20 10 30 60 50 70`
### PostOrder (LRN): `10 30 20 50 70 60 40`

---

## ⚙️ Supported Operations

| Method             | Description                             | Time (avg) | Time (worst) |
|--------------------|-----------------------------------------|------------|--------------|
| `insert(value)`    | Insert a value into the tree            | O(log n)   | O(n)         |
| `search(value)`    | Check if a value exists                 | O(log n)   | O(n)         |
| `delete(value)`    | Delete a node while preserving BST      | O(log n)   | O(n)         |
| `inOrder()`        | Left → Root → Right traversal           | O(n)       | O(n)         |
| `preOrder()`       | Root → Left → Right traversal           | O(n)       | O(n)         |
| `postOrder()`      | Left → Right → Root traversal           | O(n)       | O(n)         |

---

