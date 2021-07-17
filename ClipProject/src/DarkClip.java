/**
 * DarkClip.java
 * @author Stephen Zoyac
 * Displays a Dark Clip 
 */
public class DarkClip implements gif {
private String fileName;
private String scene;

public DarkClip(String fileName, String scene) {
	this.fileName = fileName;
	this.scene = scene;
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
 * Gets the scene of the clip
 * @return
 */
public String getScene() {
	return scene;
}
/**
 * Sets the scene of the clip
 * @param scene
 */
public void setScene(String scene) {
	this.scene = scene;
}
/**
 *@return a string of the class, and its variables
 */
@Override
public String toString() {
	return "DarkClip [fileName=" + fileName + ", scene=" + scene + "]";
}
}
