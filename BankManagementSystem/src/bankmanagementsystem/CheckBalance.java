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
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JSeparator;
public class CheckBalance extends JFrame 
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
		public void run() 
                {
		    try 
                    {
			CheckBalance frame = new CheckBalance();
			frame.setVisible(true);
		    } catch (Exception e) 
                    {
			e.printStackTrace();
		    }
		}
	    });
	}

	/**
	 * Create the frame.
	 */
	public CheckBalance() 
        {
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(200, 200, 1018, 579);
	    contentPane = new JPanel();
	    contentPane.setBackground(new Color(204, 204, 204));
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    setContentPane(contentPane);
	    contentPane.setLayout(null);
		
	    JLabel lblNewLabel = new JLabel("Check Balance");
	    lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 22));
	    lblNewLabel.setBounds(184, 29, 160, 35);
	    contentPane.add(lblNewLabel);
		
	    JLabel lblNewLabel_1 = new JLabel("Click here to check your balance:");
	    lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
	    lblNewLabel_1.setBounds(39, 97, 320, 24);
	    contentPane.add(lblNewLabel_1);
		
	    JLabel lblNewLabel_2 = new JLabel("");
	    lblNewLabel_2.setBackground(Color.DARK_GRAY);
	    lblNewLabel_2.setForeground(new Color(0, 0, 255));
	    lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_2.setBounds(175, 183, 160, 24);
	    contentPane.add(lblNewLabel_2);
		
	    JButton btnNewButton = new JButton("check balance");
	    btnNewButton.addActionListener(new ActionListener() 
            {
	       public void actionPerformed(ActionEvent e) 
               {
		   lblNewLabel_2.setText(""+DataStore.balance[BankLog.p]+"");
	       }
	    });
	    btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
	    btnNewButton.setBounds(165, 132, 160, 30);
	    contentPane.add(btnNewButton);
		
	    JButton btnNewButton_1 = new JButton("back to menu");
	    btnNewButton_1.addActionListener(new ActionListener() 
            {
		public void actionPerformed(ActionEvent e) 
                {
		    Menu obj =new Menu();
		    obj.setVisible(true);
		}
	    });
	    btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	    btnNewButton_1.setBounds(150, 326, 163, 24);
	    contentPane.add(btnNewButton_1);
		
	    JLabel lblNewLabel_3 = new JLabel("");
	    lblNewLabel_3.setBounds(55, 204, 46, 14);
	    contentPane.add(lblNewLabel_3);
		
	    JLabel lblNewLabel_4 = new JLabel("Your current balance is");
	    lblNewLabel_4.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
	    lblNewLabel_4.setBounds(55, 183, 160, 24);
	    contentPane.add(lblNewLabel_4);
		
	    JSeparator separator = new JSeparator();
	    separator.setBounds(21, 69, 438, 6);
	    contentPane.add(separator);
		
	    JSeparator separator_1 = new JSeparator();
	    separator_1.setBounds(21, 304, 438, 24);
	    contentPane.add(separator_1);
        }
}
