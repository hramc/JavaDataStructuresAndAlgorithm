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
    - className : datastructures.linkedLists.SingleLinkedList
      - It has static class `Node` which holds integer value and reference to next node.
      - It also has below methods
        - Code snippet to generate single linked list 
        - Code snippet to find a Node reference based on the integer value.
        - Code snippet to add a node after an existing node.
        - Code snippet to print all node's integer values in order.
    - className: datastructures.linkedLists.DoubleLinkedList
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
    - className: algorithms.recursive.RecursiveFunctions
      - It has below methods
        - methodName: CountDown
          - This is a recursive function which get an integer value and print the all the values until it reach `Zero` and Print `Done!` in the end.
          - I have used ternary operator and did the string manipulation in one line. 
        - methodName: Power
          - This is a recursive function which gets 2 long values (value & powerOf) and calculates in recursive fashion.
          - I have used ternary operator and did the calculation in one line.
          - Note: Math.pow() library function does the same work. It is for learning purpose.
        - methodName: Factorial
          - This is a recursive function which gets a value and calculates in recursive fashion.
          - I have used ternary operator and did the calculation in one line.
          - It is for learning purpose.
        - methodName: FindMaxOrMin
          - This is a recursive function which gets an array of int values and calculates max or min value in the array based on the boolean indicator.
          - I have used ternary operator and did the calculation in one line.
          - It is for learning purpose.
    
### Sorting
#### Bubble Sort
  - It is very simple to understand and easy to implement sorting algorithm
  - Time complexity of the algorithm is O(n^2)
  - Because of time complexity it is not considered to be a practical solution.
  - Algorithm
    - Iterate the given array in a loop
    - Compare the element with rest of the other elements by looping again
    - Since, we are iterating loop inside another loop. it gets the time complexity of O(n*n) otherwise O(n^2)
    - comparison style determine the sorting type (ascending or descending). 
    - In this example, I have used boolean identifier to determine the sorting style. (For learning purpose)
  - Code Example
    - className: algorithm.sorting.Sorting
    - methodName: bubbleSort
       
#### Merge Sort
- It is a divide and conquer algorithm
  - Breaks a dataset recursively until it becomes individual element / sub-arrays 
  - Merge the individual elements / sub-arrays into bigger array
    - While merging, sort the sub-arrays. since, sub-arrays are calculated by earlier sub-arrays. It will be sorted already.
- Uses recursion to operate on datasets
- Performs well on large sets of data
- In general has a performance of O(n log n) time complexity
- Algorithm Approach
  - Find the mid-position of an Array. So, we can split the array into smaller sub-arrays
  - Separate into left & right array from the mid-position (using recursive)
  - Merge the both the arrays
    - While merging, sort the arrays.
    - Please be noted, the individual arrays already sorted.
      - We can use left & right counter and create a new array with both the sub-arrays data in sorted fashion.
  - comparison style determine the sorting type (ascending or descending).
  - In this example, I have used boolean identifier to determine the sorting style. (For learning purpose)
- Code Example
    - className: algorithm.sorting.Sorting
    - methodName: splitAndMerge
      - private sub-functions used: merge - to merge two sub-arrays and sort it.

#### Quick Sort
- It is a divide and conquer algorithm
- Uses recursion to perform sorting
- Generally perform better than merge sort, O(n log n)
- Operates in place on the data unlike Merge sort. where we create new arrays while merging the sub-arrays.
- Worst case is O(n2) when the dataset is already sorted.
- Difference from Merge
  - All the work done in the Merge step where we sort the 2 arrays while mering
  - In quick sort, All the work done in the Partition step where we group the lower and upper value from the pivot value.
  - Algorithm Approach
    - Find the partition position of an Array
      - Approach 1 (Choose the Pivot as Last Item):
        - Take last element as the pivot element
        - Loop from the first element and swap elements lower than pivot to left and elements higher than pivot to right.
        - Once, it is done you have an index+1 which will be swapped by pivot elements.
        - In this way, pivot elements takes the correct position.
      - Approach 2 (Choose the Pivot as First Item):
        - Take first element as the pivot element
        - Loop from the last element and swap elements lower than pivot to left and elements higher than pivot to right.
        - Once, it is done you have an index-1 which will be swapped by pivot elements.
        - In this way, pivot elements takes the correct position.
        - Separate into left and right array from the partition position (using recursive)
        - In this, we will sort the array while partition.
  - comparison style determine the sorting type (ascending or descending).
  - In this example, I have used boolean identifier to determine the sorting style. (For learning purpose)
- Code Example
  - className: algorithm.sorting.Sorting
  - methodName: quickSort
    - private sub-functions used: partitionByLastItem - which explains Approach 1 of partitioning the array.
    - private sub-functions used: partitionByFirstItem - which explains Approach 2 of partitioning the array.

### Searching
#### Linear Search
- Search the given array in linear fashion and try to find the given item is present or not.
  - if the item is present return the index position
  - otherwise return -1 as an indicator the give item is not present in the array
- Performance is O(n)
- Suited for unordered list or array.
- Code example
  - className: algorithm.search.Searching
  - methodName: findIndex

#### Binary Search
- Search the given sorted array in logarithmic fashion
  - Find mid-position of the array
  - compare the mid-position array value with given search item.
    - if the given search item is higher than mid-position item, compare the array larger than mid-position index.
    - if the given search item is lower than mid-position item, compare the array smaller than mid-position index.
    - iterate the above logic until you find the given search item in the mid-position of the array.
    - otherwise, there is no sub-array to explore.
  - if the item is present return the index position
  - otherwise return -1 as an indicator the give item is not present in the array
  - Code example
    - className: algorithm.search.Searching
    - methodName: findIndexByBinarySearch

#### Determine the Array is sorted or not. if sorted what is the type of the sort.
- I created this function for a learning purpose.
- It will return following data
  - 0 means the given array is not sorted.
  - 1 means the given array is sorted in ascending manner
  - 2 means the given array is sorted in descending manner.
  - Note: if the array contains only equal value items, it is considered as ascending manner array in my algorithm.