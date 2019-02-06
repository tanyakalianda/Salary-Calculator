import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SalaryCalculator 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setBounds(300,300,500,400);
		frame.setLayout(null);
		
		JLabel labelRate = new JLabel();
		labelRate.setBounds(50,50,100,50);
		labelRate.setText("Hourly Rate: ");
		frame.add(labelRate);
		
		JTextField rate = new JTextField();
		rate.setBounds(150,50,100,50);
		frame.add(rate);
		
		JLabel labelHours = new JLabel();
		labelHours.setBounds(50,150,100,50);
		labelHours.setText("Hours/Week: ");
		frame.add(labelHours);
		
		JTextField hours = new JTextField();
		hours.setBounds(150,150,100,50);
		frame.add(hours);
		
		
		
		JCheckBox check = new JCheckBox();
		check.setBounds(50,200,20,50);
		check.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		frame.add(check);
		
		JLabel labelCheck = new JLabel();
		labelCheck.setBounds(70,200,50,50);
		labelCheck.setText("Full Time");
		frame.add(labelCheck);
		
		
		
		
		//if neither is checked -> nothing should happen
		//if full time is checked -> make textboxes blank
		
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
