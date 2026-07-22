package again.p1;
import again.p1.Rule;


public class Cell {
    private Rule regel;
    private boolean state;
    public Cell(boolean state, Rule regel){
        this.regel = regel;
        this.state = state;
    }

    public void nextState(int input){ //34
        state = regel.computeNextState(state, input);
    }

    public void printState(){
        System.out.println("Status ist: " + state);
    }
    public void printMyRule(){
        regel.printRuleName();
    }
}
//Conway would not be proud.