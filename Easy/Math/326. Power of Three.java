// class Solution {
//     public boolean isPowerOfThree(int n) {
//         // Integer Limitations
//         return n > 0 && 1162261467 % n == 0;
//     }
// }

class Solution {
    public boolean isPowerOfThree(int n) {
        // // Integer Limitations
        // return n > 0 && 1162261467 % n == 0;
        if (n > 0) {
            while(n > 0){
                if (n % 3 == 0) {
                    n /= 3;
                } else if (n == 1) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}