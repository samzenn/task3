import java.awt.*;
import javax.swing.*;

public class Aardvarkgui {
	
	 public static void main(String[] args) {
		  // Assemble all the classes of the Abominodo MVC
		 AbominodoModel m = new AbominodoModel("", "");
		 AbominodoView v = new AbominodoView("");
		 AbominodoController c = new AbominodoController(m, v);
		  c.initController();
		 }
}
