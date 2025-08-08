import java.util.Scanner;

public class merge_array {
    
    static int[] merge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr3[k++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[k++] = arr2[i];
        }

        return arr3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 
        System.out.println("Enter size of arr1:");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter elements of arr1:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

    
        System.out.println("Enter size of arr2:");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter elements of arr2:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

       
        int[] result = merge(arr1, arr2);

      
        System.out.println("Merged array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

  
    }
}
