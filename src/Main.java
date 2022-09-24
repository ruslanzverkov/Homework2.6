import java.util.*;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(List.of("Машина", "дорога", "Машина", "корова", "дорога", "Машина"));

    public static void main(String[] args) {
        //sort1();
        sort2();
        sort3();
        sort4();

    }


    public static void sort1() {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }

    // не знаю почему данный способ у меня не работает sort2
    public static void sort2() {
        Collections.sort(nums);
        int prevnum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num % 2 == 0 && num != prevnum) {
                System.out.println(num);
                num = prevnum;
            }
        }
    }

    public static void sort3() {
        Set<String> unique=new HashSet<>(strings);
        System.out.println(unique);
    }

    public static void sort4() {
        Set<String> unique=new HashSet<>(strings);
        System.out.println(strings.size()-unique.size());
    }
}