package Day_7.classtask;

public class Minvalue
{
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3, 5, 4};
        int min = 10000;
        for (int i = 0; i < nums.length-1; i++)
        {
            if (nums[i] < min)
            {
                min = nums[i];
            }
        }
        System.out.print("Minimum value is " + min);
    }
}