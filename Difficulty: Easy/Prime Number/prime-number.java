class Solution {
    static boolean isPrime(int n) {
        if(n == 0 || n == 1) {
            return false;
        }
        if(factors(n) == 2) {
            return true;
        }
        else {
            return false;
        }
    }
    public static int factors(int n) {
        int count = 0;
        for(int i = 1 ; i <= Math.sqrt(n) ; i++) {
            if(n % i == 0) {
                if(i != n/i) {
                    count = count + 2;
                }
                else {
                    count++;
                }
            }
        }
        return count;
    }
}