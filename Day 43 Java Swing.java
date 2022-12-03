package Graphical;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;  
public class Books extends JFrame implements ActionListener {
	JLabel lb;  
    JCheckBox cb1,cb2,cb3; 
    JTextArea Jt;
    JButton b;
    Books()
    {
    	JFrame frame=new JFrame("SWING");
		frame.setSize(450,400);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		lb=new JLabel("Choose what Language you know ");
		lb.setBounds(50,50,250,50);
		frame.add(lb);
		Jt=new JTextArea("Show Languages");  
	    Jt.setBounds(200,90,200,200);  
		
		 cb1=new JCheckBox("Hindi");  
	     cb1.setBounds(50,100,150,20);  
	     cb2=new JCheckBox("English");  
	     cb2.setBounds(50,150,150,20);  
	     cb3=new JCheckBox("Sanskrit");  
	     cb3.setBounds(50,200,150,20);  
	     b=new JButton("Choose");  
	     b.setBounds(50,250,80,30);  
	     b.addActionListener(this);  
	     frame.add(cb1);
	     frame.add(cb2);
	     frame.add(cb3);
	     frame.add(Jt);
	     frame.add(b);
	     
	     b.addActionListener(this);
	     frame.setVisible(true);
    }	     
	    public void actionPerformed(ActionEvent e)
		{  
	         String msg="";  
	         if(cb1.isSelected()){    
	             msg="Hindi:\n";  
	         }  
	         if(cb2.isSelected()){     
	             msg+="English:\n";  
	         }  
	         if(cb3.isSelected()){    
	             msg+="Sanskrit:\n";  
	         }
	         Jt.setText(msg);
		}
	       
public static void main(String args[])
{
	new Books();
}
}
