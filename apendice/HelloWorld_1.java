import javax.swing.JOptionPane;

public class HelloWorld_1 {
	/*
		Accept an input from the GUI
	*/
	public static void main(String[] args) {
		String response;
		response = JOptionPane.showInputDialog("Enter a number");
		int num = Integer.parseInt(response);

		//System.out.println("chosen number: " + Integer.toString(num));
		JOptionPane.showMessageDialog(null, Integer.toString(num));
	}
}
