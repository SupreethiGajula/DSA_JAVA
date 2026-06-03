public class Pattern3 {
    /*
    
    Right Triagle pattern
    * 
    * * 
    * * * 
    * * * * 
    
    */
    public static void main(String [] args){
        int n = 4;
        // for(int i=0;i<n;i++){
        //     for(int j=1;j<i+1;j++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }

        
        /*
        
        1 
        2 2 
        3 3 3 
        
        
        */


        for(int i=1;i<n;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
}
