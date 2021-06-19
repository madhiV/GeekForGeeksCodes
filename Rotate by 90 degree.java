class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int n) 
    { 
        int left,right,up,down;
        left=up=0;
        int[][] m=matrix;
        right=down=n-1;
        int temp1,temp2;
        for(int i=0;i<n/2;i++){
            for(int j=i;j<right;j++){
                temp1=m[i][j];
                //System.out.println(i+" "+j);
                m[i][j]=m[j][right];
                //System.out.println(j+" "+right);
                temp2=m[down-j+i][i];
                //System.out.println(down-j+i+" "+i);
                m[down-j+i][i]=temp1;
                temp1=m[down][right-j+i];
                //System.out.println(down+" "+(right-j+i));
                m[down][right-j+i]=temp2;
                m[j][right]=temp1;
            }
            right--;
            down--;
        }
    }
}
