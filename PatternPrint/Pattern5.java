
/*

1 
2 1 
3 2 1 
4 3 2 1 

*/



public class Pattern5 {
    public static void main(String [] args){
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=i+1;j>0;j--){
                System.err.print(j+ " ");
                //System.out.print((char)(j+'A'-1)+" ");
            }
            System.out.println();
        }
    }
}
