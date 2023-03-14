import java.util.Scanner;
public class Bai1 { 
public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat");
        int firstNumber = scanner.nextInt();
        System.out.println("Nhap vao so thu hai");
        int secondNumber = scanner.nextInt();


        int tong = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + tong);
        int hieu = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + hieu );
        int tich = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = "+ tong);
        float thuong = (float) firstNumber / secondNumber;
        System.out.println(firstNumber + " % " + secondNumber + " = " + thuong);
        int phandu = firstNumber % secondNumber;
        System.out.println(firstNumber + " % " + secondNumber + " = " + phandu);



 }
 }