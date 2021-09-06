class Solution
{
    ArrayList<Integer> smallestDifferenceTriplet(int a[],int b[],int c[],int n)
    {
        int i,j,k,min,max,ans=Integer.MAX_VALUE;
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        ArrayList<Integer> al=null;
        i=j=k=0;
        while(i<n && j<n && k<n){
            min=Math.min(a[i],Math.min(b[j],c[k]));
            max=Math.max(a[i],Math.max(b[j],c[k]));
            if(ans>max-min){
                ans=max-min;
                if(al==null){
                    al=new ArrayList<>();
                    al.add(a[i]);
                    al.add(b[j]);
                    al.add(c[k]);
                }
                else{
                    al.set(0,max);
                    al.set(2,min);
                    if(min!=a[i] && max!=a[i]){
                        al.set(1,a[i]);
                    }
                    else if(min!=b[j] && max!=b[j]){
                        al.set(1,b[j]);
                    }
                    else{
                        al.set(1,c[k]);
                    }
                }
            }
            if(min==a[i]){
                i++;
            }
            else if(min==b[j]){
                j++;
            }
            else{
                k++;
            }
        }
        return al;
    }
}
