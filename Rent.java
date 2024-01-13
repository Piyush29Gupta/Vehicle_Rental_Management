package vehicle;
import vehicle_owner.*;

public class Rent{
Owner owner_inc1 = new Owner();
   
    public void display_Type()
    {
        System.out.println(" [1]Car\n [2]Bike\n [3]Scooty\n [4]Mini-Bus\n [5]Cycle.");
    }
    public void display_rent()
    {
    	owner_inc1.DISPLAY();
    }
        
}