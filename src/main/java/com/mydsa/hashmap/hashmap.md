# 🗺️ MyHashMap<K, V> – Custom HashMap in Java

This module implements a generic **HashMap** (also known as a Dictionary or Associative Array) from scratch using:

- ✅ Separate chaining (Linked Lists)
- ✅ Dynamic resizing (rehashing)
- ✅ Support for null keys and values
- ✅ Constant time average access

---

## 💡 What is a HashMap?

A **HashMap** stores key-value pairs with fast lookups using a hash function.  
It allows `put(K, V)`, `get(K)`, and `remove(K)` operations in average **O(1)** time.

---

## 🧠 Internal Structure

```text
+--------+     +--------------------------+
| Bucket | --> | (key, value) → next      |
| Array  |     +--------------------------+
| [0]    |     | (null, "foo") → null     |
| [1]    |     +--------------------------+
| [2]    | --> null
| [3]    | --> | (key1, val1) → (key2, val2) → null
| ...    |     ...
```
- Each bucket is a LinkedList of key-value pairs.

- Collisions are handled by chaining entries in the same index.

- The array resizes when load factor > 0.75.

### ⚙️ Core Features
| Method           | Description                     | Time (avg) | Time (worst) |
| ---------------- | ------------------------------- | ---------- | ------------ |
| `put(K, V)`      | Insert or update key-value pair | O(1)       | O(n)         |
| `get(K)`         | Retrieve value by key           | O(1)       | O(n)         |
| `remove(K)`      | Delete key-value pair           | O(1)       | O(n)         |
| `containsKey(K)` | Check if key exists             | O(1)       | O(n)         |
| `size()`         | Return number of entries        | O(1)       | O(1)         |
| `isEmpty()`      | Check if map has no entries     | O(1)       | O(1)         |

### ✍️ Sample Usage

```java
MyHashMap<String, Integer> map = new MyHashMap<>();

map.put("apple", 1);
map.put("banana", 2);
map.put("apple", 3); // update

System.out.println(map.get("apple"));  // 3
System.out.println(map.containsKey("banana"));  // true

map.remove("banana");
System.out.println(map.size());  // 1
```


