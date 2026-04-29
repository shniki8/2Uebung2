package p1;

public class PCwillHateMeRule implements Rule{
    public boolean dontSetThisToTrue = false;
    @Override
    public void printRuleName() {
        System.out.println("Useful Rule");
    }

    @Deprecated
    @Override
    public boolean computeNextState(boolean currentState, int input) {
        double[] d = new double[100000];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length*d.length; j++) { //Let's do it a lot of times
                for (int k = 0; k < 69; k++) {
                    for (int l = 0; l < 3; l++) { //Let's do some math :D
                        d[i] = Math.asin(i+j+k+l) + Math.random()*101 - Math.acos(l) + Math.divideExact((int)Math.cos(j*l) + input, 2) + Math.exp(Math.PI);
                        Rule[] letsCreateSomeArrays = new Rule[i];
                        if (dontSetThisToTrue) {
                            Double x = Math.PI/Math.random()*101; //pray we dont divide by zero
                        }


                    }
                }
            }
        }



        return true;
    }
}
