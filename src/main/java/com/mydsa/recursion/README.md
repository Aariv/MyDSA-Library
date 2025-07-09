### Recursion

When a function calls itself until a specified condition is met, it is known as recursion. 
This is a powerful technique that can simplify code for problems that can be broken down into smaller subproblems.

### Recursion Tree

A recursion tree is a visual representation of the recursive calls made by a function.
It helps to understand how the function operates and how many times it is called. Each node in the tree represents a function call, and the edges represent the recursive calls made by that function.

### Terminologies
- **Base Case**: The condition under which the recursion stops. It prevents infinite recursion.
- **Recursive Case**: The part of the function that calls itself with modified arguments, moving towards the base case.
- **Stack Overflow**: An error that occurs when the recursion goes too deep, exceeding the call stack limit. This can happen if the base case is not defined correctly or if the recursion depth is too high.
- **Memoization**: An optimization technique that stores the results of expensive function calls and returns the cached result when the same inputs occur again. This can significantly improve performance for recursive functions, especially in cases like Fibonacci sequence calculations.
- **Tail Recursion**: A specific type of recursion where the recursive call is the last operation in the function. This can be optimized by the compiler to avoid increasing the call stack depth, thus preventing stack overflow.
- **Recursion Depth**: The number of recursive calls made before reaching the base case. It is important to manage recursion depth to avoid stack overflow errors.
- **Recursive Function**: A function that calls itself to solve a problem. It typically consists of a base case and a recursive case.
- **Recursive Algorithm**: An algorithm that uses recursion to solve a problem. It breaks down the problem into smaller subproblems, solves each subproblem recursively, and combines the results to solve the original problem.

### Parameterized Recursion
Parameterized recursion is a type of recursion where the recursive function takes parameters that influence its behavior. This allows the function to operate on different inputs and can lead to more flexible and reusable code.
### Types of Recursion
- **Direct Recursion**: A function that calls itself directly.
- **Indirect Recursion**: A function that calls another function, which in turn calls the first function. This can create a cycle of function calls.
- **Tail Recursion**: A specific type of recursion where the recursive call is the last operation in the function. This can be optimized by the compiler to avoid increasing the call stack depth, thus preventing stack overflow.
- **Head Recursion**: A type of recursion where the recursive call is made before any other operations in the function. This can lead to deeper recursion and is less efficient than tail recursion.
- **Tree Recursion**: A type of recursion where a function makes multiple recursive calls, creating a tree-like structure of function calls. This can lead to exponential growth in the number of calls and is often used in problems like generating combinations or permutations.
- **Linear Recursion**: A type of recursion where a function makes a single recursive call in each invocation. This is the most common form of recursion and is used in problems like calculating factorials or Fibonacci numbers.
- **Binary Recursion**: A type of recursion where a function makes two recursive calls in each invocation. This is often used in problems like binary search or tree traversals.
- **Mutual Recursion**: A type of recursion where two or more functions call each other in a cycle. This can be used to solve problems that require alternating behavior between functions.
- **Nested Recursion**: A type of recursion where a function makes a recursive call within another recursive call. This can lead to complex behavior and is often used in problems like the Ackermann function.
- **Exponential Recursion**: A type of recursion where the number of recursive calls grows exponentially with the input size. This is often seen in problems like calculating Fibonacci numbers without memoization or solving combinatorial problems.

### Problems on Recursion

### Basic Problems

- [Print Name 5 Times](print_name_5_times.md)
- [Print Liner Numbers](print_linear_numbers.md)
- [Print N to 1](print_n_to_1.md)
- [Print Liner Numbers Backward](print_linear_numbers_backward.md)
- [Print N to 1 Backward](print_n_to_1_backward.md)

### Medium Problems
- [Factorial](factorial.md)
- [Fibonacci](fibonacci.md)
- [Power](power.md)
- [Sum of Digits](sum_of_digits.md)
- [Reverse a String](reverse_string.md)
- [Binary Search](binary_search.md)
- [Permutations](permutations.md)
- [Combinations](combinations.md)
- [Subsets](subsets.md)
- [Tower of Hanoi](tower_of_hanoi.md)
- [Palindrome](palindrome.md)
- [Count Paths in a Grid](count_paths_in_grid.md)
- [Generate Parentheses](generate_parentheses.md)
- [Longest Common Subsequence](longest_common_subsequence.md)
- [Edit Distance](edit_distance.md)
- [Coin Change](coin_change.md)
- [Knapsack Problem](knapsack_problem.md)
- [Subset Sum Problem](subset_sum_problem.md)
- [Combination Sum](combination_sum.md)
- [Word Break Problem](word_break_problem.md)
- [Find All Anagrams in a String](find_all_anagrams_in_a_string.md)


