import java.util.*;
public class DecimalToBinary {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int a=sc.nextInt();
    System.out.println("the number converted to binary is:");
DecimalToBinary ob= new DecimalToBinary();
System.out.println(ob.binary(a));
}
public static int binary(int a){
    int t=a ;
    int b;
    int bi=0;
    while(t>0){
        b=t%2;
        bi=bi*10+b;
        t=t/2;
    }
    return bi;
}
}
