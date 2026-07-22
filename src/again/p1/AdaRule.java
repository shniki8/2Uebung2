package again.p1;

public class AdaRule implements Rule{
    //This rule was created with admiration for a certain Person in mind.
    @Override
    public boolean computeNextState(boolean currentState, int input) {
        //Versuche das Rätsel zu lösen, wenn du das hier schon siehst, Person, die das sich anschaut, es ist eigentlich ganz einfach.
        if (input == 1 || input == 14 || input == 141 || input == 14112 || input == 1411215 || input == 141121522 || input == 1411215225 /* || input == 141121522512 || input == 1411215225121 || input == 14112152251213 || input == 141121522512135 */){
            return true;
        }else return false;
    }

    @Override
    public void printRuleName() {
        System.out.println("Ada's Rule");
    }
}
