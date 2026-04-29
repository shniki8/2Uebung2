package p2;

public class AlarmSystem implements Notifiable{
    boolean emergencyMode;
    @Override
    public String getNotification() {
        return "Alarm! Please check your home!";
    }
    public String alert(){
        if (emergencyMode){
           return getNotification();
        }
        else return Notifiable.super.getNotification();
    }
    public AlarmSystem(boolean emergencyMode){
        this.emergencyMode = emergencyMode;
    }
    public void switch_(){
        emergencyMode = !emergencyMode;
    }
}
