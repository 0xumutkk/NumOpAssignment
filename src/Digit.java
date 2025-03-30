public abstract class Digit {
    protected long number;

    public void SetNumber(long number) {
        this.number = number;
    }

    public abstract long calculate();
}
