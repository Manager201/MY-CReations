class armstrong_list
{
    void main()
    {
        int i,s=0,d,c=0;
        System.out.println("Armstrong Numbers Are =");
        for(i=1;i<=50000;i++)
        {
            int n=i;
            while(n!=0)
            {
                d=n%10;
                s=s+(int)Math.pow(d,3);
                n=n/10;
            }
            if(s==i)
            {
                System.out.println(s);
                c++;
            }
            s=0;
        }
        System.out.println("Frequency of Amstrong number = "+c);
    }
}
