/*
    hollow star pattern



   *
  * *
 *   *
*     *
 *   *
  * *
   *
   


*/
public class Pattern9 {
    public static void main(String[] args) {
        int n = 4;

        // top part
        for (int i = 0; i < n; i++) {

            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // first star
            System.out.print("*");

            if (i != 0) {
                // inner spaces
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }

                // second star
                System.out.print("*");
            }

            // move to next line
            System.out.println();
        }
        //bottom half

        for(int i=0;i<n-1;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            if(i!=n-2){
            for(int j=0;j<2*(n-2-i)-1;j++){
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.println();
            
        }
    }
}