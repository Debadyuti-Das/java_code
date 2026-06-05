public class phone_keypad {
    public static String[] Keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
    public static void printCombo(String str,int idx,String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar=str.charAt(idx);
        String mapping=Keypad[currChar-'0'];

        for(int i=0;i<mapping.length();i++){
            printCombo(str, idx+1, combination+mapping.charAt(i));
        }
    }
    
    public static void main(String[] args) {
        String str="23";
        printCombo(str, 0, "");
    }
}
