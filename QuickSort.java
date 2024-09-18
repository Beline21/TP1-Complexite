import java.util.ArrayList;
import java.lang.Math;

public class QuickSort {

    public static ArrayList<Integer> quickSort(ArrayList<Integer> list, String choix) {
        if ("Beginning".equals(choix)) {
            return quickSortB(list, 0, list.size()-1);
        } else if ("Median".equals(choix)) {
            return quickSortM(list, 0, list.size()-1);
        } else {
            throw new IllegalArgumentException("Invalid choix: " + choix);
        }
    }

    public static ArrayList<Integer> quickSortB(ArrayList<Integer> list, int beginIndex, int endIndex){

        int pivot = beginIndex;
        int i = endIndex;

        while (i != pivot){
            if (i-pivot > 0) {
                if (list.get(i) < list.get(pivot)) {
                    switchList(list, pivot, i);
                    int tmp = i;
                    i = pivot;
                    pivot = tmp;
                }
            }
            else {
                if (list.get(i) >= list.get(pivot)) {
                    switchList(list, pivot, i);
                    int tmp = i;
                    i = pivot;
                    pivot = tmp;
                }
            }
            i = i + (pivot - i) / Math.abs(i - pivot);
        }
        //System.out.println("liste : " + list);
        //System.out.println("pivot : " + list.get(pivot));

        if (pivot-1 > beginIndex) {
            quickSortB(list, beginIndex, pivot-1);
        }
        if (pivot+1 < endIndex) {
            quickSortB(list, pivot + 1, endIndex);
        }
        return list;
    }

    public static ArrayList<Integer> quickSortM(ArrayList<Integer> list, int beginIndex, int endIndex){

        int pivot = beginIndex + (endIndex - beginIndex) / 2;

        switchList(list, pivot, beginIndex);
        //System.out.println("LAAAA liste : " + list);
        //System.out.println("pivotttt : " + list.get(pivot));

        pivot = beginIndex;
        int i = endIndex;

        while (i != pivot){
            if (i-pivot > 0) {
                if (list.get(i) < list.get(pivot)) {
                    switchList(list, pivot, i);
                    int tmp = i;
                    i = pivot;
                    pivot = tmp;
                }
            }
            else {
                if (list.get(i) >= list.get(pivot)) {
                    switchList(list, pivot, i);
                    int tmp = i;
                    i = pivot;
                    pivot = tmp;
                }
            }
            i = i + (pivot - i) / Math.abs(i - pivot);
        }
        //System.out.println("liste : " + list);
        //System.out.println("pivot : " + list.get(pivot));

        if (pivot-1 > beginIndex) {
            quickSortB(list, beginIndex, pivot-1);
        }
        if (pivot+1 < endIndex) {
            quickSortB(list, pivot + 1, endIndex);
        }
        return list;
    }

    public static void switchList(ArrayList<Integer> list, int i, int j){
        int tmp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, tmp);
    }
}
