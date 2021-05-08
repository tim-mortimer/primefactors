import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> of(int n) {
        List<Integer> primes = new ArrayList<>();

        if (n > 1) {
            int divisor = 2;

            while (n > 1) {
                while (n % divisor == 0) {
                    primes.add(divisor);
                    n /= divisor;
                }

                divisor++;
            }
        }

        return primes;
    }
}
