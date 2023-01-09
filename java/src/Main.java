import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int a[] = arrayRankTransform(new int[] {37,12,28,9,100,56,80,5,12});
        for(int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }


    }

    public static int[] arrayRankTransform(int[] arr) {
        Set<Integer> set = new TreeSet<>(List.of(Arrays.stream(arr).boxed().toArray(Integer[]::new)));
        int ans[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
           ans[i] = Arrays.binarySearch(set.toArray(), arr[i])+1;
        }
        return ans;
    }
}