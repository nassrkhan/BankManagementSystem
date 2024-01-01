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
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JSeparator;

public class Menu extends JFrame
{
    private final JPanel contentPane;

   /**
     * Launch the application.
     * @param args
     */
    public static void main(String[] args) 
    {
      EventQueue.invokeLater(new Runnable() 
      {
        @Override
	public void run() 
        {
	    try 
            {
	        Menu frame = new Menu();
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
    public Menu() 
    {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(200, 200, 1023, 613);
	contentPane = new JPanel();
	contentPane.setBackground(new Color(204, 204, 204));
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
		
	JLabel lblNewLabel = new JLabel("Menu");
	lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 22));
	lblNewLabel.setBounds(204, 34, 72, 23);
	contentPane.add(lblNewLabel);
		
	JButton btnNewButton = new JButton("Deposit");
	btnNewButton.addActionListener(new ActionListener() 
        {
	    public void actionPerformed(ActionEvent e) 
            {
		Deposit obj =new Deposit();
		obj.setVisible(true);
				
				
	    }
	});
	btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
	btnNewButton.setBounds(33, 145, 102, 23);
	contentPane.add(btnNewButton);
		
	JButton btnNewButton_1 = new JButton("Wthdraw");
	btnNewButton_1.addActionListener(new ActionListener() 
        {
            @Override
	    public void actionPerformed(ActionEvent e) 
           {
	      WithDraw obj =new WithDraw();
	      obj.setVisible(true);
	   }
	});
	btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	btnNewButton_1.setBounds(170, 145, 113, 23);
	contentPane.add(btnNewButton_1);
		
	JButton btnNewButton_2 = new JButton("Check Balance");
	btnNewButton_2.addActionListener(new ActionListener() 
        {
            @Override
	    public void actionPerformed(ActionEvent e) 
            {
		CheckBalance obj =new CheckBalance();
		obj.setVisible(true);
	    }
	});
	btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
	btnNewButton_2.setBounds(311, 145, 139, 23);
	contentPane.add(btnNewButton_2);
		
	JLabel lblNewLabel_2 = new JLabel("Choose the option");
	lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
	lblNewLabel_2.setBounds(30, 90, 184, 22);
	contentPane.add(lblNewLabel_2);
		
	JSeparator separator = new JSeparator();
	separator.setBounds(20, 68, 442, 23);
	contentPane.add(separator);
		
	JSeparator separator_1 = new JSeparator();
	separator_1.setBounds(20, 246, 442, 14);
	contentPane.add(separator_1);
		
	JLabel lblNewLabel_1 = new JLabel("Press the button below to go back !");
	lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
	lblNewLabel_1.setBounds(48, 271, 332, 23);
	contentPane.add(lblNewLabel_1);
		
	JButton btnNewButton_3 = new JButton("Go Back");
	btnNewButton_3.addActionListener(new ActionListener() 
        {
            @Override
	    public void actionPerformed(ActionEvent e) 
            {
		BankLog obj=new BankLog();
		obj.setVisible(true);
	    }
	});
	btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
	btnNewButton_3.setBounds(348, 305, 102, 23);
	contentPane.add(btnNewButton_3);
    }
}
