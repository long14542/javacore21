import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class khoitao {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 4, 10, 5, 7));
        strings.add("Đạt");

        ArrayList<Integer> integersC = new ArrayList<>(Arrays.asList(5, 7));
        System.out.println(strings.get(0));
        System.out.println(integers);
        //integers.remove(4);
        //System.out.println(integers);
        //integers.removeAll(integers);

        integers.addAll(integersC);

        integers.removeAll(integersC);
        integers.set(2, 11);
        Collections.sort(integers);

    }
}
