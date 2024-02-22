import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
//    Bài hiển thị 20 số nguyên tố
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng nguyên tố:");
        int n = scanner.nextInt();

        int count = 0;

        System.out.println(" Các số nguyên tố đó là: " );
        for (int i = 2; count < n ; i++){
            if(checkPrimer(i)){
                System.out.println(i);
                count++;
            }
        }
    }
    public static boolean checkPrimer(int n){
        if (n <= 1){
            return false;
        } for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }


}