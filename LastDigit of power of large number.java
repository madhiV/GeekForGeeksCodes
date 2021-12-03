class Solution {
    static int getLastDigit(String a, String b) {
        if(b.equals("0")){
            return 1;
        }
        int lastDigit=Integer.parseInt(""+a.charAt(a.length()-1)),lastTwo;
        if(b.length()>1){
            lastTwo=Integer.parseInt(b.substring(b.length()-2));
        }
        else{
            lastTwo=Integer.parseInt(""+b.charAt(0));
        }
        switch(lastDigit){
            case 1:
                return 1;
            case 2:
                switch(lastTwo%4){
                    case 1:
                        return 2;
                    case 2:
                        return 4;
                    case 3:
                        return 8;
                    case 0:
                        return 6;
                }
            case 3:
                switch(lastTwo%4){
                    case 1:
                        return 3;
                    case 2:
                        return 9;
                    case 3:
                        return 7;
                    case 0:
                        return 1;
                }
            case 4:
                if(Integer.parseInt(""+b.charAt(b.length()-1))%2==0){
                    return 6;
                }
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                switch(lastTwo%4){
                    case 1:
                        return 7;
                    case 2:
                        return 9;
                    case 3:
                        return 3;
                    case 0:
                        return 1;
                }
            case 8:
                switch(lastTwo%4){
                    case 1:
                        return 8;
                    case 2:
                        return 4;
                    case 3:
                        return 2;
                    case 0:
                        return 6;
                }
            case 9:
                if(Integer.parseInt(""+b.charAt(b.length()-1))%2==0){
                    return 1;
                }
                return 9;
            case 0:
                return 0;
        }
        return -1;
    }
};
