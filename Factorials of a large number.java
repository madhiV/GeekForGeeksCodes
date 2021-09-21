class Solution {
    static ArrayList<Integer> tempSum;
    static ArrayList<Integer> factorial(int N){
        int carry,product,multiplier,temp,num,count;
        ArrayList<Integer> ans=new ArrayList<>(),eachProductTemp=new ArrayList<>(),sumTemp=new ArrayList<>();
        temp=N;
        ans.add(1);
        for(int i=2;i<=N;i++){//multipliers...
            count=0;
            num=i;
            sumTemp.clear();
            while(num!=0){//to multiply with each digits of multiplier
                eachProductTemp.clear();
                multiplier=num%10;
                num/=10;
                carry=0;
                for(int j=0;j<count;j++){//Adding zero's at end for left-shift (Multiplication rule)
                    eachProductTemp.add(0);
                }
                for(int j=ans.size()-1;j>=0;j--){//Iterating over each digit of current ans...
                    product=multiplier*ans.get(j)+carry;
                    carry=product/10;
                    eachProductTemp.add(0,product%10);
                }
                while(carry!=0){
                    eachProductTemp.add(0,carry%10);
                    carry/=10;
                }
                sum(sumTemp,eachProductTemp);
                count++;
            }
            if(i==N-1){
                ans.clear();
            }
            copy(ans,sumTemp);
        }
        return ans;
    }
    public static void sum(ArrayList<Integer> a,ArrayList<Integer> b){
        int sum,carry,i,j,k;
        carry=0;
        i=a.size()-1;
        j=b.size()-1;
        while(i>=0 && j>=0){
            sum=a.get(i)+b.get(j)+carry;
            a.set(i,sum%10);
            carry=sum/10;
            i--;
            j--;
        }
        while(i>=0){
            sum=a.get(i)+carry;
            a.add(i,sum%10);
            carry=sum/10;
            i--;
        }
        while(j>=0){
            sum=b.get(j)+carry;
            a.add(0,sum%10);
            carry=sum/10;
            j--;
        }
        while(carry!=0){
            a.add(0,carry%10);
            carry/=10;
        }
    }
    public static void copy(ArrayList<Integer> a,ArrayList<Integer> b){
        int i=a.size()-1,j=b.size()-1;
        while(i>=0 && j>=0){
            a.set(i,b.get(j));
            i--;
            j--;
        }
        while(j>=0){
            a.add(0,b.get(j));
            j--;
        }
    }
}
