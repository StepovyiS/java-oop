package phones;

public class SamsungS4 extends Phone {
    public SamsungS4(){
        screenSize = 5;
        hasWifi = true;
    }
    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Hello"+message+"SamsungS4 is sending to"+number);

    }
} {
}
