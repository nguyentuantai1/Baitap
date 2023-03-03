import java.util.Scanner;

public class baithuchanh1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Nhap so can kiem tra:");
        int number = Scanner.nextInt();
        if(number % 2 == 0){
            System.out.println(number + " co chia het cho 2");
        }else {
            System.out.println(number + " khong chia het cho 2");
        }
    }
}