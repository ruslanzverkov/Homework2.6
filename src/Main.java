import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 6, 5, 4, 6, 7));

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i));
            }
        }
        System.out.println();


        for (int i = 0; i < nums.size()-1; i++) {

            Collections.sort(nums, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1.toString().compareTo(o2.toString());
                }
            });
            if (nums.get(i) % 2 == 0&nums.get(i)!=nums.get(i+1)) {
                System.out.print(nums.get(i));

            }

        }
    }
}