import java.util.ArrayList;

public class Driver {
 public static void main( String [] args )
  {
    
      System.out.println("\n\n\n" + "----------*** Insertion Testing (void) version... ***---------- ");
      ArrayList paul = new ArrayList<Integer>();
      paul.add(205);
      paul.add(1);
      paul.add(4);
      paul.add(13);
      paul.add(21);
      paul.add(22);
      paul.add(6);
      paul.add(5);
      paul.add(18);
      paul.add(2);

      System.out.println("\nAverage Case " );
Sorts.insertionSort(paul);

      ArrayList insertionWorst = new ArrayList<Integer>();
      insertionWorst.add(10);
      insertionWorst.add(9);
      insertionWorst.add(8);
      insertionWorst.add(7);
      insertionWorst.add(6);
      insertionWorst.add(5);
      insertionWorst.add(4);
      insertionWorst.add(3);
      insertionWorst.add(2);
      insertionWorst.add(1);

      System.out.println("\nWorst case: " );
Sorts.insertionSort(insertionWorst);

      ArrayList insertionBest = new ArrayList<Integer>();
      insertionBest.add(1);
      insertionBest.add(2);
      insertionBest.add(3);
      insertionBest.add(4);
      insertionBest.add(5);
      insertionBest.add(6);
      insertionBest.add(7);
      insertionBest.add(8);
      insertionBest.add(9);
      insertionBest.add(10);

      System.out.println("\nBest case: " );
Sorts.insertionSort(insertionBest);


/*
      ArrayList sally = populate( 10, 1, 1000 );
      System.out.println( "\nArrayList sally before sorting:\n" + sally );
      Sorts.insertionSort(sally);
      System.out.println( "\nArrayList sally after sorting:\n" + sally );
*/

      System.out.println("\n\n\n"+ "----------*** BubbleSort Testing (void) version... ***---------- ");
      ArrayList mark = new ArrayList<Integer>();
      mark.add(205);
      mark.add(1);
      mark.add(4);
      mark.add(13);
      mark.add(21);
      mark.add(22);
      mark.add(6);
      mark.add(5);
      mark.add(18);
      mark.add(2);
      System.out.println("\nAverage Case " );
 Sorts.bubbleSort(mark);

      ArrayList bubbleWorst = new ArrayList<Integer>();
      bubbleWorst.add(10);
      bubbleWorst.add(9);
      bubbleWorst.add(8);
      bubbleWorst.add(7);
      bubbleWorst.add(6);
      bubbleWorst.add(5);
      bubbleWorst.add(4);
      bubbleWorst.add(3);
      bubbleWorst.add(2);
      bubbleWorst.add(1);
      System.out.println("\nWorst case: " );
Sorts.bubbleSort(bubbleWorst);

      ArrayList bubbleBest = new ArrayList<Integer>();
      bubbleBest.add(1);
      bubbleBest.add(2);
      bubbleBest.add(3);
      bubbleBest.add(4);
      bubbleBest.add(5);
      bubbleBest.add(6);
      bubbleBest.add(7);
      bubbleBest.add(8);
      bubbleBest.add(9);
      bubbleBest.add(10);
      System.out.println("\nBest case: ");
Sorts.bubbleSort(bubbleBest);



/*
      ArrayList mary = populate( 10, 1, 1000 );
      System.out.println( "ArrayList mary before sorting:\n" + mary );
      Sorts.bubbleSort(mary);
*/

      System.out.println("\n\n\n"+"----------*** SelectionSort Testing (void) version... ***---------- ");
      ArrayList glen = new ArrayList<Integer>();
      glen.add(205);
      glen.add(1);
      glen.add(4);
      glen.add(13);
      glen.add(21);
      glen.add(22);
      glen.add(6);
      glen.add(5);
      glen.add(18);
      glen.add(2);
      System.out.println("\nAverage Case ");
 Sorts.selectionSort(glen);

      ArrayList selectionWorst = new ArrayList<Integer>();
      selectionWorst.add(9);
      selectionWorst.add(10);
      selectionWorst.add(8);
      selectionWorst.add(6);
      selectionWorst.add(7);
      selectionWorst.add(1);
      selectionWorst.add(3);
      selectionWorst.add(4);
      selectionWorst.add(5);
      selectionWorst.add(2);
      System.out.println("\nWorst case: " );
Sorts.selectionSort(selectionWorst);

      ArrayList selectionBest = new ArrayList<Integer>();
      selectionBest.add(1);
      selectionBest.add(2);
      selectionBest.add(3);
      selectionBest.add(4);
      selectionBest.add(5);
      selectionBest.add(6);
      selectionBest.add(7);
      selectionBest.add(8);
      selectionBest.add(9);
      selectionBest.add(10);
      System.out.println("\nBest case: ");
Sorts.selectionSort(selectionBest);

/*
    ArrayList coco = populate( 10, 1, 1000 );
    System.out.println( "ArrayList coco before sorting:\n" + coco );
    Sorts.selectionSort(coco);
*/
}
}

