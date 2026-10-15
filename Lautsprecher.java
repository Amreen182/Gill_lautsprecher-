public class Lautsprecher 
{
    private String hersteller;
    private int watt;
    private boolean bluetooth;

    //constructor 
   public Lautsprecher(String neuHersteller, int neuWatt, boolean neuBluetooth)
   {
       setHersteller(neuHersteller);
       setWatt(neuWatt);
       setBluetooth(neuBluetooth);
   }
   
   public Lautsprecher()
   {
       setHersteller("UNKN");
       setWatt(0);
       setBluetooth(false);
   }
   
   
   // get-methode 
   public String getHersteller()
   {
      return hersteller;
   }
 
   public int getWatt()
   {
       return watt;
   }
   
   public boolean getBluetooth()
   {
       return bluetooth;
   }
   
   
   // set-methode
   public void setHersteller(String neuHersteller)
   {
       hersteller = neuHersteller;
   }
   
   public void setWatt(int neuWatt)
   {
       watt = neuWatt;
   }
   
   public void setBluetooth(boolean neuBluetooth)
   {
       bluetooth = neuBluetooth;
   }
   
   // print-methode 
   
   public void printLautsprecher()
   {
       System.out.println("Lautsprecher "+hersteller+" - bluetooth: " + bluetooth+" - "+watt+" watt");
   }
   
}