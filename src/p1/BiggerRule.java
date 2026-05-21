package p1;

public class BiggerRule implements Rule{
    @Override
    public boolean computeNextState(boolean currentState, int input) {
        return input > 5;
    }

    @Override
    public void printRuleName() {
        System.out.println("Bigger Rule");
    }
}
