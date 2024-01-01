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
public class WithDraw extends JFrame
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
		    WithDraw frame = new WithDraw();
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
    public WithDraw() 
    {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(200, 200, 1037, 637);
	contentPane = new JPanel();
	contentPane.setBackground(new Color(204, 204, 204));
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
		
	JLabel lblNewLabel = new JLabel("Withdraw");
	lblNewLabel.setBackground(new Color(245, 245, 220));
	lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 22));
	lblNewLabel.setBounds(176, 33, 130, 26);
	contentPane.add(lblNewLabel);
		
	JLabel lblNewLabel_1 = new JLabel("Enter the amount you want  to withdraw:");
	lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
	lblNewLabel_1.setBounds(32, 104, 310, 26);
	contentPane.add(lblNewLabel_1);
		
	textField = new JTextField();
	textField.setBounds(329, 109, 130, 20);
	contentPane.add(textField);
	textField.setColumns(10);
		
	JButton btnNewButton = new JButton("Withdraw");
	btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
	btnNewButton.addActionListener(new ActionListener() 
        {
            @Override
	    public void actionPerformed(ActionEvent e) 
            {
		int amount= Integer.parseInt(textField.getText());
		if( DataStore.balance[BankLog.p]>amount) 
                {
		    DataStore.balance[BankLog.p] -= amount;
		    JOptionPane.showMessageDialog(null, "Amount Withdraw successfully!","withdraw amount",JOptionPane.INFORMATION_MESSAGE);
		}
		else 
                {
		    JOptionPane.showMessageDialog(null, "Insufficient Balance!", "Error", JOptionPane.ERROR_MESSAGE);
		}
	    }
        });
	    //( data.balance[Banklog.p]>Integer.parseInt(textField.getText()))
	    btnNewButton.setBounds(329, 162, 130, 23);
	    contentPane.add(btnNewButton);
		
	    JButton btnNewButton_1 = new JButton("Back to Menu");
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
	btnNewButton_1.setBounds(162, 314, 152, 23);
	contentPane.add(btnNewButton_1);
		
	JSeparator separator = new JSeparator();
	separator.setBounds(22, 291, 437, 2);
	contentPane.add(separator);
		
	JSeparator separator_1 = new JSeparator();
	separator_1.setBounds(22, 71, 437, 2);
	contentPane.add(separator_1);
    }  
}
