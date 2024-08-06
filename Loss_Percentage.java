import java.util.Scanner;
public class losspercentage{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        double loss=(a-b)/10.0;
        double losspercentage=(loss*1000)/a;
        System.out.printf("%.2f",losspercentage);
    }
}