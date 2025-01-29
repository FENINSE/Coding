import java.util.Scanner;
class sumofthree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      // Get the Numbers
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
      //Add the three numbers
        int sum = a+b+c;
        System.out.println("Sum of three numbers is:" +sum);     
    }
}
