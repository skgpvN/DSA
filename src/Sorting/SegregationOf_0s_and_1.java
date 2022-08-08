package MockEasy;

import java.util.Arrays;

public class SegregationOf_0s_and_1 {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1};
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            arr[i] = 1;
        }
        for (int i = count; i < n; i++) {
            arr[i] = 0;

        }
        for(int i=0; i<n; i++){
            System.out.println(Arrays.toString(arr));
            break;
        }


    }

}
