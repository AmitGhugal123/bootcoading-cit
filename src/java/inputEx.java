import java.util.Scanner;
public class inputEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number :");
        int n = sc.nextInt();
        System.out.println("Enter second Number :");
        int m = sc.nextInt();

        int add = n+m;
        System.out.println("Addition = " + add);
        int sub = n-m;
        System.out.println("substraction = "+sub);
        int multi = n*m;
        System.out.println("multiplication = "+multi);
        int div = n/m;
        System.out.println("division =" + div);
        int mod = n%m;
        System.out.println("modulo ="+ mod);
    }
}
