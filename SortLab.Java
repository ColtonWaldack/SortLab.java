import java.util.Arrays;

public class SortLab {

      public static int[] insertionSort(int[] ArraytoSort) {

          for (int i = 1; i < ArraytoSort.length; i++) {
        int current = ArraytoSort[i];
        int prior = i - 1;
        while (prior >= 0 && ArraytoSort[prior] > current) {
            ArraytoSort[prior + 1] = ArraytoSort[prior];
            prior = prior - 1;
        }
        ArraytoSort[prior + 1] = current;
            }
          return ArraytoSort;
      }
      
    public static void main(String args[])
    {

        System.out.println(Arrays.toString(insertionSort(new int[] {5,2,4,3,10,7,1,9,6,8})));

    }
}

