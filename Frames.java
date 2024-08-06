import java.util.Scanner;
public class frames{
    public static void main(String args[])
    {
        int a,b,c,perimeter,x;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        perimeter=2*(a+b);
        x=c*perimeter;
        System.out.println(x);
    }
}