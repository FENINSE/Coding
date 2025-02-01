import java.util.Scanner;
public class OrderAgnosticBinarySearch{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      // Taking input for array size
    System.out.print("Enter the size of the array:");
    int n = sc.nextInt();
      // Declare and initialize array
    int[] arr = new int[n];
      // Taking array input
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
      // Taking the target element to search
    System.out.print("Enter the target element: ");
    int target = sc.nextInt();
      // Calling the function and printing the result
    int ans = OrderAgnosticBinarySearch(arr,target);
    System.out.println("The target element is found at the index: "+ans);
    sc.close();
    }
static int OrderAgnosticBinarySearch(int[] arr,int target){
    int start = 0;
    int end = arr.length-1;
  // Determine whether the array is sorted in ascending or descending order
    boolean isAsc;
    if(arr[start]<arr[end]){
        isAsc = true;
    }else{
            isAsc=false;
        }
    while(start <= end){
    int mid = start+(end - start)/2;
      // Check if mid element is the target
    if(target==arr[mid]){
        return mid;
    }
      // Binary search logic for both ascending and descending order
    if(isAsc){
        if(target < arr[mid]){
            end = mid-1;
        }
        else{
            start = mid + 1;
        }
    }else{
        if(target > arr[mid]){
            end = mid-1;
        }
        else{
            start = mid+1;
        }
    }

    }
    return -1;
}
}
