package again.p3;

@FunctionalInterface
public interface Operation {
    int calculate(int a, int b);

    default String getDescription() {
        return "Default Operation";
    }
}