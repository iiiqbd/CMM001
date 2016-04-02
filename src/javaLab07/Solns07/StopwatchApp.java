package javaLab07.Solns07;

public class StopwatchApp
{
  public static void main(String [] args)
  {
    Stopwatch timer = new Stopwatch();

    int n = 1000000;
    timer.start();
    for(int i=1; i<=n; i++)
    {
      // you can put any operation in here
      double x = Math.sin(2*Math.PI*i/1000.0);
    }

    timer.stop();
    System.out.println(n + " loops took " + timer.getTimeInSeconds() + " seconds\n");

    timer.start();
    for(int i=1; i<=10; i++)
    {
      for(int j=1; j<=i*1000000; j++)
      {
        // again put any operation you want inside the loop
        double x = Math.pow( Math.sin(2*Math.PI*j/1000000.0) ,2);
      }
      System.out.println(i*1000000 + " loops took " + timer.getTimeInSeconds() + " seconds");
    }
    timer.stop();
  }
}