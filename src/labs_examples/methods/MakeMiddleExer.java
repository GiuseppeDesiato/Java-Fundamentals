package labs_examples.methods;

public class MakeMiddleExer {

    public static void main(String[] args) {

        int[] intArray = {4, 5, 3, 1, 2, 4};

        System.out.println(makeMiddle(intArray));

    }

    public static int[] makeMiddle(int[] nums) {

        return new int[] {nums[nums.length/2 -1], nums[nums.length/2]};

    }

}
