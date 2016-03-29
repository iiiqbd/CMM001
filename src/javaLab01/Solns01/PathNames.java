package javaLab01.Solns01;

/**
 * A simple program to emphasise that " and / need to be included using
 * escape characters /" and // inside Strings
 * @author David
 * @version Oct6 2015
 */
public class PathNames
{
    // main method - starting point for all Java applications
    public static void main(String[] args)
    {
    // use \\ to print a \ since \ alone is the escape character
    System.out.println("C:\\Program Files\\Java\\jdk1.8.0_20\\bin");
    // use \" to print a " since " alone will simply close the String
    System.out.println("\"http://www.rgu.ac.uk/current-students/library/library-home\"");
    }
}
