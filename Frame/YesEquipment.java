package Frame;

import java.lang.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;


public class YesEquipment extends JFrame implements ActionListener, MouseListener
{

    JPanel panel;
    ImageIcon logoImage,logo;
    ImageIcon backgroundIcon;
    JLabel imgJLabel1;
    JLabel imgJLabel2;

    JLabel benchLabel;
    JLabel dumbLabel;
    JLabel flyLabel;
    JLabel dipLabel;
    
    JButton backButton;
    JButton nextButton;
    
    Font headFont;
    Font detFont;
    Color oppColor;
    Color yellowColor;
    Color grayColor;
	private String name,password;

    public YesEquipment(String name,String password)
    {
	    super("Sporting Sphere Complex");
	    this.setBounds(400,100,1100,700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logo = new ImageIcon("Photo/Project.png");	
		this.setIconImage(logo.getImage());
		
		this.name=name;
		this.password=password;

        panel = new JPanel();
        panel.setLayout(null);       

        headFont = new Font("Comic Sans", Font.BOLD, 28);
        detFont = new Font("Open Sans", Font.BOLD, 15);

        yellowColor = new Color(255,181,62);
        grayColor = new Color(145,144,145);
        oppColor = new Color(145,145,145,(int) 0.53);

        backgroundIcon = new ImageIcon("Photo/yesequip1.png");
        imgJLabel2 = new JLabel(backgroundIcon);
        imgJLabel2.setBounds(0,0,1100,700);
        panel.add(imgJLabel2);
        
        Icon icon = new ImageIcon("Photo/backButton.png");
        backButton = new JButton(icon);
        backButton.setBounds(29,27, 32,32);
        backButton.setBackground(grayColor);
        backButton.setBorderPainted(false);
        backButton.setFocusable(false);
        backButton.addMouseListener(this);
        backButton.addActionListener(this);
        imgJLabel2.add(backButton);
        
        benchLabel = new JLabel("BENCH PRESS");
        benchLabel.setBounds(273,170,220,100);
        benchLabel.setForeground(yellowColor);
        benchLabel.setFont(headFont);
        imgJLabel2.add(benchLabel);

        dumbLabel = new JLabel("<html><body>DUMBBELL CURLS</body></html>");
        dumbLabel.setBounds(832,170,220,100);
        dumbLabel.setForeground(yellowColor);
        dumbLabel.setFont(headFont);
        imgJLabel2.add(dumbLabel);

        flyLabel = new JLabel("CHEST FLY");
        flyLabel.setBounds(300,435,220,100);
        flyLabel.setForeground(yellowColor);
        flyLabel.setFont(headFont);
        imgJLabel2.add(flyLabel);

        dipLabel = new JLabel("CHEST DIP");
        dipLabel.setBounds(855,435,220,100);
        dipLabel.setForeground(yellowColor);
        dipLabel.setFont(headFont);
        imgJLabel2.add(dipLabel);

        nextButton = new JButton("NEXT");
        nextButton.setBounds(800,610, 190,40);
        nextButton.setBackground(new Color(249,176,63));
        nextButton.setForeground(Color.WHITE);
        nextButton.setFont(headFont);
        nextButton.setBorderPainted(false);
        nextButton.setFocusable(false);
        nextButton.addMouseListener(this);
        nextButton.addActionListener(this);
        imgJLabel2.add(nextButton);


        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae)
    {
		if(ae.getSource()==nextButton){
			AllSetFrame asf = new AllSetFrame(name,password);
			asf.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==backButton){
            EquipmentChecking ASF = new EquipmentChecking(name,password);
            ASF.setVisible(true);
			this.setVisible(false);
		}


    }
    public void mouseClicked(MouseEvent me)
    {
       
    }
	public void mousePressed(MouseEvent me)
    {
        
    }
	public void mouseReleased(MouseEvent me)
    {
      
    }

	public void mouseEntered(MouseEvent me)
	{
        
	}
	public void mouseExited(MouseEvent me)
	{
		
	}

}