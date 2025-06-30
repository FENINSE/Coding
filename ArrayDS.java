package Data_Structures;
import java.util.Scanner;
public class ArrayDS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the choice:");
        int c = sc.nextInt();
        switch(c)
        {
            case 1:
                System.out.println("Enter the element to be entered:");
                int ele = sc.nextInt();
                insert_first(arr,ele);
                for(int i=0;i<=n;i++){
                    System.out.print(arr[i]+" ");
                }
                break;

            case 2:
                System.out.println("Enter the element to be inerted:");
                int ele1 = sc.nextInt();
                insert_last(arr,ele1);
                for(int i=0;i<=n;i++){
                    System.out.print(arr[i]+" ");
                }
                break;
            case 3:
                System.out.println("Enter the element to be inserted:");
                int ele2 = sc.nextInt();
                System.out.println("Enter the position:");
                int pos =sc.nextInt();
                insert_mid(arr,ele2,pos,n);
                for(int i=0;i<=n;i++){
                    System.out.print(arr[i]+" ");
                }
                break;
            case 4:
                Delete_last(arr,n);
                for(int i=0;i<n-1;i++){
                    System.out.print(arr[i]+" ");
                }
                break;
            case 5:
                Delete_first(arr,n);
                for(int i=0;i<n-1;i++){
                    System.out.print(arr[i]+" ");
                }
                break;
            case 6:
                System.out.println("Enter the pos to be deleted:");
                int pos1 = sc.nextInt();
                Delete_mid(arr,pos1,n);
                for(int i=0;i<n-1;i++){
                    System.out.print(arr[i]+" ");
                }
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
    static int[] insert_first(int[] arr,int ele){
        int i = arr.length-1;
        while(i>=0){
            if(i==0){
                arr[i+1]=arr[i];
                arr[i]=ele;
            }
            if(arr[i]!=0){
                arr[i+1]=arr[i];
            }
            i--;
        }
        return arr;
    }
    static int[] insert_last(int[] arr,int ele1){
        int i=arr.length-1;
        while(i > 0) {
            if(arr[i]!=0){
                arr[i+1]=ele1;
                break;
            }else {
                i--;
            }
        }
        return arr;
    }
    static int[] insert_mid(int[] arr,int ele2,int pos,int n){
        for(int i=n-1;i>0;i--){
            if(i==pos-1){
                arr[i]=ele2;
                break;
            }else{
                arr[i+1] = arr[i];
            }
        }
        return arr;
    }
    static int[] Delete_last(int[] arr,int n){
        for(int i=0;i<arr.length;i++){
            if(i==n-1){
                arr[i] = 0;
            }
        }
        return arr;
    }
    static int[] Delete_first(int[] arr,int n){
        for(int i=0;i<=n;i++){
            if(i==0){
                arr[i]=arr[i+1];
            }else{
                arr[i]=arr[i+1];
            }
        }
        return arr;
    }
    static int[] Delete_mid(int[] arr,int pos1,int n){
        for(int i=pos1-1;i<n;i++){
            if(i==pos1-1){
                arr[i] = arr[i+1];
            }else{
                arr[i]=arr[i+1];
            }
        }
        return arr;
    }
}
