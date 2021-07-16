
class Solution
{
    void diagonalSort(int matrix[][], int n, int m)
    {
        int i,j;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        //Lower left triangle
        for(int k=1;k<matrix.length;k++){
            i=k;
            j=0;
            pq=new PriorityQueue<>();
            while(i<matrix.length && j<matrix[0].length){
                pq.add(matrix[i][j]);
                i++;
                j++;
            }
            i=k;
            j=0;
            while(!pq.isEmpty()){
                matrix[i][j]=pq.poll();
                i++;
                j++;
            }
        }
        //Upper right triangle
        for(int k=1;k<matrix[0].length;k++){
            j=k;
            i=0;
            pq=new PriorityQueue<>(Collections.reverseOrder());
            while(i<matrix.length && j<matrix[0].length){
                pq.add(matrix[i][j]);
                i++;
                j++;
            }
            j=k;
            i=0;
            while(!pq.isEmpty()){
                matrix[i][j]=pq.poll();
                i++;
                j++;
            }
        }
    }
}
