import java.util.*;
public class Spiral {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n,m,left,right,up,down,r,c,count=0;
        System.out.println("Enter the number of rows : ");
        n=scanner.nextInt();
        System.out.println("Enter the number of columns : ");
        m=scanner.nextInt();
        int[][] M=new int[n][m];
        System.out.println("Enter the matrix : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                M[i][j]=scanner.nextInt();
            }
        }
        down=n;
        right=m;
        up=-1;
        left=0;
        r=0;
        c=0;
        while(true){
            //Down
            for(int i=r,j=c;i<down;i++){
                System.out.print(M[i][j]+" ");
                r=i;
                count++;
            }
            if(check(count,m*n)){
                break;
            }
            down--;
            //Right
            c++;
            for(int i=r,j=c;j<right;j++){
                System.out.print(M[i][j]+" ");
                c=j;
                count++;
            }
            right--;
            r--;
            if(check(count,m*n)){
                break;
            }
            //Up
            for(int i=r,j=c;i>up;i--){
                System.out.print(M[i][j]+" ");
                r=i;
                count++;
            }
            if(check(count,m*n)){
                break;
            }
            c--;
            up++;
            //Left
            for(int i=r,j=c;j>left;j--){
                System.out.print(M[i][j]+" ");
                c=j;
                count++;
            }
            if(check(count,m*n)){
                break;
            }
            left++;
            r++;
        }
    }
    static boolean check(int a,int b){
        return a == b;
    }
}
