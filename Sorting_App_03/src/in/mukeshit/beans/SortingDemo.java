package in.mukeshit.beans;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class SortingDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(21);
        al.add(32);
        al.add(5);
        al.add(8);
        System.out.println("Elements Before Sorting::" + al);
        
        Collections.sort(al, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1 > o2) ? 1 : (o1 < o2) ? -1 : 0;
            }
        });

        System.out.println("Elements After Sorting::" + al);
    }
}

    /*static class ElementsSortingComparator implements Comparator<Integer> { // Corrected generic type

        @Override
        public int compare(Integer o1, Integer o2) { // Corrected parameter types
			
			 * if (o1 > o2) { return 1; } else if (o1 < o2) { return -1; } else { return 0;
			 * }
			 
      //  return  	(o1 > o2)? 1:(o1<o2) ? -1: 0;
        }
    }
}
*/