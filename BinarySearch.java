public class BinarySearch{
    public static void main(String[] args){
      //Define sorted array
        int[] arr ={1,3,4,5,7,8,9};
      //Target Element to search for
        int target = 8;
      //Call the BinarySearch method and store the value in ans
        int ans = BinarySearch(arr,target);
        System.out.println("The target element is found at the index: "+ans);

    }
  //Method for performig Binary search
static int BinarySearch(int[] arr,int target){
    int start = 0;
    int end = arr.length-1;
       // Loop until the search range is valid
    while(start <= end){
        int mid = start + (end - start)/2;
        // If the target is smaller than the middle element, search in the left half
        if(target < arr[mid]){
            end = end -1;
        }
        // If the target is greater than the middle element, search in the right half
        else if(target > arr[mid]){
            start = mid +1;
        }
        // If the middle element is the target, return its index
        else{
            return mid;
        }     
    }
    return -1;
}
}
