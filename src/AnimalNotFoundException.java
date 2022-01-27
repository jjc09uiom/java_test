public class AnimalNotFoundException extends RuntimeException {
    @Override
    public String toString() {
        return "AnimalNotFoundException：当前没有动物可看！";
    }
}
