package p3;

@FunctionalInterface
public interface Operation {
    int calculate(int a, int b);
    //int berechneDoppelt(int a, int b);
    default String getDescription() {
        return "Default Operation";
    }
}
