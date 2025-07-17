public class DutchNationalAlgorithm_sortign {
    public static void main(String[] args) {
        int[] arr = {1,0,0,2,0,2,2,1};
/*
Time and Space Complexity:
Time: O(n) – each element is visited at most once.
Space: O(1) – in-place sorting.
 */
        int low = 0;
        int mid = 0;
        int hight = arr.length-1;
        for(int i = 0; i<arr.length; i++){
            if(arr[mid] == 0){
                int tem = arr[low];
                arr[low] = arr[mid];
                arr[mid] = tem;
                low++;
                mid++;

            }
            if(arr[mid] == 1){
                mid++;
            }
            if(arr[mid] ==2){
                int tem = arr[mid];
                arr[mid] = arr[hight];
                arr[hight] = tem;
                hight--;
            }
        }
    }
}
