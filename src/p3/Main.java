package p3;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Operation o = new Add();
        System.out.println(o.getDescription());
        System.out.println(o.calculate(1,69));
        o = new Multiply();
        System.out.println(o.getDescription());
        System.out.println(o.calculate(1,69));
        System.out.println(new LegacyCalculator().add(1,69));
        test();
    }
    public static void test(){
        int x = new LegacyCalculator().add(1,2);
        System.out.println(x);
    }
}
