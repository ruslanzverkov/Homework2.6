import java.util.*;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 6, 5, 4, 6, 8,12));


        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i)+" ");
            }
        }
        System.out.println();



        for (int i = 0; i < nums.size(); i++) {
            Collections.sort(nums);
            if (nums.get(i) % 2 == 0 ) {
                System.out.print(nums.get(i)+" ");
            }
        }

    }
}