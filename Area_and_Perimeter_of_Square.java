import java.util.Scanner;
public class areaandperimeterofsquare{
    public static void main(String args[])
    {
        int a,area,perimeter;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        area=a*a;
        System.out.printf("%d",area);
        perimeter=4*a;
        System.out.printf(" %d",perimeter);
    }
}