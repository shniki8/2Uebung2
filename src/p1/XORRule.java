package p1;

public class XORRule implements Rule{
    @Override
    public void printRuleName() {
        System.out.println("XOR Rule");
    }

    @Override
    public boolean computeNextState(boolean currentState, int input) {
        boolean b = currentState;
        switch (input){
            case 0:
                b = false;
                break;
            case 1:
                b = true;
                break;
        }
        if (currentState^b){ //noch nie XOR Operator bis jetzt genutzt, endlich :DDD
            return true;
        }else return false;
    }
}
