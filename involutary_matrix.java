/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		System.out.println("Enter the number of rows and columns : ");
		Scanner scanner =new Scanner(System.in);
		int n=scanner.nextInt();
		System.out.println("Enter the matrix : ");
		int[][] m=new int[n][n];
		int[][] I=new int[n][n];
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        m[i][j]=scanner.nextInt();
		        if(i==j){
		            I[i][j]=1;
		        }
		    }
		}
		int[][] product=new int[n][n];
		//multiplication
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        for(int k=0;k<n;k++){
		            product[i][j]+=m[i][k]*m[k][j];
		        }
		        if(product[i][j]!=I[i][j]){
		            System.out.println("Not an Involutary matrix");
		            return;
		        }
		    }
		}
		System.out.println("Involutary matrix");
	}
}
