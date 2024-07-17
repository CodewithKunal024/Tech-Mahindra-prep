import java.util.*;
public class Count {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size");
        int size=sc.nextInt();
        int ar[]= new int [size];
        System.out.println("enter elements into the array");
        for(int i = 0;i<size;i++){
            ar[i]=sc.nextInt();
        }
            Count ob = new Count();
            System.out.println("the Difference between the odd and even nos are:");
            System.out.println(ob.countOddEvenDifference(ar, size));
    }
    public static int countOddEvenDifference(int ar[],int size){
        int even=0,odd=0;
        for(int i=0;i<size;i++){
            if(ar[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
       return(odd-even);
    }
    }



