class Solution {
    public static int largest(int[] arr) {
        int largest = arr[0];
        if(arr == null || arr.length == 0) {
            return -1;
        }
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
