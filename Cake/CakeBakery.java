import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import  java.awt.*;



public class CakeBakery extends JFrame implements ActionListener , User{
	
	private JTextField text1,text2,text3,text4;
	private JLabel label1,label2;
	private JButton button1,button2,button3,button4,buttonAddItem,
	buttonLogout;
	private JPanel panel1,panel2,panel3,panel4,panel5,
	panel6;
	
	public CakeBakery()
	{
		super("Cake Bakery");
		setLayout(new FlowLayout());	
	//panel6=new JPanel();
	
		buttonLogout=new JButton("Logout");
		buttonhandler handler=new buttonhandler();
	   buttonLogout.addActionListener(handler);
	add(buttonLogout);
	   //panel4.add(buttonLogout);
	
	//add(panel4);
	//if(AddItem()==true)
	{
	buttonAddItem=new JButton("Add item");
	buttonAddItem.addActionListener(handler);
	add(buttonAddItem);
	}
	//panel5.add(buttonAddItem);
	//add(panel5);
		
	}
	private class buttonhandler implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		

		if(e.getSource()==buttonLogout)
		{
			System.out.println("You have been logout successfully");
		}
		if(e.getSource()==buttonAddItem)
		{
		JOptionPane.showMessageDialog(null, "item added succesfully");
		}
	}
	}
	
public static void main(String []args)
{
	CakeBakery myCakeBakery=new CakeBakery();
	myCakeBakery.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	myCakeBakery.setVisible(true);
myCakeBakery.setSize(300,350);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
