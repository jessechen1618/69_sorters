/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class SelectionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public SelectionSorter(  ArrayList< String> usersData) {
        super(usersData);
    }
    

    /**
      sort the user's data, implementing insertion sort
     */

    public void mySort() {
      for (int lowestIndex = 0; lowestIndex < elements.size(); lowestIndex++) {
        String dweeb = elements.get(lowestIndex);
        int dweebIndex = lowestIndex;
        for (int contestorIndex = lowestIndex; contestorIndex < elements.size(); contestorIndex++) {
          if(dweeb.compareTo(elements.get(contestorIndex)) > 0) {
            dweeb = elements.get(contestorIndex);
            dweebIndex = contestorIndex;
          }
        }
        elements.set(dweebIndex, elements.get(lowestIndex));
        elements.set(lowestIndex, dweeb);
      }
    }
}