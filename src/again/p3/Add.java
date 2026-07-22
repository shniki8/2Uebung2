package again.p3;

public class Add implements Operation{
    @Override
    public int calculate(int a, int b) {
        return a+b; //complex math operation!!!
    }

    @Override
    public String getDescription() {
        return "Addition";
    }
}
