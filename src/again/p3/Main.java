package again.p3;
@SuppressWarnings("deprecation")
public class Main {

    public static void main(String[] args) {
        Add a = new Add();
        Multiply m = new Multiply();
        System.out.println(a.calculate(67,2)); //wink
        System.out.println(m.calculate( 24, 2));
        System.out.println(a.getDescription());
        System.out.println(m.getDescription());
        LegacyCalculator lc = new LegacyCalculator();
        System.out.println(lc.add(69,0));
    }
}
