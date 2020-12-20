import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số phần tử của mảng bạn muốn khởi tạo:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập số X cần chèn vào mảng:");
        int x = sc.nextInt();
        System.out.println("Nhập vị trí index cần chèn x vào trong mảng:");
        int index = sc.nextInt();
        if (0 < index && index < arr.length) {
            arr[index] = x;
        } else {
            System.out.println("Không chèn được phần tử vào mảng");
        }
        System.out.println(Arrays.toString(arr));
    }
}