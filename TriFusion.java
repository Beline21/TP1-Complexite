import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//exo 3
public class TriFusion {
    public Integer[] tab;

    TriFusion(Integer[] tab){
        this.tab = tab;
    }


//https://www.techiedelight.com/fr/split-array-two-parts-java/ source pour diviser en deux
    public Integer[] tri_fusion(Integer[] tab) {
        //Integer[] new_tab = new Integer[0];
        if (tab.length <= 2) {
            Arrays.sort(tab);
            return tab;

        } else {
            int n = tab.length;
            Integer[] a = Arrays.copyOfRange(tab, 0, (n + 1) / 2);
            Integer[] b = Arrays.copyOfRange(tab, (n + 1) / 2, n);
            Integer[] new_a = tri_fusion(a);
            Integer[] new_b = tri_fusion(b);
            return fusion(new_a, new_b);
        }

    }

    //https://www.techiedelight.com/fr/add-new-elements-to-array-java/

    private static Integer[] append(Integer[] arr, int element)
    {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.add(element);

        return list.toArray(new Integer[0]);
    }


    public static Integer[] fusion(Integer[] tab1, Integer[] tab2){
        Integer[] new_tab = new Integer[0];

        return new_tab;
    }

}
