class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        int li = 0;
        int ri = arr.length - 1;
        while(li<ri){
            char chl = arr[li];
            char chr = arr[ri];

            if(isVowel(chl) && isVowel(chr)){
                arr[li] = chr;
                arr[ri] = chl;
                li++;
                ri--;
            }else if(isVowel(chl)){
                ri--;
            }else if(isVowel(chr)){
                li++;
            }else{
                li++;
                ri--;
            }
        }

        return new String(arr);
    }

    boolean isVowel(char ch){
        if(ch == 'a' || ch == 'A'){
            return true;
        }else if(ch == 'e' || ch == 'E'){
            return true;
        }else if(ch == 'i' || ch == 'I'){
            return true;
        }else if(ch == 'o' || ch == 'O'){
            return true;
        }else if(ch == 'u' || ch == 'U'){
            return true;
        }else{
            return false;
        } 
    }
}