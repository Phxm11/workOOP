public class Telephone {
    public String os;
    public String Name;
    public int Rom;
    public int Ram;
    public String Colour;

    public void setDetalis(String TPos,String TPName,int TPRom,int TPRam,String TPColour){
        os = TPos;
        Name = TPName;
        Rom = TPRom;
        Ram = TPRam;
        Colour = TPColour;
    }
    public void getDetalis(){
        System.out.println("OS = "+os);
        System.out.println("Telephone name = "+Name);
        System.out.println("ROM = "+Rom);
        System.out.println("RAM = "+Ram);
        System.out.println("Colour Telephone = "+Colour);
    }

     
}