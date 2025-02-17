//factorial using parematerized function

public class factorialpara {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    public static int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
}