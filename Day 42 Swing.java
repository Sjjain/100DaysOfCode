// Java Swing Program

package Graphical;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Swing3 extends Frame implements ActionListener{
	 JTextField name;
	 JTextField city; 
	 JButton submit;
	 JTextField text;
	 
	 Swing3()
	 {
			JFrame frame=new JFrame("SWING");
			frame.setSize(425,418);
			frame.setLayout(null);
			frame.setResizable(true);
			frame.setBackground(Color.white);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);

			JLabel l_name=new JLabel("Name :");
			JLabel l_city=new JLabel("City :");
			l_name.setBounds(50,50,50,50);
			l_city.setBounds(50,100,80,50);
			frame.add(l_name);
	    	frame.add(l_city);
		
	    	name=new JTextField();
	    	city=new JTextField();
			name.setBounds(100,50,250,50);
			city.setBounds(100,100,250,50);
			frame.add(name);
			frame.add(city);
		
			submit=new JButton("Submit");
			submit.setBounds(160,170,100,50);
			frame.add(submit);
		
			text=new JTextField();
			text.setBounds(50,250,350,50);
			frame.add(text);

			submit.addActionListener(this);
			frame.setVisible(true);
	 }
	 public void actionPerformed(ActionEvent e)
		{
		    String s1 = String.valueOf("Name :" +name.getText() +"   ");
		    String s2 = String.valueOf("City :" +city.getText());
		    String s3 = s1.concat(s2);
		    text.setText(s3);
		  	
		}
	 public static void main(String args[])
	 {
		new Swing3(); 
	 }
}
