import java.util.Scanner;
public class Bai4 { 
public static void main(String[] args) {
    int number;
    String dayOfMonth = "";  
       Scanner scanner = new Scanner(System.in);
         
     System.out.println("Nhap vao so nguyen tu 1 - 12  ");
    number = scanner.nextInt();
         
        switch (number) {
            case 1:
                System.out.println("Thang 1");
                break;
            case 2:
                System.out.println("Thang 2");
                break;
            case 3:
                System.out.println("Thang 3");
                break;
            case 4:
                System.out.println("Thang 4");
                break;
            case 5:
                System.out.println("Thang 5");
                break;
            case 6:
                System.out.println("Thang 6");
                break;
            case 7:
                System.out.println("Thang 7");
                break;
            case 8:
                System.out.println("Thang 8");
                break;
            case 9:
                System.out.println("Thang 9");
            case 10:
                System.out.println("Thang 10");
            case 11:
                System.out.println("Thang 11");
            case 12:
                System.out.println("Thang 12");


            
            
                default:
                System.out.println("So khong hop le");
        }
    }
 
}