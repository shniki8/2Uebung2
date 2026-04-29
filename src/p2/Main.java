package p2;

public class Main {
    public static void main(String[] args) {
        AlarmSystem sys = new AlarmSystem(true);
        String msg = sys.getNotification();
        System.out.println(msg);
        msg = sys.alert();
        System.out.println(msg);
        sys.switch_();
        msg = sys.getNotification();
        System.out.println(msg);
        msg = sys.alert();
        System.out.println(msg);

    }
}
