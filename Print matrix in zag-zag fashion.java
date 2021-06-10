package MatrixZigZag;
import java.util.*;
public class Matrixzz {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n,m;
        System.out.println("Enter the number of rows : ");
        n=scanner.nextInt();
        System.out.println("Enter the number of columns : ");
        m=scanner.nextInt();
        System.out.println("Enter the matrix : ");
        int[][] M=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                M[i][j]=scanner.nextInt();
            }
        }
        int count=1,r=0,c=0;
        System.out.print(M[0][0]+" ");
        while(true){
            //Right
            if(c+1<m){
                c++;
                System.out.print(M[r][c]+" ");
                count++;
                if(check(count,m*n)){
                    return;
                }
            }
            else if(c==m-1){//Down
                r++;
                System.out.print(M[r][c]+" ");
                count++;
                if(check(count,m*n)){
                    return;
                }
            }
            r++;
            c--;

            //LeftDownDiagonal
            while(r<=n && c>=0){
                System.out.print(M[r][c]+" ");
                count++;
                if(check(count,m*n)){
                    return;
                }
                if(r==n-1 || c==0){
                    break;
                }
                c--;
                r++;
            }
            if(r+1<n){//Down
                r++;
                System.out.print(M[r][c]+" ");
                count++;
            }
            else{
                c++;
                System.out.print(M[r][c]+" ");
                count++;
            }
            if(check(count,m*n)){
                return;
            }
            c++;
            r--;

            //Up Right
            while(r>=0 && c<m){
                System.out.print(M[r][c]+" ");
                count++;
                if(check(count,m*n)){
                    return;
                }
                if(r==0 || c==m-1){
                    break;
                }
                r--;
                c++;
            }
        }
    }
    static boolean check(int a,int b){
        return a==b;
    }
}
