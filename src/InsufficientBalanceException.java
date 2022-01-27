public class InsufficientBalanceException extends RuntimeException {
    @Override
    public String toString() {
        return "InsufficientBalanceException：开销大于现金储备！";
    }
}
