class Solution {
    public int[] getThreeLargest(int arr[]) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        int k = 0;
        for(int l = 1; l < arr.length ; l++) {
            if(arr[k] != arr[l]) {
                arr[k + 1] = arr[l];
                k++;
            }
        }
        int size = Math.min(3 , k + 1);
        int [] result = new int [size];
        for(int v = 0 ; v < size ; v++) {
            result[v] = arr[v];
        }
        return result;
    }
}