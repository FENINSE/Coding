import java.util.Scanner;
class MultipleOf27{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      // Read the input number
        int num = sc.nextInt(); 
        sc.close();
      // Check the condition whether the number is divisible by 27 or not
        if(num % 27 == 0){
            System.out.println(num + " is a multiple of 27");
        }else{
            System.out.println(num + " is not a multiple of 27");
        }
    }
}
