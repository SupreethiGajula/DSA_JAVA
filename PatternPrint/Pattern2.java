
public class Pattern2 {
    //1 2 3 
    //4 5 6 
    //7 8 9 
    public static void main(String [] args){
        int n=3;
        int num = 1;
        //int ch = 'A';
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //System.out.println(ch+" ");
                System.out.print(num+" ");
                num++;
                //ch+=1;
            }
            System.out.println();
        }
    }
}
