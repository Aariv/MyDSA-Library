# 🌐 MyGraph – Custom Graph Implementation in Java

This is a custom **Graph** data structure built from scratch in Java, using an adjacency list model — **without** using Java’s built-in `Map`, `List`, or `Set`.

> ✅ Supports directed edges, traversal algorithms, and full vertex/edge management.

---

## 📦 Features

| Feature               | Description                                 |
|----------------------|---------------------------------------------|
| `addVertex(label)`   | Add a new node                              |
| `addEdge(from, to)`  | Add a directed edge                         |
| `removeVertex(label)`| Delete a vertex and associated edges        |
| `removeEdge(from, to)`| Remove a directed edge                     |
| `hasEdge(from, to)`  | Check if an edge exists                     |
| `dfs(start)`         | Depth-first traversal from a node           |
| `bfs(start)`         | Breadth-first traversal from a node         |

---

## 🌐 Graph Structure

### Example

Insert the following edges:

````
A → B
A → C
B → D
C → D
D → E
````
### Adjacency List Diagram

```declarative
A → B → C
B → D
C → D
D → E
E → ∅
```


---

## 🔁 Traversal Examples

### DFS (Depth-First Search)
- Visits nodes deeply before backtracking.

#### Start from `A`

```
DFS from A: A B D E C
```
### BFS (Breadth-First Search)
- Visits neighbors level by level.

#### Start from `A`
```
BFS from A: A B C D E
```
## 🧠 Applications

| Domain           | Use Case                          |
|------------------|-----------------------------------|
| Social networks  | Friend/follow graph               |
| Maps & GPS       | Shortest path, road maps          |
| Game design      | Navigation meshes, level graphs   |
| Web crawling     | Page links                        |
| AI/ML            | Graph-based learning & inference  |
| Network design   | Routing, spanning trees           |


