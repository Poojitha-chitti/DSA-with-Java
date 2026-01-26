import java.util.Scanner;
public class SecondLargest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of arry: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=-99999999;
        int secondLargest=-99999999;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest =arr[i];
            }else if(arr[i] > secondLargest && arr[i] !=largest){
                secondLargest=arr[i];
            }
        }
        if(secondLargest == Integer.MIN_VALUE){
            System.out.println("No second Largest element");
        }else{
            System.out.println("Second Largest element: " + secondLargest);
        }
        }
        }
    