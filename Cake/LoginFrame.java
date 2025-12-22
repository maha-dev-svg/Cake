import javax.swing.*;
import java.awt.*;
 
 
public class LoginFrame extends JFrame {
	private JTextField idField;
	private JPasswordField passField; 
	private JCheckBox customer; 
	private final Store store;
 
       public LoginFrame(Store store) {
	        super("CakeBakery - Login");
	        this.store = store;

	  	  idField =new JTextField(10);
	  	  passField=new  JPasswordField(10);
	  	
	  	 customer = new JCheckBox("Customer ID ");
	        setLayout(new GridLayout(0,2,8,8));

	        add(new JLabel("ID:"));
	        add(idField);

	        add(new JLabel("Password:"));
	        add(passField);

	        add(new JLabel(""));
	        add( customer);

	        JButton loginBtn = new JButton("Login");
	        add(new JLabel(""));
	        add(loginBtn);

	        customer.addActionListener(e -> passField.setEnabled(!customer.isSelected()));

	      

	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        pack();
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }
	  
	    private void doLogin() {
	        String idText = idField.getText().trim();

	        if (idText.isEmpty()) {
	            JOptionPane.showMessageDialog(this, "Enter ID");
	            return;
	        }


	        if (customer.isSelected()) {
	            JOptionPane.showMessageDialog(this, "Logged in as Customer (ID only)");
	        } else {
	            String pass = new String(passField.getPassword());
	            JOptionPane.showMessageDialog(this, "Logged in with password:"+pass);
	
}
}
}
