import java.util.*;
public class TaxCollect {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int ar[]={1000, 2000, 3000, 4000, 5000};
        int size= ar.length;
        TaxCollect ob = new TaxCollect();
        System.out.println(ob.taxToBePaid(size, ar));

    }
    public int taxToBePaid(int size,int ar[]){
        int taxamount=0;
        for(int i=0;i<size;i++){
            if(ar[i]>1000){
                taxamount+=(ar[i]-1000)*0.1;
            }
        }
        return taxamount;
    }

}
