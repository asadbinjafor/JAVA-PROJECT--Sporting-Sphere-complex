package Frame;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Cursor;
import java.awt.event.*;

public class SportSelection extends JFrame implements ActionListener{
    private JPanel panel;
	//private ImageIcon icon;
    private JLabel topJLabel,topJLabel2,topJLabel3,topJLabel4,imgLabel;
    private ImageIcon backgroundIcon,logo;
    private JButton back,confirmButton,submitButton;
    private JCheckBox[] sport;
	private JCheckBox[] day;
    private String name,password;

    public SportSelection(String name,String password){
 	    super("$porting-$phere Complex");
	    this.setBounds(400,100,1100,700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //logo = new ImageIcon("Photo/Project.png");	
		//this.setIconImage(logo.getImage());
		
		
		panel= new JPanel();
		panel.setBackground(new Color(100,153,123));
		//panel.setBounds(40,80,200,200)
		panel.setLayout(null);


        this.name=name;
	    this.password=password;

        backgroundIcon = new ImageIcon("Photo/4.png");
        imgLabel = new JLabel(backgroundIcon);
        imgLabel.setSize(1100,700);
        panel.add(imgLabel);

        //toplvl 1
        topJLabel= new JLabel("PLEASE, SELECT THE") ;
		topJLabel.setBounds(82,125,(int)434.6,50);
		topJLabel.setForeground(Color.GRAY);
		topJLabel.setFont(new Font("Gotham",Font.BOLD,40));
		imgLabel.add(topJLabel);

        //toplvl 2
        topJLabel2= new JLabel("DESIRED SPORTS") ;
		topJLabel2.setBounds(85,175,(int)434.6,50);
		topJLabel2.setForeground(Color.GRAY);
		topJLabel2.setFont(new Font("Gotham",Font.BOLD,40));
		imgLabel.add(topJLabel2);

        //check box
        sport = new JCheckBox[4];
        String[] sportList = {"Football", "Cricket", "Batminton", "Swimming"};//{" Saturday", " Sunday"," Monday", " Tuesday", " Wednesday", " Thursday", " Friday"};


        int yPos = 260; // Vertical position

        for (int i = 0; i < 4; i++) {
            sport[i] = new JCheckBox(sportList[i]);
            sport[i].setFont(new Font("Gotham",Font.PLAIN,18));
            sport[i].setBorderPainted(false);
            sport[i].setFocusable(false);
            sport[i].setBackground(new Color(0x000000));
            sport[i].setForeground(new Color(0xE9E8E8));
            sport[i].setBounds(160, yPos, 200, 25); // Set position and size
            sport[i].addActionListener(this);
            imgLabel.add(sport[i]);

            yPos += 40; // Adjust vertical position for the next checkbox
        }

        //confirm button
        confirmButton = new JButton("Confirm");
        confirmButton.setBounds(160,558, 250, 47);
        confirmButton.setBackground(new Color(0,0,153));
        confirmButton.setForeground(Color.WHITE);
        confirmButton.setBorderPainted(false);
        confirmButton.setFocusable(false);
        confirmButton.setFont(new Font("Gotham",Font.BOLD,20));
		confirmButton.addActionListener(this);

        confirmButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                StringBuilder selectedSports = new StringBuilder("Selected sports: ");
                
                for (int i = 0; i < sport.length; i++) {
                    JCheckBox checkbox = sport[i];
                    if (checkbox.isSelected()) {
                        
                        selectedSports.append(checkbox.getText()).append(" ");
                    }
                }
                JOptionPane.showMessageDialog(null, selectedSports.toString());

            }
        });
		//top right lvl1
		topJLabel3= new JLabel("PLEASE, SELECT THE") ;
		topJLabel3.setBounds(600,125,(int)434.6,50);
		topJLabel3.setForeground(Color.GRAY);
		topJLabel3.setFont(new Font("Gotham",Font.BOLD,40));
		imgLabel.add(topJLabel3);
		//top right lvl2
		topJLabel4= new JLabel("DESIGNATED Days:") ;
		topJLabel4.setBounds(600,165,(int)434.6,50);
		topJLabel4.setForeground(Color.GRAY);
		topJLabel4.setFont(new Font("Gotham",Font.BOLD,40));
		imgLabel.add(topJLabel4);
		

        //check box
        day = new JCheckBox[7];
        String[] days = {" Saturday", " Sunday"," Monday", " Tuesday", " Wednesday", " Thursday", " Friday"};


         int yPos2 = 253; // Vertical position

        for (int i = 0; i < 7; i++) {
            day[i] = new JCheckBox(days[i]);
            day[i].setFont(new Font("Gotham",Font.PLAIN,18));
            day[i].setBorderPainted(false);
            day[i].setFocusable(false);
            day[i].setBackground(new Color(0x646364));
            day[i].setForeground(new Color(0xE9E8E8));
            day[i].setBounds(650, yPos2, 200, 25); // Set position and size
            day[i].addActionListener(this);
            imgLabel.add(day[i]);

            yPos2 += 40; // Adjust vertical position for the next checkbox
        }
		//submit button
        submitButton = new JButton("Submit");
        submitButton.setBounds(660,558, 250, 47);
        submitButton.setBackground(new Color(0,0,153));
        submitButton.setForeground(Color.WHITE);
        submitButton.setBorderPainted(false);
        submitButton.setFocusable(false);
        submitButton.setFont(new Font("Gotham",Font.BOLD,20));
		submitButton.addActionListener(this);

        /*submitButton.addActionListener(new ActionListener() {
            
            public void actionPerformed2(ActionEvent eb) {
                StringBuilder selectedDays = new StringBuilder("Selected days: ");
                
                for (int i = 0; i < day.length; i++) {
                    JCheckBox checkbox = day[i];
                    if (checkbox.isSelected()) {
                        
                        selectedDays.append(checkbox.getText()).append(" ");
                    }
                }
                JOptionPane.showMessageDialog(null, selectedDays.toString());

            }
        });*/
        
        

        imgLabel.add(confirmButton);
		imgLabel.add(submitButton);

        //back button
      // Icon icon = new ImageIcon("Back");
        back = new JButton("Back");
        back.setBounds(50,50,75,48);
        back.setBackground(new Color(0x111111));
		back.setForeground(Color.WHITE);
        back.setBorderPainted(false);
        back.setFocusable(false);
		back.setFont(new Font("Gotham",Font.BOLD,11));
        back.addActionListener(this);
        imgLabel.add(back);


		this.add(panel);
    }
    public void actionPerformed(ActionEvent ae)
	  {
	if(ae.getSource()==back){
		Home H = new Home(name,password);
		H.setVisible(true);
		
	this.setVisible(false);}
		
		else if(ae.getSource()==submitButton){
		payment H = new payment(name,password);
		H.setVisible(true);
		
		this.setVisible(false);
		
		
		  //String command=ae.getActionCommand();
		 // if(ae.getSource()==back){

          //back button
         /* if(back.getText().equals(command)){
            BMI B = new BMI(name,password);
            B.setVisible(true);
            this.setVisible(false);
          }*/
		 /* if(submitButton.getText().equals(command)){
            SlotBookingApp S = new SlotBookingApp(name,password);
            S.setVisible(true);
			this.setVisible(false);
		  }
		 // this.getSource(false);
		 
	  }
	  
	/*public void actionPerformed2(ActionEvent a)
	{
		String command= a.getActionCommand();
}*/
	

	  }




	}
}
