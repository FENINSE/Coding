public class BinarySearch1{
    public static void main(String[] args){
      //Initializing a sorted array in descending order
        int[] arr = {75,67,56,45,34,23,12,10};
      //Input the target value
        int target = 67;
      //Call the BinarySearch method and store the value in ans
        int ans = BinarySearch(arr,target);
        System.out.println("The target element is found at the index: "+ans);

    }
  //Method for BinarySearch
static int BinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
  //Loop continues until the search space is exhausted
        while(start <= end){
          // Calculating mid index to prevent overflow
            int mid = start +(end - start)/2;
           // If target is smaller than mid element, search in the right half
            if(target < arr[mid]){
                start = mid + 1;
            }
              // If target is greater than mid element, search in the left half
            else if(target > arr[mid]){
                end = mid - 1;
            }
            else{
              // Target found, return its index
                return mid;
            }
        }
  //No target element is present
        return -1;
    }
}
