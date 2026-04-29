package p3;

public class Add implements Operation{
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
    @Override
    public String getDescription(){
        return "Add Operation"; //Wer haette es gedacht...
    }
}
