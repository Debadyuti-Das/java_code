// sub set of first n  natural number
import java.util.*;
public class subset_no{
    public static void printsubset(ArrayList<Integer>subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findsubsets(int n, ArrayList<Integer> subset){

        if(n==0){
            printsubset(subset);
            return;
        }
        //wants to add
        subset.add(n);
        findsubsets(n-1, subset);
        //do not want to add
        subset.remove(subset.size()-1);
        findsubsets(n-1, subset);
    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset =new ArrayList<>();
        findsubsets(n, subset);
    }
    
}
