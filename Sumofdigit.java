import java.util.Scanner;
class SumOfThreeDigitNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      // Enter a Number from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
            while (num > 0){
              // Use modulo operator to extract last digit
                int digit = num % 10;
              // Add to sum
                sum += digit;
              // Remove last digit
                num /= 10; 
            }            
            System.out.println("Sum of digits is: " + sum);
        }      
        sc.close();
    }
}
