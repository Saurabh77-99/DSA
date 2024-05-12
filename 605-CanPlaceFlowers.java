// Placing flowers:-

// for all are zeroes :- 0 0 0 0 0 0
// flowers = (arr.length()+1)/2

// for starting or ending are zeroes :- 0 0 0 0 1 0 0 0 1 0 0 0 0
// flowers = Count/2

// for zeroes in middle :  0 0 0 1 0 0 0 1 0 0 0
// flowers = (count - 1)/ 2

class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
        int max = 0;

        int fi = 0;
        int li = 0;
        for(int i = 0; i < fb.length;i++){
            if(fb[i] == 0){
                continue;
            }else if(fi == -1){
                fi = i;
                li = i;
            }else{
                li = i;
            }
        }

        //all zeroes
        if(fi == -1){
            max = (fb.length + 1)/2;
        }else{
            int left = fi;
            int right = fb.length - 1 - li;

            max = left/2;
            max += right/2;

            int count = 0;
            for(int i = fi+1; i <= li - 1;i++){
                if(fb[i]==0){
                    count++;
                }else{
                    max += (count-1)/2;
                    count = 0;
                }
            }

            max += (count - 1)/2;
        }

        return n <= max;
    }
}