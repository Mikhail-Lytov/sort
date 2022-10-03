import java.util.Arrays;

public class test_simple_sort<E> {
    public static void main(String[] args) {
        int[] arr = {4,6,5,12,2,3,8,13,7,1,11,16,10,14,15,9};
        System.out.println(Arrays.toString(arr));
        simple_sort sort = new simple_sort() ;
        //arr = sort.bubble_sorting(arr);
        int[] arr_2 = {4,6,5,12,2,3,8,13,7,1,11,16,10,14,15,9};
        arr_2 = sort.bubble_sorting(arr_2);
        System.out.println(Arrays.toString(arr_2));
        arr = sort.sorting_by_inserts(arr);
        System.out.println(Arrays.toString(arr));
    }
}
