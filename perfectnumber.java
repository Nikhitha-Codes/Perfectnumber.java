import java.util.*;
class Perfectnumber
{
    int num(int n)
    {
        int s=0;
        for(int i=1; i<n; i++)
        {
        if(n%i==0)
        {
             s = s+i;
        }
        }
    if(s==n)
    {
        System.out.println("it is a perfect number");
    }
    else
    {
        System.out.println("it is not a perfect number");
    }
    return 0;
    }
}
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Perfectnumber p=new Perfectnumber();
        p.num(n);
    }
}
