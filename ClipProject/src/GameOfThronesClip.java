/**
 * GameOfThronesClip.java
 * @author Stephen Zoyac
 * Displays a Game of Thrones Clip 
 */
public class GameOfThronesClip implements gif{
	private String fileName;
	private String Character;
	
	/**
	 * Constructor for 
	 * @param fileName
	 * @param character
	 */
	public GameOfThronesClip(String fileName, String character) {
		this.fileName = fileName;
		Character = character;
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
	 * Gets the name of the character.
	 * @return character
	 */
	public String getCharacter() {
		return Character;
	}
	/**
	 * Sets the name of the character
	 * @param character
	 */
	public void setCharacter(String character) {
		Character = character;
	}
	/**
	 *@return a string of the class, and its variables
	 */
	public String toString() {
		return "GameOfThronesClip [fileName=" + fileName + ", Character=" + Character + "]";
	}

}
