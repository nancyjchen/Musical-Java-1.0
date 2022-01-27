import org.jfugue.player.Player;
import org.jfugue.pattern.Pattern;

public class Miraculous 
{
  //INSTANCE VARIABLES
  private static String instrument; 
  private static double playbackSpeed; 
  private int ladybugTempo;
  private static String[] subSongList = {"It's Ladybug"};
  
  //ACCESSORS
  public static String getInstrument() {return instrument;}
  public static double getPlaybackSpeed() {return playbackSpeed;}
  public static String[] getSubSongList() {return subSongList;}

  //CONSTRUCTORS
  public Miraculous()
  {
    instrument = "Piano";
    playbackSpeed = 1;
    ladybugTempo = 163;
  }
  public Miraculous(String i, double pbs)
  {
    if(i.equals("Default"))
      instrument = "Piano";
    else
      instrument = i;
    playbackSpeed = pbs;
    ladybugTempo = (int) Math.round(163 * playbackSpeed);
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
  public void playLadybug()
  {
    Pattern tremble = new Pattern("V0 I[" + instrument + "] (G5+D6)ha87d127 (G5+D6)q.a87d127 (B5+E6)qa89d127 | (B5+E6)qa89d127 (B5+E6)ia89d127 (B5+E6)ha90d127 | (F5+B5)ha85d127 (F5+B5)q.a85d127 (F5+C6)qa85d127 | (F5+C6)qa87d127 (F5+C6)ia87d127 (F5+C6)ha87d127 | (G5+D6)ha87d127 (G5+D6)q.a87d127 (B5+E6)qa87d127 | (B5+E6)qa89d127 (B5+E6)ia89d127 (B5+E6)ha89d127 | "); //measures 1-6 - PAGE 1
      tremble.add("(F5+B5)ha85d127 (F5+B5)q.a85d127 (F5+C6)qa85d127 | (F5+C6)qa85d127 (F5+C6)ia85d127 (F5+C6)ha85d127 | Rq. C6ia90d127 (C6 B5 B5)ia90d127  Ri | Rq. C6ia90d127  (C6 B5 B5)ia90d127  Ri | Rq. C6ia90d127  (C6 B5 B5)ia86d127 Ri | "); //measures 7-11
      tremble.add("Ri (A5 A5)qa83d127 (B5 B5)ia88d127 Ri | Rq. C6ia95d127 (C6 B5 B5)ia95d127 Ri | Rq. C6ia95d127 (C6 B5)ia93d127 (B5+D6)qa97d127 | C6q Ri C6ia85d127 (C6 B5 B5)ia95d127 Ri | "); //measures 12-15
      tremble.add("Ri (A5 A5)qa90d127 (B5 B5)ia95d127 Ri | (D6+D7)qa100d50 (G6+G7)qa105d50 (F6+F7)qa103d50 Ri (B5+D6)qa97d127 |  (B5+D6)qa97d127 (B5+F6)ia97d127 (D6 C6 B5)id93d127 Ri | (D6+D7)qa100d50 (G6+G7)qa105d50 (F6+F7)qa103d50 Ri (B5+D6)qa97d127 | "); //measures 16-19
      tremble.add(" (B5+D6)qa97d127 (B5+F6)ia99d127 (D6 C6 B5)ia95d127 Ri | (D6+D7)qa100d127 (G6+G7)qa95d127 (F6+F7)qa95d127 Ri (B5+D6)qa97d127 | (B5+D6)qa97d127 (B5+F6)ia97d127 (D6 C6)ia99d127 (B5 B5)ia95d127 | (B5+E6)qa96d127 D6ia91d127 C6qa86d127 B5qa81d127 D6ia95d127 | "); //measures 20-23
      tremble.add("(F5+C6)qa60d50 (F5+C6)qa70d50 (F5+C6)qa80d50 (F5+C6)qa90d50 | (F5+C6)qa100d50 (F5+C6)qa100d50 (B5+B6 A5+A6)ia107d127 (F5+F6)i (G5+G6)qa107d127 | Ri Rq (B5+B6 A5+A6)ia113d127 (F5+F6)i (G5+G6)qa113d127 | Ri Rq (B5+B6 A5+A6)ia115d127 (F5+F6)ia115d127 (G5+G6)qa114d50 | "); //measures 24-27 - PAGE 2
      tremble.add(" (G5+G6)qa115d95 (G5+G6)qa112d127 (D6+D7)qa115d127 (C6+C7)qa113d127 | (D6+D7)q.a115d127 (B5+B6 A5+A6)ia120d127 (F5+F6)ia118d127 (G5+G6)qa119d127 | Ri (B5+B6)qa120d127 (A5+A6)qa118d127 (F5+F6)qa116d127 (G5+G6)qa114d127 | Rq. (B5+B6 A5+A6)ia110d127 (F5+F6)ia106d127 (G5+G6)qa108d50 | "); //measures 28-31
      tremble.add("(G5+G6)qa108d50 (G5+G6)qa108d127 (D6+D7)qa110d127 (C6+C7)qa108d127 | (D6+D7)q.a109d127 Rh | Rq. C6ia87d127 (C6 B5 B5)ia85d127 Ri | Rq. C6ia87d127 (C6 B5 B5)ia85d127 | "); //measures 32-35 
      tremble.add("Rq. C6ia87d127 (C6 B5 B5)ia87d127 Ri | Ri A5qa90d127 A5qa90d127 (B5 B5)ia93d127 Ri | Rq. C6ia88d127 (C6 B5 B5)ia88d127 Ri | Rq. C6ia90d127 (C6 B5)ia90d127 (B5+D6)qa90d127 | "); //measures 36-39
      tremble.add("C6qa86d127 Ri C6ia88d127 (C6 B5 B5)ia88d127 Ri | Ri (A5 A5)qa93d127 (B5 B5)ia93d127 Ri | (D6+D7)qa97d50 (G6+G7)qa100d50 (F6+F7)qa98d50 Ri (B5+D6)qa93d127 | (B5+D6)qa93d127 (B5+D6)ia93d127 (B5+D6)ia93d127 (C6 B5)ia95d127 Ri | (D6+D7)qa97d127 (G6+G7)qa100d50 (F6+F7)qa98d50 Ri (B5+D6)qa93d127 | "); //measures 40-44 
      tremble.add(" (B5+D6)qa93d127 (B5+F6)ia93d127 (D6 C6 B5)ia100d127 Ri | (D6+D7)qa110d50 (G6+G7)qa115d50 (F6+F7)qa113d127 Ri (B5+D6)qa97d127 | (B5+D6)qa96d127 (B5+F6)ia98d127 (D6 C6)ia95d127 (B5 B5)ia92d127 | (B5+E6)qa95d127 D6ia90d127 C6qa85d127 B5qa75d127 D6ia70d127 | "); //measures 45-48 - PAGE 3
      tremble.add("(F5+C6)qa60d50 (F5+C6)qa65d50 (F5+C6)qa70d50 (F5+C6)qa75d50 | (F5+C6)qa80d50 (F5+C6)qa75d50 (B6 A6)ia83d127 (F6 G6)ia73d127 | G6ia67d127 Ri Rq B6ia73d127 A6ia71d127 F6ia68d127 G61a69d127 | Rq Ri B6ia73d127 A6ia72d127 F6ia70d127 G6qa71d127 | "); //measures 49-52
      tremble.add("G6qa73d127 G6qa75d127 D7qa80d127 C7qa79d127 | D7q.a80d127 B6ia78d127 A6ia77d127 F6ia75d127 G6qa76d127 | Ri B6ia83d127 A6qa82d127 F6qa80d127 G6qa81d127 | Rq. B6ia87d127 A6ia86d127 F6ia84d127 G6qa85d127 | G6qa88d127 G6qa90d127 (D6+D7)qa92d127 (C6+C7)qa95d127 | "); //measures 53-57
      tremble.add("(D6+D7)q.a100d127 (B5+B6 A5+A6)ia107d127 (F5+F6)ia103d127 (G5+G6)qa105d127 | Rq. (B5+B6 A5+A6)ia107d127 (F5+F6)ia103d127 (G5+G6)qa105d127 | Rq. (B5+B6 A5+A6)ia100d127 (F5+F6)ia95d127 (G5+G6)qa97d50 | (G5+G6)qa99d50 (G5+G6)qa104d127 (D6+D7)qa107d127 (C6+C7)qa106d127 | "); //measures 58-61 
      tremble.add("(D6+D7)q.a107d127 (B5+B6 A5+A6)ia100d127 (F5+F6)ia96d127 (G5+G6)qa98d127 | Ri (B5+B6)ia102d127 (A5+A6)qa97d127 (F5+F6)qa92d127 (G5+G6)qa94d127 | Rq. (B5+B6 A5+A6)ia104d127 (F5+F6)ia100d127 (G5+G6)qa102d50 | (G5+G6)qa101d50 (G5+G6)qa100d127 (D6+D7)qa110d127 (C6+C7)qa105d127 | "); //measures 62-65 
      tremble.add("(D6+D7)q.a106d127 (B5+B6)ia101d127 (F5+F6)ia96d127 (G5+G6)ia98d127 | (B5+B6)q.a97d127 (A5+A6)qa95d127 (F5+F6)qa93d127 (D5+D6)qa91d127 | Ri (B5+B6)ia95d127 (A5+A6)qa93d127 (F5+F6)qa91d127 (D5+D6)qa89d127 | (F5+F6)ha93d127 (F5+F6)qa90d127 (D5+D6)qa86d127 | "); //measures 66-69 - PAGE 4
      tremble.add("(F5+F6)qa91d127 Ri (B5+B6 A5+A6)ia95d127 (F5+F6)ia90d127 (G5+G6)qa93d127 | Ri (B5+B6)ia90d127 (A5+A6)qa90d127 (F5+F6)qa85d127 (G5+G6)qa88d127 | Rq. (B5+B6 A5+A6)ia98d127 (F5+F6)ia93d127 (G5+G6)qa96d50 | (G5+G6)qa98d50 (G5+G6)qa100d127 (D6+D7)qa105d127 (C6+C7)qa103d127 | "); //measures 70-73
      tremble.add("(D6+D7)q.a107d127 (B5+B6 A5+A6)ia110d127 (F5+F6)ia105d127 (G5+G6)qa112d127 | (G5+G6)qa119d127 (B5+B6)qa124d127 (B5+B6)qa125d127 | (D6+D7)qa126d127 (D6+D7)qa127d127 (G6+G7)ha127d127 | Rw | Rw | "); //measures 74-77 
    /*
    Pattern alto = new Pattern("V1 I[" + instrument + "] "); //measures 1-6 - PAGE 1
      alto.add(""); //measures 7-11
      alto.add(""); //measures 12-15
      alto.add(""); //measures 16-19
      alto.add(""); //measures 20-23
      alto.add(""); //measures 24-27 - PAGE 2
      alto.add(""); //measures 28-31
      alto.add(""); //measures 32-35 
      alto.add(""); //measures 36-39
      alto.add(""); //measures 40-44
      alto.add(""); //measures 45-48 - PAGE 3
      alto.add(""); //measures 49-52
      alto.add(""); //measures 53-57
      alto.add(""); //measures 58-61 
      alto.add(""); //measures 62-65 
      alto.add(""); //measures 66-69 - PAGE 4
      alto.add(""); //measures 70-73
      alto.add(""); //measures 74-77 
    */
    Pattern bass = new Pattern("V2 I[" + instrument + "] (G3+D4+G4 D4 G3+D4+G4 D4)qa67 | (E3+B3+E4)qa69 (B3 E4)ia69 (E3+B3+E4 B3)qa69 | (B3+F4+B4 F4 B3+F4+B4 F4)qa65 | (F3+C4+F4)qa67 (C4+F4)ia67 (F3+C4+F4 C4)qa67 | (G3+D4+G4 D4 G3+D4+G4 D4)qa67 | (E3+B3+E4)qa69 (B3 E4)ia69 (E3+B4+E4 B3)qa69 | "); //measures 1-6 - PAGE 1
      bass.add("(B3+F4+B4 F4 B3+F4+B4 F4)qa65 | (F3+C4+F4)qa65 (C4+F4)ia65 (F3+C4+F4 C4)qa65 | (G3+D4+G4)qa70 D4ia70 (G3+D4+G4)qa70 (D4 G3+G4 D4)ia70 | (E3+B3+E4)qa70 B3ia70 (E3+B3+E4)qa70 (B3 E3+E4 B3)ia70 | (B3+F4+B4)qa70 F4ia70 (B3+F4+B4)qa70 (F4 B3+B4 F4)ia70 | "); //measures 7-11
      bass.add("(F3+C4+F4)qa63 C4ia63 (F3+C4+F4)qa63 (C4 F3+F4 C4)ia63 | (G3+D4+G4)qa75 D4ia75 (G3+D4+G4)qa75 (D4 G3+G4 D4)ia75 | (E3+B3+E4)qa75 B3ia75 (E3+B3+E4)qa75 (B3 E3+E4 B3)ia75 | (B3+F4+B4)qa65 F4ia65 (B3+F4+B4)qa65 (F4 B3+B4 F4)ia65 | "); //measures 12-15
      bass.add("(F3+C4+F4)qa70 C4ia70 (F3+C4+F4)qa70 (C4 F3+F4 C4)ia70 | (G3+D4+G4)qa80 D4i (G3+D4+G4)qa80 (D4 G3+G4 D4)ia80 | (E3+B3+E4)qa77 B3ia77 (E3+B3+E4)qa77 (B3 E3+E4 B3)ia77 | (B3+F4+B4)qa80 F4ia80 (B3+F4+B4)qa80 (F4 B3+B4 F4)ia80 | "); //measures 16-19
      bass.add("(F3+C4+F4)qa77 C4ia77 (F3+C4+F4)qa77 (C4 F3+F4 C4)ia77 | (G3+D4+G4)qa80 D4ia80 (G3+D4+G4)qa80 (D4 G3+G4 D4)ia80 | (E3+B3+E4)qa77 B3ia77 (E3+B3+E4)qa77 (B3 E3+E4 B3)ia77 | (B3+F4+B4)qa76 F4ia76 (B3+F4+B4)qa76 (F4 B3+B4 F4)ia76 | "); //measures 20-23
      bass.add("(F3+C4+F4 C4)ia40 (F3+C4+F4 C4)ia50 (F3+C4+F4 C4)ia60 (F3+C4+F4 C4)ia70 | (F3+C4+F4)qa80 (F3+C4+F4)qa80 Rh | (G3+D4+G4)qa83 D4ia83 (G3+D4+G4)qa83 (D4 G3+G4 D4)ia83 | (E3+B3+E4)qa95 B3ia95 (E3+B3+E4)qa95 (B3 E3+E4 B3)ia95 | "); //measures 24-27 - PAGE 2
      bass.add("(B3+F4+B4)qa95 F4ia95 (B3+F4+B4)qa95 (F4 B3+B4 F4)ia95 | (F3+C4+F4)qa95 C4ia95 (F3+C4+F4)qa95 (C4 F3+F4 C4)ia95 | (G3+D4+G4)qa100 D4ia100 (G3+D4+G4)qa100 (D4 G3+G4 D4)ia100 | (E3+B3+E4)qa100 B3ia100 (E3+B3+E4)qa100 (B3 E3+E4 B3)ia100 | "); //measures 28-31
      bass.add("(B3+F4+B4)qa88 F4ia88 (B3+F4+B4)qa88 (F4 B3+B4 F4)ia88 | (F3+C4+F4)qa70 C4ia70 (F3+C4+F4)qa70 (C4 F3+F4 C4)ia70 | (G3+D4+G4)qa68 D4ia68 (G3+D4+G4)qa68 (D4 G3+G4 D4)ia68 | (E3+B3+E4)qa70 B3ia70 (E3+B3+E4)qa70 (B3 E3+E4 B3)ia70 | "); //measures 32-35 
      bass.add("(B3+F4+B4)qa77 F4ia77 (B3+F4+B4)qa77 (F4 B3+B4 F4)ia77 | (F3+C4+F4)qa70 C4ia70 (F3+C4+F4)qa70 (C4 F3+F4 C4)ia70 | (G3+D4+G4)qa68 D4ia68 (G3+D4+G4)qa68 (D4 G3+G4 D4)ia68 | (E3+B3+E4)qa70 B3ia70 (E3+B3+E4)qa70 (B3 E3+E4 B3)ia70 | "); //measures 36-39
      bass.add("(B3+F4+B4)qa66 F4ia66 (B3+F4+B4)qa66 (F4 B3+B4 F4)ia66 | (F3+C4+F4)qa73 C4ia73 (F3+C4+F4)qa73 (C4 F3+F4 C4)ia73 | (G3+D4+G4)qa77 D4ia77 (G3+D4+G4)qa77 (D4 G3+G4 D4)ia77 | (E3+B3+E4)qa73 B3ia73 (E3+B3+E4)qa73 (B3 E3+E4 B3)ia73 | (B3+F4+B4)qa77 F4ia77 (B3+F4+B4)qa77 (F4 B3+B4 F4)ia77 | "); //measures 40-44
      bass.add("(F3+C4+F4)qa73 C4ia73 (F3+C4+F4)qa73 (C4 F3+F4 C4)ia73 | (G3+D4+G4)qa90 D4ia90 (G3+D4+G4)qa90 (D4 G3+G4 D4)ia90 | (E3+B3+E4)qa76 B3ia76 (E3+B3+E4)qa76 (B3 E3+E4 B3)ia76 | (B3+F4+B4)qa75 F4ia75 (B3+F4+B4)qa75 (F4 B3+B4 F4)ia75 | "); //measures 45-48 - PAGE 3
      bass.add("(F3+C4+F4 C4)ia40 (F3+C4+F4 C4)ia45 (F3+C4+F4 C4)ia50 (F3+C4+F4 C4)ia55 | (F3+C4+F4)qa60 (F3+C4+F4)qa55 Rh | (G4+D5+G5)qa47 D5ia47 G5ha47 Ri | (E4+B4+E5)qa53 B4ia53 E5ha53 Ri | "); //measures 49-52
      bass.add("(B4+F5+B5)qa53d127 F5ia53a127 B5ha53d127 Ri | (F4+C5+F5)qa60d127 C5ia60d127 F5ha60d127 Ri | (G3+D4+G4)qa63d127 D4ia63d127 G4ha63d127 Ri | (E3+B3+E4)qa67d127 B3ia67d127 E4ha67d127 Ri | (B3+F4+B4)qa68d127 F4ia68d127 (B3+F4+B4)qa68d127 (F4 B3+B4 F4)ia68d127 | "); //measures 53-57
      bass.add("(F3+C4+F4 C4)ia80 (F3+C4+F4 C4)ia80 (F3+C4+F4 C4)ia80 (F3+C4+F4 C4)ia80 | (G3+D4+G4)qa87 D4ia87 (G3+D4+G4)qa87 (D4 G3+G4 D4)ia87 | (E3+B3+E4)qa80 B3ia80 (E3+B3+E4)qa80 (B3 E3+E4 B3)ia80 | (B3+F4+B4)qa79 F4ia79 (B3+F4+B4)qa79 (F4 B3+B4 F4)ia79 | "); //measures 58-61 
      bass.add("(F3+C4+F4)qa87 C4ia87 (F3+C4+F4)qa87 (C4 F3+F4 C4)ia87 | (G3+D4+G4)qa82 D4ia82 (G3+D4+G4)qa82 (D4 G3+G4 D4)ia82 | (E3+B3+E4)qa84 B3ia84 (E3+B3+E4)qa84 (B3 E3+E4 B3)ia84 | (B3+F4+B4)qa81 F4ia81 (B3+F4+B4)qa81 (F4 B3+B4 F4)ia81 | "); //measures 62-65 
      bass.add("(F3+C4+F4)qa86 C4ia86 (F3+C4+F4)qa86 (C4 F3+F4 C4)ia86 | (G3+D4+G4)qa77 D4ia77 (G3+D4+G4)qa77 (D4 G3+G4 D4)ia77 | (E3+B3+E4)qa75 B3ia75 (E3+B3+E4)qa75 (B3 E3+E4 B3)ia75 | (B3+F4+B4)qa73 F4ia73 (B3+F4+B4)qa73 (F4 B3+B4 F4)ia73 | "); //measures 66-69 - PAGE 4
      bass.add("(F3+C4+F4)qa71 C4ia71 (F3+C4+F4)qa71 (C4 F3+F4 C4)ia71 | (G3+D4+G4)qa70 D4ia70 (G3+D4+G4)qa70 (D4 G3+G4 D4)ia70 | (E3+B3+E4)qa78 B3ia78 (E3+B3+E4)qa78 (B3 E3+E4 B3)ia78 | (B3+F4+B4)qa78 F4ia78 (B3+F4+B4)qa78 (F4 B3+B4 F4)ia78 | "); //measures 70-73
      bass.add("(F3+C4+F4)qa87 C4ia87 (F3+C4+F4)qa87 (C4 F3+F4 C4)ia87 | (G3+D4+G4)q.a99 (G3+D4+G4)ia99 (B3+F4+B4)qa99 (B3+F4+B4)qa99 | (G3+D4+G4)qa106 (G3+D4+G4)qa106 (G3+D4+G4)ha106 | G2qa127d50 Rqqq | Rw | "); //measures 74-77 

    Pattern ladybug = new Pattern("KEY:Bmaj T" + ladybugTempo);
      ladybug.add(tremble);
      ladybug.add(bass);

    Player player = new Player();
      player.play(ladybug);
  }
  public void playRain() 
  {

  }
  
  //TO STRING
  public String toString()
  {
    // return "Miraculous Ladybug";
    return "Miraculous";
  }
}
