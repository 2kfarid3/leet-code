import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }


    public static List<List<Integer>> generate(int numRows) {
        List<Integer[]> list = new ArrayList<>();
        Integer[] arr1 = new Integer[]{1};
        Integer[] arr2 = new Integer[]{1,1};

        if (numRows == 1){
            list.add(arr1);
            return convert(list);
        } else if (numRows == 2) {
            list.add(arr1);
            list.add(arr2);
            return convert(list);
        } else {
            list.add(arr1);
            list.add(arr2);
        }

        for (int i = 3; i <= numRows; i++) {
            Integer[] new_arr = new Integer[i];
            new_arr[0] = 1;
            new_arr[i - 1] = 1;
            for (int j = 1; j < i - 1; j++) {
                new_arr[j] = list.get(i - 2)[j - 1] + list.get(i - 2)[j];
            }
            list.add(new_arr);
        }


        return convert(list);
    }

    public static List<List<Integer>> convert(List<Integer[]> input) {
        List<List<Integer>> result = new ArrayList<>();

        for (Integer[] arr : input) {
            result.add(Arrays.asList(arr));
        }

        return result;
    }
}
