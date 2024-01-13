package pack2;
import java.util.Scanner;
import java.lang.Math;
import vehicle.*;
import vehicle_owner.*;


interface Vehicle_interface{
    void customer_details();// make a class or method for take details of customer
    void select_vehicle(); // a method or class for select vehicle and take time in time and outtime // take static var for time 
    double calculate();// a class or method for calculate rent for selected vehicle acc time
    void Increment_Time();//make a class or method for increase time for vehicle
    void display();
}

class customer implements Vehicle_interface{
    
    // final double car=250,bike=100,scooty=50,mini_bus=500,cycle=25;
    String name,licence,vehicle;
    int age;
    static double cost=0;
    double time;
    Scanner input = new Scanner(System.in);
    Owner owner_inc1 = new Owner();
    int ID;
    
    public customer(int ID) // constructor 
    {
        this.ID = ID +1;       // increment ID
    }
    public void customer_details()   // taking input of details
    {
        System.out.print("\nEnter Name:- ");
        name = input.nextLine();

        System.out.print("\nEnter Licence:- ");
        licence = input.next();
        
        System.out.print("\nEnter Age:- ");
        age = input.nextInt();
    
    }
    
    public void select_vehicle()  // taking input for vechile and taking time
    {
        System.out.print("Enter Vehicle =");
        vehicle = input.next();

        try{
        
            if(vehicle.equalsIgnoreCase("car") || vehicle.equalsIgnoreCase("bike") || vehicle.equalsIgnoreCase("scooty") || 
                vehicle.equalsIgnoreCase("mini-bus") ||vehicle.equalsIgnoreCase("cycle") )
        {
        System.out.print("\nEnter Hours For Rent The Vehicle=");
        time = input.nextDouble(); // ceil
        time = Math.ceil(time);
        }
        }
        
        catch(Exception e)
        {
            System.out.println("\n\t\tException = INVALID VECHILE TYPE\n");
        }
        
    }
    
    public double calculate()
    {
        double cal=0.0;
        // if(vehicle.equalsIgnoreCase("car"))
        // {
        //     cal = time * car;
        //     return cal;
            
        // }
        // else if(vehicle.equalsIgnoreCase("scooty"))
        // {
        //     cal = bike * time;
        //     return cal;
            
        // }
        // else if(vehicle.equalsIgnoreCase("bike"))
        // {
        //     cal = scooty * time;
        //     return cal;
            
        // }
        // else if(vehicle.equalsIgnoreCase("mini-bus"))
        // {
        //     cal = mini_bus * time;
        //     return cal;
            
        // }
        // else if(vehicle.equalsIgnoreCase("cycle"))
        // {
        //     cal = cycle * time;
        //     return cal;
        // }
        cal = time * owner_inc1.increment_price(vehicle);
        return cal;
    }
    public void Increment_Time()
    {
        System.out.print("Extra Time =");
        double extra_time = input.nextDouble(); // ceil
        extra_time = Math.ceil(extra_time);
        time = time + extra_time;
        
        
    }
    
    public void display() // display details of customer 
    {
        cost = calculate();
        System.out.println("\nName- "+name+"\nLicence- "+licence+"\nAge- "+age+"\nvehicle I'D-"+ID+"\nVEHICLE = "+vehicle+
        "\nTOTAL PAID AMOUNT ="+cost);
    }
    
}


public class VehicleRentalManagement
{
    public static void main(String args[])
    {
        int cho;
        Scanner input = new Scanner(System.in);
        Owner owner_inc1 = new Owner();
        Rent pack = new Rent();
        customer obj1 = new customer(1000);
        
        while(true)
        {
        System.out.print("\n\t\t\t1)OWNER. 2)customer\n");
        int a;
        System.out.print("Enter your STATUS:");
        a = input.nextInt();
        if(a == 1)
        {
        System.out.print("\n1)INCREMENT PRICE OF VECHILE. \n2)DISPLAY TOTAL PROFIT. \n3)DISPLAY PRICE OF VECHILE:-");
        int b;
        System.out.print("\n\tEnter your CHOICE:");
        b = input.nextInt();
        if(b == 1)
        {
        double inc;
        String veh;
        System.out.print("Enter your INCREMENT price=:");
        inc = input.nextInt();
        System.out.print("\nEnter your  VECHILE =:");
        veh = input.next();
        //static double vec_price;
        //vec_price = owner_inc1.increment_price(inc,veh);
        owner_inc1.increment_price(inc,veh);
        }
        
        else if(b ==2)
        {
            System.out.println("Total Profit = "+customer.cost);
        }
        else if(b==3)
        {
            owner_inc1.DISPLAY();
        }
        }
        
        else if(a ==2)
        {
            
            while(true)
        {
        System.out.print("\nX-X-X-X-X-X-X-X-X-X-X-X--X-X-X-X-X-X-X-X-X-X-X--X-X-X-X-X-X-X-X-X");
        System.out.println("\n\t\tMENU:");
        System.out.println("\t(1)Available Vehicles:");
        System.out.println("\t(2)Rent For Available Vehicles:");
        System.out.println("\t(3)Details Of customer:");
        System.out.println("\t(4)Select vehicle:");
        System.out.println("\t(5)Rent For Selected Vehicle:");
        System.out.println("\t(6)Increase Time For Your selected vehicle:"); // increase outtime and rent
        System.out.println("\t(7)DISPLAY"); // show vehicle id and user details
        System.out.println("\t(8)EXIT");
        
        System.out.print("\n\t\tEnter Your choice =");
            cho = input.nextInt();
        System.out.print("X-X-X-X-X-X-X-X-X-X-X-X--X-X-X-X-X-X-X-X-X-X-X--X-X-X-X-X-X-X-X-X\n\n");
            switch(cho)
            {
                case 1:
                    {
                        pack.display_Type();
                        break;
                    }
                case 2:
                    {
                        owner_inc1.DISPLAY();
                        break;
                    }
                case 3:
                    {
                        obj1.customer_details();// make a class or method for take details of customer
                        break;
                    }
                case 4:
                    {
                        obj1.select_vehicle();// a method or class for select vehicle and take time // take static var for time                          
                        break;
                    }
                case 5:
                        {
                            double cal_total;
                            cal_total = obj1.calculate(); // a class or method for calculate rent for selected vehicle acc time
                            System.out.println("Rent For Selected Vehicle:"+cal_total);
                            break;
                        }
                case 6:
                        {
                            obj1.Increment_Time();
                            //make a class or method for increase time for vehicle
                            break;
                        }
                
                case  7:
                    {
                        try{
                            obj1.display();
                            }
                        catch(NullPointerException e)
                        {
                            System.out.println("PLEASE ENTER DETAILS FIRST!!!!!");
                        }
                        finally
		            	{
                            System.out.println("\n\t\t\t-x-x-x-x-x-x-THANK YOU-x-x-x-x-x-x-x");
                            break;
			            }
                        
                    }
	        	case 8:
                    {
                        System.exit(0);
                        break;
                    }
                default :
                    {
                        throw new ArithmeticException("INVALID INPUT");
                        
                    }
                    
            }
        }
        }
        else {
            System.exit(0);
                        break;
        }
        }        
    }
}






