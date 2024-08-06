import java.util.Scanner;
public class watertaps{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=(a*b)/(a+b);
        System.out.println(c);
    }
}