import java.util.*;
class GFG{
    public static void main(String[] arsg){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine(),sub,num;
        StringBuilder decode=new StringBuilder("");
        int z=scanner.nextInt();
        int l,r,i,j=1,t;
        i=0;
        while(i<s.length()){
            j=i;
            sub="";
            while(Character.isDigit(s.charAt(j))==false){
                sub+=s.charAt(j);
                j++;
            }
            num="";
            while(j<s.length() && Character.isDigit(s.charAt(j))){
                num+=s.charAt(j);
                j++;
            }
            i=j;
            for(int k=0;k<Integer.parseInt(String.valueOf(num));k++){
                decode.append(sub);
            }
        }
        System.out.println(decode.charAt(z-1));
    }
}
