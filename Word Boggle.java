class Solution
{
    public boolean find(char[][] board,String word,int i,int j,int length){
        if(length>=word.length()){
            return true;
        }
        //System.out.println(length+" "+word.length()+" "+i+" "+j);
        boolean ans=false;
        char temp;
        //Up
        if(i-1>=0 && board[i-1][j]==word.charAt(length)){
            temp=board[i-1][j];
            board[i-1][j]='*';
            ans=find(board,word,i-1,j,length+1);
            board[i-1][j]=temp;
        }
        //Down
        if(i+1<board.length && board[i+1][j]==word.charAt(length) && ans==false){
            temp=board[i+1][j];
            board[i+1][j]='*';
            ans=find(board,word,i+1,j,length+1);
            board[i+1][j]=temp;
        }
        //Left
        if(j-1>=0 && board[i][j-1]==word.charAt(length) && ans==false){
            temp=board[i][j-1];
            board[i][j-1]='*';
            ans=find(board,word,i,j-1,length+1);
            board[i][j-1]=temp;
        }
        //Right
        if(j+1<board[0].length && board[i][j+1]==word.charAt(length) && ans==false){
            temp=board[i][j+1];
            board[i][j+1]='*';
            ans=find(board,word,i,j+1,length+1);
            board[i][j+1]=temp;
        }
        //Up-left
        if(i-1>=0 && j-1>=0 && board[i-1][j-1]==word.charAt(length) && ans==false){
            temp=board[i-1][j-1];
            board[i-1][j-1]='*';
            ans=find(board,word,i-1,j-1,length+1);
            board[i-1][j-1]=temp;
        }
        //Up-Right
        if(i-1>=0 && j+1<board[0].length && board[i-1][j+1]==word.charAt(length) && ans==false){
            temp=board[i-1][j+1];
            board[i-1][j+1]='*';
            ans=find(board,word,i-1,j+1,length+1);
            board[i-1][j+1]=temp;
        }
        //Down-left
        if(i+1<board.length && j-1>=0 && board[i+1][j-1]==word.charAt(length) && ans==false){
            temp=board[i+1][j-1];
            board[i+1][j-1]='*';
            ans=find(board,word,i+1,j-1,length+1);
            board[i+1][j-1]=temp;
        }
        //Down-Right
        if(i+1<board.length && j+1<board[0].length && board[i+1][j+1]==word.charAt(length) && ans==false){
            temp=board[i+1][j+1];
            board[i+1][j+1]='*';
            ans=find(board,word,i+1,j+1,length+1);
            board[i+1][j+1]=temp;
        }
        return ans;
    }
    public String[] wordBoggle(char board[][], String[] dictionary)
    {
        ArrayList<String> al=new ArrayList<>();
        int count=0,flag,r=board.length,c=board[0].length;
        char temp;
        for(int k=0;k<dictionary.length;k++){
            flag=0;
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(board[i][j]==dictionary[k].charAt(0)){
                        temp=board[i][j];
                        board[i][j]='*';
                        if(find(board,dictionary[k],i,j,1)){
                            al.add(dictionary[k]);
                            flag=1;
                            board[i][j]=temp;
                            break;
                        }
                        board[i][j]=temp;
                    }
                }
                if(flag==1){
                    break;
                }
            }
        }
        String[] ans=new String[al.size()];
        int i=0;
        for(String k:al){
            ans[i]=k;
            i++;
        }
        return ans;
    }
}
