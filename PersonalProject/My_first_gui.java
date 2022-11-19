// in our Gui.java: 


import javax.swing.*; //import swing libs
import java.awt.*; //import awt 
import java.awt.event.ActionEvent; //import take action from user
import java.awt.event.ActionListener; //import store action from user 

public class GUI implements ActionListener {

  //declaring all the useful variables
    int count = 0;
    private JLabel label;
    private JPanel panel;
    private JButton button;
    private JFrame frame;
  
    public GUI() {
        frame = new JFrame();
      
      
        //setting button
        button = new JButton("click me");
        button.addActionListener(this);
        
      //setting the txts
        label = new JLabel("number of clicks: 0");

        //confing the panels
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);
      
      
        //config the frame
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }

    //override the method
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("number of clicks: " + count);

    }
}

//call everything in our main:
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        new GUI();
    }
}
