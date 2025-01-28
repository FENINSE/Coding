import java.util.Scanner;
class agegroup{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      //Get the value and store it in the variable age
        int age = sc.nextInt();
      //Check the conditions
        if(age<=12){
            System.out.println("Child");
        }
        else if(age>=13 && age<=19){
            System.out.println("Teenager");
        }
        else if(age>=20 && age<=64){
            System.out.println("Adult");
        }
        else{
            System.out.println("Senior");
        }
    }
}
