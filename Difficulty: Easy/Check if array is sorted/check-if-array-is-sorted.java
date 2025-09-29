class Solution {
    public boolean isSorted(int[] arr) {
        if(arr == null || arr.length < 2) {
            return true;
        }
        for(int i = 1 ; i < arr.length ; i++) {
            if(arr[i - 1] <= arr[i]) {
                    
            }
            else {
                return false;
            }
        }
        return true;
    }
}