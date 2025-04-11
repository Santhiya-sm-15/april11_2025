# april11_2025
The problem that i solved today in leetcode

1.You are given two positive integers low and high.

An integer x consisting of 2 * n digits is symmetric if the sum of the first n digits of x is equal to the sum of the last n digits of x. Numbers with an odd number of digits are never symmetric.

Return the number of symmetric integers in the range [low, high].

Code:
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int cnt=0;
        while(low<=high)
        {
            String s=Integer.toString(low);
            int n=s.length();
            if(n%2==1)
            {
                low++;
                continue;
            }
            int sum1=0,sum2=0;
            for(int i=0;i<n/2;i++)
                sum1+=s.charAt(i)-'0';
            for(int i=n/2;i<n;i++)
                sum2+=s.charAt(i)-'0';
            if(sum1==sum2) cnt++;
            low++;
        }
        return cnt;
    }
}
