/**
 * <h1>✨ Musical Java ✨</h1>
 * The MusicalJava program implements an application that gives the user the option to choose a song and its features: 
 * the instrument playing the song, speed, song category, specific sng, and number of repetitions.
 * 
 * @author Nancy J. Chen
 * @version 1.0.0
 * @since 2021-12-25
 */

// import org.jfugue.player.Player;
// import org.jfugue.pattern.Pattern;
// import java.awt.GraphicsEnvironment;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MusicalJava
{ 
  //--- COLOR CODES
  // private static final String ANSI_RESET = "\u001B[0m";
  // private static final String ANSI_BLACK = "\u001B[30m";
  // private static final String ANSI_RED = "\u001B[31m";
  // private static final String ANSI_GREEN = "\u001B[32m";
  // private static final String ANSI_YELLOW = "\u001B[33m";
  // private static final String ANSI_BLUE = "\u001B[34m";
  // private static final String ANSI_PURPLE = "\u001B[35m";
  // private static final String ANSI_CYAN = "\u001B[36m";
  // private static final String ANSI_WHITE = "\u001B[37m";
  // private static final String[] ANSI_COLORS = {ANSI_RESET, ANSI_RED, ANSI_GREEN, ANSI_YELLOW, ANSI_BLUE, ANSI_PURPLE, ANSI_CYAN};
  private String name;

  public static void main(String[] args) throws Exception 
  {
    //--- PROJECT CODE
    MusicalJava mj = new MusicalJava();
    mj.printWithDelays(mj.toString(), TimeUnit.SECONDS, (long) 0.8);
    Playlist playlist = new Playlist();
    playlist.setVisible(true);

    // --- SOUND CHECK
    // Player p = new Player(); 
    // p.play("T400 E D C D | E E Eh | D D Dh | E E Eh | E D C D | E E E E | D D E D | Cw |");
    
    // --- RANDOM MUSIC CHECK
    // Player p = new Player();
    // p.play("T350 (B5+E6)i. (A5+D6)i. (B5+E6)i. (A5+D6)i. (B5+E6)i (B5+E6)i | ");
    
    // --- MUSIC CHECK
    // JingleBells j = new JingleBells();
    // j.playBrillante();

    // Miraculous m = new Miraculous("Marimba", 1);
    // m.playLadybug();

    // TwinkleTwinkle t = new TwinkleTwinkle();
    // t.playOriginal();

    // DemonSlayer d = new DemonSlayer("Default", 1.25);
    // d.playNezuko();
    // d.playGurenge();

    // Persona5 p5 = new Persona5();
    // p5.playLifeWillChange();
    
    System.out.println("Done");
    
    // --- FONT SEARCH
    // String fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(); for (int i = 0; i < fonts.length; i++) {System.out.println(fonts[i]);}
  }
  public String getRemark(String[] remarkList)
  {
    int randomNum = (int) (Math.random() * (remarkList.length));
    for(int index = 0; index <= remarkList.length - 1; index++)
      if(index == randomNum)
        return remarkList[index];
    return null;
  }
  public void printWithDelays(String data, TimeUnit unit, long delay) throws InterruptedException 
  {
    for(char ch:data.toCharArray())
    {
      System.out.print(ch);
      unit.sleep(delay);
    }
  }
  public String toString()
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name: ");
    name = sc.nextLine();
    String[] emojiList = {":)", ":(", ":D", ">:(", ":P", "-_-", "O w O", "8)", "8(", "=-)", "=-(", "Q A Q", ">.<", "^_^", "O_O"};
    String welcome = "\nWelcome to Musical Java, " + name + "! " + getRemark(emojiList) + " \n\nThe 'Musical Java' window will shown up momentarily. \n\nPlease wait... ";
    sc.close();
    return welcome; 
  }
}