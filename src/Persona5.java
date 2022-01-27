import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

public class Persona5 
{
  //INSTANCE VARIABLES
  private static String instrument; 
  private static double playbackSpeed; 
  private int liWCTempo;
  private static String[] subSongList = {"Life Will Change"};
  
  //ACCESSORS
  public static String getInstrument() {return instrument;}
  public static double getPlaybackSpeed() {return playbackSpeed;}
  public static String[] getSubSongList() {return subSongList;}
  
  //CONSTRUCTORS
  public Persona5()
  {
    instrument = "Piano";
    playbackSpeed = 1;
    liWCTempo = 132;
  }
  public Persona5(String i, double pbs)
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
    liWCTempo = (int) Math.round(132 * playbackSpeed);
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
  public void playLifeWillChange()
  {
    Pattern trembleIntro1 = new Pattern("KEY:Ebmaj F5sa47 Rs (F5 F5)sa48 Ri F5sa49 Rs (F5 F5)sa50 Ri F5sa51 Rs (F5 F5)sa52 | Ri F5sa54 Rs (F5 F5)sa56 Ri F5qa58 Gbqa60 | "); //measures 1-2
    Pattern trembleIntro2 = new Pattern("KEY:Ebmaj F5sa67 Rs (F5 F5)sa68 Ri F5sa69 Rs (F5 F5)sa70 Ri F5sa71 Rs (F5 F5)sa72 | Ri F5sa74 Rs (F5 F5)sa76 Ri F5qa78 Gbqa80 | F5sa81 Rs (F5 F5)sa82 Ri F5sa83 Rs (F5 F5)sa84 Ri F5sa85 Rs (F5 F5)sa87 | Ri F5sa89 Rs (F5 F5)sa91 Ri F5qa93 Gbqa95 | F5sa84 Rsa85 (F5 F5)sa86 Ri F5sa87 Rs (F5 F5)sa88 Ri F5sa89 Rs (F5 F5)sa91 | Ri F5sa93 Rs (F5 F5)sa95 Ri F5qa97 Gbqa99 | F5sa90 Rs (F5 F5)sa92 Ri F5sa94 Rs (F5 F5)sa96 Ri F5sa98 Rs (F5 F5)sa100 | Ri F5sa104 Rs (F5)sa108 (F5)sa103 A4ia93 (A4 B4)i.a87 F4ia87 | "); //measures 3-10
    Pattern trembleRepeat = new Pattern("F4q.a92 A4ia97 (A4 B4)i.a102 C5qa107 | E5qa112d50 F5qa117 A5qa119d50 B5q.a124 | B5ia120 A5qa116 F5qa112 Ri | Rq. F5ia107 (E5 F5)i.a109 A5qa111 | "); //measures 11-14
      trembleRepeat.add(" A5qa113d50 F5ia115 (E5 F5)i.a117 B5qa119 | B5qa121d50 F5ia123 (E5 F5)i.a125 C6qa127 | E6qa120d50 B5hia110 | F5ha107 Enqa96 Ri C6qa87 | "); //measures 15-18
      trembleRepeat.add(" (A5 B5 F5)ia85 A5q.a90 Ri | Rq (B4 C5 B4)sa88 A4ia88 A4sa90 F4qa107 C6qa105 | (A5 B5 F5)ia95 A5q.a95 Ri | Rq (B4 A4 B4)sa106 C5i B4sa106 C5ia106 E5ia106 C6qa106 | "); //measures 19-22
      trembleRepeat.add(" (A5 B5 F5)ia97 A5q.a97 Ri | Rhi B5q.a99 | (En+G5)ha95 C5qa88 F5qa92 | E5ha90 Enqa88 F5ia87 C6qa90 | "); //measures 23-26
      trembleRepeat.add(" (A5 B5 F5)ia88 A5q.a90 Ri | Rq (B4 C5 B4)sa80 A4ia80 A4sa80 F4qa78 C6qa82 | (E6 B5 F5)ia85 A5q.a90 Ri | Rq (B4 A4 B4)sa100 C5ia100 B4sa100 C5ia107 E5ia114 C6qa127 | "); //measures 27-30
      trembleRepeat.add(" (A5 B5 F5)ia120 A5q.a103 Ri | Rhi B5q.a93 | (Cn+G5)ha88 C5qa83 F5qa85 | En5wa98 | "); //measures 31-34
      trembleRepeat.add("Rw | Rw | Rw | Rw | "); //measures 35-38
      trembleRepeat.add("F6wa95 | En6ta93 F6qsta97 En6ta94 F6qsta98 En6ta95 F6qsta99 En6ta96 F6qsta100 En6ta98 F6ista103 | A6wa107 | Ri (B5 A5)i.a127 (B5 A5)i.a127 B5ia127 | "); //measures 39-42
      trembleRepeat.add("(F5 A5)i.a120 Rq (E5 F5)sa115 Ri (B4 C5)sa110 | Ri (A5 A5)i.a115 (A5 A5)i.a115 B5ia117 | (A5 F5)i.a115 Rq (E5 F5)sa110 Ri (B4 C5)sa100 | Ri (A5 A5)i.a110 (A5 A5)i.a110 B5ia110 | "); //measures 43-46
      trembleRepeat.add("(F5 A5)i.a95 Rq (E5 F5)sa98 (F5 F5)ia99 | (C6 B5)i.a109 A5qa107 B5qa108 F5q.a100 | Rq Rh | Ri (B5 A5)i.a95 (B5 A5)i.a93 B5ia95 | "); //measures 47-50
      trembleRepeat.add("(F5 A5)i.a90 Rq (E5 F5)sa92 Ri (B4 C5)sa93 | Ri (A5 A5)i.a96 (A5 A5)i.a96 B5ia98 | (A5 F5)i.a96 Rq (E5 F5)sa93 Ri (B4 C5)sa88 | Ri (A5 A5)i.a93 (A5 A5)i.a93 B5ia95 | "); //measures 51-54
      trembleRepeat.add("(F5 A5)i.a93 Rq (E5 F5)sa90 (F5 F5)ia92 | (C6 E6)i.a96 B5qa100 B5qa100 A5qa102 | F5h.a98 Ri | Rw | "); //measures 55-58
      trembleRepeat.add("C6hqia107 C6ia105 | E6qa109 C6ia107 E6qa109 C6ia107 E6qa109 | F6hqia109 C6ia107 | E6qa111 C6ia109 E6qa111 C6ia109 E6qa111 | "); //measures 59-62
      trembleRepeat.add("D6q.a105 F6q.a106 Rq | Rq Ri A6qa110d50 A6q.a110d50 | C5q.a85 C#5hia90 | C#5q.a90 Enhia95 | "); //measures 63-66
    Pattern trembleEnd1 = new Pattern("KEY:Ebmaj C6hqia107 C6ia105 | E6qa109 C6ia107 E6qa109 C6ia107 E6qa109 | F6hqia109 C6ia107 | E6qa111 C6ia109 E6qa111 C6ia109 E6qa111 | "); //measures 67-70
      trembleEnd1.add("F6h.a109 Ri (E6 F6)sa111 | A6qa113 F6ia111 A6qa113 F6ia111 A6qa113 | A6qa96 F6ha93 Rq | Rq. A4ia87 (A4 B4)i.a87 F4ia87 | "); //measures 71-74
    Pattern trembleEnd2 = new Pattern("KEY:Ebmaj C6hqia90 C6ia80 | E6qa83 C6ia80 E6qa82 C6ia79 E6qa75 | F6hqia78 C6ia70 | E6qa75 C6ia70 E6qa73 C6ia68 E6qa70 | "); //measures 75-78
      trembleEnd2.add("F6h.a65 Ri (E6 F6)sa60 | A6qa63 F6ia53 A6qa55 F6ia45 A6qa50 | A6qa40 F6h.a27 | Rq | "); //measures 79-82

    Pattern altoIntro1 = new Pattern("KEY:Ebmaj Rw | Rw | "); //measures 1-2
    Pattern altoIntro2 = new Pattern("KEY:Ebmaj Rw | Rw | Rw | Rw | Rw | Rw | Rw | Ri F4sa49 Rs (F4 F4)sa51 Ri (R R)i. Ri | "); //measures 3-10
    Pattern altoRepeat = new Pattern("KEY:Ebmaj Rh Rq Ri A4qa102 | (A4+C5)qa107d50 (A4+C5)qa112 (A4+C5+E5)qa114d50 (D5+F5)q.a119 | (D5+F5)ia115 D5qa111 D5qa107 Ri | Rq. Ri (R R)i. (C5+F5)qa109 | "); //measures 11-14
      altoRepeat.add("(C5+F5)qa108d50 Ri (R R)i. (C5+E5)qa114 | (C5+E5)qa116d50 Ri (R R)i. F5qa105 | (F5+B5)qa115 (D5+F5)hia105 | C5ha102 B4q Rq | "); //measures 15-18
      altoRepeat.add("Rhi (E5 F5)sa85 Ri (B4 C5)sa80 | Rw | Rhi (E5 F5)sa90 Ri (B4 C5)sa85 | Rh Rq Ri F5qa101 | "); //measures 19-22
      altoRepeat.add(" Rh (E6 F6)sa92 Ri (B5 C6)sa88 | Rh Ri G5q.a94 | Rq B4qa91 Rh | C5ha85 C5qa83 Rq | "); //measures 23-26
      altoRepeat.add("Rhi (E5 F5)sa85 Ri (B4 C5)sa80 | Rw | Rhi (E5 F5)sa85 Ri (B4 C5)sa83 | Rh Rq Ri F5qa122 | "); //measures 27-30
      altoRepeat.add(" Rh (E6 F6)sa98 Ri (B5 C6)sa93 | Rh Ri G5q.a88 | Rq B4qa83 Rh | C5wa93 | "); //measures 31-34
      altoRepeat.add("Rw | Rw | Rw | Rw | "); //measures 35-38
      altoRepeat.add("C6wa90 | Rt C6qsta92 Rt C6qsta93 Rt C6qsta94 Rt C6qsta95 Rt C6ista98 | (C6+E6)wa102 | Ri (F5 F5 F5 F5)i.a122 F5ia122 | "); //measures 39-42
      altoRepeat.add("(C5 C5+F5)i.a115 Rhi | Ri (F5 F5)i.a110 (F5 F5)i.a110 F5ia110 | (E5 C5)i.a110 Rq (R R)s Ri (R R)s | Ri (E5 E5)i.a105 (E5 E5)i.a105 E5ia105 | "); //measures 43-46
      altoRepeat.add("(D5 D5+F5)i.a90 Rhi | (F5 F5)i.a104 F5qa102 F5qa103 B4qia95 | Rq Rh | Ri (F5 F5)i.a90 (F5 F5)i.a88 F5ia88 | "); //measures 47-50
      altoRepeat.add("(C5 C5+F5)i.a85 Rq (R R)s Ri (R R)s | Ri (F5 F5)i.a91 (F5 F5)i.a91 F5ia93 | (E5 C5)i.a91 Rq (R R)s Ri (R R)s | Ri (E5 E5)i.a88 (E5 E5)i.a88 E5ia90 | "); //measures 51-54
      altoRepeat.add("(D5 D5+F5)i.a88 Rq (R R)s (F5 F5)ia87 | (F5 F5+B5)i.a91 F5qa95 F5qa95 D5qa97 | C5h.a93 Ri | Rw | "); //measures 55-58
      altoRepeat.add("(F5+C5)hqia102 (F5+C5)ia100 | (A5+C6)qa104 (F5+A5)ia102 (A5+C6)qa104 (F5+A5)ia102 (A5+C6)qa104 | (A5+C6)hqia107 A5ia105 | (A5+C6)qa109 (F5+A5)ia107 (A5+C6)qa109 (F5+A5)ia107 (A5+C6)qa109 | "); //measures 59-62
      altoRepeat.add("B5q.a102 (B5+D6)q.a100 Rq | Rq. (D6+F6)qa105d50 (D6+F6)q.a105d50 | G4q.a80 A4hia85 | A4q.a85 Bn4hia90 | "); //measures 63-66
    Pattern altoEnd1 = new Pattern("KEY:Ebmaj (F5+A5)hqia102 (F5+A5)ia100 | (A5+C6)qa104 (F5+A5)ia102 (A5+C6)qa104 (F5+A5)ia102 (A5+C6)qa104 | (A5+C6)hqia109 A5ia102 | (A5+C6)qa109 F5ia104 (A5+C6)qa109 F5ia104 (A5+C6)qa109 | "); //measures 67-70
      altoEnd1.add("(B5+D6)h.a104 Rq | (D6+F6)qa108 D6ia109 (D6+F6)qa111 D6ia109 (D6+F6)qa111 | (C6+F6)qa91 C6ha88 Rq | Rw | "); //measures 71-74
    Pattern altoEnd2 = new Pattern("KEY:Ebmaj (F5+C6)hqia85 (F5+C6)ia75 | (A5+C6)qa78 (F5+A5)ia75 (A5+C6)qa77 (F5+A5)ia74 (A5+C6)qa70 | (A5+C6)hqia73 A5ia65 | (A5+C6)qa70 F5ia65 (A5+C6)qa68 F5ia63 (A5+C6)qa65 | "); //measures 75-78
      altoEnd2.add("(B5+D6)h.a60 Rq | (D6+F6)qa58 D6ia48 (D6+F6)qa50 D6ia40 (D6+F6)qa45 | (C6+F6)qa35 C6h.a22 | Rq | "); //measures 79-82

    Pattern bassIntro1 = new Pattern("KEY:Ebmaj Rw | Rw | "); //measures 1-2
    Pattern bassIntro2 = new Pattern("KEY:Ebmaj F2i.a50 F2sa47 (C3 B2 A2)sa47 (F2si F2i E2i E2s F2si)a47 | F2ia57 (E2i E2s F2i. F2i Gb2q)a54 | F2i.a64 F2sa61 (C3 B2 A2)sa61 (F2si F2i E2i E2s F2si.)a61 | F2sa72 (C3s)a69 (Bn2i Bb2i F2i E2qs)a69d50 | F2i.a67 F2sa64 (C3 B2 A2)sa64 (F2si F2i E2i E2s F2si)a64 | F2ia76 (E2i E2s F2i. F2i Gb2q)a73 | F2i.a73 F2sa70 (C3 B2 A2)sa70 (F2si F2i E2i E2s F2sh)a70 | Rh |  "); //measures 3-10
    Pattern bassRepeat = new Pattern("KEY:Ebmaj (F2 F3)ia72 (F2 F2)sa72 F3ia72 (F2 F3)ia72 (F2 F2)sa72 F3ia72 | (A2 A3)ia107 (A2 A2)sa107 A3ia107 (A2 A3)ia107 (A2 A2)sa107 A3ia107 | (B2 B3)ia100 (B2 B2)sa100 B3ia100 (B2 B3)ia100 (B2 B2)sa100 B3ia100 | (C3 C4)ia87 (C3 C3)sa87 C4ia87 (C3 C4)ia87 (C3 C3)sa87 C4ia87 | "); //measures 11-14
      bassRepeat.add("(F2 F3)ia93 (F2 F2)sa93 F3ia93 (F2 F3)ia93 (F2 F2)sa93 F3ia93 | (A2 A3)ia101 (A2 A2)sa101 A3ia101 (A2 A3)ia101 (A2 A2)sa101 A3ia101 | (B2 B3)ia100 (B2 B2)sa100 B3ia100 (B2 B3)ia100 (B2 B2)sa100 B3ia100 | (G2 G3)ia87 (G2 G2)sa87 G3ia87 (G2 G3)ia87 (G2 G2)sa87 G3ia87 | "); //measures 15-18
      bassRepeat.add("(F2 F3)ia65 (F2 F2)sa65 F3ia65 (F2 F3)ia65 (F2 F2)sa65 F3ia65 | (F2 F3)ia68 (F2 F2)sa68 F3ia68 (F2 F3)ia68 (F2 F2)sa68 F3ia68 | (A2 A3)ia75 (A2 A2)sa75 A3ia75 (A2 A3)ia75 (A2 A2)sa75 A3ia75 | (A2 A3)ia86 (A2 A2)sa86 A3ia86 (A2 A3)ia86 (A2 A2)sa86 A3ia86 | "); //measures 19-22
      bassRepeat.add("(B2 B3)ia77 (B2 B2)sa77 B3ia77 (B2 B3)ia77 (B2 B2)sa77 B3ia77 | (B2 B3)ia79 (B2 B2)sa79 B3ia79 (B2 B3)ia79 (B2 B2)sa79 B3ia79 | (G2 G3)ia65 (G2 G2)sa65 G3ia65 (G2 G3)ia65 (G2 G2)sa65 G3ia65 | (C3 C4)ia70 (C3 C3)sa70 C4ia70 (C3 C4)ia70 (C3 C3)s C4ia70 | "); //measures 23-26
      bassRepeat.add("(F2 F3)ia68 (F2 F2)sa68 F3ia68 (F2 F3)ia68 (F2 F2)sa68 F3ia68 | (F2 F3)ia60 (F2 F2)sa60 F3ia60 (F2 F3)ia60 (F2 F2)sa60 F3ia60 | (A2 A3)ia60 (A2 A2)sa60 A3ia60 (A2 A3)ia60 (A2 A2)sa60 A3ia60 | (A2 A3)ia80 (A2 A2)sa80 A3ia80 (A2 A3)ia80 (A2 A2)sa80 A3ia80 | "); //measures 27-30
      bassRepeat.add("(B2 B3)ia100 (B2 B2)sa100 B3i (B2 B3)ia100 (B2 B2)a100s B3ia100 | (B2 B3)ia73 (B2 B2)sa73 B3ia73 (B2 B3)ia73 (B2 B2)sa73 B3ia73 | (G2 G3)ia68 (G2 G2)sa68 G3ia68 (G2 G3)ia68 (G2 G2)sa68 G3ia68 | (C3 C4)ia68 (C3 C3)sa70 C4ia72 (C3 C4)ia76 (C3 C3)sa80 C4ia82 | "); //measures 31-34
      bassRepeat.add("(F3 F3 En3 En3)ia87 (Eb3 Eb3)ia87 (D3 D3)sa87 Db3ia87 | (C3 C3 Bn2 Bn2)ia83 (Bb2 Bb2)sa83 (A2 A2)sa83 F2ia83 | (F3 F3)sa87 F3ia87 (En3 En3)ia87 (Eb3 Eb3)ia87 (D3 D3)sa87 Db3ia87 | (C3 C3 Bn2 Bn2)ia80 (Bb2 Bb2)ia80 (A2 A2)sa80 F2ia80 | "); //measures 35-38
      bassRepeat.add("(F3 F3 En3 En3)ia75 (Eb3 Eb3)ia75 (D3 D3)sa75 Db3ia75 | (C3 C3 Bn2 Bn2)ia73 (Bb2 Bb2)sa73 (A2 A2)sa73 F2ia73 | (F3 F3)sa87 F3ia87 (En3 En3)ia87 (Eb3 Eb3)ia87 (D3 D3)sa87 Db3ia87 | (C3 C3 Bn2 Bn2)ia107 (Bb2 Bb2)ia107 (A2 A2)sa107 F2ia107 | "); //measures 39-42
      bassRepeat.add("(F3+C4+F4)qa100 (F3 C4+F4 F3 C4+F4 F3 C4+F4)ia100 | (F3 F4)ia95 (F4sss+B4s_C3s_B4s)a95 (C4+A4)ia95 A4sa95 (C4+F4)ia95 (C4+F4 C4+F4)ia95 | (A3+E4+A4)qa98 (A3 E4+A4 A3 E4+A4 A3 E4+A4)ia95 | (A3 A4)ia90 (E4sss+B4s_A4s_B4s)a90 (A4+C5)ia90 (C4+B4)sa90 (E4+A4+C5)ia90 (E4+A4+E5)qa90"); //measures 43-46
      bassRepeat.add("(B3+F4+B4)qa75 (B3 F4+B4 B3 F4+B4 B3)ia75 (B4 C3)sa75 | (B3 F4+B4 B3 F4+B4 B3 F4+B4 B3 F4)ia89 | (F3+C4+F4)q.a78 (F#3+C#4+F#4)hia78 | (G3+D4+G4)q.a75 (C4+G4+C5)hia75 | "); //measures 47-50
      bassRepeat.add("(F3+C4+F4)qa73 (F3 C4+F4 F3 C4+F4 F3 C4+F4)ia70 | (F3 F4)ia76 (F4sss+B4s_C3s_B4s)a76 (C4+A4)ia76 A4sa76 (C4+F4)ia76 (C4+F4 C4+F4)ia76 | (A3+E4+A4)qa79 (A3 E4+A4 A3 E4+A4 A3 E4+A4)ia76 | (A3 A4)ia73 (E4sss+B4s_A4s_B4s)a73 (A4+C5)ia73 (C4+B4)sa73 (E4+A4+C5)ia73 (E4+A4+E5)qa73"); //measures 51-54
      bassRepeat.add("(B3+F4+B4)qa76 (B3 F4+B4 B3 F4+B4 B3)ia73 (B4 C3)sa73 | (B3 F4+B4 B3 F4+B4 B3 F4+B4 B3 F4+B4)ia76 | (F3+C4+F4)qa78 (F3 F4 F3 F4 F3 F4)ia78 | (F3 F4 F3 F4 F3 F4 F3 C3)ia83 | "); //measures 55-58
      bassRepeat.add("(F2 F3 F2 F3 F2 F3 F2 F3)ia87 | (F2 F3 F2 F3 F2 F3 F2 F3)ia89 | (A2 A3 A2 A3 A2 A3 A2 A3 A2 A3)ia89 | (A2 A3 A2 A3 A2 A3 A2 A3)ia91 | "); //measures 59-52
      bassRepeat.add("(B2 B3 B2 B3 B2 B3 B2 B3)ia85 | (B2 B3 B2 B3 B2 B3 B2 B3)ia90 | (C3+C4)q.a65 (C#3+C#4)hia70 | (C#3+C#4)q.a70 (En3+En4)hia75 | "); //measures 63-66
    Pattern bassEnd1 = new Pattern("KEY:Ebmaj (F2+F3)qa87 (F2 F3 F2 F3 F2 F3 F2 F3)ia87 | (F2 F3 F2 F3 F2 F3 F2 F3)ia89 | (A2 A3 A2 A3 A2 A3 A2 A3 A2 A3)ia89 | (A2 A3 A2 A3 A2 A3 A2 A3 A2 A3)ia91 | "); //measures 67-70
      bassEnd1.add("(B2 B3 B2 B3 B2 B3 B2 B3)ia91 | (B2 B3 B2 B3 B2 B3 B2 B3)ia93 | (F2 F3 F2 F3 F2 F3 F2 F3)ia76 | (F2 F3 F2 F3 F2 F3 F2 F3)ia67 | "); //measures 71-74
    Pattern bassEnd2 = new Pattern("KEY:Ebmaj (F2 F3 F2 F3 F2 F3 F2 F3)ia65 | (F2 F3 F2 F3 F2 F3 F2 F3)ia58 | (A2 A3 A2 A3 A2 A3 A2 A3 A2 A3)ia54 | (A2 A3 A2 A3 A2 A3 A2 A3 A2 A3)ia53 | "); //measures 75-78
      bassEnd2.add("(B2 B3 B2 B3 B2 B3 B2 B3)ia43 | (B2 B3 B2 B3 B2 B3 B2 B3)ia36 | (F2+F3)wa15 | Rq "); //measures 79-82

    Pattern tremble = new Pattern("V0 I[" + instrument + "] ");
      for(int i = 1; i <= 4; i++)  
          tremble.add(trembleIntro1); 
        tremble.add(trembleIntro2);  
      tremble.add(trembleRepeat);
      tremble.add(trembleEnd1);
      tremble.add(trembleRepeat);
      tremble.add(trembleEnd2);    
    
    Pattern alto = new Pattern("V1 I[" + instrument + "] ");
      for(int i = 1; i <= 4; i++)  
        alto.add(altoIntro1);
      alto.add(altoIntro2);  
      alto.add(altoRepeat);
      alto.add(altoEnd1);
      alto.add(altoRepeat);
      alto.add(altoEnd2); 
    
    Pattern bass = new Pattern("V2 I[" + instrument + "] ");
      for(int i = 1; i <= 4; i++)  
        bass.add(bassIntro1); 
      bass.add(bassIntro2);  
      bass.add(bassRepeat);
      bass.add(bassEnd1);
      bass.add(bassRepeat);
      bass.add(bassEnd2); 
    
    Pattern lifeWillChange = new Pattern("KEY:Ebmaj T" + liWCTempo);
      lifeWillChange.add(tremble);
      lifeWillChange.add(alto);
      lifeWillChange.add(bass);

    Player player = new Player();
      player.play(lifeWillChange);
  }

  //TO STRING
  public String toString()
  {
    // return "Persona 5";
    return "Persona5";
  }
}
