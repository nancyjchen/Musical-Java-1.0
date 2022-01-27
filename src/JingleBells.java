import org.jfugue.player.Player;
import org.jfugue.pattern.Pattern;

public class JingleBells 
{
  //INSTANCE VARIABLES
  private static String instrument; 
  private static double playbackSpeed; 
  private int origTempo;
  private int brilTempo;
  private int andaTempo;
  private static String[] subSongList = {"Jingle Bells - Original", "Var. I - Brillante"};
  
  //ACCESSORS
  public static String getInstrument() {return instrument;}
  public static double getPlaybackSpeed() {return playbackSpeed;}
  public static String[] getSubSongList() {return subSongList;}
  
  //CONSTRUCTORS
  public JingleBells()
  {
    instrument = "Piano";
    playbackSpeed = 1;
    origTempo = 105;
    brilTempo = 80;
    andaTempo = 71;
  }
  public JingleBells(String i, double pbs)
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
    origTempo = (int) Math.round(105 * playbackSpeed);
    brilTempo = (int) Math.round(105 * playbackSpeed);
    andaTempo = (int) Math.round(71 * playbackSpeed);
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
  public void playOriginal() //Measures 1-32
  {
    Pattern tremble = new Pattern("V0 I[" + instrument + "] (C5 A5 G5 F5)ia47d25 | C5q.a47d25 (C5 C5)sa47d25 | (C5 A5 G5 F5)ia50d25 | D5ha50d25 | (D5 Bb5 A5 G5)ia53d25 | E5ha53d25 | (C6 C6 Bb5 G5)ia50d25 | A5ha50d25 | (C5 A5 G5 F5)ia57d25 |"); //measures 1-9
      tremble.add("C5q.a57d25 (C5 C5)sa57d25 | (C5 A5 G5 F5)ia60d25 | D5ha65d25 | (D5 Bb A5 G5)ia70d50 | (C6 C6 C6 C6)ia85d127 | D6ia83d25 C6ia80d25 Bb5ia77d25 G5ia75d25 | F5qa70d25 C6qa100d15 | (A5 A5)ia87d127 A5qa87d50 | (A5 A5)ia87d127 A5qa87d50 | "); //measures 10-18
      tremble.add("(A5 C6)ia89d25 (F5i. G5s)a85d25 | A5ha88d25 | (B5 B5 B5 B5)ia90d50 | (B5 A5 A5)ia87d25 (A5 A5)sa85d25 | (A5 G5)ia83d25 (G5 A5)ia85d25 | G5qa90d127 C6qa127d15 | (A5 A5)ia107d127 A5qa107d50 | (A5 A5)ia110d127 A5qa110d50 | (A5 C6)ia105d25 (F5i. G5s)a103d25 | A5ha107d127 |"); //measures 19-28
      tremble.add("(Bb5 Bb5 Bb5 Bb5)ia115d127 | (Bb5 A5 A5)ia110d50 (A5 A5)sa113d50 | (C6 Bb5 G5 E5)ia110d25 | G5ha100d75 F5qa95d100 | Rh | "); //measures 29-32
    Pattern alto = new Pattern("V1 I[" + instrument + "] Rh | Rh | Rh | Rh | Rh | Rh | E5ha60d50 | Rh | Rh |"); //measures 1-9
      alto.add("Rh | Rh | Rh | Rh | Rh | E5ha75d50 | Rh | Rh | Rh |"); //measures 10-18
      alto.add("(C5 C5)qa90d25 | Rh | Rh | Rh | Rh | Rh | Rh | Rh | (C5 C5)qa103d50 | Rh |"); //measures 19-28
      alto.add("Rh | Rh | Rh | (C5h F5q)a97d50 | Rh |"); //measures 29-32
    Pattern bass = new Pattern("V2 I[" + instrument + "] (F4+A4)ha42d25 | (C4+F4+A4)ha42d25 | (F4+A4)ha45d25 | (Bb3+F4)ha45d25 | (Bb4+F4+G4+D5)ha48d25 | (C4+G4+Bb4)ha48d25 | (C4+G4+Bb4)ha48d25 | (F4+A4+C5+F5)ha45d25 | (F4+A4)ha52d25 |");  //measures 1-9
      bass.add("(C4+F4+A4)ha52d25 | (F4+A4)ha55d25 | (Bb4+F4)ha60d25 | (Bb4+F4+G4+D5)ha65d25 | (C4+G4+Bb4)ha80d25 | (C4+G4+Bb4)ha83d25 | (F4+A4+C5)qa65d25 C4sa95d127 G4sa82d120 Bbsa79d115 E5sa76d110 | (F4+C5+F5)qa82d100 (F4+C5+F5)qa82d25 | (F4+C5+F5)qa82d100 (F4+C5+F5)qa82d25 |"); //measures 10-18
      bass.add("(F4+A4)ha84d25 | (F4+C5+D5)a83d125 | (B3+F4+D5)a85d127 (B3+F4+D5)a85d50 | (F4+C5+F5)a82d127 (F4+C5+F5)d81d50 | (G4+B4+F5)a78d127 (G4+B4+F5)a80d50 | (G4+B4+E5)a85d127 C4a122d50 | (F4+C5+F5)a105d127 (F4+C5+F5)d105d50 | (F4+A4)ha100d25 | (F4+C5+F5)ha102d127 |"); //measures 19-28
      bass.add("(B3+F4+D5)a110d127 (B3+F4+D5)a110d50 | (F4+C5+F5)a105d127 (F4+C5+F5)a108d50 | (G4+B4+E5)a105d127 (G4+B4+E5)a105d50 | (F4+C5)h.a97d127 | Rh |"); //measures 29-32

    Pattern original = new Pattern("KEY:Fmaj T" + origTempo);
      original.add(tremble);
      original.add(alto);
      original.add(bass);

    Player player = new Player();
      player.play(original);
  }
  public void playBrillante()
  {
    Pattern trembleIntro = new Pattern("C#5s*a47d50 Bn4s*a47d50 Cn5s*ia50d50 |"); //measure 33
    Pattern trembleRepeat = new Pattern("KEY:Fmaj | (A5 C5)s*a50d127 A5s*a53d127 (G5 C5)s*a50d127 G5s*a53d127 (F5 C5)s*a50d59 F5s*a53d50 | C5ia65d127 (A5 C5)s*a60d127 A5s*a63d127 (G5 C5)s*a60d127 G5s*a63d127 (F5 C5)s*a60 F5s*a63 | D5ia68d127 (B5 D5)s*a63d127 B5s*a66d127 (A5 D5)s*a63d127 A5s*a66d127 (G5 D5)s*a63d50 G5s*a66 | E5ia70d127 (C6 E5)s*a65d127 C6s*a68d127 (B5 E5)s*a65d127 B5s*a68d127 (G5 E5)s*a65d50 G5s*a68d50 | A5ia73d127 (E5 G5)s*a65d127 Eb5s*a68d127 (F#5 D5)s*a61d127 Fn5s*a65d127 (C#5 En5)s*a58d50 Bn5s*a60d50 | "); //measures 34-38
      trembleRepeat.add("C5ia70d127 (A5 C5)s*a65d127 A5s*a68d127 (G5 C5)s*a65d127 G5s*a68d127 (F5 C5)s*a65 F5s*a68 | C5ia68d127 (A5 C5)s*a63d127 A5s*a68d127 (G5 C5)s*a65d127 G5s*a68d127 (F5 C5)s*a65 F5s*a68d127 | D5ia75d127 (B5 D5)s*a70d127 B5s*a73d127 (A5 D5)s*a70d127 A5s*a73d127 (G5 D5)s*a70 G5s*a73 | (C6 E5)s*a75d127 C6s*a78d127 (C7 C6)s*a75d127 C7s*a78d127 (C8 C7)s*a73d127 C8s*a80d127 (C7 C6)s*a75 E5s*a78 |"); //measures 39-42
      trembleRepeat.add("(D6 E5)s*a78d127 D6s*a83d127 (C6 E5)s*a78d127 C6s*a83d127 (B5 E5)s*a78d127 B5s*a83d127 (G5 E5)s*a78 G5s*a83 | Fqa85d127 (B4 E5 G5 C6 C7)s*5:4a127d75 | (A6 A5)s*a93d127 A6s*a100d127 (A5 A6)s*a93d127 A6s*a100d127 A7qa110d127 | (A6 A5)s*a93d127 A6s*a100d127 (A5 A6)s*a93d127 A6s*a100d127 A7qd110d127 | (A6 A5)s*d93 A6s*d100d127 (C6 C7)s*a90d127 C6s*a95d127 (F5+F6)i.a85d127 (G5+G6)sa90d127 |"); //measures 43-47
      trembleRepeat.add("(A5+A6)qa95d127 (A6+A7)qa100d127 | (B5 D5)s*a80d127 B5s*a85d127 (B6 B5)s*a85d127 B6s*a88d127 (B7 B6)s*a85d127 B7s*a88d127 (B6 B5)s*a85d127 D5s*a88d127 | (B5 B6)s*a85d127 B5s*a90d127 (A6 A5)s*a85d127 A6s*a90d127 (A5 A6)s*a85d127 A5s*a90d127 (A5 A6)sa88d127 | (A5+A6 G5+G6)ia85d127 (G5+G6 A5+A6)ia95d127 | (G5+G6 C7+C8)qa93d127 |"); //measures 48-52 
      trembleRepeat.add("(A6 A5)s*a103d127 A6s*a110d127 (A5 A6)s*a103d127 A6s*a110d127 A7qa115d127 | (A6 A5)s*a103d127 A6s*a110d127 (A5 A6)s*a103d127 A6s*a110d127 A7qa115d127 | (A6 A5)s*a98d127 A6s*a103d127 (C6 C7)s*a95d127 C6s*a98d127 (F5+F6)i.a100d127 (G5+G6)sa127d127 | (A5+A6)qa85d127 (A6+A7)qa95d127 | (B5 D5)s*a83d127 B5s*a88d127 (B6 B5)s*a80d127 B6s*a85d127 (B7 B6)s*a75d127 B7s*a80d127 (B6 B5)s*a70d127 D5s*a75d127 | (B5 B6)s*a60d127 B5s*a65d127 (A6 A5)s*a55d127 A6s*a60d127 (A5 A6)s*a50 A5s*a55d127 (A5 A6)sa53d127 |"); //measures 53-58
    Pattern trembleEnd1 = new Pattern("KEY:Fmaj (C6+C7 C6+C7)ia75d127 (B5+B6)ia70d127 (G5+G6)ia65d127 | (F5+F6)i.a60d127 (C#5 Bn4 C#5)s*a50d127 | "); //measures 59-60
    Pattern trembleEnd2 = new Pattern("KEY:Fmaj (C6+C7 B5+B6)ia80d127 (G5+G6)ia78d127 (E5+E6)ia76d127 | (G5+G6)ha78d127 (F5+F6)qa80d127 | Rh |"); //measures 61-62

    Pattern bassIntro = new Pattern("KEY:Fmaj F3ia42d50- |");  //measure 33
    Pattern bassRepeat = new Pattern("KEY:Fmaj F3-qa45d127+C4q+A4qa45d127 Ri F3ia45d50- | (F3-qa+C4q+A4q)a60d127 Ri F3ia55d50 | (B3+F4+G4+D5)qa63d127 Ri B3ia59d50 | (C4+G4+B4)qa65d127 Ri C4ia60d50 | (F3 C4 A4)q*a68d127 Ri C4ia55d50 |"); //measures 34-38
      bassRepeat.add("(F3+C4+A4)qa65d127 Ri F3ia60d50- | F3-q+C4q+A4qa63d127 Ri F3ia60d127 | (B3+F4+G4+D5)qa70d127 Ri B3a68d50 | (C4+G4+B4)qa70d127a70d50 Ri G3i |"); //measures 39-42
      bassRepeat.add("(C4+G4+B4)qa73d127 Ri C4ia78d50 | (F3+C4+A4)qa80d127 (C3 E4)ia122d127 | (F3 C4+A4 C4 F4+A4+F5)ia88d127 | (F3 C4+A4 C4 F4+A4+F5)ia88d127 | (F4 C4+F4+A4 C3 C4+F4+A4)ia88d75 |"); //measures 43-47
      bassRepeat.add("(F3 C4+A4)ia90d127 (C5 Bn)s*a80d127 Bbs*a85d127 (A4 Ab4)s*a70d127 G4s*a75d127 | (B3 F4+B4+D5 F3 D4+B4)ia70d127 | (C4 F5+A5+F5 F3 C4+A4+C5)ia75d127 | (G3 G4+B4+F5 D4 G4+B4+F5)ia80d127 | (G3 B4+C5+E5 C4 G4+B4+E5)ia83d127 | "); //measures 48-52
      bassRepeat.add("(F3 C4+A4 C4 F4+A4+F5)ia93d127 | (F3 C4+A4 C4 F4+A4+F5)ia93d127 | (F3 C4+F4+A4 C3 C4+F4+A4)ia88d127 | (F3 C4+A4)ia88d127 (C5 Bn)s*a70d127 Bbs*a75d127 (A4 Ab4)s*a65d127 G4s*a75d127 | (B3 F4+B4+D5 F3 D4+B4)ia73d127 | (C4 F4+A4+F5 F3 C4+A4+C5)ia60d127 |"); //measures 53-58
    Pattern bassEnd1 = new Pattern("KEY:Fmaj (G3 G4+B4+E5 C4 G4+B4+E5)ia70d127 | F3ia55d127 (C4+F4+A4)qa45d127 Ri |"); //measures 59-60
    Pattern bassEnd2 = new Pattern("KEY:Fmaj (G3 G4+B4+E5 C4 G4+B4+E5)ia75d127 | (F3+C4+A4)h*a73d127 | Rh |"); //measures 61-62
    
    Pattern tremble = new Pattern("V0 I[" + instrument + "] ");
      tremble.add(trembleIntro);  
      tremble.add(trembleRepeat);
      tremble.add(trembleEnd1);
      tremble.add(trembleRepeat);
      tremble.add(trembleEnd2);    

    Pattern bass = new Pattern("V2 I[" + instrument + "] ");
      bass.add(bassIntro);  
      bass.add(bassRepeat);
      bass.add(bassEnd1);
      bass.add(bassRepeat);
      bass.add(bassEnd2);

    Pattern brillante = new Pattern("KEY:Fmaj T" + brilTempo);
      brillante.add(tremble);
      brillante.add(bass);

    Player player = new Player();
      player.play(brillante);
    // try
    // {
    //   RealtimePlayer rt = new RealtimePlayer(); 
    //     rt.play(brillante);
    // } catch(MidiUnavailableException e) {}
  }
  public void playAndante()
  {
    Pattern tremble = new Pattern("V0 I[" + instrument + "] "); //measures 67-75
      tremble.add(""); //measures 76-82
      tremble.add(""); //measures 83-88
      tremble.add(""); //measures 89-94
      tremble.add(""); //measures 95-104

    Pattern alto = new Pattern("V1 I[" + instrument + "] "); //measures 67-75
      alto.add(""); //measures 76-82
      alto.add(""); //measures 83-88
      alto.add(""); //measures 89-94
      alto.add(""); //measures 95-104

    Pattern bass = new Pattern("V2 I[" + instrument + "] "); //measures 67-75
      bass.add(""); //measures 76-82
      bass.add(""); //measures 83-88
      bass.add(""); //measures 89-94
      bass.add(""); //measures 95-104

    Pattern andante = new Pattern("KEY:Emaj T" + andaTempo);
      andante.add(tremble);
      andante.add(alto);
      andante.add(bass);

    Player player = new Player();
      player.play(andante); 
  }

  //TO STRING
  public String toString()
  {
    // return "Jingle Bells";
    return "JingleBells";
  }
}
