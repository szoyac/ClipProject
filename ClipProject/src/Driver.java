
/**
 * Driver.java
 * @author: Stephen Zoyac
 * Version: 02/19/2021
 * Plays a variety of wav and gif clips.
 */
import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		ArrayList<Clips> clip = new ArrayList<Clips>(); 
		
		ArrayList<String> speakers = new ArrayList<String>();
		Clips dkClip1 = (Clips) new DarkClip("Dark-Jonas.gif"," Jonas Walking Into Cave");
		Clips dkClip2 = (Clips) new DarkClip("Dark-TheStranger.gif","Stranger Leaving Cave");
		
		Clips dsClip1 =  (Clips) new DarkShadowsClip("DarkShadows-Angelique.wav",606,"Angelique");
		Clips dsClip2 =  (Clips) new DarkShadowsClip("DarkShadows-DoctorHoffman.wav",613,"Doctor Hoffman");
		Clips dsClip3 =  (Clips) new DarkShadowsClip("DarkShadows-ProfessorStokes.wav",506,"Professor Stokes");
		Clips dsClip4 =  (Clips) new DarkShadowsClip("DarkShadows-Zombie.wav",942,"Zombie Sheriff");
		
		Clips gotClip1 = (Clips) new GameOfThronesClip("GameOfThrones-Joffrey.gif", "Joffrey Baratheon");
		Clips gotClip2 = (Clips) new GameOfThronesClip("GameOfThrones-Jon.gif" , "Jon Snow");
		
		Clips rbClip1 = (Clips) new RockyAndBullwinkleClip("RockyAndBullwinkle-Natasha.wav",speakers);
		Clips rbClip2 = (Clips) new RockyAndBullwinkleClip("RockyAndBullwinkle-RockyAndBullwinkle.wav", speakers);
		
		clip.add(dkClip1);
		clip.add(dkClip2);
		
		clip.add(dsClip1);
		clip.add(dsClip2);
		clip.add(dsClip3);
		clip.add(dsClip4);
		
		clip.add(gotClip1);
		clip.add(gotClip2);
		
		clip.add(rbClip1);
		clip.add(rbClip2);
		
        clip.forEach(c -> c.play(((Clips) c).getFileName()));
        
        
        //movies.forEach((length,m) -> System.out.println(m.toString() + " " + length.toString() +" minutes"));

	}

}
