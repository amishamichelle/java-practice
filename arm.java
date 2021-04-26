import java.util.Scanner;
/**
 *
 * @author KIIT
 */
class Arm {
    public static void main (String[] args){
        int n,r,t,sum=0;
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        t=n;
        while(n>0){
            r=n%10;
            sum+=(r*r*r);
            n/=10;
        }
        if(t==sum)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}
