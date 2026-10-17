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
   
   public Lautsprecher(String neuHersteller, int neuWatt)
   {
       setHersteller(neuHersteller);
       setWatt(neuWatt);
       setBluetooth(false);
   }
   
   public Lautsprecher(String neuHersteller)
   {
       setHersteller(neuHersteller);
       setWatt(0);
       setBluetooth(false);
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
   // add this methode
   public void setHersteller(String hersteller)
   {
       this.hersteller = hersteller;
   }
   
   public void setWatt(int watt)
   {
       this.watt = watt;
   }
   
   public void setBluetooth(boolean bluetooth)
   {
       this.bluetooth = bluetooth;
   }
   
   
   
   // print-methode 
   
   public void printLautsprecher()
   {
       System.out.println("Lautsprecher "+hersteller+" - bluetooth: " + bluetooth+" - "+watt+" watt");
   }
   
   
   
   
   
}