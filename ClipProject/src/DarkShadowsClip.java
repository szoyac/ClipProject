/**
 * DarkShadowsClip.java
 * @author Stephen Zoyac
 * Displays a Dark Shadows Clip 
 */
public class DarkShadowsClip implements wav{
	
private String fileName;
private int episode;
private String Speaker;

public DarkShadowsClip(String fileName, int episode, String speaker) {
	this.fileName = fileName;
	this.episode = episode;
	Speaker = speaker;
}
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
 * Gets the episode of a clip
 * @return
 */
public int getEpisode() {
	return episode;
}
/**
 * Sets the episode of a clip
 * @param episode
 */
public void setEpisode(int episode) {
	this.episode = episode;
}
/**
 * Gets the character of the clip
 * @return Speaker
 */
public String getSpeaker() {
	return Speaker;
}
/**
 * Sets the speaker of the clip
 * @param speaker
 */
public void setSpeaker(String speaker) {
	Speaker = speaker;
}
@Override
/**
 *@return a string of the class, and its variables
 */
public String toString() {
	return "DarkShadowsClip [fileName=" + fileName + ", episode=" + episode + ", Speaker=" + Speaker + "]";
}

}

