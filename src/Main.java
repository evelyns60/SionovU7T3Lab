import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
     /*   ArrayList<String> names = new ArrayList<String>();
        names.add("Jamal");
        names.add("Emily");
        names.add("Destiny");
        names.add("Mateo");

        //COMPLETE ME: print each name using an index based for loop
        for (int i = 0; i < names.size(); i ++) {
            System.out.println(names.get(i));
        }
        //COMPLETE ME: print each name (again) using enhanced for loop
        for (String name : names) {
            System.out.println(name);
        }
        //COMPLETE ME: print each name (a third time) using a while loop
        int i = 0;
        while (i < names.size()) {
            System.out.println(names.get(i));
            i++;
        }

      */

        /*

        // Add to your runner class
        ArrayList<Cat> catList = new ArrayList<Cat>();
        catList.add(new Cat("Patty"));
        catList.add(new Cat("Keith"));
        catList.add(new Cat("Jerry"));
        catList.add(new Cat("Mary"));

        // COMPLETE ME: print each Cat’s name using a
        // standard for loop
        for (int i = 0; i < catList.size(); i ++) {
            System.out.println(catList.get(i));
        }
        // COMPLETE ME: print each Cat’s name using an
        // enhanced for loop
        for (Cat cat: catList) {
            System.out.println(cat);
        }

        */

        ArrayList<Integer> numList = new ArrayList<> (Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10, 11));
        for (int i = 1; i < numList.size() - 2; i ++) {
            if (numList.get(i - 1) % 2 == 0) {
                numList.set(i, numList.get(i + 1) + numList.get(i + 2));
            }
        }
        System.out.println(numList);
    }
}
