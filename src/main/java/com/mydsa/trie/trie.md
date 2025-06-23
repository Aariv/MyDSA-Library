# 🔡 MyTrie – Custom Trie (Prefix Tree) in Java

This is a custom implementation of a **Trie (Prefix Tree)** in Java to efficiently store and retrieve strings by prefix.

> 🔍 Tries allow **fast prefix searches**, making them perfect for autocomplete, spell-checkers, and dictionary operations.

---

## 🌱 What is a Trie?

A **Trie** is a tree-like data structure for storing a dynamic set of strings where keys share common prefixes.

### ✅ Key Properties:

- Each node represents a character.
- Paths from root to a node form prefixes.
- Leaf (or marked) nodes represent complete words.

---

## 🌲 Visual Example

### Words inserted:

````
["apple", "app", "ape"]
````
### Trie Structure:

```
        root
         |
         a
         |
         p
        / \
       p   e
      / \   \
     l   e   a
    /     \   \
   e       p   p
            |
            l
```
### Array Representation (for visualization):

```
[
  [null, 'a'],        // root
  ['a', 'p'],        // 'a'
  ['p', 'p', 'e'],   // 'p'
  ['p', 'l'],        // second 'p'
  ['l', 'e'],        // 'l'
  ['e']              // 'e'
]
```

✅ Nodes marked with `(✓)` are end of valid words.

---

## ⚙️ Supported Operations

| Method             | Description                                  | Time Complexity |
|--------------------|----------------------------------------------|------------------|
| `insert(word)`     | Inserts a word into the trie                 | O(L)             |
| `search(word)`     | Checks if the word exists in the trie       | O(L)             |
| `startsWith(prefix)` | Checks if any word starts with given prefix | O(L)             |

> Where `L` is the length of the word/prefix.

---
## 🧠 Real-World Applications

| Domain              | Use Case                                     |
|---------------------|----------------------------------------------|
| Autocomplete        | Suggest words from a prefix                  |
| Spell Checker       | Check if word exists in dictionary           |
| Search Engines      | Fast prefix-based search                     |
| IP Routing          | Longest prefix match                         |
| Word Games          | Scrabble, Boggle, Crossword solvers          |
| Bioinformatics      | Matching DNA sequences                       |

---
