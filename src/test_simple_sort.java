import java.util.Arrays;

public class test_simple_sort<E> {
    public static void main(String[] args) {
        int[] arr = {1,-1,3,4,2,3,4};
        simple_sort sort = new simple_sort(arr) ;
        arr = sort.bubble_sorting(arr);
    }
}
