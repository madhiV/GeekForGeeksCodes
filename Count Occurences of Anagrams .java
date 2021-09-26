class Solution {

    int search(String pat, String txt) {
        int[] freq=new int[26];
        int[] arr=new int[26];
        int count=0,start=0;
        char ch;
        for(int i=0;i<pat.length();i++){
            freq[pat.charAt(i)-97]++;
        }
        
        for(int i=0;i<txt.length();i++){
            ch=txt.charAt(i);
            if(freq[ch-97]==0){
                while(start!=i){
                    arr[txt.charAt(start)-97]--;
                    start++;
                }
                start++;
            }
            else if(freq[ch-97]>arr[ch-97]){
                arr[ch-97]++;
                if(i-start+1==pat.length()){
                    count++;
                    arr[txt.charAt(start)-97]--;
                    start++;
                }
            }
            else{
                while(txt.charAt(start)!=ch){
                    arr[txt.charAt(start)-97]--;
                    start++;
                }
                start++;
            }
        }
        return count;
    }
}
