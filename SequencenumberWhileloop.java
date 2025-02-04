import java.util.Scanner;
class numberSequenceWhileLoop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      // Reed the input 
        int n = sc.nextInt(); 
        sc.close();
        System.out.print("The first " + n + " natural numbers are ");
      // Initialize i=0
        int i = 1; 
      // Check the condition
        while (i <= n){  
            System.out.print(i);
            System.out.print(",");
          // Increment the loop
            i++; 
        }
    }
}
