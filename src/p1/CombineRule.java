package p1;

public class CombineRule implements Rule{
    @Override
    public boolean computeNextState(boolean currentState, int input) {
        ParityRule pr = new ParityRule();
        BiggerRule br = new BiggerRule();
        if (pr.computeNextState(currentState,input) && br.computeNextState(currentState,input)){
            return true;
        }
        else return false;
    }

    @Override
    public void printRuleName() {
        System.out.println("Combine Rule");
    }
}
