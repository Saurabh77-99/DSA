public class LowerBound {
    public static int lowerBound(int [] arr,int n,int x){
        int low = 0,high = n - 1;
        int ans = n;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid]>=x){
                ans = mid;

                high = mid - 1;
            } else {
                low  =  mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19};
        int n = 5,x = 9;
        int index = lowerBound(arr,n,x);
        System.out.println("the lower bound index is"+index);

    }
}

