import java.util.Scanner;

public class Ch4_ps4 {
    public static void main(String[] args) {
//Question no 1
        int a = 10;
        if (a == 11){
            System.out.println("i am 11");
        }
        else{
            System.out.println("I am not 11");
        }

 //Question no 2
       Scanner sc2= new Scanner(System.in); 
        
        byte m1,m2,m3;
        System.out.println("Enter your Physics:");
        m1 = sc2.nextByte();
        System.out.println("Enter your Physics:");
        m2 = sc2.nextByte();
        System.out.println("Enter your Physics:");
        m3 = sc2.nextByte();

        float avg = (m1+m2+m3)/3.0f;

        System.out.println(" Overall Parcentags is:"+ avg);
        if(avg==40 && m1>=33 && m2>=33 && m3>=33)  {
            System.out.println("Congratulation, you are pass");
        }
        else{
            System.out.println("Sorry , you are not clear examation");
        }


// Question no 3
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter your Income:");
        float tax = 0;
        float income = sc3.nextFloat();

        if (income<=2.5f){
            tax = tax + 0;
        }
            else if (income<2.5f && 5.0f>=income){
                tax = tax + 0.05f *(income - 2.5f);
            }
            else if (income>5f && 10.0f<=income){
                tax = tax + 0.05f *(5.0f - 2.5f);
                tax = tax + 0.2f *(income - 5.0f);               

            }
            else if (10.0f<income){
                tax = tax + 0.05f *(5.0f - 2.5f);
                tax = tax + 0.2f *(10.0f - 5.0f);
                tax = tax + 0.3f*(income - 10.0f) ;             
            }
        System.out.println("The total Tax paid by employee is: "+ tax);




//Question no 4

         Scanner sc4 = new Scanner(System.in);
         int day = sc4.nextInt();
        switch(day){
            case 1->System.out.println("Monday");
            case 2->System.out.println("Tuesday");
            case 3->System.out.println("Wednesday");
            case 4->System.out.println("Thursday");
            case 5->System.out.println("Friday");
            case 6->System.out.println("Saturday");
            case 7->System.out.println("Sunday");
            
        }

//Question no 5

    System.out.println("Enter the year to be checked:");
    Scanner sc5 =new Scanner(System.in); 
    int year= sc5.nextInt();

    if((year%4==0 && year%100!=0)|| year%400==0){
          System.out.println("Leap year");
        }
    else{
          System.out.println("Not a leap year");
        }

//Question no 6
       Scanner sc6 = new Scanner(System.in);
       String Website = sc6.next();
       if(Website.endsWith(".org")){
        System.out.println("This is an organization website");
       }
       else if(Website.endsWith(".com")){
        System.out.println("This is an commertcial website");
       }
       else if(Website.endsWith(".in")){
        System.out.println("This is an indian website");
       }

    }

    
}
