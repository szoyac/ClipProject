/**
 * SeinfeldClip.java
 * @author Stephen Zoyac
 * Displays a Seinfeld Clip 
 */
public class SeinfeldClip {
private String fileName;
private String speaker;
private int year;

public SeinfeldClip(String fileName, String speaker, int year) {
	this.fileName = fileName;
	this.speaker = speaker;
	this.year = year;
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
public String getSpeaker() {
	return speaker;
	
}
/**
 * Sets the speaker of the clip
 * @param speaker
 */
public void setSpeaker(String speaker) {
	this.speaker = speaker;
	
}
/**
 * Gets the year of the clip
 * @return
 */
public int getYear() {
	return year;
	
}
/**
 * Sets the year of the clip
 * @param year
 */
public void setYear(int year) {
	this.year = year;
	
}
@Override
/**
 *@return a string of the class, and its variables
 */
public String toString() {
	return "SeinfeldClip [fileName=" + fileName + ", speaker=" + speaker + ", year=" + year + "]";
	
}


}
