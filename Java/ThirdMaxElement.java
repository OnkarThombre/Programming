import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 15, 12};

        int fmax = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int tmax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > fmax) {
                // shift down
                tmax = smax;
                smax = fmax;
                fmax = num;
            } 
            else if (num > smax && num != fmax) {
                // shift second and third
                tmax = smax;
                smax = num;
            } 
            else if (num > tmax && num != smax && num != fmax) {
                tmax = num;
            }
        }

        System.out.println("First max: " + fmax);
        System.out.println("Second max: " + smax);
        System.out.println("Third max: " + tmax);
    }
}
