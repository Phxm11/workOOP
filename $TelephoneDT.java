public class $TelephoneDT {
    public static void main(String[] args) {
        Telephone Iphone = new Telephone();
        Telephone Samsung = new Telephone();

        Iphone.setDetalis("IOS", "Iphone", 128, 8, "black");
        Iphone.getDetalis();

        Samsung.setDetalis("Android", "Samsung", 64, 4, "white");
        Samsung.getDetalis();


    }
    
}
