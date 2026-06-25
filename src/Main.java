import java.util.Scanner;
class SumOfEven{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.print("The sum of even numbers from 1 to "+n+" is: " +sum);
    }
}
