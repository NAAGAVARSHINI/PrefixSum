import java.util.Scanner;

public class PrefixSum {

    public static int[] PrefixSumOfArray(int array[], int n){

        for(int i=1;i<n;i++){
            array[i]=array[i-1]+array[i];
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n= sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        array= PrefixSumOfArray(array,n);
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }

    }
}
