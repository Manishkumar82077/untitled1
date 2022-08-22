import java.util.Scanner;

public class All_the_LOop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int[] arr = new int[no];
        // use of while loop
        int i = 0;
        while (i < arr.length) {
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println(" ");
        // use of do while loop
        int j = 0;
        do {
            System.out.print(arr[j]);
            j++;
        } while (j < arr.length);
        // use of for loop
        System.out.println(" ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);
        }

    }
}
