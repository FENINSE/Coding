import java.util.Scanner;
class LetterComparison{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      // Read the Characters
        char char1 = sc.next().charAt(0);
        char char2 = sc.next().charAt(0);
        sc.close();
      // Do comparison operations
        System.out.println(char1 + " < " + char2 + " : " + (char1 < char2));
        System.out.println(char1 + " <= " + char2 + " : " + (char1 <= char2));
        System.out.println(char1 + " > " + char2 + " : " + (char1 > char2));
        System.out.println(char1 + " >= " + char2 + " : " + (char1 >= char2));
        System.out.println(char1 + " == " + char2 + " : " + (char1 == char2));
        System.out.println(char1 + " != " + char2 + " : " + (char1 != char2));
    }
}
