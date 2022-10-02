import com.sun.source.tree.LiteralTree;

import java.util.Arrays;
import javax.swing.JButton;

public class simple_sort<E extends Comparable<E>> implements Comparable<E>  {
    private E item;
    private E item_2;
    int[] arr_int = new int[1];
    char[] arr_char = new char[1];
    double[] arr_double = new double[1];
    String[] arr_string = new String[1];
    Object[] arr_object = new Object[1];
    //public simple_sort(){

    //}
    public  simple_sort(){
        //this.arr_object = arr;
    }
   /* private void interpret(Object[] arr){
        this.arr_object = arr;
        int size = arr.length;
        this.arr_object = Arrays.copyOf(arr_object,size);
    }*/
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
    public Object[] bubble_sorting(Object[] arr){
        //interpret(arr);
        bubble_sorting_object(0,arr_object.length);
        return arr_object;
    }
    public Object[] bubble_sorting(Object[] arr, int first, int second){
        bubble_sorting_object(first,second);
        return arr_object;
    }
    public int[] bubble_sorting(int[] arr){
        interpret(arr);
        bubble_sorting_object(0,arr_object.length);
        for (int i = 0; i < arr_object.length; i++){
            arr_int[i] = (int)arr_object[i];
        }
        return arr_int;
    }
    public int[] bubble_sorting(int[] arr, int first, int second){
        interpret(arr);
        bubble_sorting_object(first,second);
        for (int i = 0; i < arr_object.length; i++){
            arr_int[i] = (int)arr_object[i];
        }
        return arr_int;
    }
    public char[] bubble_sorting(char[] arr){
        interpret(arr);
        bubble_sorting_object(0,arr_object.length);
        for (int i = 0; i < arr_object.length; i++){
            arr_char[i] = (char)arr_object[i];
        }
        return arr_char;
    }
    public char[] bubble_sorting(char[] arr, int first, int second) {
        interpret(arr);
        bubble_sorting_object(first, second);
        for (int i = 0; i < arr_object.length; i++) {
            arr_char[i] = (char) arr_object[i];
        }
        return arr_char;
    }
    public String[] bubble_sorting(String[] arr){
        interpret(arr);
        bubble_sorting_object(0,arr_object.length);
        for (int i = 0; i < arr_object.length; i++){
            arr_string[i] = (String) arr_object[i];
        }
        return arr_string;
    }
    public String[] bubble_sorting(String[] arr, int first, int second) {
        interpret(arr);
        bubble_sorting_object(first, second);
        for (int i = 0; i < arr_object.length; i++) {
            arr_string[i] = (String) arr_object[i];
        }
        return arr_string;
    }
    public double[] bubble_sorting(double[] arr){
        interpret(arr);
        bubble_sorting_object(0,arr_object.length);
        for (int i = 0; i < arr_object.length; i++){
            arr_double[i] = (double)arr_object[i];
        }
        return arr_double;
    }
    public double[] bubble_sorting(double[] arr, int first, int second) {
        interpret(arr);
        bubble_sorting_object(first, second);
        for (int i = 0; i < arr_object.length; i++) {
            arr_double[i] = (Double) arr_object[i];
        }
        return arr_double;
    }

    private void bubble_sorting_object(int first, int second){
        //Object a = "1";
        //om = (E) a;
        int result ;
        Object variable;
        boolean flag = true;
        int size = arr_object.length;
        try {
            //arr_int = Arrays.copyOf(arr_int,size);
            while (flag) {
                flag = false;
                for (int i = first; i < (size - 1) && i < (second); i++) {
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
    @Override
    public int compareTo(E o) {
        int result = this.item.compareTo(o);
        return result;
    }
}