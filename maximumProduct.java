import java.util.Scanner;

public class maximumProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = sc.nextInt();
        int[] ar = new int[size];
        System.out.println("Enter elements in the array:");
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }
        maximumProduct ob = new maximumProduct();
        int[] result = ob.maxProduct(ar, size);
        System.out.println("The maximum product pair is: " + result[0] + " " + result[1]);
    }

    public int[] maxProduct(int ar[], int size) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int negmax1 = Integer.MAX_VALUE;
        int negmax2 = Integer.MAX_VALUE;

        if (size < 2) {
            return new int[]{0, 0};
        }

        for (int i = 0; i < size; i++) {
            // Update the two largest positive numbers
            if (ar[i] > max1) {
                max2 = max1;
                max1 = ar[i];
            } else if (ar[i] > max2) {
                max2 = ar[i];
            }

            // Update the two smallest negative numbers
            if (ar[i] < 0 && ar[i] < negmax1) {
                negmax2 = negmax1;
                negmax1 = ar[i];
            } else if (ar[i] < 0 && ar[i] < negmax2) {
                negmax2 = ar[i];
            }
        }

        // Compare the products of the two largest positive numbers and the two smallest negative numbers
        if ((max1 * max2) > (negmax1 * negmax2)) {
            return new int[]{max1, max2};
        } else {
            return new int[]{negmax1, negmax2};
        }
    }
}

