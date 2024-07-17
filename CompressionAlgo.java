import java.util.Scanner;

public class CompressionAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String a = sc.next();
        CompressionAlgo ob = new CompressionAlgo();
        System.out.println("Number of non-repeating characters: " + ob.nonRepeating(a));
    }

    public int nonRepeating(String a) {
        int d = 0;
        
        for (int i = 0; i < a.length(); i++) {
            int c = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(i) == a.charAt(j)) {
                    c++;
                }
            }
            if (c == 1) {
                d++;
            }
        }
        
        return d;
    }
}
