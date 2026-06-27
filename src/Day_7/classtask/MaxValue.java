package Day_7.classtask;

public class MaxValue
{
    public static void main(String[] args)
    {
       int[] nums = {1, 2, 3, 5, 4};
       int max = 0;
       for (int i = 0; i < nums.length; i++)
       {
           if (nums[i] >max)
           {
               max= nums[i];
           }
       }
       System.out.print("Maximum value is " + max);
    }
}

