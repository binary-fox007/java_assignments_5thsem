import javax.swing.*;
public class assignment13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("while loop example");
      int i =0;
      int c;
      String choice;
      choice= JOptionPane.showInputDialog("enter the number of times u want to print your name:");
      c=Integer.parseInt(choice);
      while(i<c){
          JOptionPane.showMessageDialog(null,"NEVER GONNA GIVE U UP/ NEVER GONNA LET U DOWN!!","result",JOptionPane.PLAIN_MESSAGE);
          i++;

      }


    }
    //wap in java to show the use of while loop using a gui based program

}
