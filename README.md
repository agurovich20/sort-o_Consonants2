# sort-o_Consonants2
# TNPG : Consonants2
## SotW: Survival Tactics - Joey Bada$$
### Roster: Ari Gurovich, Oscar Breen, Marcus Wu

*assumes all methods is to sort to ascending order* 
## BubbleSort
  * Best Case Scenario
     * Sorted in ascending order [1 , 2 , 3 , 4 ,5]
       * Reasoning: The lsit is already sorted so it will go through it with zero swaps
     * Swaps: 0
     * Comparisons: 45
     * Passes: 9
     * put O value here ( maybe O(0) ?)
  * Worst Case Scenario
     * Sorted in descending order [5 , 4 , 3 , 2 , 1]
       * Reasoning: in this case Bubble sort is required to walk every large number to its correct spot.
     * Swaps: 45
     * Comparisons: 45
     * Passes: 9
     * put O value here
## SelectionSort
  * Best Case Scenario
     * Sorted in ascending order [1 , 2 , 3 , 4 , 5]
       * Reasoning: The lsit is already sorted so it will go through it with zero swaps
     * Swaps: 0
     * Comparisons: 0
     * Passes: 10
     * put O value here
  * Worst Case Scenario
     * Everything in incorrect position [4 , 5 , 1 , 2 , 3]
       * Reasoning: while the comaprisons number for all of the cases of the same size for Selection Sort are the same,            our code only switches them if it is not already in the wrong place giving this array many more switches than            the best case
     * Swaps: 8
     * Comparisons: 14
     * Passes: 10
     * put O value here
## InsertionSort
  * Best Case Scenario
     * Sorted in ascending order [1 , 2 , 3 , 4 ,5]
       * Reasoning: The list is already sorted so it will go through it with zero swaps
     * Swaps: 0
     * Comparisons: 9
     * Passes: 9
     * put O value here
  * Worst Case Scenario
     * Sorted in descending order [5 , 4 , 3 , 2 , 1]
        * Reasoning: The method is required to swap every single element with every other element it has already sorted
     * Swaps: 45
     * Comparisons: 45
     * Passes: 9
     * put O value here


