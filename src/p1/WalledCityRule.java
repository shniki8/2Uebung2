package p1;

public class WalledCityRule implements Rule{
    @Override
    public void printRuleName() {
        System.out.println("Walled City Rule");
    }
//XD
    @Override
    public boolean computeNextState(boolean currentState, int input) {
        if (currentState && input > 2 && input < 5){ //Aufgabe sagt natürlich nicht ob inkl. oder exkl. ist
            return true;
        }
        else if (!currentState && input > 4 && input < 8){
            return true;
        }
        return false;
    }
}
