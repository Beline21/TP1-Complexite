import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Tableaux dans le pire des cas (déjà trié)
        for (int j = 1; j < 10; j++) {
            ArrayList<Integer> list2 = new ArrayList <Integer>();
            for (int i = 0; i < j; i++) {
                list2.add(i);
            }
            //System.out.println(list2);
            //System.out.println(QuickSort.quickSort(list2, "Beginning"));
        }

        // Tableaux remplis aléatoirement
        for (int j = 1; j < 10; j++) {
            ArrayList<Integer> list3 = new ArrayList <Integer>();
            for (int i = 0; i < j; i++) {
                list3.add((int)(Math.random() * 10));
            }
            System.out.println(list3);
            //System.out.println(QuickSort.quickSort(list3, "Beginning"));
            System.out.println(QuickSort.quickSort(list3, "Median"));
        }
    }
}
