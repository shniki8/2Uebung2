package p1;

public class Main {
    public Main(){

    }
    public static void testCellBehavior(boolean initialState, Rule regel){
    Cell cell = new Cell(false, regel);
    cell.printMyRule();
    cell.printState();
        for (int i = 0; i < 6; i++) {
            System.out.println("Aenderung Nummer / Uebergabewert: " + i);
            cell.nextState(69);
            cell.printState();
        }
    }
    public static void testCellBehavior(boolean initialState, Rule regel, int z){
        Cell cell = new Cell(false, regel);
        cell.printMyRule();
        cell.printState();
        for (int i = 0; i <= z; i++) {
            System.out.println("Aenderung Nummer / Uebergabewert: " + i);
            cell.nextState(69);
            cell.printState();
        }
    }
    public static void main(String[] args) {
        Rule toggle = new ToggleRule();
        testCellBehavior(true, toggle);

    }

}
