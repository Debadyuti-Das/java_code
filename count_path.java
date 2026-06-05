//count totlal paths in a maze to move from(0,0)to(m,n) 
public class count_path {
    public static int countpath(int i,int j, int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        //move downwards
        int downpaths=countpath(i+1,j,n,m);
        //move right
        int rightpaths=countpath(i, j+1,n, m);
        return downpaths+rightpaths;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.err.println("total paths :"+countpath(0, 0, n, m));

    }
    
}
