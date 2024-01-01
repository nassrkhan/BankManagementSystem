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
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
public class BankLog extends JFrame 
{
    //private JFrame frame;
    private final JPanel contentPane;
    private JTextField textField;
//    private JTextField textField_1;
    private JPasswordField passwordField;
    private final JTextField txtLoginHere;
    static int p;

    /*
     * Launch the application.
    */
    public static void main(String[] args) 
    {
        EventQueue.invokeLater(new Runnable() 
        {
	    public void run() 
            {
		try 
                {
		    BankLog frame = new BankLog();
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
    public BankLog() 
    {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(200, 200, 1034, 518);
	contentPane = new JPanel() ;
	contentPane.setBackground(new Color(204, 204, 204));
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
		
	JLabel lblNewLabel = new JLabel("Username");
	lblNewLabel.setBackground(new Color(204, 204, 255));
	lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
	lblNewLabel.setBounds(44, 124, 119, 17);
	contentPane.add(lblNewLabel);
		
	JLabel lblNewLabel_1 = new JLabel("Password");
	lblNewLabel_1.setBackground(new Color(204, 204, 255));
	lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
	lblNewLabel_1.setBounds(45, 172, 86, 17);
	contentPane.add(lblNewLabel_1);
		
	textField = new JTextField();
	textField.setBounds(218, 124, 198, 20);
	contentPane.add(textField);
	textField.setColumns(10);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(218, 172, 198, 20);
        contentPane.add(passwordField);
	passwordField.setColumns(10);
		
	JButton btnNewButton = new JButton("LOGIN");
	btnNewButton.setBackground(new Color(240, 255, 255));
	btnNewButton.addActionListener(new ActionListener() 
        {
			
	    public void actionPerformed(ActionEvent e) 
            {
		int h = 0;
		for(int i = 0 ; i < 4 ; i ++) 
                {
		    if(DataStore.name[i].equals(textField.getText()) && DataStore.password[i].equals(passwordField.getText())) 
                    {
			h = 1;
			p = i;
			Menu obj =new Menu();
			obj.setVisible(true);
		    }
		}
		if(h == 1) 
                {
		    JOptionPane.showMessageDialog(null, "Login Successfully!","Login success",JOptionPane.INFORMATION_MESSAGE);
		}
		else 
                {
		    JOptionPane.showMessageDialog(null, "Invalid login details","Login Error",JOptionPane.ERROR_MESSAGE);
		    textField.setText(null);
		    passwordField.setText(null);
		}
	    }
	});
	btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
	btnNewButton.setBounds(327, 223, 89, 23);
	contentPane.add(btnNewButton);
		
	txtLoginHere = new JTextField();
	txtLoginHere.setBackground(new Color(248, 248, 255));
	txtLoginHere.setEditable(false);
	txtLoginHere.setFont(new Font("Viner Hand ITC", Font.BOLD, 22));
	txtLoginHere.setText("LOGIN HERE");
	txtLoginHere.setBounds(156, 27, 147, 34);
	contentPane.add(txtLoginHere);
	txtLoginHere.setColumns(10);
		
	JSeparator separator = new JSeparator();
	separator.setBounds(20, 257, 433, 2);
	contentPane.add(separator);
		
	JSeparator separator_1 = new JSeparator();
	separator_1.setBounds(20, 85, 433, 2);
	contentPane.add(separator_1);
		
	JLabel lblNewLabel_2 = new JLabel("Press the button below to exit from account!");
	lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
	lblNewLabel_2.setBounds(44, 280, 364, 23);
	contentPane.add(lblNewLabel_2);
		
	JButton btnNewButton_1 = new JButton("Logout");
	btnNewButton_1.addActionListener(new ActionListener() 
        {
            @Override
	    public void actionPerformed(ActionEvent e) 
            {
		System.exit(0);
	    }
	});
	btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	btnNewButton_1.setBounds(327, 327, 89, 23);
	contentPane.add(btnNewButton_1);
		
	JLabel lblNewLabel_3 = new JLabel("Click logic button");
        lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
	lblNewLabel_3.setBounds(20, -28, 1040, 519);
	contentPane.add(lblNewLabel_3);
    }
}
