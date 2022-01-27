import org.jfugue.player.Player;
import org.jfugue.pattern.Pattern;

public class DemonSlayer 
{
  //INSTANCE VARIABLES
  private static String instrument; 
  private static String[] nezuInstruments = {"Vibraphone", "Marimba", "Glockenspiel"};
  private static double playbackSpeed; 
  private int gureTempo;
  private int nezuTempo;
  private static String[] subSongList = {"Gurenge", "Nezuko's Theme [WIP]"};

  //ACCESSORS
  public static String getInstrument() {return instrument;}
  public static String[] getNezuInstrument() {return nezuInstruments;}
  public static double getPlaybackSpeed() {return playbackSpeed;}
  public static String[] getSubSongList() {return subSongList;}
  
  //CONSTRUCTORS
  public DemonSlayer()
  {
    instrument = "Piano";;
    playbackSpeed = 1;
    gureTempo = 135;
    nezuTempo = 140;
  }
  public DemonSlayer(String i, double pbs)
  {
    if(i.equals("Default"))
    {
      instrument = "Piano";
      nezuInstruments[0] = "Vibraphone";
      nezuInstruments[1] = "Xylophone";
      nezuInstruments[2] = "Glockenspiel";
    }
    else 
    {
      instrument = i; 
      for(int index = 0; index <= 2; index++)
        nezuInstruments[index] = instrument;
    }
    playbackSpeed = pbs;
    gureTempo = (int) Math.round(135 * playbackSpeed); //SET TEMPO
    nezuTempo = (int) Math.round(140 * playbackSpeed);
  }

  //MUTATORS
  public static void setInstrSpeed(String instru, double speed)
  {
    if(instru.equals("Default"))
    {
      instrument = "Piano";
      nezuInstruments[0] = "Vibraphone";
      nezuInstruments[1] = "Xylophone";
      nezuInstruments[2] = "Glockenspiel";
    }
    else 
    {
      instrument = instru; 
      for(int index = 0; index <= 2; index++)
        nezuInstruments[index] = instrument;
    }
    playbackSpeed = speed;
  }

  //METHODS
    /* DYNAMICS: pp - 27 	p - 47 	mp - 67 	mf - 87	f - 107	ff(sf) - 127 */ 
  public void playGurenge() // EASY VERSION
  {
    Pattern tremble = new Pattern("V0 I[" + instrument + "] (G6 F6)i.a87d127 G6ha87d127 Ri | (G6 F6)i.a90d127 G6ha90d127 Ri | (G6 F6)i.a87d127 E6q.a85d127d127 D6ia83d127 D6iha80d127 Ri B5qa85d127 D6ia90d127 E6ha95d127 Ri E6qa90d127 G6ia98d127 | A6ha107 Ri G6qa105 A6ia115 | B7i.a127 D6i.a125 E6i.a125 D6i.a125 E6qa126 | "); //m. 1-7
      tremble.add("(B5+E6)i.a120 (A5+D6)i.a115 (B5+E6)i.a120 (A5+D6)i.a115 (B5+E6)qa120 | (B5+E6)i.a115 (A5+D6)i.a110 (B5+E6)i.a115 (A5+D6)i.a110 (B5+E6)qa115 | (B5+E6)i.a110 (A5+D6)i.a105 (B5+E6)i.a110 (A5+D6)i.a105 (B5+E6)qa110 | (E6 G6)i.a90d127 F6qa95d127 (D6 E6)ia93d127 D6iha93d127 (A5 G5)ia85d127 (A5 C6)ia87d127 | B5ia83d127 E5qha78d127 Ri | "); //m. 8-13
      tremble.add("Ri E5ia75d127 (G5 A5)sa80d127 Rs B5i.a85d127 (A5 B5)ia83d127 D6ia88d127 | (E6 G6)i.a90d127 F6qa87d127 (D6 E6)ia85d127 D6iha85d127 (B6 A6)ia95d127 (B6 C7)ia90d127 | B6ia90d127 G6h.a92d127 G6ia88d127 | (F6 F6)i.a85d127 G6ia87d127 A6qa89d127 Ri G6ia85d127 | "); //m. 14-18
      tremble.add("(A6 G6)i.a90d127 (E6 G6)i.a88d127 B6i.a95d127 A6sa93d127 | Ri A7ia105d127 (A7 A7)ia100d127 | (A7 B7)i.a100d127 G6ia95d127 | (A6 G6)i.a95d127 (E6 G6)i.a90d127 D7qa100d127 | Ri A7ia105d127 (A7 A7)ia105d127 (A7 F7)i.a105d127 G6ia100d127 | (A6 G6)i.a95d127 E6qa90d127 (G6 B6 A6)ia97d127 | "); //m. 19-23 
      tremble.add("Rq (A6 B6)ia95d127 (A6 B6)ia97d127 (D7 B6)ia100d127 | A6i.a97d127 G6isha95d127 G6ia93d127 | (F6 F6)i.a90d127 G6ia93d127 A6qa96d127 Rq | (G6 F6)i.a100 G6ha103 Ri | (G6 F6)i.a100 G6ha103 Ri | (G6 F6)i.a100 E6q.a95 D6ia93 D6iha90 "); //m. 24-29
      tremble.add(" Ri B5qa88 D6ia93 | E6ha97 Ri E6qa95 G6ia100 | A6ha105 Ri G6qa107 A6ia117 | B6ia127 A5ia100 B5ia105 D6ia110 E6ia115 F6ia120 G6ia125 F6ia123 | Rq (D6 D6)qa100 B6qa110 | "); //m. 30-34
      tremble.add("(A6 B6)ia105 (D7 B6)ia108 A6ia106 (B6 B6)sa109 Ri G6ia108 | (A6 B6)ia111 (D7 B6)ia115 A6ia110 (B6 B6)sa103 Ri D6ia95 | D6ia90 (G6 G6)sa100 Ri D6ia95 (D6 G6)ia115 (A6 G6)ia103 | D7qa115 C7qa113 (B6 A6)i.a110 G6ia95 | "); //m. 35-38
      tremble.add("G6i.a98 G6qa105 (A6 B6 A6)ia107 | Rqi A6qa108 B6ia110 (D7 B6)ia114 | Ri. (A5+D6)i.a106 (B5+E6)i.a104 (A5+D6)i.a106 (B5+E6)qa104 | Rq (D6 D6)qa108 B6qa108 | (A6 B6)ia118 (D7 B6)ia105 A6ia100 (B6 B6)sa103 Ri G6ia99 | "); //m. 39-43
      tremble.add("(A6 B6)ia104 (D7 B6)ia108 A6ia106 (B6 G6)sa103 Ri G6ia100 | G6i.a104 A6i.a106 B6qa108 B6ia110 G7ia120 F7ia115 | Rq D7qa110 (B6 A6)i.a103 G6ia100 | G6q.a100 G6qa105 A6ia108 (B6 A6)ia104 | Rq. A6ia109 A6qa111 B6qa116 | "); //m. 44-48
      tremble.add("(B5+E6)i.a118 (A5+D6)i.a116 (B5+E6)i.a120 (A5+D6)i.a118 (B5+E6)ia122 (B5+E6)ia126 | Rq | "); //m. 49

    Pattern bass = new Pattern("V1 I[" + instrument + "] (C4 E4)i.a77d127 G4ha77d127 Ri | (D4 F4)i.a80d127 A4ha80d127 Ri | (E4 G4)i.a77d127 B4ha77d127 Ri | (B4 D4)i.a97d127 F4ha97d127 Ri | (C4 D4)i.a97d127 G5ha97d127 Ri | (D3+D4)wa97 | (A3+E4 B3+D4)i.a117 (A3+E4 B3+D4)i.a117 (A3+E4)qa117 | "); //m. 1-7
      bass.add("(A3+E4 B3+D4)i.a110 (A3+E4 B3+D4)i.a110 (A3+E4)qa110 | (A3+E4 B3+D4)i.a105 (A3+E4 B3+D4)i.a105 (A3+E4)qa105 | (A3+E4 B3+D4)i.a100 (A3+E4 B3+D4)i.a100 (A3+E4)qa100 | (E4 G4)i.a80d127 D5ha80d127 Ri | (D4 F4)i.a80d127 G4ha80d127 Ri | (D4 F4)i.a73d127 A4ha73d127 Ri | "); //m. 8-13
      bass.add("(D4 F4)i.a65d127 A4ha65d127 Ri | (C4 G4)i.a80d127 D5ha80d127 Ri | (D4 F4)i.a80d127 G4ha80d127 Ri | (C4 F4)i.a80d127 G4ha80d127 Ri | (D4 F4)i.a75d127 A4ha75d127 Ri | "); //m. 14-18
      bass.add("(E4 G4)i.a80d127 D5ha80d127 Ri | (D4 F4)i.a95d127 A4ha95d127 Ri | (C4 G4)i.a85d127 D5ha85d127 Ri | (D4 F4)i.a95d127 G4ha95d127 Ri | (E4 G4)i.a85d127 D5ha85d127 Ri | "); //m. 19-23
      bass.add("(D4 F4)i.a85d127 G4ha85d127 Ri | (C4 F4)i.a87d127 G4ha87d127 Ri | (D4 F4)i.a80d127 A4ha80d127 Ri | (C4+E4+G4)wa90 | (D4+F4+A4)wa90 | (E4+G4+B4)wa90 | "); //m. 24-29
      bass.add("(B4+D4+F4)wa78 | (C3+C4)qa80 (C3+C4)qa86 (C3+C4)qa92 (C3+C4)qa98 | (C3+C4)qa104 (C3+C4)qa110 (C3+C4)qa117 (C3+C4)qa100 | (C3+C4 C3+C4)ia90 (C3+C4 C3+C4)ia90 (C3+C4 C3+C4)ia90 (C3+C4)a90 (C3+C4)ia90d50 | Rw | "); //m. 30-34
      bass.add("(C3+G3+C4)i.a85 (C3+G3+C4)i.a85 (C3+G3+C4)ia85 | (D3+A3+D4)i.a91 (D3+A3+D4)i.a91 (D3+A3+D4)ia91 | (E3+B3+E4)i.a70 (E3+B3+E4)i.a70 (E3+B3+E4)ia70 | (B2+G3+B3)i.a95 (B2+G3+B3)i.a95 (B2+G3+B3)ia95 | "); //m. 35-38
      bass.add("(C3+G3+C4)i.a88 (C3+G3+C4)i.a88 (C3+G3+C4)ia88 | (D#3+B3+D#4)i.a98 (D#3+B3+D#4)i.a98 (D#3+B3+D#4)ia98 | (A3+A4)i.a96 (B3+B4)i.a96 (A3+A4)i.a96 (B3+B4)i.a96 (A3+A4)qa96 | (B2+B3)i.a98 (A2+A3)i.a98 (B2+B3)i.a98 (A2+A3)i.a98 (B2+B3)ia98 | (C3+E3+G3+C4)q.a96 (C3+E3+G3+C4)q.a96 (C3+E3+G3+C4)qa96 | "); //m. 39-43
      bass.add("(D3+F3+A3+D4)q.a94 (D3+F3+A3+D4)q.a94 (D3+F3+A3+D4)qa94 | (D#3+F3+B3+D#4)q.a94 (D#3+F3+B3+D#4)q.a94 (D#3+F3+B3+D#4)qa94 | (E3+G3+B3+E4)q.a100 (E3+G3+B3+E4)q.a100 (E3+G3+B3+E4)qa100 | (C3+C4 C3+C4)ia100 (C3+C4 C3+C4)ia100 (C3+C4 C3+C4)ia100 (C3+C4 C3+C4)ia100 | (D3+D4)qa99d50 Rqh | "); //m. 44-48
      bass.add("(E3+E4 D3+D4)i.a108 (E3+E4 D3+D4)i.a100 (E3+E4 E3+E4)ia106 | Rq |"); //m. 49

    Pattern gurenge = new Pattern("KEY:Gmaj T" + gureTempo);
      gurenge.add(tremble);
      gurenge.add(bass);

    Player player = new Player();
     player.play(gurenge); 
  }
  public void playNezuko() //13 PAGES TOTAL ➡ WILL ADD FINISHING TOUCHES FOR VERSION 2.0.0 [NOT 100% COMPLETE - ONLY 30% COMPLETE]
  { 
    Pattern vibraphone = new Pattern("V0 I[" + nezuInstruments[0] + "] F6 G6 | A6h G6 F6 | E6h E6q F6q G6h F6q E6q D6h F6q G6q | A6h G6q F6q | G6h E6h | D6h E6h | F6h | G6h | "); //p. 1 
      vibraphone.add("A6h G6q F6q | E6h E6q F6q | G6h F6q E6q | D6h F6q G6q | A6h G6q F6q | G6h C7h | D7h (C7+E7)h | D6h (A6+D7)h | ");
      vibraphone.add("A6h (G6 F6)q | E6h (E6 F6)q | G6h (F6 E6)q | "); //p. 2 
      vibraphone.add("D6h (F6 G6)q | A6h (G6 F6)q | G6h C7h | ");
      vibraphone.add("A6h E6h | F6h G6h | A6h (G6 F6+F7)q | ");
      vibraphone.add("(E6+E7)h (E6+E7 F6+F7)q | G6h (F6+F7 E6+E7)q | (D6+D7)h (F6+F7 G6)q | "); //p. 3
      vibraphone.add("A6h (G6 F6+F7)q | G6h C7h | D7w | ");
      vibraphone.add("Rw | Rw | (D6 E6 F6)i* (A6 D6 F6)i* (E6 F6 A6)i* (B6 D7 E7)i* | Rw | ");
      vibraphone.add("Rhq (D6 E6)i | (F6 G6)q (E6 C6)q | (F6 A6)q G6q (D6 E6)i | (F6 G6)q (E6 C6)q | (B5 A6)q G6q (D6 E6)i | (F6 G6)q (E6 C6)q | (F6 A6)q G6q (D6 E6)i | (F6 G6)q (E6 C6)q | "); //p. 4
      vibraphone.add("D6h. (D6 E6)i | (F6 G6)q (E6 C6)q | (F6 A6)q G6q (D6 E6)i | (F6 G6)q (E6 C6)q | B5q A6q G6q (D6 E6)i | ");
      vibraphone.add("(F6 G6)q (E6 C6)q | (F6 A6)q G6q (D6 E6)i | (F6 G6)q (E6 D6)q | D6h (F6 G6)q | ");
      vibraphone.add("A6hi (D6+D7)q | (A6 D7)h | (C7 B6)q G6h | A6w | A6hi (D6+D7)q | "); //p. 5
      vibraphone.add("G6h C7h | B6h. C7q | A6h (F6+F7)q G6q | A6h. (D6+D7)q | ");
      vibraphone.add("A6h D7h | C7q B6q G6h | A6h (D6+D7 E6+E7)q | ");
      vibraphone.add("(F6 G6)q (E6 C6)q | (F6 A6)q G6q (D6+D7 E6+E7)i | (F6 G6)q (E6 C6)q | "); //p. 6
      vibraphone.add("(B5 A6)q (G6 C7)q | Rw | ");
      vibraphone.add("Rh (F6+F7 G6)q | (A6+D7)h (G6 F6+F7)q | ");
      vibraphone.add("(E6+B6+E7)h (E6+B6+E7 F6+F7)q | (G6+C7+E7)h (F6+A6+F7 E6+G6+E7)q | "); //p. 7
      vibraphone.add("(D6+F6+D7)h (F6+A6+C7+F7)q G6q | (A6+D7)h G6q (F6+F7)q | ");
      vibraphone.add("G5+B6+D7)h (E6+G6+B6+E7)h | (D6+F6+F7)h (E6+G#6+E7)h | ");
      vibraphone.add("(F6+A6+F7)h (G6+C#7)h | (A6+C7)h (G6+C7)q (F6+F7)q | "); //p. 8
      vibraphone.add("(E6+G6+C7+E7)h (E6+g6+C7+E7)q (F6+F7)q | (G6+B6+Eb7)h (F6+F7)q (Eb6+E7)q | ");
      vibraphone.add("(D6+G6+Bn6+D7)h (F6+F7)q G6q | (A6+D7)h G6q (F6+F7)q | ");
      vibraphone.add("(G6+D7)h C7h | D7w | "); //p. 9
      vibraphone.add("(F#5+A5+D6+F#6)h. (D5+D6)i (E5+E6)i | (F5+A5+D7+F7)q (G6+G7)q (E5+G5+C6+E6)q (E5+C6)q | (F5+D6+F6)q (A5+A6)q (G5+C6+G6)q (D5+D6 E5+C6+E6)i | (F5+B5+D6+F6)q (G5+G6)q (E5+G5+C6+E6)q C6q | ");
      vibraphone.add("(B4+D5+F5+B5)q (A5+D6+A6)q (G5+D6+E6+G6)q (D6+D7 E6+E7)i | (F5+A5+D6+F6)q (G5+G6)q (D5+G5+C6+E6)q (E5+C6)q | (F5+D6+F6)q (A5+A6)q (F5+C6+G6)q (D5+D6 E5+C6+E6)i | (F5+B5+D6+F6)q (G5+G6)q (E5+G5+C6+E6)q (C5+C6)q (D5+G5+A5+D6)h+Rq_D5i*_A4i*_E4i* F#5 (D5+D6 E5+E6)i | ");
      vibraphone.add("(F5+A5+D6+F6)q (D6+G6)q (G5+C6+E6)q (A5+C6)q | (A5+D6+F6)q A6q (G5+C6+G6)q (G5+D6 E6)i | (G5+B5+D6+F6)q (G5+B5+D6+G6)q (E5+G5+C6+E6)q (G5+C6)q | (D5+F5+B5)q (A6+D6+A7)q (G5+C#6+G6)q (D6 E6)i | "); //p. 10
      vibraphone.add("(A5+D6+F6)q (D6 G6)q (G5+C6+E6)q (G5+C6)q | (A5+C6+F6)q (C6+A6)q (G5+Bn5+D6+G6)q (Bn5+D6 E6)i | (A6+D6+F6)q (A5+D6+G6)q (G5+C6+E6)q (G5+C6)q | (D5+G5+A5+D6)h (F6+F7 G6)q | ");
      vibraphone.add("(A6+D7)h G6q (F6+F7)q | (E6+G6+C7+E7)h (E6+E7)q (F6+F7)q | (G6+C7)h (F6+F7)q (E6+E7)q | ");
      vibraphone.add("(D6+F6+D7)h (F6+F7)q G6q | (A6+D7)h G6q (F6+F7)q | (G6+C7)h C7h | "); //p. 11
      vibraphone.add("(A6+C7)h (E6+G6+C7+E7)h | (F6+A6+F7)h (G6+A6+C7)h | (A6+D7)h (G6+D7)q (F6+D7+F7)q | ");
      vibraphone.add("(E6+G6+C7+E7)h (E6+G6+C7+E7)q (F6+G6+C7+F7)q | (G6+C#7+E7)h (F6+A6+C7+F7)q (E6+E7)q | (D6+F6+A6+D7)h (F6+A6+C7+F7)q G6q | ");
      vibraphone.add("(A6+D7)h (A6+D7)q (F6+F7)q | (G5+C7+E7)h (C7+E7)h | Rw | (E5+A5 A4 E5)i* (A5 E5 A5)i* (E6 A5 E6)i* (A6 E6 A6)i* | "); //p. 12
      vibraphone.add("(A5+E6 A5 E6)i* (A6 E6 A5)i* (E6 A5 E5)i* (A5 E5 A4)i* | (Bn4+D5+G5)h (F6+F7)q G6q | (A6+D7+F7)h G6q (F6+F7)q | (G6+C7+E7)h (C7+E7)h | ");
      vibraphone.add("Rw | D6q E6q D6q A5q | D7w. | Rq | "); //p. 13

    Pattern xylophone = new Pattern("V1 I[" + nezuInstruments[1] + "] "); //p. 1
      xylophone.add(""); //p. 2
      xylophone.add(""); //p. 3
      xylophone.add(""); //p. 4
      xylophone.add(""); //p. 5
      xylophone.add(""); //p. 6
      xylophone.add(""); //p. 7
      xylophone.add(""); //p. 8
      xylophone.add(""); //p. 9
      xylophone.add(""); //p. 10
      xylophone.add(""); //p. 11
      xylophone.add(""); //p. 12
      xylophone.add(""); //p. 13

    Pattern glockenspiel = new Pattern("V2 I[" + nezuInstruments[2] + "] "); //p. 1
      glockenspiel.add(""); //p. 2
      glockenspiel.add(""); //p. 3
      glockenspiel.add(""); //p. 4
      glockenspiel.add(""); //p. 5
      glockenspiel.add(""); //p. 6
      glockenspiel.add(""); //p. 7
      glockenspiel.add(""); //p. 8
      glockenspiel.add(""); //p. 9
      glockenspiel.add(""); //p. 10
      glockenspiel.add(""); //p. 11
      glockenspiel.add(""); //p. 12
      glockenspiel.add(""); //p. 13 

    Pattern nezuko = new Pattern("KEY:Fmaj T" + nezuTempo);
      nezuko.add(vibraphone);
      nezuko.add(xylophone);
      nezuko.add(glockenspiel);

    Player player = new Player();
      player.play(nezuko); 
  }

  //TO STRING
  public String toString()
  {
    // return "Demon Slayer";
    return "DemonSlayer";
  }
}
