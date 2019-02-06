import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SalaryCalculator 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setBounds(300,300,400,300);
		frame.setLayout(null);
		
		JLabel title = new JLabel();
		title.setBounds(150,10,100,20);
		title.setText("Salary Calculator");
		frame.add(title);
		
				JLabel labelRate = new JLabel();
		labelRate.setBounds(50,50,100,50);
		labelRate.setText("Hourly Rate: ");
		frame.add(labelRate);
		
		JTextField rate = new JTextField();
		rate.setBounds(150,50,100,40);
		frame.add(rate);
		
		JLabel labelHours = new JLabel();
		labelHours.setBounds(50,100,100,50);
		labelHours.setText("Hours/Week: ");
		frame.add(labelHours);
		
		JTextField hours = new JTextField();
		hours.setBounds(150,100,100,40);
		frame.add(hours);
				
		JCheckBox check = new JCheckBox();
		check.setBounds(50,150,20,50);
		frame.add(check);
		
		JLabel labelCheck = new JLabel();
		labelCheck.setBounds(70,150,100,50);
		labelCheck.setText("Full Time");
		frame.add(labelCheck);
		
		JLabel salaryLabel = new JLabel();
		salaryLabel.setBounds(185,200,120,50);
		salaryLabel.setText("Annual Salary:");
		frame.add(salaryLabel);
		
		JTextField salary = new JTextField();
		salary.setBounds(280,200,80,40);
		frame.add(salary);
		
		JButton calculate = new JButton();
		calculate.setBounds(50,200,100,50);
		calculate.setText("Calculate");
		calculate.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (check.isSelected())
				{
					salary.setText("$" + Double.toString(Double.parseDouble(rate.getText()) * 40 * 52));
					hours.setText("");
				}
				else
				{
					salary.setText("$" + Double.toString(Double.parseDouble(rate.getText()) * Double.parseDouble(hours.getText()) * 52));
				}
			}
		});
		frame.add(calculate);
		
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
