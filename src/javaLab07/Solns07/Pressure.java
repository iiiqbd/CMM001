package javaLab07.Solns07;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author DL
 */
public class Pressure {
  private double value;
  private String unit;
  private double time;

 /**
 * @value PSI_TO PA     class constant used to convert pressure in psi to Pa
 */
  private static final double PSI_TO_PA = 6894.8;
 /**
 * @value PA_TO_PSI     class constant used to convert pressure in Pa to psi
 */
  private static final double PA_TO_PSI = 0.000145038;

 /**
 * Constructor for Pressure object, takes 3 parameters (pressure, unit, time)
 * @return     a Pressure object
 * @param d    double representing value of pressure measurement,
 *             used to initialise value property
 * @param u    String representing unit of measurement of pressure,
 *             used to initialise unit property
 * @param t    double representing time of pressure measurement
 *            (in days after drilling commenced),
 *             used to initialise time property
 */
  public Pressure(double p, String u, double t) {
      setValue(p);  // or  value = p;
      setUnit(u);   // or  unit = u;
      time = t;
  }


 /**
 * Accessor returning pressure value associated with the Pressure measurement
 * @return     a double equal to instance variable value of Pressure object
 */
  public double getValue(){
    return value;
  }

 /**
 * Accessor returning unit associated with the Pressure measurement
 * @return     a String equal to instance variable unit of Pressure object
 */
  public String getUnit(){
    return unit;
  }

   /**
 * Accessor returning time (in days after drilling commenced)
 * associated with the Pressure measurement
 * @return     a double equal to instance variable time of Pressure object
 */
  public double getTime(){
    return time;
  }

 /**
 * Accessor returns pressure value in psi (pounds per square inch)
 * of Pressure measurement
 * @return     a double representing pressure in psi,
 *             equals value if units of Pressure are psi,
 *             equals (value * PA_TO_PSI) if units of Pressure are Pa
 */
  public double getPressureInPsi(){
    if (unit.equals("psi")) return value;
    else return value*PA_TO_PSI;
  }

 /**
 * Accessor returns pressure value in Pa (pascals) of Pressure measurement
 * @return     a double representing pressure in Pa,
 *             equals value if units of Pressure are Pa,
 *             equals (value * PSI_TO_PA) if units of Pressure are psi
 */
  public double getPressureInPa(){
    if (unit.equals("Pa")) return value;
    else return value*PSI_TO_PA;
  }

 /**
 * Sets value property of Pressure object to parameter p
 * @param p a double value representing the pressure measurement
 */
  public void setValue(double p){
      value = p;
  }

 /**
 * Sets unit property of Pressure object to parameter u
 * @param u a String value representing the unit of measurement associated
 *          with a Pressure measurement, will accept "Pa",
 *          any other parameter value interpreted as default value "psi"
 */
 public void setUnit(String u){
      if(u.equals("Pa")) unit = u;
      else unit = "psi";
  }

  /**
 * Sets value property of Pressure object to parameter p
 * @param t a double value representing the pressure measurement
 */
  public void setTime(double t){
      time = t;
  }

 /**
 * Returns description of properties of Pressure object
 * @return a String giving pressure, unit and time (in days) associated with
 *         Pressure measurement
 */
 @Override
 public String toString(){
      return value + " " + unit + " at " + time + " days";
  }

 /**
 * Static method: Converts a pressure in psi to a pressure in Pa
 * @return a double representing a pressure in units of Pa
 * @param psi a double representing a pressure in psi
 */
 public static double psiToPa(double psi){
      return psi*PSI_TO_PA;
  }

 /**
 * Static method: Converts a pressure in Pa to a pressure in psi
 * @return a double representing a pressure in units of psi
 * @param pa a double representing a pressure in Pa
 */
 public static double paToPsi(double pa){
      return pa*PA_TO_PSI;
  }

/* main method used for testing the Pressure class */ 
public static void main(String[] s){

    Pressure p1 = new Pressure(2000,"psi",0);
    System.out.println(p1.toString());
    System.out.println(Pressure.psiToPa(2000));
    System.out.println(p1.getPressureInPa());
    
    Pressure p2 = new Pressure(2500000,"Pa",1);
    System.out.println(p2.toString());
    System.out.println(Pressure.paToPsi(2500000));
    System.out.println(p2.getPressureInPsi());
    
    
    // further testing with an ArrayList of Presure objects
    ArrayList<Pressure> pressures = new ArrayList<>();
    
    pressures.add(p1);
    pressures.add(p2);

    pressures.add(new Pressure (1670,"psi",2));
    pressures.add(new Pressure (1450,"psi",3));

    double p = Double.parseDouble(JOptionPane.showInputDialog("Enter pressure reading:"));
    String u = JOptionPane.showInputDialog("Enter pressure unit Pa or psi:");
    double t = Double.parseDouble(JOptionPane.showInputDialog("Enter number of days since drilling started:"));

    pressures.add(new Pressure (p,u,t));

    for (int i = 0; i<pressures.size() ;i++){
        System.out.println(pressures.get(i).toString());
    }

    for (Pressure pr: pressures){
        System.out.println(pr.toString());
    }

    for (Pressure pr: pressures){
        System.out.println(pr.getPressureInPa() + " Pa " + pr.getTime() + " days");
    }
}
} // end of Pressure class
