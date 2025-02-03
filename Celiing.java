import java.util.Scanner;

public class Ceiling{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      //Get the array size
    System.out.print("Enter the size of the array:");
    int n = sc.nextInt();
      //Get the array elements
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
      //Enter the target element 
    System.out.print("Enter the target element: ");
    int target = sc.nextInt();
      //Calling the ceiling function
    int ans = Ceiling(arr,target);
    System.out.println("The ceiling number of the target element is found at the index: "+ans);
    sc.close();

    }
  //Main method to find the ceiling of a given number
static int Ceiling(int[] arr,int target){
    int start = 0;
    int end = arr.length-1;
    if(target > arr[arr.length-1]){
        return -1;
    }
    while(start <= end){
        int mid = start + (end - start)/2;
        if(target < arr[mid]){
            end = end -1;
        }
        else if(target > arr[mid]){
            start = mid +1;
        }
        else{
            return mid;
        }     
    }
    return start;
}
}
