import java .util.*;
public class AbsoluteDifference {
    public int AbsoluteDiff(int ar[],int pos,int size){
    int sum=0;
    for(int i=pos;i<size-1;i++){
        sum=sum+Math.abs(ar[i]-ar[i+1]);
    }
return sum;
}
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Size of the array");
        int size = sc.nextInt();
        System.out.println("Enter elements of the Array");
        int ar[]= new int[size];
        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }
        int pos;
        System.out.println("Enter position");
        pos=sc.nextInt();

AbsoluteDifference ob = new AbsoluteDifference();
    System.out.println(ob.AbsoluteDiff(ar,pos,size));
}
}
