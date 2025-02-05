import java.util.Scanner;
class MultipleOf{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      // Read the input number
        int num = sc.nextInt();
        sc.close();
      // Check wheather the number is divisible by 100 or not
        if(num % 100 == 0){
            System.out.println(num + " is a multiple of 100");
        }else{
            System.out.println(num + " is not a multiple of 100");
        }
    }
}
