import java.util.Scanner;
class numbersequence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      // Raed the input
        int n = sc.nextInt(); 
        sc.close();
      //print the numbers
        System.out.print("The first " + n + " natural numbers are ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            System.out.print(",");
        }
    }
}
