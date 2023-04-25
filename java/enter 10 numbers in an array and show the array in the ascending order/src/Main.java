import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        int i, j, t;
        System.out.println("enter value");
        for (i = 0; i < 10; i++) {
            arr[i] = s.nextInt();
        }
        for (i = 0; i < 10; i++) {
            for (j = i + 1; j < 10; j++) {
                if (arr[i] > arr[j]) {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.println("showing the array");
        for (i = 0; i < 10; i++)
            System.out.println(arr[i]);
    }
}