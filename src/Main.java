import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int i,times=0;
        String str=sc.next();
        char cur=str.charAt(0);
        int lena=str.length();
        for(i=0;i<lena;i++)
        {
            if(cur==str.charAt(i))
            {
                times++;
                if(times>=k)
                {
                    System.out.println(cur);
                    System.exit(0);
                }
            }
            else{
                cur=str.charAt(i);
                times=1;
            }
        }
        System.out.println("No");
    }
}
