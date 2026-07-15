package Day_21.Classwork;

public class SumOfNum {
    public static void main(String [] args){
        int sum =0;
        add(1,sum);

    }
    public static void add(int num,int sum){
        if(num==6){
            return;
        }
        sum=sum+num;
        num++;

        System.out.println(sum);
        add(num,sum);

    }
}
