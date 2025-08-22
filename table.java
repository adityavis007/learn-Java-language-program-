import java.util.Scanner;
public class table{
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Table number:");
        a = sc.nextInt();
        for(int i=1;i<=10;i++){
           
                System.out.printf("%d * %d = %d \n", a,i,a*i);
            
        }


    }
}