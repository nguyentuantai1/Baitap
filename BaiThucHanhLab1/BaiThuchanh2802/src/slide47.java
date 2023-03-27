import java.util.Scanner;
public class slide47 {
    
public static void main(String[] agrs) {
    float sum = 0, a;
    Scanner sc = new Scanner(System.in);
    do { 
     a = sc.nextFloat();
     sum += a;
     if(sum>100)
      break;
     
    } while (a > 0);
    System.out.println("Tong = " + sum);
    
   }
}