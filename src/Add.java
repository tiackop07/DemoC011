import java.util.Scanner;

public class Add {
    public static void main(String[] args){
        int [] arr = {1,3,5,7,9};
        System.out.println("Mảng ban đầu là: ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + "");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần thêm: ");
        int x = scanner.nextInt();
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        newArr[arr.length] = x;
        System.out.println("Mảng mới");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + "");
        }
    }
}
