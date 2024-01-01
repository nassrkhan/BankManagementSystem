/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagementsystem;

/**
 *
 * @author nasrullah
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JSeparator;
public class Deposit extends JFrame 
{
    private final JPanel contentPane;
    private JTextField textField;

    /**
      * Launch the application.
     * @param args
      */
    public static void main(String[] args) 
    {
	EventQueue.invokeLater(new Runnable() 
        {
	    public void run() 
            {
		try 
                {
		    Deposit frame = new Deposit();
		    frame.setVisible(true);
		} 
                catch (Exception e) 
                {
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
      * Create the frame.
      */
    public Deposit() 
    {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(200, 200, 1047, 620);
	contentPane = new JPanel();
	contentPane.setBackground(new Color(204, 204, 204));
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
		
	JLabel lblNewLabel = new JLabel("Enter amount you want to deposit:");
	lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
	lblNewLabel.setBounds(44, 109, 315, 28);
	contentPane.add(lblNewLabel);
		
	JLabel lblNewLabel_1 = new JLabel("Deposit");
	lblNewLabel_1.setBackground(new Color(240, 255, 255));
	lblNewLabel_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 22));
	lblNewLabel_1.setBounds(193, 35, 92, 20);
	contentPane.add(lblNewLabel_1);
		
	textField = new JTextField();
	textField.setBounds(312, 110, 141, 20);
	contentPane.add(textField);
	textField.setColumns(10);
		
	JButton btnNewButton = new JButton("click to Deposit");
	btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
	btnNewButton.addActionListener(new ActionListener() 
        {
	    public void actionPerformed(ActionEvent e) 
            {
		DataStore.balance[BankLog.p] += Integer.parseInt(textField.getText());
		JOptionPane.showMessageDialog(null, "Amount deposited!","deposit",JOptionPane.PLAIN_MESSAGE);
	    }
	});
	btnNewButton.setBounds(312, 180, 141, 28);
	contentPane.add(btnNewButton);
		
	JButton btnNewButton_1 = new JButton("back to menu");
	btnNewButton_1.addActionListener(new ActionListener() 
        {
            @Override
	    public void actionPerformed(ActionEvent e) 
            {
		Menu obj =new Menu();
		obj.setVisible(true);
	    }
	});
	btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	btnNewButton_1.setBounds(156, 315, 141, 23);
	contentPane.add(btnNewButton_1);
		
	JSeparator separator = new JSeparator();
	separator.setBounds(28, 291, 425, 2);
	contentPane.add(separator);
		
	JSeparator separator_1 = new JSeparator();
	separator_1.setBounds(28, 66, 425, 10);
	contentPane.add(separator_1);
    }
}

