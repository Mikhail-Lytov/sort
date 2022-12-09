import java.util.Arrays;

public class test_simple_sort {
    public static void main(String[] args) {

        simple_sort sort = new simple_sort();
        Comparable[] original = {4, 6, 5, 12, 2, 3, 8, 13, 7, 1, 11, 16, 10, 14, 15, 9};
        Comparable[] arr = {4, 6, 5, 12, 2, 3, 8, 13, 7, 1, 11, 16, 10, 14, 15, 9};
        Comparable[] arr_1 = {4, 6, 5, 12, 2, 3, 8, 13, 7, 1, 11, 16, 10, 14, 15, 9};
        Comparable[] arr_2 = {4, 6, 5, 12, 2, 3, 8, 13, 7, 1, 11, 16, 10, 14, 15, 9};

        System.out.println("изначальный массив: " + Arrays.toString(arr));
        arr = sort.bubble_sorting(arr);
        arr_1 = sort.sorting_by_inserts(arr_1);
        arr_2 = sort.sorting_by_choice(arr_2);
        System.out.println("Сортировка пузырьком:  " + Arrays.toString(arr));
        System.out.println("Сортировка вставкой: " + Arrays.toString(arr_1));
        System.out.println("Сортировка выбором: " + Arrays.toString(arr_2));

        arr = Arrays.copyOf(original,original.length);
        arr_1 = Arrays.copyOf(original,original.length);
        arr_2 = Arrays.copyOf(original,original.length);
        System.out.println(Arrays.toString(arr));

        arr = sort.bubble_sorting(arr,3,11);
        arr_1 = sort.sorting_by_inserts(arr_1,3,11);
        arr_2 = sort.sorting_by_choice(arr_2,3,11);
        System.out.println("Сортировка пузырьком в подпоследовательности:  " + Arrays.toString(arr));
        System.out.println("Сортировка вставкой в подпоследовательности: " + Arrays.toString(arr_1));
        System.out.println("Сортировка выбором в подпоследовательности: " + Arrays.toString(arr_2));

        System.out.println();

        Comparable[] original_char = {'b','a','c','f','d','l','l','g'};
        Comparable[] arr_char = {'b','a','c','f','d','l','l','g'};
        Comparable[] arr_char_1 = {'b','a','c','f','d','l','l','g'};
        Comparable[] arr_char_2 = {'b','a','c','f','d','l','l','g'};
        System.out.println("Массив символов: " + Arrays.toString(arr_char));

        arr_char = sort.bubble_sorting(arr_char);
        arr_char_1 = sort.sorting_by_inserts(arr_char_1);
        arr_char_2 = sort.sorting_by_choice(arr_char_2);
        System.out.println("Сортировка пузырьком:  " + Arrays.toString(arr_char));
        System.out.println("Сортировка вставкой: " + Arrays.toString(arr_char_1));
        System.out.println("Сортировка выбором: " + Arrays.toString(arr_char_2));

        arr_char = Arrays.copyOf(original_char,original_char.length);
        arr_char_1 = Arrays.copyOf(original_char,original_char.length);
        arr_char_2 = Arrays.copyOf(original_char,original_char.length);
        System.out.println(Arrays.toString(arr_char));

        arr_char = sort.bubble_sorting(arr_char,0,3);
        arr_char_1 = sort.sorting_by_inserts(arr_char_1,0,3);
        arr_char_2 = sort.sorting_by_choice(arr_char_2,0,3);
        System.out.println("Сортировка пузырьком в подпоследовательности:  " + Arrays.toString(arr_char));
        System.out.println("Сортировка вставкой в подпоследовательности: " + Arrays.toString(arr_char_1));
        System.out.println("Сортировка выбором в подпоследовательности: " + Arrays.toString(arr_char_2));

        System.out.println();

        Comparable[] original_doubl = {0.4, 0.6, 0.5, 0.2, 1.2, 3, 9.8, 0.13, 5.7, 0.1, 0.11, 4.16, 6.10, 6.14, 1.5, 3.9};
        Comparable[] arr_doubl = {0.4, 0.6, 0.5, 0.2, 1.2, 3, 9.8, 0.13, 5.7, 0.1, 0.11, 4.16, 6.10, 6.14, 1.5, 3.9};
        Comparable[] arr_1_doubl = {0.4, 0.6, 0.5, 0.2, 1.2, 3, 9.8, 0.13, 5.7, 0.1, 0.11, 4.16, 6.10, 6.14, 1.5, 3.9};
        Comparable[] arr_2_doubl = {0.4, 0.6, 0.5, 0.2, 1.2, 3, 9.8, 0.13, 5.7, 0.1, 0.11, 4.16, 6.10, 6.14, 1.5, 3.9};

        System.out.println("изначальный массив: " + Arrays.toString(arr_1_doubl));
        arr_doubl = sort.bubble_sorting(arr_doubl);
        arr_1_doubl = sort.sorting_by_inserts(arr_1_doubl);
        arr_2_doubl = sort.sorting_by_choice(arr_2_doubl);
        System.out.println("Сортировка пузырьком:  " + Arrays.toString(arr_doubl));
        System.out.println("Сортировка вставкой: " + Arrays.toString(arr_1_doubl));
        System.out.println("Сортировка выбором: " + Arrays.toString(arr_2_doubl));

        arr_doubl = Arrays.copyOf(original_doubl,original_doubl.length);
        arr_1_doubl = Arrays.copyOf(original_doubl,original_doubl.length);
        arr_2_doubl = Arrays.copyOf(original_doubl,original_doubl.length);
        System.out.println(Arrays.toString(arr_doubl));

        arr_doubl = sort.bubble_sorting(arr_doubl,3,11);
        arr_1_doubl = sort.sorting_by_inserts(arr_1_doubl,3,11);
        arr_2_doubl = sort.sorting_by_choice(arr_2_doubl,3,11);
        System.out.println("Сортировка пузырьком в подпоследовательности:  " + Arrays.toString(arr_doubl));
        System.out.println("Сортировка вставкой в подпоследовательности: " + Arrays.toString(arr_1_doubl));
        System.out.println("Сортировка выбором в подпоследовательности: " + Arrays.toString(arr_2_doubl));

        System.out.println();

        Comparable[] original_string = {"Hello", "My_*", "Names_1", "PASHA_13","Lab_5"};
        Comparable[] arr_string = {"Hello", "My_*", "Names_1", "PASHA_13","Lab_5"};
        Comparable[] arr_1_string = {"Hello", "My_*", "Names_1", "PASHA_13","Lab_5"};
        Comparable[] arr_2_string = {"Hello", "My_*", "Names_1", "PASHA_13","Lab_5"};

        System.out.println("изначальный массив: " + Arrays.toString(arr_string));
        arr_string = sort.bubble_sorting(arr_string);
        arr_1_string = sort.sorting_by_inserts(arr_1_string);
        arr_2_string = sort.sorting_by_choice(arr_2_string);
        System.out.println("Сортировка пузырьком:  " + Arrays.toString(arr_string));
        System.out.println("Сортировка вставкой: " + Arrays.toString(arr_1_string));
        System.out.println("Сортировка выбором: " + Arrays.toString(arr_2_string));

        arr_string = Arrays.copyOf(original_string,original_string.length);
        arr_1_string = Arrays.copyOf(original_string,original_string.length);
        arr_2_string = Arrays.copyOf(original_string,original_string.length);
        System.out.println(Arrays.toString(arr_string));

        arr_string = sort.bubble_sorting(arr_1_string,2,4);
        arr_1_string = sort.sorting_by_inserts(arr_1_string,2,4);
        arr_2_string = sort.sorting_by_choice(arr_2_string,2,4);
        System.out.println("Сортировка пузырьком в подпоследовательности:  " + Arrays.toString(arr_string));
        System.out.println("Сортировка вставкой в подпоследовательности: " + Arrays.toString(arr_1_string));
        System.out.println("Сортировка выбором в подпоследовательности: " + Arrays.toString(arr_2_string));

        System.out.println();


    }
}
