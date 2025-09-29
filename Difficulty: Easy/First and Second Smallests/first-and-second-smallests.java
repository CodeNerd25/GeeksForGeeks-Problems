class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        ArrayList <Integer> result = new ArrayList<>();
        if(arr == null || arr.length < 2) {
            result.add(-1);
            return result;
        }
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        if(secondSmallest == Integer.MAX_VALUE) {
            result.add(-1);
            return result;
        }
        result.add(smallest);
        result.add(secondSmallest);
        return result;
    }
}
