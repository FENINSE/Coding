import java.util.Scanner;
class AddSubtractWithout{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      // Read the first number
        int num1 = sc.nextInt();
      // Raed the second number
        int num2 = sc.nextInt(); 
        sc.close();
        int sum = num1 + num2;
      // using ternary operator to ensure positive subtraction result
        int diff = (num1 > num2) ? (num1 - num2) : (num2 - num1); 
        System.out.println("Addition: " + sum);
        System.out.println("Absolute Subtraction: " + diff);
    }
}
