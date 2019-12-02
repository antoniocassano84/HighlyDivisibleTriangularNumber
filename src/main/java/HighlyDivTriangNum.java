import java.util.ArrayList;
import java.util.List;

class HighlyDivTriangNum {

    static void printDivisors(int maxNum) {
        int n = 0, m = 1;
        List<Integer> divs = new ArrayList<>();
        while(divs.size() <= maxNum) {
            n += m++;
            divs.clear();
            System.out.print(n + ": ");
            for (int i = 1; i <= n; i++) if (n % i == 0) divs.add(i);
            for (int i : divs) System.out.print(i + " ");
            System.out.println("- #" + divs.size());
        }
    }


    public static void main(String args[]) {
        printDivisors(5);
    }
}
