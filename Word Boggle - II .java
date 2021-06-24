class Solution
{
    boolean find(char[][] board,String word,int i,int j,int length){
        if(length==word.length()){
            return true;
        }
        boolean ans=false;
        char temp=word.charAt(length);
        int r=board.length,c=board[0].length;
        //Up
        if(i-1>=0 && board[i-1][j]==temp){
            board[i-1][j]='-';
            ans=find(board,word,i-1,j,length+1);
            board[i-1][j]=temp;
        }
        //Down
        if(i+1<r && board[i+1][j]==temp && ans==false){
            board[i+1][j]='-';
            ans=find(board,word,i+1,j,length+1);
            board[i+1][j]=temp;
        }
        //Left
        if(j-1>=0 && board[i][j-1]==temp && ans==false){
            board[i][j-1]='-';
            ans=find(board,word,i,j-1,length+1);
            board[i][j-1]=temp;
        }
        //Right
        if(j+1<c && board[i][j+1]==temp && ans==false){
            board[i][j+1]='-';
            ans=find(board,word,i,j+1,length+1);
            board[i][j+1]=temp;
        }
        //Up-Right
        if(i-1>=0 && j+1<c && board[i-1][j+1]==temp && ans==false){
            board[i-1][j+1]='-';
            ans=find(board,word,i-1,j+1,length+1);
            board[i-1][j+1]=temp;
        }
        //Up-left
        if(i-1>=0 && j-1>=0 && board[i-1][j-1]==temp && ans==false){
            board[i-1][j-1]='-';
            ans=find(board,word,i-1,j-1,length+1);
            board[i-1][j-1]=temp;
        }
        //Down-left
        if(i+1<r && j-1>=0 && board[i+1][j-1]==temp && ans==false){
            board[i+1][j-1]='-';
            ans=find(board,word,i+1,j-1,length+1);
            board[i+1][j-1]=temp;
        }
        //Down-Right
        if(i+1<r && j+1<c && board[i+1][j+1]==temp && ans==false){
            board[i+1][j+1]='-';
            ans=find(board,word,i+1,j+1,length+1);
            board[i+1][j+1]=temp;
        }
        return ans;
    }
    public String[] wordBoggle(char board[][], String[] dictionary)
    {
        Set<String> set=new HashSet<>();
        char temp;
        int r=board.length,c=board[0].length,flag;
        for(int k=0;k<dictionary.length;k++){          
            flag=0;
            temp=dictionary[k].charAt(0);
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(board[i][j]==temp){
                        board[i][j]='-';
                        if(find(board,dictionary[k],i,j,1)){
                            set.add(dictionary[k]);
                            board[i][j]=temp;
                            flag=1;
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
        int i=0;
        String[] ans=new String[set.size()];
        for(String k:set){
            ans[i]=k;
            i++;
        }
        return ans;
    }
}
