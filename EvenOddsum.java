import java.util.Scanner;
class EvenOrOddSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      // Read the first number
        int num1 = sc.nextInt();
      // Read the second number
        int num2 = sc.nextInt(); 
        sc.close();
      // Calculate the sum
        int sum = num1 + num2;
        if(sum % 2 == 0){
            System.out.println("The sum " + sum + " is even.");
        }else{
            System.out.println("The sum " + sum + " is odd.");
        }
    }
}
