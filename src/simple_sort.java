import java.util.Arrays;

public class simple_sort<E extends Comparable<E>> implements Comparable<E>  {
    private E item;
    private E item_2;

    private E[] arr_object;

    public  simple_sort(){}

    public E[] sorting_by_inserts(E[] arr){
        this.arr_object = arr;
        sorting_by_inserts_object(0,arr_object.length);
        return arr_object;
    }
    public E[] sorting_by_inserts(E[] arr, int first, int prev){
        this.arr_object = arr;
        sorting_by_inserts_object(first,prev);
        return arr_object;
    }
    public E[] bubble_sorting(E[] arr){
        this.arr_object = arr;
        bubble_sorting_object(0,arr_object.length);
        return arr_object;
    }
    public E[] bubble_sorting(E[] arr, int first, int second){
        this.arr_object = arr;
        bubble_sorting_object(first,second);
        return arr_object;
    }

    public E[] sorting_by_choice(E[] arr, int first, int second){
        this.arr_object = arr;
        sorting_by_choice_object(first,second);
        return arr_object;
    }
    public E[] sorting_by_choice(E[] arr){
        this.arr_object = arr;
        sorting_by_choice_object(0,arr_object.length);
        return arr_object;
    }





    private void bubble_sorting_object(int first, int second){
        int result ;
        E variable;
        boolean flag = true;
        int size = arr_object.length;
        try {
            //arr_int = Arrays.copyOf(arr_int,size);
            while (flag) {
                flag = false;
                for (int i = first; i < (size - 1) && i < (second - 1); i++) {
                    item = arr_object[i];
                    item_2 = arr_object[i + 1];
                    result = compareTo(item_2);
                    if (result > 0) {
                        variable = arr_object[i + 1];
                        arr_object[i + 1] = arr_object[i];
                        arr_object[i] = variable;
                        flag = true;
                    }
                }
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index error");
        }catch (ArrayStoreException e){
            System.out.println(e.getMessage());
        }
        //System.out.println(Arrays.toString(arr_object));
    }

    private void sorting_by_inserts_object(int first, int second){
        try {
            boolean flag = true;
            int result;
            E variable;
            int gap;
            for (int i = first + 1; i < second - 1; i++) {
                item = (E) arr_object[i];
                item_2 = (E) arr_object[i - 1];
                result = compareTo(item_2);
                if (result < 0) {
                    variable = arr_object[i];
                    gap = i;
                    for (int j = i - 1; j > first - 1; j--) {
                        item_2 = (E) arr_object[j];
                        result = compareTo(item_2);
                        if (result < 0) {
                            arr_object[gap] = arr_object[j];
                            if (j == first) {
                                arr_object[j] = variable;
                            }
                            gap--;
                        } else if (result >= 0) {
                            arr_object[gap] = variable;
                            break;
                        }
                    }
                }
            }
            for (int i = second - 1; i > first; i--) {
                item = (E) arr_object[i];
                item_2 = (E) arr_object[i - 1];
                result = compareTo(item_2);
                if (result < 0) {
                    variable = arr_object[i];
                    gap = i;
                    for (int j = i - 1; j > first - 1; j--) {
                        item_2 = (E) arr_object[j];
                        result = compareTo(item_2);
                        if (result < 0) {
                            arr_object[gap] = arr_object[j];
                            if (j == first) {
                                arr_object[j] = variable;
                            }
                            gap--;
                        } else if (result >= 0) {
                            arr_object[gap] = variable;
                            break;
                        }
                    }
                }

            }
        }catch (ArrayStoreException e){
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    private void sorting_by_choice_object(int first, int second){
        int result;
        try {
            E max_element = arr_object[first];
            item = max_element;
            int position_max = 0;
            for (int j = second - 1; j > first - 1; j--) {
                max_element = arr_object[first];
                item = (E) max_element;
                position_max = first;
                for (int i = first; i <= j; i++) {
                    item_2 = (E) arr_object[i];
                    result = compareTo(item_2);
                   // System.out.println(result);
                    if (result < 0) {
                        max_element = arr_object[i];
                        item = (E) max_element;
                        position_max = i;
                    }
                }
                arr_object[position_max] = arr_object[j];
                arr_object[j] = max_element;
            }
        }catch (ArrayStoreException e){
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }


    }
    @Override
    public int compareTo(E o) {
        try {
            int result = this.item.compareTo(o);
            return result;
        }catch (ClassCastException e){
            e.getMessage();
            return 0;
        }
    }
}