/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(  ArrayList< String> usersData) {
        super(usersData);
    }
    

    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
      int currentMarker = 1;
      int currentIndex = 0;
      for (String el : elements) {
        if (currentIndex != 0 && currentIndex < elements.size()) {
          while(currentIndex > 0 && el.compareTo(elements.get(currentIndex - 1)) < 0) {
            elements.set(currentIndex, elements.get(currentIndex - 1));
            elements.set(currentIndex - 1, el);
            currentIndex--;
          }
        }
        currentIndex = currentMarker;
        currentMarker++;
      }
    }
}
