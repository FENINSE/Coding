import java.util.Scanner;

public class Floor{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      //Get the size of the array
    System.out.print("Enter the size of the array:");
    int n = sc.nextInt();
    int[] arr = new int[n];
      //Get the elements
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.print("Enter the target element: ");
      //Enter the target element
    int target = sc.nextInt();
      //Call the funtion
    int ans = Floor(arr,target);
    System.out.println("The Floor number of the target element is found at the index: "+ans);
    sc.close();

    }
  //Main method to perform floor of a number
static int Floor(int[] arr,int target){
    int start = 0;
    int end = arr.length-1;
  //If the element is not found return -1
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
    return end;
}
}
