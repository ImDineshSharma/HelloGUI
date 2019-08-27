import javax.swing.JOptionPane;

public class Apples {
 public static void main(String[] args) {
	
   // show user an interface to enter two values
	 String st1 = JOptionPane.showInputDialog("Enter first Number");
	 String st2 = JOptionPane.showInputDialog("Enter second Number");
	 
   // Let showInputDialog  know what we are talking about int not String.
	 int num1 = Integer.parseInt(st1);
	 int num2 = Integer.parseInt(st2);
	 
	 int sum = num1 + num2;
	 
   // show them the final interface with some texts
	 JOptionPane.showMessageDialog(null, "The answer is " + sum, "result", JOptionPane.PLAIN_MESSAGE);
	 
	 
	 
	 }	
 }
  
