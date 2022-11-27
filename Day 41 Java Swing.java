package Graphical;
import javax.swing.*;
import java.awt.*;
public class Swing1 {
	public static void main(String args[])
	{
		JFrame fr = new JFrame();
		fr.setTitle("LOGIN FORM");
		JTextField tf1=new JTextField("");  
		tf1.setBounds(150,50,100,30); 
		JTextField tf2=new JTextField("");  
		tf2.setBounds(150,100, 100,30); 
		fr.setResizable(false);
		JLabel l1,l2;  
	    l1=new JLabel("Registration No ");  
	    l1.setBounds(50,50,100,30);  
	    l2=new JLabel("Password ");  
	    l2.setBounds(50,100,100,30);  
		JButton b=new JButton("Login");  
		b.setBounds(90,140,100, 40);  
		          
		fr.add(b); 
		fr.add(tf1);
		fr.add(tf2);
		          
		fr.setSize(500,500);  
		fr.setLayout(null); 
		fr.add(l1);
		fr.add(l2);  
		fr.setSize(500,500);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
