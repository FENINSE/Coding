import java.util.Scanner;
class PowerCalculation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      // take the base and exponent
        System.out.print("Enter base: ");
        double base = sc.nextDouble();    
        System.out.print("Enter exponent: ");
        double exponent = sc.nextDouble();
      // Using Math.pow() to calculate power
        double result = Math.pow(base, exponent);   
        System.out.println("Power of the number is: " + result);     
        sc.close();
    }
}
