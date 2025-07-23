### Call Stack Trace for pow(2, 3):
```
pow(2, 3)
=> 2 * pow(2, 2)
        => 2 * pow(2, 1)
                => 2 * pow(2, 0)
                        => 1 (Base case)
                => 2 * 1 = 2
        => 2 * 2 = 4
=> 2 * 4 = 8
```
### Stack Visual:
```
| Call        | Return Value |
| ----------- | ------------ |
| `pow(2, 0)` | `1` (base)   |
| `pow(2, 1)` | `2 * 1 = 2`  |
| `pow(2, 2)` | `2 * 2 = 4`  |
| `pow(2, 3)` | `2 * 4 = 8`  |
```
### Generate Parentheses
```
start: open=0, close=0, sb=""

→ (
open=1, close=0, sb="("

→ (
open=2, close=0, sb="(("

→ (
open=3, close=0, sb="((("

→ )
open=3, close=1, sb="((()"

→ )
open=3, close=2, sb="((())"

→ )
open=3, close=3, sb="((()))"

✅ valid → added to result
 ```
 ### Generate Binary String
 
 ```
           ""
        /    \
      0        1
     / \      / \
   00  01   10  11
  / \  / \  / \  / \
000 001 010 011 100 101 110 111
 ```
 
