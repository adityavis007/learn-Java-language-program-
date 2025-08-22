import java.util.Scanner;

public class excrise_1_1 {
    public static void main(String[] args) {
        System.out.println("Taking a input for Student mark of percentage");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Subject Marks:");
        float a = sc.nextFloat();
        System.out.println("Enter the sceond Subject Marks:");
        float b = sc.nextFloat();
        System.out.println("Enter the Third Subject Marks:");
        float c = sc.nextFloat();
        System.out.println("Enter the Fouth Subject Marks:");
        float d = sc.nextFloat();
        System.out.println("Enter the Fifth Subject Marks:");
        float e = sc.nextFloat();
        float total = a+b+c+d+e;
        System.out.println("Tatal for Marks:");
        System.out.println(total);
        float percentage = (total*100)/500;
        System.out.println("The percentage of These marks");
        System.out.println(percentage);
    } 
    
}
