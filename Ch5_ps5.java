public class Ch5_ps5 {
    public static void main(String[] args) {
//Question no 1
        int n = 4;
        for(int i=n; i>=0; i--){
            for(int j=0; j<i ;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
// Question no 2
        int sum=0;
        int N = 3;
        for(int I=0;I<N;I++){
            sum = sum +(2*I);
        }
        System.out.print("Sum of this even number:");
        System.out.println(sum);
    }

}
