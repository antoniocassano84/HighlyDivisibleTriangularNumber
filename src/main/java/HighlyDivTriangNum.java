import java.util.ArrayList;
import java.util.List;

class HighlyDivTriangNum {

    static void printDivisors(int maxNum) {
        long n = 0L, m = 1L;
        List<Long> divs = new ArrayList<>();
        while(divs.size() <= maxNum) {
            n += m++;
            divs.clear();
            System.out.print(n + ": ");
            for (long i = 1L; i <= n; i++) if (n % i == 0) divs.add(i);
            for (long l : divs) System.out.print(l + " ");
            System.out.println();
        }
    }


    public static void main(String args[]) {
        printDivisors(500);
    }
}
