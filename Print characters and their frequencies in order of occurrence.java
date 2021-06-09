import java.util.*;
class GFG{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        char c;
        String s=scanner.nextLine();
        LinkedHashMap<Character,Integer> dic=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(dic.get(c)==null){
                dic.put(c,1);
            }
            else{
                dic.put(c,dic.get(c)+1);
            }
        }
        for(Map.Entry<Character,Integer> entry:dic.entrySet()){
            System.out.print(entry.getKey()+""+entry.getValue()+" ");
        }
    }
}
