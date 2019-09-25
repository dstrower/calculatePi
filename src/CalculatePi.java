/**
 * @author DT071977  (Dave Trower)
 * This program prints out the number pi using the randon number generator.
 * There is description of this process here: https://github.com/dstrower/calculatePi/blob/master/README.md
 */
// cerner_2^5_2019


public class CalculatePi {

    public static void main(String[] args) {
        double attempts = 0;
        double success = 0;
        double four = 4.0D;
        while(true) {
            double x = Math.random();
            double y = Math.random();
            double distance = Math.sqrt(x * x + y * y);
            if(distance <= 1) {
                success++;
            }
            attempts++;
            double pi = four*  ( success/attempts);
            if(attempts % 100000 == 0) {
                System.out.println(pi);
            }
        }
    }
}