import java.util.*;
public class CompressionAlgo2 {
 public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    String a = sc.next();
    CompressionAlgo2 ob = new CompressionAlgo2();
    System.out.println(ob.nonRepeating(a));
 }
public static int nonRepeating (String a){
    Map<Character,Integer> hmap= new HashMap<>();
    if(a==null||a.isEmpty()){
        return 0;
    }
    for(char ch:a.toCharArray()){
        hmap.put(ch,hmap.getOrDefault(ch, 0)+1); 
    }
int count=0;
for(Map.Entry<Character,Integer> entry:hmap.entrySet()){
    if(entry.getValue()==1){
        count++;
    }
}
return count;
}
}
