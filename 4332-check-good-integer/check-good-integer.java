class Solution {
    public boolean checkGoodInteger(int n) {
        int temp = 0;
        int digitSum = 0;
        int squareSum = 0;
        while(n>0){
            temp = n%10;
            digitSum += temp;
            squareSum += temp*temp;
            n = n/10;
        }
        if((squareSum - digitSum)>=50){
            return true;
        }
        return false;
    }
}