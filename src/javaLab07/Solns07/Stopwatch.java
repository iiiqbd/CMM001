package javaLab07.Solns07;

public class Stopwatch
{
  // Instance variables
  private long starttime, endtime ;
  private boolean running ;

  // Constructor (uses reset method to initialise all instance variable to appropriate values)
  public Stopwatch () {
    reset () ; // or could use  starttime = 0; endtime = 0; running = false;
  }

  //Transformer: initialises data to empty state
  public void reset()
  {
    starttime = 0;
    endtime = 0;
    running = false;
  }

  // Transformer: sets starttime to current system time in milliseconds and running to true
  public void start()
  {
    starttime = System.currentTimeMillis();
    running = true;
  }

  // Transformer: sets endtime to current system time in milliseconds and running to false
  public void stop()
  {
    endtime = System.currentTimeMillis();
    running = false;
  }

  //Accessor: returns the elapsed time
  public double getTimeInSeconds()
  {
    long now = System.currentTimeMillis();
    if (running) return (now - starttime)/1000.0 ;
    else return (endtime-starttime)/1000.0;
  }
}