import java.util.ArrayList;

public class Driver {
 public static void main( String [] args )
  {
    
      System.out.println("\n\n\n" + "----------*** Insertion Testing (void) version... ***---------- ");
      ArrayList paul = new ArrayList<Integer>();
      paul.add(7);
      paul.add(1);
      paul.add(5);
      paul.add(12);
      paul.add(3);

      System.out.println(" number of passes average case: " + Sorts.insertionSort(paul));

      ArrayList insertionWorst = new ArrayList<Integer>();
      insertionWorst.add(5);
      insertionWorst.add(4);
      insertionWorst.add(3);
      insertionWorst.add(2);
      insertionWorst.add(1);
      System.out.println(" number of passes worst case: " + Sorts.insertionSort(insertionWorst));

/*
      ArrayList sally = populate( 10, 1, 1000 );
      System.out.println( "\nArrayList sally before sorting:\n" + sally );
      Sorts.insertionSort(sally);
      System.out.println( "\nArrayList sally after sorting:\n" + sally );
*/

      System.out.println("\n\n\n"+ "----------*** BubbleSort Testing (void) version... ***---------- ");
      ArrayList mark = new ArrayList<Integer>();
      mark.add(7);
      mark.add(1);
      mark.add(5);
      mark.add(12);
      mark.add(3);
      Sorts.bubbleSort(mark);
      System.out.println(" number of passes average case: " + Sorts.bubbleSort(paul));

      ArrayList bubbleWorst = new ArrayList<Integer>();
      bubbleWorst.add(5);
      bubbleWorst.add(4);
      bubbleWorst.add(3);
      bubbleWorst.add(2);
      bubbleWorst.add(1);
      System.out.println(" number of passes worst case: " + Sorts.bubbleSort(bubbleWorst));

/*
      ArrayList mary = populate( 10, 1, 1000 );
      System.out.println( "ArrayList mary before sorting:\n" + mary );
      Sorts.bubbleSort(mary);
*/

     System.out.println("\n\n\n"+"----------*** SelectionSort Testing (void) version... ***---------- ");
    ArrayList glen = new ArrayList<Integer>();
    glen.add(7);
    glen.add(1);
    glen.add(5);
    glen.add(12);
    glen.add(3);
    Sorts.selectionSort(glen);
    System.out.println(" number of passes average case: " + Sorts.selectionSort(glen));


    ArrayList selectionWorst = new ArrayList<Integer>();
    selectionWorst.add(5);
    selectionWorst.add(4);
    selectionWorst.add(3);
    selectionWorst.add(2);
    selectionWorst.add(1);
    System.out.println(" number of passes worst case: " + Sorts.selectionSort(selectionWorst));

/*
    ArrayList coco = populate( 10, 1, 1000 );
    System.out.println( "ArrayList coco before sorting:\n" + coco );
    Sorts.selectionSort(coco);
*/
}
}
