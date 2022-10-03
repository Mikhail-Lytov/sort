import java.util.Arrays;

public class simple_sort<E extends Comparable<E>> implements Comparable<E>  {
    private E item;
    private E item_2;
    private int[] arr_int = new int[1];
    private char[] arr_char = new char[1];
    private double[] arr_double = new double[1];
    private String[] arr_string = new String[1];
    private Object[] arr_object = new Object[1];

    public  simple_sort(){}

    private void interpret(int[] arr){
        this.arr_int = arr;
        int size = arr.length;
        this.arr_object = Arrays.copyOf(arr_object,size);
        for(int i = 0; i < size; i++){
            this.arr_object[i] = (int)arr[i];
        }
    }
    private void interpret(char[] arr){
        this.arr_char = arr;
        int size = arr.length;
        this.arr_object = Arrays.copyOf(arr_object,size);
        for(int i = 0; i < size; i++){
            this.arr_object[i] = (char)arr[i];
        }
    }
    private void interpret(String[] arr){
        this.arr_string = arr;
        int size = arr.length;
        this.arr_object = Arrays.copyOf(arr_object,size);
        for(int i = 0; i < size; i++){
            this.arr_object[i] = (String)arr[i];
        }
    }
    private void interpret(double[] arr){
        this.arr_double = arr;
        int size = arr.length;
        this.arr_object = Arrays.copyOf(arr_object,size);
        for(int i = 0; i < size; i++){
            this.arr_object[i] = (double)arr[i];
        }
    }

    private void return_int(){
        for (int i = 0; i < arr_object.length; i++){
            arr_int[i] = (int)arr_object[i];
        }
    }
    private void return_char(){
        for (int i = 0; i < arr_object.length; i++){
            arr_char[i] = (char)arr_object[i];
        }
    }
    private void return_String(){
        for (int i = 0; i < arr_object.length; i++) {
            arr_string[i] = (String) arr_object[i];
        }
    }
    private void return_double(){
        for (int i = 0; i < arr_object.length; i++){
            arr_double[i] = (double)arr_object[i];
        }
    }

    private Object[] sorting_by_choice(Object[] arr){
        this.arr_object = arr;
        sorting_by_choice_object(0, arr_object.length);
        return arr_object;
    }
    public Object[] sorting_by_choice(Object[] arr, int first, int second){
        this.arr_object = arr;
        sorting_by_choice_object(first,second);
        return arr_object;
    }
    public Object[] sorting_by_inserts(Object[] arr){
        this.arr_object = arr;
        sorting_by_inserts_object(0,arr_object.length);
        return arr_object;
    }
    public Object[] sorting_by_inserts(Object[] arr, int first, int prev){
        this.arr_object = arr;
        sorting_by_inserts_object(first,prev);
        return arr_object;
    }
    public Object[] bubble_sorting(Object[] arr){
        this.arr_object = arr;
        bubble_sorting_object(0,arr_object.length);
        return arr_object;
    }
    public Object[] bubble_sorting(Object[] arr, int first, int second){
        this.arr_object = arr;
        bubble_sorting_object(first,second);
        return arr_object;
    }

    public int[] sorting_by_choice(int[] arr, int first, int second){
        interpret(arr);
        sorting_by_choice_object(first,second);
        return_int();
        return arr_int;
    }
    public int[] sorting_by_choice(int[] arr){
        interpret(arr);
        sorting_by_choice_object(0,arr_object.length);
        return_int();
        return arr_int;
    }
    public int[] sorting_by_inserts(int[] arr, int first, int second){
        interpret(arr);
        sorting_by_inserts_object(first, second);
        return_int();
        return arr_int;
    }
    public int[] sorting_by_inserts(int[] arr){
        interpret(arr);
        sorting_by_inserts_object(0,arr_object.length);
        return_int();
        return arr_int;
    }
    public int[] bubble_sorting(int[] arr){
        interpret(arr);
        bubble_sorting_object(0,arr_object.length);
        return_int();
        return arr_int;
    }
    public int[] bubble_sorting(int[] arr, int first, int second){
        interpret(arr);
        bubble_sorting_object(first,second);
        return_int();
        return arr_int;
    }

    public char[] sorting_by_choice(char[] arr){
        interpret(arr);
        sorting_by_choice_object(0,arr_object.length);
        return_char();
        return arr_char;
    }
    public char[] sorting_by_choice(char[] arr, int first, int second){
        interpret(arr);
        sorting_by_choice_object(first,second);
        return_char();
        return arr_char;
    }
    public char[] sorting_by_inserts(char[] arr, int first, int second){
        interpret(arr);
        sorting_by_inserts_object(first, second);
        return_char();
        return arr_char;
    }
    public char[] sorting_by_inserts(char[] arr){
        interpret(arr);
        sorting_by_inserts_object(0,arr_object.length);
        return_char();
        return arr_char;
    }
    public char[] bubble_sorting(char[] arr){
        interpret(arr);
        bubble_sorting_object(0,arr_object.length);
        return_char();
        return arr_char;
    }
    public char[] bubble_sorting(char[] arr, int first, int second) {
        interpret(arr);
        bubble_sorting_object(first, second);
        return_char();
        return arr_char;
    }

    public String[] sorting_by_choice(String[] arr){
        interpret(arr);
        sorting_by_choice_object(0, arr_object.length);
        return_String();
        return arr_string;
    }
    public String[] sorting_by_choice(String[] arr, int first, int second){
        interpret(arr);
        sorting_by_choice_object(first,second);
        return_String();
        return arr_string;
    }
    public String[] sorting_by_inserts(String[] arr, int first, int second){
        interpret(arr);
        sorting_by_inserts_object(first,second);
        return_String();
        return arr_string;
    }
    public String[] sorting_by_inserts(String[] arr){
        interpret(arr);
        sorting_by_inserts_object(0,arr_object.length);
        return_String();
        return arr_string;
    }
    public String[] bubble_sorting(String[] arr){
        interpret(arr);
        bubble_sorting_object(0,arr_object.length);
        return_String();
        return arr_string;
    }
    public String[] bubble_sorting(String[] arr, int first, int second) {
        interpret(arr);
        bubble_sorting_object(first, second);
        return_String();
        return arr_string;
    }

    public double[] sorting_by_choice(double[] arr){
        interpret(arr);
        sorting_by_choice_object(0,arr_object.length);
        return_double();
        return arr_double;
    }
    public double[] sorting_by_choice(double[] arr, int first, int second){
        interpret(arr);
        sorting_by_choice_object(first,second);
        return_double();
        return arr_double;
    }
    public double[] sorting_by_inserts(double[] arr){
        interpret(arr);
        sorting_by_inserts_object(0, arr_object.length);
        return_double();
        return arr_double;
    }
    public double[] sorting_by_inserts(double[] arr, int first, int second){
        interpret(arr);
        sorting_by_inserts_object(first, second);
        return_double();
        return arr_double;
    }
    public double[] bubble_sorting(double[] arr){
        interpret(arr);
        bubble_sorting_object(0,arr_object.length);
        return_double();
        return arr_double;
    }
    public double[] bubble_sorting(double[] arr, int first, int second) {
        interpret(arr);
        bubble_sorting_object(first, second);
        return_double();
        return arr_double;
    }

    private void bubble_sorting_object(int first, int second){
        int result ;
        Object variable;
        boolean flag = true;
        int size = arr_object.length;
        try {
            //arr_int = Arrays.copyOf(arr_int,size);
            while (flag) {
                flag = false;
                for (int i = first; i < (size - 1) && i < (second - 1); i++) {
                    item = (E) arr_object[i];
                    item_2 = (E) arr_object[i + 1];
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
            Object variable;
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
            Object max_element = arr_object[first];
            item = (E) max_element;
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