import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;
//Implementations of packages


public class NestedPanels extends JPanel {

		    JPanel southBtnPanel = new JPanel(new GridLayout(3, 2, 1, 1)); //grid layout of buttons and declaration of panel SoutbtnPanel
        JButton b = new JButton("Say Hello");//1
        JButton c = new JButton("Say You Look Good");//1
        JButton d = new JButton("Say Sorry I'm Late");//1
        JButton e2 = new JButton("So where are we headed?");//2
        JButton f = new JButton("Can we go to your place?");//2
        JButton g = new JButton("I don't have any money for our date...");//2
        JButton h = new JButton ("How about we go out to eat?");
        JButton j = new JButton("I'm really attracted to you.");
        JButton k = new JButton("I think there is a stain on my dress...");
       
        
       
        
   
   public NestedPanels() { //implemeted class

      	 
            //add action listener
            b.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    button1Clicked(e);//when button clicked, invoke method
                }
            });
            c.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    button2Clicked(e);//when button clicked, invoke method
                }
            });
           d.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    button3Clicked(e);//when button clicked, invoke method
                }
            }); 

            e2.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    button4Clicked(e);//when button clicked, invoke method
                }
            });

            f.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    button5Clicked(e);//when button clicked, invoke method
                }
            });

            g.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    button6Clicked(e);//when button clicked, invoke method
                }
            });

   		   southBtnPanel.add(b);
         southBtnPanel.add(c);
         southBtnPanel.add(d);



      setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1)); //layout of buttons "Button text"
      setLayout(new BorderLayout());
      add(Box.createRigidArea(new Dimension(700,700)));//Space size of text box webapp over all
      add(southBtnPanel, BorderLayout.SOUTH);
   
}
        public static void createAndShowGui() {
        NestedPanels mainPanel = new NestedPanels(); //mainPanel new class of buttons instantiation
        JFrame frame = new JFrame("Date Sim 1.0");//title of webapp on top
        frame.getContentPane().add(mainPanel);
        ImageIcon icon = new ImageIcon("C:/Users/wchri/Pictures/10346538_10203007241845278_2763831867139494749_n.jpg");
        JLabel label = new JLabel(icon);
        mainPanel.add(label);
        frame.setSize(700,700);
        frame.setVisible(true);
        }

	private void button1Clicked(ActionEvent e) {
        southBtnPanel.removeAll();
		    southBtnPanel.add(e2);
		    southBtnPanel.add(f);
		    southBtnPanel.add(g);
		    southBtnPanel.revalidate();
		    southBtnPanel.repaint();
        String msg = ((JButton)e.getSource()).getActionCommand() ;
        JOptionPane.showMessageDialog(this, "Hey there! Ready to get started?", "Christian feels good!", JOptionPane.PLAIN_MESSAGE); //display button Action
      
    }

    private void button2Clicked(ActionEvent e) {
		    southBtnPanel.removeAll();
		    southBtnPanel.add(e2);
		    southBtnPanel.add(f);
	     	southBtnPanel.add(g);
		    southBtnPanel.revalidate();
		    southBtnPanel.repaint();
        String msg = ((JButton)e.getSource()).getActionCommand() ;
        JOptionPane.showMessageDialog(this, "Ugh... thanks! You too ready?!", "Christian is a bit... Embarrased.", JOptionPane.PLAIN_MESSAGE); //display button Action
    }

    private void button3Clicked(ActionEvent e) {
		    southBtnPanel.removeAll();
		    southBtnPanel.add(e2);
		    southBtnPanel.add(f);
		    southBtnPanel.add(g);
		    southBtnPanel.revalidate();
		    southBtnPanel.repaint();
        String msg = ((JButton)e.getSource()).getActionCommand() ;
        JOptionPane.showMessageDialog(this, "It's ok! Just make sure it doesn't happen again!", "Christian is a bit angry!", JOptionPane.PLAIN_MESSAGE); //display button Action
    }

    private void button4Clicked(ActionEvent e) {
      	NestedPanels mainPanel = new NestedPanels(); //mainPanel new class of buttons instantiation
        JFrame frame = new JFrame("Date Sim 1.0");//title of webapp on top
        ImageIcon imageTwo = new ImageIcon("C:/Users/wchri/Documents/chrisferry.jpg");
        JLabel label = new JLabel(imageTwo);
  		  mainPanel.add(label);
        southBtnPanel.removeAll();
        southBtnPanel.revalidate();
        southBtnPanel.repaint();  
  		  frame.setVisible(true);
        frame.getContentPane().add(mainPanel);
        frame.setSize(700,700);
        String msg = ((JButton)e.getSource()).getActionCommand() ;
        JOptionPane.showMessageDialog(this, "Let's take the ferry to NYC!", "Christian feels good!", JOptionPane.PLAIN_MESSAGE); //display button Action
    	
    }

    private void button5Clicked(ActionEvent e) {
		    NestedPanels mainPanel = new NestedPanels(); //mainPanel new class of buttons instantiation
      	JFrame frame = new JFrame("Date Sim 1.0");//title of webapp on top
        ImageIcon imageTwo = new ImageIcon("C:/Users/wchri/Documents/chrisart.jpg");
        JLabel label = new JLabel(imageTwo);
      	mainPanel.add(label);
  		  southBtnPanel.removeAll();
        southBtnPanel.revalidate();
        southBtnPanel.repaint();
        frame.setVisible(true);
        frame.getContentPane().add(mainPanel);
        frame.setSize(700,700);
        String msg = ((JButton)e.getSource()).getActionCommand() ;
        JOptionPane.showMessageDialog(this, "Don't you think it's a bit soon for that?", "Christian is embarrassed...", JOptionPane.PLAIN_MESSAGE); //display button Action

    }

    private void button6Clicked(ActionEvent e) {
    	  NestedPanels mainPanel = new NestedPanels(); //mainPanel new class of buttons instantiation
      	JFrame frame = new JFrame("Date Sim 1.0");//title of webapp on top
        ImageIcon imageTwo = new ImageIcon("C:/Users/wchri/Documents/chrismoney.jpg");
        JLabel label = new JLabel(imageTwo);
        mainPanel.add(label);
        southBtnPanel.removeAll();
        southBtnPanel.revalidate();
        southBtnPanel.repaint();
  		  frame.setVisible(true);
    	  frame.getContentPane().add(mainPanel);
        frame.setSize(700,700);
        String msg = ((JButton)e.getSource()).getActionCommand() ;
        JOptionPane.showMessageDialog(this, "I got money!", "Christian is ballin'", JOptionPane.PLAIN_MESSAGE); //display button Action
    	}
    
   public static void main(String[] args) {
	     
		System.out.println("Welcome to Date Sim 1.0 with we1. Are you ready to play? Yes/No?");


		Scanner in = new Scanner(System.in);

		String confirm = in.nextLine();

		if (confirm.equalsIgnoreCase("Yes")) {
			System.out.println("Ok hot stuff... Let's start.");

			NestedPanels mainPanel = new NestedPanels();

		} else {

			System.out.println("Maybe some other time!");

			return;
		}


	     SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            createAndShowGui();
         }
      });
   }
}