package again.p2;

public class Main {
    public static void main(String[] args) {
        AlarmSystem aS = new AlarmSystem(true);
        AlarmSystem aS2 = new AlarmSystem(false);
        System.out.println(aS.alert());
        System.out.println(aS2.alert());
    }
}
