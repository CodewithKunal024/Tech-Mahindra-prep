import java.util.*;
public class InchesToFoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int ar[]= new int [size];
        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }
        InchesToFoot ob= new InchesToFoot();
        System.out.println(ob.toFeet(ar, size));
    }
public static int toFeet(int ar[],int size){
    int totalfeet=0;
    for(int i=0;i<size;i++){
        if(ar[i]>=12){
            totalfeet+=(ar[i]/12);
        }
    }
    return totalfeet;
}

}
