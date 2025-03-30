public class DigitTotalCube extends Digit {
    @Override
    public long calculate() {
       
        long sum = 0;
        long temp = number;

        while (temp > 0) {
            int digit = (int)(temp % 10);
            sum += digit * digit * digit;
            temp /= 10;
        }
        return sum;
    }
}
