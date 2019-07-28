import java.util.Arrays;
public class ArraySort {
    public static void main(String[] args) {
        
        int [] array = {1, 3, 81, 2, 22, 79};
        
        System.out.println("\n ARRAY SEBELUM DI SORT :");

        for (int x: array) {
            System.out.println(x+ " ");
        }
        Arrays.sort(array);

        System.out.println("\n ARRAY SETELAH DI SORT :");
        for (int x: array){
            System.out.println(x+ " ");
        }
    }
}
