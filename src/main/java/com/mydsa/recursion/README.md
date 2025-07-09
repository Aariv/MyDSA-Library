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


