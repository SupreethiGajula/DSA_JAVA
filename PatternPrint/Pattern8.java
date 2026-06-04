public class Pattern8{
    public static void main(String[] args) {
        int n = 4;
        for(int i=0;i<n;i++){
            //innrer loop to print spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //inner loop to print numbers
            for(int j=0;j<n-i;j++){
                System.out.print(i+1);
            }

            System.out.println();
        }
    }
}