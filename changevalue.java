import java.util.Arrays;

public class changevalue {
    public static void main(String[] args) {
        // create an array
      int [] arr = { 1,3,2,45,6};
        Change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Change(int[] nums){
        nums[0] = 99;
    }
}
