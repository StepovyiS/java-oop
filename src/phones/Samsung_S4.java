package phones;

public class Samsung_S4 extends Phone {
    public Samsung_S4(){
        screenSize = 5;
        hasWifi = true;
        }
        @Override
    public void sendSMS(String number, String message) {
            System.out.println("Hello"+message+"SamsungS4 is sending to"+number);

    }
}
