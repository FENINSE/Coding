import java.util.Scanner;
class GreatestOfThree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      // Read the numbers
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        sc.close();
        int largest;
      // Check the conditions
        if(num1 >= num2 && num1 >= num3){
            largest = num1;
        }else if(num2 >= num1 && num2 >= num3){
            largest = num2;
        }else{
            largest = num3;
        }
        System.out.println("Largest number: " + largest);
    }
}
