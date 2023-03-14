
import java.util.Scanner;
public class Bai5 {
    
public static void main(String[] agrs) {
    float sum = 0, a;
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap vao cac so nguyen");
    do { 
     a = sc.nextFloat();
     sum += a;
     if(sum>100)
      break;
     
    } while (a > 0);
    System.out.println("Tong = " + sum);
    
   }
}