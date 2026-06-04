/*


1 1 1 1 
2 2 2 
3 3 
4 

*/

public class Pattern7 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
