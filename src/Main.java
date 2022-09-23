import java.util.*;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 6, 5, 4,12, 6, 8));
//задание 1

        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        //задание 2

        for (int i = 0; i < nums.size()-1; i++) {
            Collections.sort(nums);
            if (nums.get(i) % 2 == 0& !Objects.equals(nums.get(i), nums.get(i + 1))) {
                System.out.print(nums.get(i)+" ");
            }
        }
        if (nums.get(nums.size()-1)%2==0) {
            System.out.println(nums.get(nums.size()-1));
        }
        //Задание 3
        List<String> strings=new ArrayList<>(List.of("Машина","дорога","Машина","корова","дорога","Машина"));

        for (int i = 0; i < strings.size()-1; i++) {
            Collections.sort(strings);
            if ( !Objects.equals(strings.get(i), strings.get(i + 1))) {
                System.out.print(strings.get(i)+" ");
            }
        }
        if ( !Objects.equals(strings.get(strings.size()-1), strings.get(strings.size()-2))) {
            System.out.println(strings.get(strings.size()-1)+" ");
        }


        //Задание 4

        for (int i = 0; i < strings.size()-1; i++) {
            Collections.sort(strings);
            int b=1;
            for (int a = i; a < strings.size()-1; a++) {
                if ( Objects.equals(strings.get(i), strings.get(a + 1))) {
                     b=b+1;
                }
            }
            System.out.println(b);
        }

    }
}