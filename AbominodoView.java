import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AbominodoView {
	
	 private JFrame frame;
	 private JLabel nameLabel;
	 private JLabel usernameLabel;
	 private JLabel welcome;
	 private JLabel welcome2;
	 private JTextField nameTextfield;
	 private JTextField usernameTextfield;
	 private JButton SaveButton;
	 private JButton ClearButton;
	 private JButton credential;
	 private JButton bye;
	 private JButton start;
	 private JPanel panel;
	 private JPanel panel2;
	 private JPanel panel3;
	 private JPanel panel4;


	
	public AbominodoView(String title) {
		 
		  frame = new JFrame("Welcome to Abominodo");
		  frame.getContentPane().setLayout(new BorderLayout());
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setSize(600, 420);
		  frame.setLocationRelativeTo(null);
		  frame.setVisible(true);
	      panel = new JPanel(); 
	      panel2 = new JPanel(); 
	      panel3 = new JPanel(); 
	      panel4 = new JPanel(); 

		  
		  // All UI Elements
		  nameLabel = new JLabel("Name :");
		  usernameLabel = new JLabel("Username :");
		  nameTextfield = new JTextField();
		  usernameTextfield = new JTextField();
		  SaveButton = new JButton("Register Now");
		  ClearButton = new JButton("Clear");
		  welcome = new JLabel();
		  welcome2 = new JLabel();

		  credential = new JButton("Verify Credentials");
		  bye = new JButton("Bye!");
		  start = new JButton ("Start");  

	        panel2.add(welcome);
	        panel3.add(welcome2);
	        panel4.add(start);
	        
	        ClearButton.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){  
			    	nameTextfield.setText("");  
			    	usernameTextfield.setText("");  
			    }  
			    }); 
	        
	  
		  //frame.add(panel, BorderLayout.PAGE_END);
	      frame.getContentPane().add(panel, BorderLayout.NORTH);
	      frame.add(panel2, BorderLayout.CENTER);
	      panel2.add(panel3);
	      panel3.add(panel4);
	      
	      panel.setPreferredSize(new Dimension(200, 200));
	  
		  welcome.setText("Welcome To Abominodo - The Best Dominoes Puzzle Game in the Universe " );
		  welcome2.setText("Version 1.0 (c), Kevan Buckley, 2010");

		  // Adding UI elements to the frame
		  
		 // GroupLayout layout = new GroupLayout(frame.getContentPane());
		  GroupLayout layout = new GroupLayout(panel);
	      panel.setLayout(layout);

		  layout.setAutoCreateGaps(true);
		  layout.setAutoCreateContainerGaps(true);
		  		  
		  layout.setHorizontalGroup(layout.createSequentialGroup()
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(nameLabel)
		    .addComponent(usernameLabel))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(nameTextfield)
		    .addComponent(usernameTextfield))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(SaveButton)
		    .addComponent(ClearButton))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(credential)
		    .addComponent(bye))
		    );
		  
		  layout.setVerticalGroup(layout.createSequentialGroup()
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(nameLabel)
		    .addComponent(nameTextfield).addComponent(SaveButton).addComponent(credential))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(usernameLabel)
		    .addComponent(usernameTextfield).addComponent(ClearButton).addComponent(bye))
		    //.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(welcome))
		    );
		  layout.linkSize(SwingConstants.HORIZONTAL, SaveButton, ClearButton);
		  layout.linkSize(SwingConstants.HORIZONTAL, credential, bye);		
		  
		  frame.getContentPane().setLayout(layout);
		 }
	
		 public JFrame getFrame() {
		  return frame;
		 }
		 public void setFrame(JFrame frame) {
		  this.frame = frame;
		 }
		 public JLabel getNameLabel() {
		  return nameLabel;
		 }
		 public void setNameLabel(JLabel nameLabel) {
		  this.nameLabel = nameLabel;
		 }
		 public JLabel getUsernameLabel() {
		  return usernameLabel;
		 }
		 public void setUsernameLabel(JLabel usernameLabel) {
		  this.usernameLabel = usernameLabel;
		 }
		 public JTextField getNameTextfield() {
		  return nameTextfield;
		 }
		 public void setNameTextfield(JTextField nameTextfield) {
		  this.nameTextfield = nameTextfield;
		 }
		 public JTextField getUsernameTextfield() {
		  return usernameTextfield;
		 }
		 public void setUsernameTextfield(JTextField usernameTextfield) {
		  this.usernameTextfield = usernameTextfield;
		 }
		 public JButton getSaveButton() {
		  return SaveButton;
		 }
		 public void setSaveButton(JButton SaveButton) {
		  this.SaveButton = SaveButton;
		 }
		 public JButton getCredential() {
		  return credential;
		 }
		 public void setCredential(JButton credential) {
			  this.credential = credential;
			 }
		 public JButton getClear() {
			 return ClearButton;
		 }
		 public void setClear() {
			 this.ClearButton = ClearButton;
		 }
		 public JButton getBye() {
		  return bye;
		 }
		 public void setBye(JButton bye) {
		  this.bye = bye;
		 }
		 public JButton getStart() {
			  return start;
		 }
		 public void setStart(JButton start) {
			 this.start = start;
		 }
}
