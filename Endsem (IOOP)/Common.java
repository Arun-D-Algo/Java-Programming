import java.util.Scanner;

public class Common {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        System.out.println("Enter number of elements in First Array :");
        n = scanner.nextInt();
        System.out.println("Enter number of elements in Second Array :");
        m = scanner.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        System.out.println("Enter elements for Array 1 :");
        for(int i=0; i<arr1.length; i++){
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Enter elements for Array 2 :");
        for(int i=0; i<arr2.length; i++){
            arr2[i] = scanner.nextInt();
        }
        System.out.println("Array 1 : ");
        for(int arr : arr1){
            System.out.print(arr + " ");
        }
        System.out.println();
        System.out.println("Array 2 : ");
        for(int arr : arr2){
            System.out.print(arr + " ");
        }
        System.out.println();
        System.out.println("Common Elements :");
        for(int i =0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
        scanner.close();
    }

}
