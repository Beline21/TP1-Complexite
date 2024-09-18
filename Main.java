import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList <Integer>();
        list.add(6);
        list.add(5);
        list.add(9);
        list.add(7);
        list.add(4);
        list.add(2);
        list.add(2);
        //System.out.println(list);
        //System.out.println(QuickSort.quickSort(list, 0, list.size()-1, "Beginning"));
        //System.out.println(QuickSort.quickSort(list, "Median"));

        // Tableaux dans le pire des cas
        for (int j = 1; j < 10; j++) {
            ArrayList<Integer> list2 = new ArrayList <Integer>();
            for (int i = j; i >= 0; i--) {
                list2.add(i);
            }
            System.out.println(list2);
            System.out.println(QuickSort.quickSort(list2, "Beginning"));
        }
    }
}
