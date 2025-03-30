public class TotalDigitCube extends Digit {
    
    @Override
    public long calculate() {
        int sum = 0;
        long temp = number;

        while (temp > 0) {
            sum += (int) (temp % 10);
            temp /= 10;
        }
        return (long) sum * sum * sum;
        
    }
}
