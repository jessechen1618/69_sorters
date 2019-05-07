/** 
  test types of sorts that are polymorphic variations of Sorter
 */
import java.util.Arrays;
import java.util.ArrayList;

public class UserOfSorts {
    public static void main(String[] commandLine) {
        // arrays to be sorted
        ArrayList< String> unsorted = new ArrayList< String>(
          Arrays.asList("B", "A", "F", "J", "L", "N", "H", "C", "Z", "M", "Q", "Z"  ));

        // insertion sort                   
        oneTest( "insertion sort "
               , new InsertionSorter( unsorted)
               );
    }


    /** 
     Run one test
     */
    private static void oneTest( String description
                               , Sorter sorter
                               ) {
        System.out.println( System.lineSeparator() + description);
        sorter.mySort();
        System.out.println( sorter);
        System.out.println( "sorted: " + sorter.isSorted());
     }
}
