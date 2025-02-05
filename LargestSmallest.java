import java.util.Scanner;
class LargestAndSmallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      // Read the four numbers
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        sc.close();
        int largest, smallest;
      // Finding the largest number
        if(num1 >= num2 && num1 >= num3 && num1 >= num4){
            largest = num1;
        }else if(num2 >= num1 && num2 >= num3 && num2 >= num4){
            largest = num2;
        }else if(num3 >= num1 && num3 >= num2 && num3 >= num4){
            largest = num3;
        }else{
            largest = num4;
        }
      // FInd the smallest number
        if(num1 <= num2 && num1 <= num3 && num1 <= num4){
            smallest = num1;
        }else if(num2 <= num1 && num2 <= num3 && num2 <= num4){
            smallest = num2;
        }else if(num3 <= num1 && num3 <= num2 && num3 <= num4){
            smallest = num3;
        }else{
            smallest = num4;
        }
      // Print the results
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}
