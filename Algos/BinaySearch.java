package Algos;



public class BinaySearch {
 
    public int binarySearch(int[] inputArr, int key) {
         
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {                             /*Element found*/
                return mid;
            }
            if (mid == 0) {                                         /*Element not in array*/  
                return 0;
            }
            if (key < inputArr[mid]) {                              /*Search the array to the left of 'mid'*/
                end = mid - 1;
            } else {
                start = mid + 1;                                    /*Search the array to the right of 'mid'*/  
            }
        }
        return -1;
    }
  
    public static void main(String[] args) {
         
        BinaySearch mbs = new BinaySearch();
        int[] arr = {2, 4, 6, 8, 10, 12, 0, 0};
        System.out.println("Key 14's position: "+mbs.binarySearch(arr, 14));
        int[] arr1 = {6,34,78,123,432,900};
        System.out.println("Key 432's position: "+mbs.binarySearch(arr1, 432));
    }
}
