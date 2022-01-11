# sort-o_Consonants2
# TNPG : Consonants2
## SotW: Survival Tactics - Joey Bada$$
### Roster: Ari Gurovich, Oscar Breen, Marcus Wu

*assumes all methods is to sort to ascending order* 
## BubbleSort
  * Best Case Scenario
     * Sorted in ascending order [1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10] 
       * Reasoning: The list is already sorted so it will go through it with zero swaps
     * Swaps: 0
     * Comparisons: 45
     * Passes: 9
     * O(n^2)
       // *    It is completed with 0 swaps, and will be the same for all sorted arrays, thus a constant (if we were measuring comparisons it would be O(n^2)) 
  * Worst Case Scenario
     * Sorted in descending order [10 , 9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1]
       * Reasoning: in this case Bubble sort is required to walk every large number to its correct spot.
     * Swaps: 45
     * Comparisons: 45
     * Passes: 9
     * O(n^2)
       // * Increases exponentially from size, Sum is n(n-1)/2 
## SelectionSort

//data insensitive 

  * Best Case Scenario
     * Sorted in ascending order [1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10]
       //* Reasoning: The list is already sorted so it will go through it with zero swaps
     * Swaps: 0
     * Comparisons: 0
     * Passes: 10
     * O(n^2)
       // * It is completed with 0 swaps, and will be the same for all sorted arrays, thus a constant 
  * Worst Case Scenario
     * Everything in incorrect position [9 , 10 , 8 , 6 , 7 , 1 , 3 , 4 , 5 , 2]
       * Reasoning: while the comaprisons number for all of the cases of the same size for Selection Sort are the same,            our code only switches them if it is not already in the wrong place giving this array many more switches than            the best case
     * Swaps: 8
     * Comparisons: 14
     * Passes: 10
     * O(n^2)
        //* Increases linearly with array size ( was 4 swaps for a 5 size array)
## InsertionSort
  * Best Case Scenario
     * Sorted in ascending order [1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10]
       * Reasoning: The list is already sorted so it will go through it with zero swaps
     * Swaps: 0
     * Comparisons: 9
     * Passes: 9
     * O(n)
       * It is completed with 0 swaps, and will be the same for all sorted arrays, thus a constant 
  * Worst Case Scenario
     * Sorted in descending order [10 , 9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1]
        * Reasoning: The method is required to swap every single element with every other element it has already sorted
     * Swaps: 45
     * Comparisons: 45
     * Passes: 9
     * O(n^2)
        * Increases exponentially from size, Sum is n(n-1)/2


