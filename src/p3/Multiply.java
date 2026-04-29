package p3;

public class Multiply implements Operation{
    @Override
    public int calculate(int a, int b) {
        return a*b;
    }
    @Override
    public String getDescription(){
        return "Multiply Operation";
    }
}
