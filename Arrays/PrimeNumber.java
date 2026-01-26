import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(n<=1){
            System.out.println("Not prime)");
            return;
        }
        boolean isPrime=true;
        for(int i=2;i<=n/2;i++){
            if(n%1==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");

        }
        }
            }
        