import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;



public class dateSim extends JPanel {

public static class Theend{

public static double score;

}

public static void main(String [] args){

JPanel mainPanel = new JPanel(new BorderLayout());
JPanel southBtn = new JPanel(new GridLayout(3, 2, 1, 1)); 
JButton b = new JButton("Say Hello");//1
JButton c = new JButton("Say You Look Good");//1
JButton d = new JButton("Say Sorry I'm Late");//1
JButton eTwo = new JButton("So where are we headed?");//2
JButton f = new JButton("Can we go to your place?");//2
JButton g = new JButton("I don't have any money for our date...");//2
JButton h = new JButton ("How about we go out to eat?");
JButton j = new JButton("I'm really attracted to you.");
JButton k = new JButton("I think there is a stain on my dress...");
JButton l = new JButton("This is really neat! What should I eat?");
JButton m = new JButton("Sorry. What do you want to do? I'll do anything for you!");
JButton n = new JButton("I feel so embarrassed. I'm so stupid!");
ImageIcon icon = new ImageIcon("C:/Users/wchri/Pictures/10346538_10203007241845278_2763831867139494749_n.jpg");
ImageIcon imageTwo = new ImageIcon("C:/Users/wchri/Documents/chrisferry.jpg");
ImageIcon imageThree = new ImageIcon("C:/Users/wchri/Documents/chrisart.jpg");
ImageIcon imageFour = new ImageIcon("C:/Users/wchri/Documents/chrismoney.jpg");
ImageIcon imageFive = new ImageIcon("C:/Users/wchri/Pictures/208779_1794188017763_3590973_n.jpg");
ImageIcon imageSix = new ImageIcon("C:/Users/wchri/Pictures/11002655_10204249084730574_8038951889823101577_n.jpg");
ImageIcon imageSeven = new ImageIcon("C:/Users/wchri/Pictures/14563546_10208472127143995_3354058797998713586_n.jpg");
JLabel label = new JLabel(icon);
mainPanel.add(label);
JFrame frame = new JFrame();
frame.add(southBtn, BorderLayout.SOUTH);
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame.getContentPane().add(label);
frame.setSize(700,700);
frame.setVisible(true);
southBtn.add((b));
southBtn.add((c));
southBtn.add((d));



            b.addActionListener(new ActionListener() {
            
                @Override
                public void actionPerformed(ActionEvent e) {
            
            southBtn.removeAll();
            southBtn.add(eTwo);
            southBtn.add(f);
            southBtn.add(g);
            southBtn.revalidate();
            southBtn.repaint();    
            String msg = ((JButton)e.getSource()).getActionCommand() ;
            JOptionPane.showMessageDialog(frame, "Hey there! Ready to get started?", "Christian feels good!", JOptionPane.PLAIN_MESSAGE); //display button Action
            Theend Theend = new Theend();
            Theend.score += 1;
         }   
});
                

            c.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
            southBtn.removeAll();
            southBtn.add(eTwo);
            southBtn.add(f);
            southBtn.add(g);
            southBtn.revalidate();
            southBtn.repaint();
            
             String msg = ((JButton)e.getSource()).getActionCommand() ;
             JOptionPane.showMessageDialog(frame, "Ugh. Thanks! You too! Ready to get started?", "Christian feels slightly embarassed!", JOptionPane.PLAIN_MESSAGE); //display button Action
             Theend.score += .5;
                }
        
        });
           d.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {    
            southBtn.removeAll();
            southBtn.add(eTwo);
            southBtn.add(f);
            southBtn.add(g);
            southBtn.revalidate();
            southBtn.repaint();
            
            String msg = ((JButton)e.getSource()).getActionCommand() ;
            JOptionPane.showMessageDialog(frame, "Ugh. Yeah... That's ok I guess! Ready to get started?", "Christian feels slightly ignored!", JOptionPane.PLAIN_MESSAGE); //display button Action
            Theend.score += -1;
    }
            
            });

            eTwo.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

            southBtn.removeAll();
            label.setIcon(imageTwo);
            southBtn.add(h);
            southBtn.add(j);
            southBtn.add(k);
            southBtn.revalidate();
            southBtn.repaint();  
            String msg = ((JButton)e.getSource()).getActionCommand() ;
            JOptionPane.showMessageDialog(frame, "Let's take the ferry to NYC!", "Christian feels good!", JOptionPane.PLAIN_MESSAGE); //display button Action
            Theend.score += 1;
            }
            });

            f.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
            southBtn.removeAll();
            label.setIcon(imageThree);
            southBtn.add(h);
            southBtn.add(j);
            southBtn.add(k);
            southBtn.revalidate();
            southBtn.repaint();    
            String msg = ((JButton)e.getSource()).getActionCommand() ;
            JOptionPane.showMessageDialog(frame, "Don't you think it's a bit soon for that?", "Christian is embarrassed...", JOptionPane.PLAIN_MESSAGE); //display button Action
            Theend.score += -.5;

              }
            
            });

            g.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
            southBtn.removeAll();
            label.setIcon(imageFour);
            southBtn.add(h);
            southBtn.add(j);
            southBtn.add(k);
            southBtn.revalidate();
            southBtn.repaint();
            String msg = ((JButton)e.getSource()).getActionCommand();
            JOptionPane.showMessageDialog(frame, "I got money!", "Christian is ballin'", JOptionPane.PLAIN_MESSAGE); //display button Action
            Theend.score += -.5;
        }
            });

             h.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
            southBtn.removeAll();
            label.setIcon(imageFive);
            southBtn.add(l);
            southBtn.add(m);
            southBtn.add(n);
            southBtn.revalidate();
            southBtn.repaint();
            String msg = ((JButton)e.getSource()).getActionCommand();
            JOptionPane.showMessageDialog(frame, "Sure! I know this great spot. I'll get us a table! It's Ninja New York. Are you comfy?", "Christian feels good!", JOptionPane.PLAIN_MESSAGE); //display buttun action
            Theend.score += 1;
        }
    });

             j.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
            southBtn.removeAll();
            label.setIcon(imageSix);
            southBtn.add(l);
            southBtn.add(m);
            southBtn.add(n);
            southBtn.revalidate();
            southBtn.repaint();
            String msg = ((JButton)e.getSource()).getActionCommand();
            JOptionPane.showMessageDialog(frame, "Well, let's not get ahead of ourselves. But you're nice too! <3", "Christian is amused.", JOptionPane.PLAIN_MESSAGE); //action button command
            Theend.score += .5;
    }
});

            k.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
            southBtn.removeAll();
            label.setIcon(imageSeven);
            southBtn.add(l);
            southBtn.add(m);
            southBtn.add(n);
            southBtn.revalidate();
            southBtn.repaint();
            String msg = ((JButton)e.getSource()).getActionCommand();    
            JOptionPane.showMessageDialog(frame, "Well. You should've come prepared. I'll use this app to get it out for you.", "Christian is annoyed.", JOptionPane.PLAIN_MESSAGE);      
            Theend.score += -1;

}
});


/*System.out.println("You scored " + Theend.score + ".");

if(Theend.score >= 10){
    System.out.println("Christian would date you IRL!!!!");
} else {
    System.out.println("Maybe next time! Best of luck! (T.T)");
}*/
}

}