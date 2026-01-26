public class Max_Min_Find {
    public static void main(String[] args) {
        int[] arr = {7,4,8,6,1,0,2};
        int min = arr[0];
        int max = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }

        }
        System.out.println("the minimum and maximum values are:"+min+" ,"+max);

    }
}
