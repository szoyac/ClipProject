/**
 * wav.java
 * @author Stephen Zoyac
 * Interface for a wav file. 
 */
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public interface wav extends Clips{
	/**
	 * plays a wave file.
	 * @param filename
	 */
	public default void play(String filename) {
		System.out.println("Playing " + filename);
		AudioInputStream audioStream;

		try {
		   Clip clip = AudioSystem.getClip();
		   clip.open(AudioSystem.getAudioInputStream(new File(filename)));
		   clip.start();
		   Thread.sleep(clip.getMicrosecondLength() / 1000);
		   clip.close();
		}
		catch (Exception e) {
		   e.printStackTrace(); 
		}
	}

}
