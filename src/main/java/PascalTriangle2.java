import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    public static void main(String[] args) {
        System.out.println( getRow(3));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer[]> list = new ArrayList<>();
        Integer[] arr0 = new Integer[]{1};
        Integer[] arr1 = new Integer[]{1,1};

        if (rowIndex == 0){
            return List.of(arr0);
        } else if (rowIndex == 1) {
            return List.of(arr1);
        } else {
            list.add(arr0);
            list.add(arr1);
        }

        for (int i = 3; i <= rowIndex+1; i++) {
            Integer[] new_arr = new Integer[i];
            new_arr[0] = 1;
            new_arr[i - 1] = 1;
            for (int j = 1; j < i - 1; j++) {
                new_arr[j] = list.get(i - 2)[j - 1] + list.get(i - 2)[j];
            }
            list.add(new_arr);
        }

        return List.of(list.get(rowIndex));
    }
}
