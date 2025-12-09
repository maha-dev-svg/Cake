import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import  java.awt.*;



public class CakeBakery extends JFrame implements ActionListener{
	private JTextField text1,text2,text3,text4;
	private JLabel label1,label2;
	private JButton button1,button2,button3,button4,button5,
	buttonLogout;
	private JPanel panel1,panel2,panel3,panel4,panel5,
	panel6;
	
	public CakeBakery()
	{
		super("Cake Bakery");
		setLayout(new GridLayout(6,1));
		
		//--------panel1------
		
		//-----panel(6)-------
	panel6=new JPanel();
	
		buttonLogout=new JButton("Logout");
		buttonLogout.addActionListener(this);
	panel6.add(buttonLogout);
	
	add(panel6);
	//idk
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		

		if(e.getSource()==buttonLogout)
		{
			System.out.println("You have been logout successfully");
		}
	}
	
public static void main(String []args)
{
	CakeBakery myCakeBakery=new CakeBakery();
	myCakeBakery.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	myCakeBakery.setVisible(true);
myCakeBakery.setSize(300,350);
	
}
}
