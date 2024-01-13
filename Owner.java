package vehicle_owner;

public class Owner{
    double arr[] = new double[5];
    public Owner()
    {
        arr[0] = 250;
        arr[1] = 100;
        arr[2] = 50;
        arr[3] = 500;
        arr[4] = 25;
    }
    double price;
    String name;
    
    public double increment_price(String name)
    {
       

 this.name = name;
        if(name.equalsIgnoreCase("car"))
        {
            return arr[0];
            
        }
        else if(name.equalsIgnoreCase("bike"))
        {
            return arr[1];
            
        }
        else if(name.equalsIgnoreCase("scooty"))
        {
            return arr[2];
            
        }
        else if(name.equalsIgnoreCase("mini-bus"))
        {
            return arr[3];
            
        }
        else if(name.equalsIgnoreCase("cycle"))
        {
            return arr[4];
            
        }
        return 0;
    }
    
    
    public double increment_price(double price,String name)
    {
        this.price = price;
        this.name = name;
        if(name.equalsIgnoreCase("car"))
        {
            arr[0] = price + arr[0];
            return arr[0];
            
        }
        else if(name.equalsIgnoreCase("bike"))
        {
            arr[1] = arr[1] + price;
            return arr[1];
            
        }
        else if(name.equalsIgnoreCase("scooty"))
        {
            arr[2] = arr[2] + price;
            return arr[2];
            
        }
        else if(name.equalsIgnoreCase("mini-bus"))
        {
            arr[3] = arr[3] + price;
            return arr[3];
            
        }
        else if(name.equalsIgnoreCase("cycle"))
        {
            arr[4] = arr[4] + price;
            return arr[4];
            
        }
        return 0;
    }
    public void DISPLAY()
    {
        System.out.println("CAR = "+arr[0]+" BIKE = "+arr[1]+ " SCOOTY = "+arr[2]+ " MINI-Bus = "+arr[3]+" CYCLE = "+arr[4]);
    }
    

}

