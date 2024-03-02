
public class Linear {
    public static void main(String[] args) {

        int[] nums = {42, 2, 45, 63, 21, 5, -7, 0, -85};
        int traget = 21;
        int ans = linearserach(nums,traget);
        System.out.println(ans);

    }
    static int linearserach(int[] arr, int target){
        if(arr.length ==0){
            return -1;
        }
        for(int index=0; index< arr.length; index++){
            int element = arr[index];
            if(element == target){
                //System.out.println("element is : "+element);
                //System.out.println("index value of element is : "+index);
                //return index;
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

}
