import java.util.Arrays;

public class test_simple_sort<E> {
    public static void main(String[] args) {
        int[] arr = {161,48,141,94,51,106,3,167,50,152,67,116,57,157,155,8,39,114,74,107,146,125,158,12,181,161,129,119,37,30,88,111,106,55,76,60,58,108,144,108,81,187,5,210,150,20,61,111,66,28};
        simple_sort sort = new simple_sort() ;
        arr = sort.bubble_sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
}
