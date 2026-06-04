/*

1
1 2
1 2 3 
1 2 3 4


*/
public class Pattern4 {

    public static void main(String [] args){
        int n=4;
        for(int i=0;i<n;i++){
            int num = 1;
            for(int j=0;j<i+1;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    
}
