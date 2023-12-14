# JavaDataStructuresAndAlgorithm
Java Data Structures and Algorithm Examples 

## Data Structures
### Linked Lists
- It is a collection of elements where each element will be referred as `Node`
- A `Node` contain reference to the other nodes in the Linked list.
- It also holds whatever data the application needs.
- It has 2 types
  - Single linked lists are unidirectional list. since, it contains only next node reference.
  - Doubly linked lists are bidirectional list. since, it contains both next and previous node references.
- Limitation
  - Not allow constant time random access.
- Array Operations Time complexity
  - Search an item in the list: O(n)
  - Insert or delete an item in the beginning: O(1)
  - Insert or delete an item in the middle or end: O(n)
- Code Examples
  - Please refer the below source file for code samples
    - datastructures.linkedLists.SingleLinkedList
      - It has static class `Node` which holds integer value and reference to next node.
      - It also has below methods
        - Code snippet to generate single linked list 
        - Code snippet to find a Node reference based on the integer value.
        - Code snippet to add a node after an existing node.
        - Code snippet to print all node's integer values in order.
    - datastructures.linkedLists.DoubleLinkedList
      - It has static class `Node` which holds integer value and reference to next and previous nodes.
      - It also has below methods
        - Code snippet to generate double linked list
        - Code snippet to find a Node reference based on the integer value.
        - Code snippet to add a node after an existing node.
        - Code snippet to add a node before an existing node.
        - Code snippet to print all node's integer values in order.

## Algorithms
### Recursive
- Recursion is when a function calls itself.
- Recursive functions has the following characteristics 
  - Have a breaking condition. 
    - This breaking condition prevents infinite loops and eventual crashes.
    - Mostly, it will be in the beginning of the method.
  - Each time the function is called, the old arguments are saved, and it is called "call stack".
- Code Examples
  - Please refer the below source file for code samples
    - algorithms.recursive.RecursiveFunctions
      - It has below methods
        - CountDown
          - This is a recursive function which get an integer value and print the all the values until it reach `Zero` and Print `Done!` in the end.
          - I have used ternary operator and did the string manipulation in one line. 
        - Power
          - This is a recursive function which gets 2 long values (value & powerOf) and calculates in recursive fashion.
          - I have used ternary operator and did the calculation in one line.
          - Note: Math.pow() library function does the same work. It is for learning purpose.
        - Factorial
          - This is a recursive function which gets a value and calculates in recursive fashion.
          - I have used ternary operator and did the calculation in one line.
          - It is for learning purpose.
        - FindMaxOrMin
          - This is a recursive function which gets an array of int values and calculates max or min value in the array based on the boolean indicator.
          - I have used ternary operator and did the calculation in one line.
          - It is for learning purpose.
    
### Sorting
#### Bubble Sort
- Very simple to understand and implement
- Performance: O(n2)
- Not considered to be a practical solution

#### Merge Sort
- Divide and conquer algorithm
- Breaks a dataset into individual pieces and merges them
- Uses recursion to operate on datasets
- Performs well on large sets of data
- In general has a performance of O(n log n) time complexity
- Algorithm Approach
  - Find the mid-position of an Array
  - Separate into left & right array from the mid-position (using recursive)
  - Merge the both the arrays
  - While merging, sort the arrays.
  - Please be noted, the individual arrays already sorted.
  - We can use left & right counter and create a new array with all the data in sorted fashion.

#### Quick Sort
- Divide and conquer algorithm
- Uses recursion to perform sorting
- Generally perform better than merge sort, O(n log n)
- Operates in place on the data
- Worst case is O(n2) when the dataset is already sorted.
- Difference from Merge
  - All the work done in the Merge step where we sort the 2 arrays while mering
  - In quick sort, All the work done in the Partition step where we group the lower and upper value from the pivot value.
  - Algorithm Approach
    - Find the partition position of an Array
      - Approach 1:
        - Take last element as the pivot element
        - Loop from the first element and swap elements lower than pivot to left and elements higher than pivot to right.
        - Once, it is done you have a index+1 which will be swapped by pivot elements.
        - In this way, pivot elements takes the correct position.
      - Approach 2:
        - Take first element as the pivot element
        - Loop from the last element and swap elements lower than pivot to left and elements higher than pivot to right.
        - Once, it is done you have a index-1 which will be swapped by pivot elements.
        - In this way, pivot elements takes the correct position.
        - Separate into left and right array from the parition position (using recursive)
        - In this, we will sort the array while partition.
