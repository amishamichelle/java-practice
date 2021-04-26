import java.util.Scanner;

class sumdigits {
    public static void main(String[] args){
        int n,r,s=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number:");
        n = sc.nextInt();
        
        while (n>0)
        {
            r=n%10;
            s+=r;
            n/=10;
        }
        System.out.println("sum of digits:"+s);
    }
}
