public class SortingArray {
    public static void main(String[] args) {

        int[] arr = {1,0,0,2,0,2,2,1};

        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i]<= arr[j]){
                    int tem = arr[i];
                    arr[i] = arr[j];
                    arr[j]= tem;
                }
            }
        }
        for(int e:arr){
            System.out.print(e+" ");
        }
    }
}
