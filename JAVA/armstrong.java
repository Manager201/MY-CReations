import java.util.*;
class armstrong
{
    void main()
    {
        int i,n,s=0,d,c=0;
        Scanner sc=new Scanner(System.in);
        int a[]= new int[15];
        System.out.println("Enter 15 numbers");
        for(i=0;i<15;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<15;i++)
        {
            n=a[i];
            while(n!=0)
            {
                d=n%10;
                s=s+(int)Math.pow(d,3);
                n=n/10;
            }
            if(s==a[i])
            {
                System.out.println("Armstrong = "+a[i]);
                c++;
            }
            s=0;
        }
        System.out.println("Frequency of Amstrong number = "+c);
    }
}
