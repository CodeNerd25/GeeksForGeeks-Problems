class Solution {
    static int countFactors(int n) {
        int count = 0;
        for(int i = 1 ; i <= Math.sqrt(n) ; i++) {
            if(n % i == 0) {
                if(i == n / i) {
                    count++;
                }
                else{
                    count = count + 2;
                }
            }
        }
        return count;
    }
}