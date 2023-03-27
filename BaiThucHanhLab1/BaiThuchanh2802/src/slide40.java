import java.util.Scanner;

public class slide40 {

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so bat ki tu 1- 7");
        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("Thu 2");
                break;
            case 2:
                System.out.println("Thu 3");
                break;
            case 3:
                System.out.println("Thu 4");
                break;
            case 4:
                System.out.println("Thu 5");
                break;
            case 5:
                System.out.println("Thu 6");
                break;
            case 6:
                System.out.println("Thu 7");
                break;
            case 7:
                System.out.println("Chu Nhat");
                break;
            default:
                System.out.println("so vua nhap ko hop le");
        }
        sc.close();
    }
}