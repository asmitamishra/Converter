import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Converter extends JFrame implements ActionListener 
{
	JPanel p1;
	JLabel L1;
	JTextField t1;
	JButton b1;
	JTextArea ta1;
	public Converter()
	{
		this.setVisible(true);
		this.setSize(500,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Converter");
		p1 = new JPanel();
		L1 = new JLabel("Distance in miles:");
		t1 = new JTextField(20);
		b1 = new JButton("Convert");
		ta1 =  new JTextArea(5,20);
		ta1.setEditable(false);
		JScrollPane js1 = new JScrollPane(ta1);
		p1.add(L1);
		p1.add(t1);
		p1.add(b1);
		p1.add(js1);
		this.add(p1);
		this.setSize(400,500);
		b1.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		JButton x = (JButton)e.getSource();
		if(x.getText().equals("Convert")) 
		{
	
		String input = t1.getText();
		double km = Double.parseDouble(input)*1.6;
		ta1.append( input +"equal" + km + "km./n");
		}
		else if(x.getText().equals("C"))
		{
			t1.setText("");
		}
		else
		{
			t1.setText(t1.getText()+x.getText());
		}
	}

	public static void main(String args[])
	{
		new Converter();
		
	}

}
