package projava1;

public class projava1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum =i sum + i;
        }
        
        int sum1 = 0;
        for (int i = 1; i <= 50; i++) {
            sum1= sum1+ i;
        }
        
        int sum2 = 0;
        for (int i = 1; i <= 10; i++) {
            sum2= sum2 + i;
        }
        
        int sum3 = 0;
        for (int i = 1; i <= 1; i++) {
            sum3 = sum3 + i;
        }
        
        

        System.out.println("Sum of 1 to 100 is:"+sum);
        System.out.println("Sum of 1 to 50 is:"+sum1);
        System.out.println("Sum of 1 to 10 is:"+sum2);
        System.out.println("Sum of 1 to 1 is:"+sum3);
        
    }
        
}
