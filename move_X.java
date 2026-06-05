public class move_X {
    public static void moveALLX(String str,int idx, int count,String newString)
    {
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newString +='x';
            }

            System.out.println(newString);
            return;
        }
        char currChar= str.charAt(idx);
        if(currChar=='x'){
            count++;
            moveALLX(str, idx+1, count, newString);
        }else{
            newString +=currChar;
            moveALLX(str, idx+1, count, newString);
        }
    }
    
    public static void main(String[] args) {
        String str ="axbcxxd";
        moveALLX(str, 0, 0, "");
}
}
