import java.util.Scanner;

public class twoNumadd {
    public static void main (String[] args){
    System.out.println("Talking a input for user");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First Number");
    int a = sc.nextInt();
    System.out.println("Enter Sceond Number");
    int b = sc.nextInt();
    int sum = a + b;
    System.out.println("The sum of These number");
    System.out.println(sum);
}
}
