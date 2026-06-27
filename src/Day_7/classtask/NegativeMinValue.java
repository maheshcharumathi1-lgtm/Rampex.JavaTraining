package Day_7.classtask;

public class NegativeMinValue
{
    public static void main(String[] args)
{
    int[] nums = {-1, -2, 3, 5, 4};
    int min = nums[0];
    for (int i = 0; i < nums.length; i++)
    {
        if (nums[i] < min)
        {
            min = nums[i];
        }
    }
    System.out.print("Minimum value is " + min);
}
}

