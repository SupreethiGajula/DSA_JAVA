package PatternPrint;

import java.util.Scanner;

public class OnetoN_Ntimes {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //System.out.print("*"+" ");
                System.out.print((char)(j+'A')+" ");
            }
            System.out.println();
        }

    }
}
