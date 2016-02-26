package lab02;

import javax.swing.*;

public class ConfirmDialogButton
{
  public static void main(String [] args)
  {
    int value;

    // prompt the user to make a choice
    value = JOptionPane.showConfirmDialog(null, "Please press Yes, No or Cancel");

    if (value == 0)
    {
      JOptionPane.showMessageDialog(null, "The value returned by pressing the \"Yes\" button of the confirm dialog was: " + value);
    }
    else if (value == 1)
    {
      JOptionPane.showMessageDialog(null, "The value returned by pressing the \"No\" button of the confirm dialog was: " + value);
    }
    else
    {
      JOptionPane.showMessageDialog(null, "The value returned by pressing the \"Cancel\" button of the confirm dialog was: " + value);
    }

  }

}