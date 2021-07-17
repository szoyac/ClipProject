/**
 * gif.java
 * @author Stephen Zoyac
 * Interface for a gif type of clip
 */
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public interface gif extends Clips {
/**
 * plays a gif file
 * @param filename
 */
public default void play(String filename){
	System.out.println("Playing " + filename);

	JFrame frame = new JFrame();
	ImageIcon icon = new ImageIcon(filename);
	JLabel label = new JLabel(icon);
	frame.add(label);
	frame.pack(); 
	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	frame.setLocation(filename.length()* 10, filename.length() * 10);
	frame.setVisible(true);
	
}
}
