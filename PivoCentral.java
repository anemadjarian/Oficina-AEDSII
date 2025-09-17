import java.util.*;
public class PivoCentral {
    public static void quickSort(double[] array, int low, int high){
        int mid = low+(high-low)/2;
        int i = low;
        int j = high;
        while(i<=j){
            while(array[i] < array[mid]){
                i++;
            }
            while(array[j] > array[mid]){
                j--;
            }
            if(i<=j){
                swap(array, i, j);
                i++;
                j--;
            }
        }
        if(low < j){
            quickSort(array, low, j);
        }
        if(i < high){
            quickSort(array, i, high);
        }
    }
    public static void swap(double[] array, int i, int j){
        double aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
    public static void scan(double[] array, Scanner sc, int n){
        for(int i=0; i<n; i++){
            array[i] = sc.nextDouble();
        }
    }
    public static void print(double[] array, int n){
        for(int i=0; i<n; i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] array;
        array = new double[n];

        scan(array, sc, n);

        int high = n-1;
        int low = 0;

        quickSort(array, low, high);

        print(array, n);
    }
}
