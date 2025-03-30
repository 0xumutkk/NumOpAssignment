public class NumOp {
    private int[] digits;
    private int size;
    public Digit digit;

    public NumOp(int number) {
        digits = new int[20]; 
        size = 0;
        int temp = number;

        while (temp > 0) {
            digits[size++] = temp % 10;
            temp /= 10;
        }

        reverseArray();
    }

    public NumOp(int number, Digit digit) {
        this(number);
        this.digit = digit;
     }

    private NumOp(int[] digits, int size, Digit digit) {

        this.digits = new int[20];
        for (int i = 0; i < size; i++) {
            this.digits[i] = digits[i];
        }
        
        this.size = size;
        this.digit = digit;
    }

    private void reverseArray() {
        for (int i = 0; i < size / 2; i++) {
            int temp = digits[i];
            digits[i] = digits[size - i - 1];
            digits[size - i - 1] = temp;
         }
     }

    public NumOp removeFirst() {
        int[] newDigits = new int[20];
        for (int i = 1; i < size; i++) {
            newDigits[i - 1] = digits[i];
        }
        return new NumOp(newDigits, size - 1, digit);
    }

    public NumOp reverse() {
        
        int[] newDigits = new int[20];
        for (int i = 0; i < size; i++) {
            newDigits[i] = digits[size - i - 1];
        }
       
        return new NumOp(newDigits, size, digit);
    }

    public NumOp getFirst() {
        int[] newDigits = new int[20];
        newDigits[0] = digits[0];

        return new NumOp(newDigits, 1, digit);
     }

    public long toValue() {
        long value = 0;

        for (int i = 0; i < size; i++) {
            value = value * 10 + digits[i];
        }
        return value;
    }

    public void CreateTotalDigitCube() {
        this.digit = new TotalDigitCube();
        }
}
