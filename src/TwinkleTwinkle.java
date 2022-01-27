import org.jfugue.player.Player;
import org.jfugue.pattern.Pattern;

public class TwinkleTwinkle 
{
  //INSTANCE VARIABLES
  private static String instrument; 
  private static double playbackSpeed; 
  private int twinTempo;
  private static String[] subSongList = {"Twinkle Twinkle Little Star - Original"};
  
  //ACCESSORS
  public static String getInstrument() {return instrument;}
  public static double getPlaybackSpeed() {return playbackSpeed;}
  public static String[] getSubSongList() {return subSongList;}
  
  //CONSTRUCTORS
  public TwinkleTwinkle()
  {
    instrument = "Piano";
    playbackSpeed = 1;
    twinTempo = 132;
  }
  public TwinkleTwinkle(String i, double pbs)
  {
    if(i.equals("Default"))
    {
      instrument = "Piano";
    }
    else 
    {
      instrument = i; 
    }
    playbackSpeed = pbs;
    twinTempo = (int) Math.round(132 * playbackSpeed);
  }

  //MUTATORS
  public static void setInstrSpeed(String instru, double speed)
  {
    if(instru.equals("Default"))
    {
      instrument = "Piano";
    }
    else
    {
      instrument = instru;
    }
    playbackSpeed = speed;
  }
  
  //METHODS
    /* DYNAMICS: pp - 27 	p - 47 	mp - 67 	mf - 87	f - 107	ff(sf) - 127 */ 
  public void playOriginal()
  {
    Pattern trembleIntro = new Pattern("C6a90d127 C6a90d127 | G6a90d127 G6a90d127 | A6a90d127 A6a90d127 | G6a90d127 G6a90d127 | F6a90d127 F6a90d127 | E6a90d127 E6a90d127 | D6a90d127 D6i.a90d127 Esa90d127 | C6a90d127 R "); //m. 1-8
    Pattern trembleRepeat = new Pattern("G6a90d127 G6a90d127 | F6a90d127 F6a90d127 | E6a90d127 E6a90d127 | D6a90d127 D6a90d127 | G6a90d127 G6a90d127 | F6a90d127 F6a90d127 | E6a90d127 E6i.a90d127 F6sa90d127 | "); //m. 9-15
      trembleRepeat.add("E6a90d127 D6a90d127 | C6a90d127 C6a90d127 | G6a90d127 G6a90d127 | A6a90d127 A6a90d127 | G6a90d127 G6a90d127 | F6a90d127 F6a90d127 | E6a90d127 E6a90d127 | D6a90d127 D6i.a90d127 E6sa90d127 | C6a90d127 Rq | "); //m. 16-24

    Pattern bassIntro = new Pattern("C4a80d127 C5a80d127 | E5a80d127 C5a80d127 | F5a80d127 C5a80d127 | E5a80d127 C5a80d127 | D5a80d127 B4a80d127 | C5a80d127 A4a80d127 | F4a80d127 G4a80d127 | C4a80d127 Rq | "); //m. 1-8
    Pattern bassRepeat = new Pattern("E5a80d127 G4a80d127 | D5a80d127 G4a80d127 | C5a80d127 G4a80d127 | B4a80d127 G4a80d127 | E5a80d127 G4a80d127 | D5a80d127 G4a80d127 | C5a80d127 C5i.a80d127 D5sa80d127 | "); //m. 9-15
      bassRepeat.add("C5a80d127 B4a80d127 | C4a80d127 C5a80d127 | C5a80d127 C5a80d127 | F5a80d127 C5a80d127 | E5a80d127 C5a80d127 | D5a80d127 B4a80d127 | C5a80d127 A4a80d127 | F4a80d127 G5a80d127 | C4a80d127 Rq | "); //m. 16-24

    Pattern tremble = new Pattern("V0 I[" + instrument + "]");
      tremble.add(trembleIntro);
      tremble.add(trembleIntro);
      tremble.add(trembleRepeat);
      tremble.add(trembleRepeat);

    Pattern bass = new Pattern("V1 I[" + instrument + "]");
      bass.add(bassIntro);
      bass.add(bassIntro);
      bass.add(bassRepeat);
      bass.add(bassRepeat);

    Pattern twinkle = new Pattern("KEY:Cmaj T" + twinTempo); 
      twinkle.add(tremble);
      twinkle.add(bass);

    Player player = new Player();
      player.play(twinkle); 
  }

  //TO STRING
  public String toString()
  {
    // return "Twinkle Twinkle Little Star";
    return "TwinkleTwinkle";
  }
}
