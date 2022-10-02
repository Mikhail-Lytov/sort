import java.util.Arrays;

public class test_simple_sort<E> {
    public static void main(String[] args) {
        String[] arr = {"privet", "my", "names"};
        simple_sort sort = new simple_sort() ;
        arr = sort.bubble_sorting(arr);
        System.out.println(Arrays.toString(sort.bubble_sorting(arr)));
    }
}
