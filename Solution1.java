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