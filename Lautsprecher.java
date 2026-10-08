public class Lautsprecher 
{
    private String hersteller;
    private int watt;
    private boolean bluetooth;


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
}