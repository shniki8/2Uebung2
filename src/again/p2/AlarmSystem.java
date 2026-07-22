package again.p2;

public class AlarmSystem implements Notifiable{
    boolean emergencyMode = false;
    public AlarmSystem(boolean emergencyMode){
        this.emergencyMode = emergencyMode;
    }
    @Override
    public String getNotification(){
        // return emergencyMode ? "Alarm! Please check your home!" : Notifiable.super.getNotification(); // Wollte es eigentlich direkt so machen aber die Aufgabe sagt ja mal wieder nein ...
        return "Alarm! Please check your home!";
    }
    public String alert(){
        return emergencyMode ? getNotification() : Notifiable.super.getNotification(); // dann halt hier :'(
    }
}
