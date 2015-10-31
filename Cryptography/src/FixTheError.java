/**
 * Created by Sydney on 10/24/2015.
 */
public class FixTheError {
        public static void main(String[] args) {
            int year = 1;
            double balance = 100;
            double rate = .01;
            while (year <= 10) {
                double interest = balance * rate;
                balance = balance + interest;
                System.out.printf("Year %d: %8.2f\n", year, balance);
            }
        }
}
