import java.util.Scanner;

public class Ch2_ps2 {
    public static void main(String[] args){
 //Pratice set Qustions 1
        float a= 7/4.0f*9.0f/2.0f;
        System.out.println("This Answer are 1st qustion");
        System.out.println(a);

 //Pratice set Qustions 2
        char grade ='B';
        grade = (char) (grade + 8);
        System.out.println("This Answer are 2st qustion");
        System.out.println(grade);
        //decrypt to grad
        grade = (char) (grade - 8);
        System.out.println(grade);

//Pratice set Qustions 3      
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        System.out.println("This Answer are 3st qustion");
        System.out.println(x>8);


//Pratice set Qustions 4

        System.out.println("This Answer are 3st qustion");
        System.out.println("v*v-s*s/2*b*s");

//Pratice set Qustions 5
        System.out.println("This Answer are 4st qustion");
         System.out.println(7*49/7+35/7);
    }
    
}
