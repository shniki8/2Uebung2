package again.p1;
public class Main {
    //Präsenzaufgaben trivial
    static ToggleRule toggle = new ToggleRule();
    public static void main(String[] args) {
        testCellBehavior(true, toggle);
    }
    public static void testCellBehavior(boolean initialState, Rule regel){
        //Bisschen anders als VL, bin zu faul es zu kopieren.
        Cell c = new Cell(initialState, regel);
        for (int i = 0; i < 5; i++) {
            c.nextState(i);
            c.printMyRule();
            c.printState();
        }
    }
    public static void testCellBehavior(boolean initialState, Rule regel, int z){
        //Bisschen anders als VL, bin zu faul es zu kopieren.
        Cell c = new Cell(initialState, regel);
        for (int i = 0; i < z; i++) {
            c.nextState(i);
            c.printMyRule();
            c.printState();
        }
    }
}
