import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import  java.awt.*;

public class CakeBakery extends JFrame implements ActionListener{
	private User currentuser;
	private JButton buttonDeleteItem,buttonAddItem,
	buttonLogout;
	private JComboBox<String> cakebox;
	private static String  [] names= {"Mango cake","Chocolate cake"};
public CakeBakery(User user)
	{

		super("Cake Bakery");
		setLayout(new FlowLayout());	
		this.currentuser=user;

		buttonLogout=new JButton("Logout");
		buttonhandler handler=new buttonhandler();
	   buttonLogout.addActionListener(handler);
       add(buttonLogout);
	
	buttonAddItem=new JButton("Add item");
	buttonAddItem.addActionListener(handler);
	add(buttonAddItem);
	
	buttonDeleteItem=new JButton("Delete item");
	buttonDeleteItem.addActionListener(handler);
	add(buttonDeleteItem);
	
	cakebox=new JComboBox<String>(names);
	add(cakebox);
	}
	private class buttonhandler implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==buttonLogout)
		{
			System.out.println("You have been logout successfully");
		}
		if(e.getSource()==buttonAddItem) {
		addingItem(currentuser);
		}
		if(e.getSource()==buttonDeleteItem)
			deleteItem(currentuser);	
	}
	}
	// method for adding items
	public static void addingItem(User user)
	{
		if(user.canAddCake()==true) {
		JOptionPane.showMessageDialog(null, "item added succesfully");
		}
		else {
			JOptionPane.showMessageDialog(null,"you can not add item");
		}
	}
	// method for deleteitem
	public static void deleteItem(User user)
	{
		if(user.canDeleteCake()==true)
		{
			JOptionPane.showMessageDialog(null,"item deleted succesfully");
		}
			else {
				JOptionPane.showMessageDialog(null,"you can not delete items");
			}
	}
public static void main(String []args)
{
	User user =new Manager();
	CakeBakery myCakeBakery=new CakeBakery(user);
	myCakeBakery.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	myCakeBakery.setVisible(true);
myCakeBakery.setSize(300,350);

}


public void actionPerformed(ActionEvent e) {}
}
