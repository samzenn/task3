import java.util.Scanner;

import javax.swing.JOptionPane;



public class AbominodoController {
	
	 private AbominodoModel AbominodoModel;
	 private AbominodoView AbominodoView;
     Scanner input=new Scanner(System.in);

	 
	 public AbominodoController(AbominodoModel m, AbominodoView v) {
	  AbominodoModel = m;
	  AbominodoView = v;

	  initView();
	 }
	 
	 public void initView() {
		 AbominodoView.getNameTextfield().setText(AbominodoModel.getName());
		 AbominodoView.getUsernameTextfield().setText(AbominodoModel.getUsername());
	 }
	 public void initController() {
		 AbominodoView.getSaveButton().addActionListener(e -> savename());
		// AbominodoView.getClear().addActionListener(e -> clear());
		 AbominodoView.getCredential().addActionListener(e -> checkCredential());
		 AbominodoView.getBye().addActionListener(e -> sayBye());
		 AbominodoView.getStart().addActionListener(e -> gameStart());

	 }
	 
	 private void savename() {
	  AbominodoModel.setName( AbominodoView.getNameTextfield().getText());
	  JOptionPane.showMessageDialog(null, "Your name saved : " + AbominodoModel.getName(), "Info", JOptionPane.INFORMATION_MESSAGE);
	  
	  AbominodoModel.setUsername( AbominodoView.getUsernameTextfield().getText());
	  JOptionPane.showMessageDialog(null, "Your username saved : " +AbominodoModel.getUsername(), "Info", JOptionPane.INFORMATION_MESSAGE);
	 }
	 
	 private void checkCredential() {
	  JOptionPane.showMessageDialog(null, "Hello, Your registered name is " + AbominodoModel.getName() + " and your username is: " + AbominodoModel.getUsername(), "Info", JOptionPane.INFORMATION_MESSAGE);
	 }
	 
	 private void gameStart() {
		 System.out.println();
	       String h1 = "Main menu";
	       String u1 = h1.replaceAll(".", "=");
	       System.out.println(u1);
	       System.out.println(h1);
	       System.out.println(u1);
	       System.out.println("1) Play");
	       // System.out.println("1) Single player play");
	       System.out.println("2) View high scores");
	       System.out.println("3) View rules");
	       // System.out.println("4) Multiplayer play");
	       System.out.println("0) Quit");
	 
	       int selection = input.nextInt();

	       while (selection<4)
	       {
	          switch(selection){
	               case 1:
	            	   System.out.println();
	                   String h4 = "Select difficulty";
	                   String u4 = h4.replaceAll(".", "=");
	                   System.out.println(u4);
	                   System.out.println(h4);
	                   System.out.println(u4);
	                   System.out.println("1) Simples");
	                   System.out.println("2) Not-so-simples");
	                   System.out.println("3) Super-duper-shuffled");
	                  double amount=input.nextDouble(); //object of scanner class
	                  break;

	               case 2:
	                  System.out.println("Start the game and record your high score"); 
	                  
	                  break;

	               case 3:
	                  System.out.println("Games Rules are shows in the next step");
	                  break;
	                  
	               case 0:
		                  System.out.println("It is a shame that you did not want to play");
		            	  System.exit(0);

		                  break;
	               
	             }
	             selection = input.nextInt(); 
	        }

	 }
	 
	 private void sayBye() {
	  System.exit(0);
	 }

}
