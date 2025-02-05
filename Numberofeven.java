import java.util.Scanner;
class Even{
public static void main(String[] args){
    System.out.println("Enter the range number: ");
  // Read the range number
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
  // Initialize count
    int count = 0;
    for(int i=0;i<n;i++){
      // Check condition for even
        if(i%2==0){
          // Increment count by 1
            count ++;
        }
    }
    System.out.println("The even numbers present from 0 to " +n+ " is: ");
    System.out.print(count);
}
}
