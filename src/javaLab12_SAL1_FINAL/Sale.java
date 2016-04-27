package javaLab12_SAL1_FINAL;

/**
 * Class encapsulating the details of a Sale of an electronic device
 * @author dpl0795
 */
public class Sale {
    private Device device;  // represents the type of device being sold
    private int memory;     // represents the amount of memory in the device

 /**
 * @value totalValue     class variable representing total value of all sales
 */
    private static double totalValue;
 
 /**
 * @value totalNumber     class variable representing total number of all sales
 */
    private static int totalNumber;


 /**
 * Constructor for Sale object, takes 2 parameters.
 * @param d    Device object representing the type of device being sold
 * @param m    int value representing the memory fitted to the device, 
 *             must equal 32, 64, 128 or 256, 
 *             with any other value being interpreted as default value 32
 */
    public Sale(Device d, int m){
        device = d;
        if (m == 32 || m == 64 || m == 128 || m == 256) memory = m;
        else memory = 32;
        totalNumber += 1;
        totalValue += d.getCost(m);
        d.sell();
    }
    
 /**
 * object method returning cost of Devices being sold in this Sale
 * @return      double value equal to cost of device times number of items
 */
    public double getCost(){
        return device.getCost(memory);
    }

 /**
 * object method returning Device being sold in this Sale
 * @return      Device object stored in device property of this Sale
 */
    public Device getDevice(){
        return device;
    }

 /**
 * object method returning memory size of Devices being sold in this Sale
 * @return      int value stored in memory property of this Sale
 */    
    public int getMemory(){
        return memory;
    }
    
 /**
 * class level method returning total value of all Sales made
 * @return      double value stored in static totalValue property of Sale class
 */
    public static double getTotalValue(){
        return totalValue;
    }
    
 /**
 * class level method returning total number of Sales made
 * @return      int value stored in static totalNumber property of Sale class
 */
    public static int getTotalNumber(){
        return totalNumber;
    }
    
 /**
 * object method that returns a String object summarising the properties of a Sale object  
 * @return     a String: in the format number of devices device name memoryGB
 *             e.g.  2 xTablet 32GB,  or   1 xPhone 128GB
 */
    @Override
    public String toString(){
        String message = device.getName() + " " + memory + "GB";
        return message;
    }
}
