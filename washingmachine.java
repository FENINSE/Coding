import java.util.Scanner;

class WashingMachine{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      // Read the weight of clothes
        int weight = sc.nextInt();
      // Read the water level
        char waterLevel = sc.next().charAt(0); 
        sc.close();
        if (weight < 0){
            System.out.println("INVALID INPUT");
        }else if (weight == 0){
            System.out.println("Time Estimated: 0 minutes");
        }else if (weight > 7000){
            System.out.println("OVERLOADED");
        }else{
            int time = 0;
            if (weight <= 2000){
                time = 25;
            }else if (weight <= 4000){
                time = 35;
            }else{
                time = 45;
            }
            System.out.println("Time Estimated: " + time + " minutes");
        }
    }
}
