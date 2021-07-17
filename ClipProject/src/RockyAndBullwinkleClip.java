/**
 * RockyAndBullwinkleClip.java
 * @author Stephen Zoyac
 * Displays a Rocky And Bullwinkle Clip 
 */
import java.util.ArrayList;

public class RockyAndBullwinkleClip implements wav{
private String fileName;
private ArrayList<String> Speakers;


public RockyAndBullwinkleClip(String fileName, ArrayList<String> speakers) {
	this.fileName = fileName;
	Speakers = speakers;
}
/**
*Gets the name of the file
*/
public String getFileName() {
	return fileName;
	
}
/**
 * Sets the name of a file
 * @param fileName
 */
public void setFileName(String fileName) {
	this.fileName = fileName;
	
}
/**
 * Gets the speaker of the clip
 * @return
 */
public ArrayList<String> getSpeakers() {
	return Speakers;
	
}
/**
 * Sets the speaker of the clip
 * @param speaker
 */
public void setSpeakers(ArrayList<String> speakers) {
	Speakers = speakers;
	
}

@Override
/**
 *@return a string of the class, and its variables
 */
public String toString() {
	return "RockyAndBullwinkleClip [fileName=" + fileName + ", Speakers=" + Speakers + "]";
}
}