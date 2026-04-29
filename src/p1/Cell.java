package p1;

public class Cell { // Biology <3    private boolean state;
    private Rule regel;
    private boolean state;
    public Cell(boolean state, Rule regel){
        this.regel = regel;
        this.state = state;
    }

    public void nextState(int input){
    state = regel.computeNextState(state,input);
    }
    public void printState(){
        System.out.println("Status ist: " + state);
    }
    public void printMyRule(){
        regel.printRuleName();
    }
}
//Conway would not be proud.