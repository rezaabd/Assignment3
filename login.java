import javax.swing.JOptionPane;

public class login {

	public static void main(String[]args){

		String user = "rezaadb";
		String pass = "12345";
		String entered_user = "";
		String entered_pass = "";

		while(entered_user.equals(user) == false || entered_pass.equals(pass) == false){

			entered_user = JOptionPane.showInputDialog("Enter username");
			entered_pass = JOptionPane.showInputDialog("Enter password");

			String[] choices = {"Admin", "Student", "Staff"};
			String input = (String) JOptionPane.showInputDialog(null, "Choose account type ","Account Type", JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]);
			System.out.println(input);
}
}
}
