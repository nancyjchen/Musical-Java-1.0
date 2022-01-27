import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Playlist extends JFrame 
{
  // SONG CLASSES
  private DemonSlayer demonSlayer;
  private JingleBells jingle; 
  private Miraculous miraculous;
  private Persona5 persona5;
  private TwinkleTwinkle twinkle;

  // PANEL CLASSES
  private static MenuPanel menuPanel;
  private SettingsPanel settingsPanel;
  private HelpPanel helpPanel;
  private SongListPanel songListPanel;
  private PlayPanel playPanel;
  private static JButton menuButton; 

  private JLabel menuTitle;
  private JLabel settingsTitle;
  private JLabel helpTitle; 
  private JLabel songListTitle; 
  private JLabel playTitle;

  private static String[] basicSelection = {"Default",
    "Piano", "Marimba", "Xylophone", "Drawbar_Organ", "Guitar", "Acoustic_Bass", 
    "Violin", "Viola", "Cello", "String_Ensemble_1", "Trumpet", "Soprano_Sax", "Piccolo", "Flute", "Recorder"};
  private static String[] advancedSelection = {"Default",
    "Piano", "Bright_Acoustic", "Electric_Grand", "Honkey_Tonk", "Electric_Piano", "Electric_Piano_2", "Harpsichord", "Clavinet", //Piano
    "Celesta", "Clockenspiel", "Music_Box", "Vibraphone", "Marimba", "Xylophone", "Tubular_Bells", "Dulcimer", //Chromatic Percussion
    "Drawbar_Organ", "Percussive_Organ", "Rock_Organ", "Church_Organ", "Reed_Organ", "Accordian", "Harmonica", "Tango_Accordian", //Organ
    "Guitar", "Steel_String_Guitar", "Electric_Jazz_Guitar", "Electric_Clean_Guitar", "Electric_Muted_Guitar", "Overdriven_Guitar", "Distortion_Guitar", "Guitar_Harmonics", //Guitar
    "Acoustic_Bass", "Electric_Bass_Finger", "Electric_Bass_Pick", "Fretless_Bass", "Slap_Bass_1", "Slap_Bass_2", "Synth_Bass_1", "Synth_Bass_2", //Bass
    "Violin", "Viola", "Cello", "Contrabass", "Tremolo_Strings", "Pizzicato_Strings", "Orchestral_Strings", "Timpani", //Strings
    "String_Ensemble_1", "String_Ensemble_2", "Synth_Strings_1", "Synth_Strings_2", "Choir_Aahs", "Voice_Oohs", "Synth_Voice", "Orchestra_Hit", //Ensemble
    "Trumpet", "Trombone", "Tuba", "Muted_Trumpet", "French_Horn", "Brass_Section", "Synth_Brass_1", "Synth_Brass_2", //Brass
    "Soprano_Sax", "Alto_Sax", "Tenor_Sax", "Baritone_Sax", "Oboe", "English_Horn", "Bassoon", "Clarinet", //Reed
    "Piccolo", "Flute", "Recorder", "Pan_Flute", "Blown_Bottle", "Skakuhachi", "Whistle", "Ocarina"}; //Pipe
  private String[] songList = {"Demon Slayer", "Jingle Bells", "Miraculous Ladybug", "Persona 5", "Twinkle Twinkle Little Star"};
  private double[] playbackOptions = {0.25, 0.5, 0.75, 1.00, 1.25, 1.50, 1.75, 2.00}; //7 Speed Options

  public Playlist(DemonSlayer ds, JingleBells jb, Miraculous mlb, Persona5 p5, TwinkleTwinkle tt)
  {
    demonSlayer = new DemonSlayer(DemonSlayer.getInstrument(), DemonSlayer.getPlaybackSpeed());
    jingle = new JingleBells(JingleBells.getInstrument(), JingleBells.getPlaybackSpeed()); 
    miraculous = new Miraculous(Miraculous.getInstrument(), Miraculous.getPlaybackSpeed());
    persona5 = new Persona5(Persona5.getInstrument(), Persona5.getPlaybackSpeed());
    twinkle = new TwinkleTwinkle(TwinkleTwinkle.getInstrument(), TwinkleTwinkle.getPlaybackSpeed());
  } 
  public Playlist()
  {
    ImageIcon logo = new ImageIcon("MJlogo.png");
    this.setTitle("✨ Musical Java ✨");
    this.setIconImage(logo.getImage());
    this.setLayout(null);
    
    menuPanel = new MenuPanel();
    settingsPanel = new SettingsPanel();
    helpPanel = new HelpPanel();
    songListPanel = new SongListPanel();
    playPanel = new PlayPanel();

    this.add(menuPanel);
    this.add(settingsPanel);
    this.add(helpPanel);
    this.add(songListPanel);
    this.add(playPanel);
    // this.addChangeListener(this);

    // this.pack();
    this.getContentPane().setBackground(Color.PINK);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    this.setResizable(false);
    this.setSize(new Dimension(1000, 600));
    this.setVisible(true);
  } 
  public class MenuPanel extends JPanel 
  {
    private JButton settingsButton;
    private JButton songListButton;
    private JButton helpButton;
    private JButton menuPlayButton;

    public JButton[] getMenuButtons() 
    {
      JButton[] menuButtons = {settingsButton, songListButton, helpButton, menuPlayButton};
      return menuButtons;
    }

    public MenuPanel()
    {
      this.setBounds(0, 0, 1000, 600);
      this.setBackground(Color.WHITE);
      this.setLayout(null);

      menuTitle = new JLabel("<html>Musical Java</html>");
      menuTitle.setHorizontalAlignment(JLabel.CENTER);
      Playlist.setAppearance(menuTitle, Color.BLACK, Color.LIGHT_GRAY, new Font("Comic Sans MS", Font.BOLD, 125));
      
      settingsButton = new JButton("SETTINGS");
      settingsButton.setFocusable(false);
      Playlist.setAppearance(settingsButton, Color.BLACK, Color.LIGHT_GRAY, new Font("Comic Sans MS", Font.BOLD, 50));
      settingsButton.addMouseListener(new MouseAdapter() 
      {
        public void mouseEntered(MouseEvent e) {
          settingsButton.setBackground(Color.GRAY);
        }
        public void mouseExited(MouseEvent e) {
          settingsButton.setBackground(Color.LIGHT_GRAY);
        }
        public void mouseClicked(MouseEvent e) {
          menuPanel.setVisible(false);
          settingsPanel.setVisible(true);
        }
      } );

      helpButton = new JButton("HELP");
      helpButton.setFocusable(false);
      Playlist.setAppearance(helpButton, Color.BLACK, Color.LIGHT_GRAY, new Font("Comic Sans MS", Font.BOLD, 50));
      helpButton.addMouseListener(new MouseAdapter() 
      {
        public void mouseEntered(MouseEvent e) {
          helpButton.setBackground(Color.GRAY);
        }
        public void mouseExited(MouseEvent e) {
          helpButton.setBackground(Color.LIGHT_GRAY);
        }
        public void mouseClicked(MouseEvent e) {
          menuPanel.setVisible(false);
          helpPanel.setVisible(true);
        }
      } );

      songListButton = new JButton("PLAYLIST");
      songListButton.setFocusable(false);
      Playlist.setAppearance(songListButton, Color.BLACK, Color.LIGHT_GRAY, new Font("Comic Sans MS", Font.BOLD, 50));
      songListButton.addMouseListener(new MouseAdapter() 
      {
        public void mouseEntered(MouseEvent e) {
          songListButton.setBackground(Color.GRAY);
        }
        public void mouseExited(MouseEvent e) {
          songListButton.setBackground(Color.LIGHT_GRAY);
        }
        public void mouseClicked(MouseEvent e) {
          menuPanel.setVisible(false);
          songListPanel.setVisible(true);
        }
      } );

      menuPlayButton = new JButton("PLAY");
      menuPlayButton.setFocusable(false);
      Playlist.setAppearance(menuPlayButton, Color.BLACK, Color.LIGHT_GRAY, new Font("Comic Sans MS", Font.BOLD, 50));
      menuPlayButton.addMouseListener(new MouseAdapter() 
      {
        public void mouseEntered(MouseEvent e) {
          menuPlayButton.setBackground(Color.GRAY);
        }
        public void mouseExited(MouseEvent e) {
          menuPlayButton.setBackground(Color.LIGHT_GRAY);
        }
        public void mouseClicked(MouseEvent e) {
          menuPanel.setVisible(false);
          playPanel.setVisible(true);
        }
      } );

      menuTitle.setBounds(0, 75, 1000, 125);
      settingsButton.setBounds(503, 250, 372, 110);
      helpButton.setBounds(503, 395, 372, 110);
      songListButton.setBounds(95, 395, 372, 110);
      menuPlayButton.setBounds(95, 250, 372, 110);

      this.add(menuTitle);
      for(JButton menuButton : getMenuButtons())
        this.add(menuButton);
      this.setOpaque(true);
    }
  } //MenuPanel END
  public class SettingsPanel extends JPanel implements ActionListener
  {
    private JLabel sInstrumentTitle;
    private JRadioButton settingsBasicChoice;
    private JRadioButton settingsAdvancedChoice;
    private ButtonGroup instrumentSelectionGroup;
    private JLabel colorThemeTitle;
    private JRadioButton lightSimpleChoice;
    private JRadioButton darkSimpleChoice;
    private JRadioButton lightColorfulChoice; 
    private JRadioButton darkColorfulChoice; 
    private ButtonGroup colorThemeSelectionGroup;

    public JLabel[] getSettingsLabels()
    {
      JLabel[] settingsLabels = {sInstrumentTitle, colorThemeTitle};
      return settingsLabels;
    }
    public JRadioButton[] getSettingsRadioButtons()
    {
      JRadioButton[] settingsRadioButtons = {settingsBasicChoice, settingsAdvancedChoice, lightSimpleChoice, darkSimpleChoice, lightColorfulChoice, darkColorfulChoice};
      return settingsRadioButtons;
    }

    public SettingsPanel()
    {
      this.setBounds(0, 0, 1000, 600); //REVISE & EDIT
      this.setBackground(Color.WHITE); 
      this.setLayout(null);

      settingsTitle = new JLabel("-- SETTINGS --");
      settingsTitle.setHorizontalAlignment(JLabel.CENTER);
      Playlist.setAppearance(settingsTitle, Color.BLACK, Color.WHITE, new Font("Comic Sans MS", Font.BOLD, 30));

      sInstrumentTitle = new JLabel("Instrument Selection: ");
      Playlist.setAppearance(sInstrumentTitle, Color.BLACK, Color.WHITE, new Font("Constantia", Font.BOLD, 30));

      settingsBasicChoice = new JRadioButton("Basic Selection", true); 
      Playlist.setAppearance(settingsBasicChoice, Color.BLACK, Color.WHITE, new Font("DengXian", Font.BOLD, 25));
      settingsBasicChoice.addActionListener(this);

      settingsAdvancedChoice = new JRadioButton("Advanced Selection", false);
      Playlist.setAppearance(settingsAdvancedChoice, Color.BLACK, Color.WHITE, new Font("DengXian", Font.BOLD, 25));
      settingsAdvancedChoice.addActionListener(this);

      instrumentSelectionGroup = new ButtonGroup();
      instrumentSelectionGroup.add(settingsBasicChoice);
      instrumentSelectionGroup.add(settingsAdvancedChoice);

      colorThemeTitle = new JLabel("Color Theme: ");
      Playlist.setAppearance(colorThemeTitle, Color.BLACK, Color.WHITE, new Font("Constantia", Font.BOLD, 30));

      lightSimpleChoice = new JRadioButton("Light Theme - Simple", true);
      Playlist.setAppearance(lightSimpleChoice, Color.BLACK, Color.WHITE, new Font("DengXian", Font.BOLD, 25));
      lightSimpleChoice.addActionListener(this);

      darkSimpleChoice = new JRadioButton("Dark Theme - Simple", false);
      Playlist.setAppearance(darkSimpleChoice, Color.BLACK, Color.WHITE, new Font("DengXian", Font.BOLD, 25));
      darkSimpleChoice.addActionListener(this);

      lightColorfulChoice = new JRadioButton("Light Theme - Colorful", false);
      Playlist.setAppearance(lightColorfulChoice, Color.BLACK, Color.WHITE, new Font("DengXian", Font.BOLD, 25));
      lightColorfulChoice.addActionListener(this);

      darkColorfulChoice = new JRadioButton("Dark Theme - Colorful", false);
      Playlist.setAppearance(darkColorfulChoice, Color.BLACK, Color.WHITE, new Font("DengXian", Font.BOLD, 25));
      darkColorfulChoice.addActionListener(this);

      colorThemeSelectionGroup = new ButtonGroup();
      colorThemeSelectionGroup.add(lightSimpleChoice);
      colorThemeSelectionGroup.add(darkSimpleChoice);
      colorThemeSelectionGroup.add(lightColorfulChoice);
      colorThemeSelectionGroup.add(darkColorfulChoice);

      settingsTitle.setBounds(0, 15, 1000, 50);
      sInstrumentTitle.setBounds(50, 66, 500, 50);
      settingsBasicChoice.setBounds(50, 106, 300, 50);
      settingsAdvancedChoice.setBounds(500, 106, 300, 50);
      colorThemeTitle.setBounds(50, 175, 300, 50);
      lightSimpleChoice.setBounds(50, 215, 300, 50);
      darkSimpleChoice.setBounds(500, 215, 300, 50);
      lightColorfulChoice.setBounds(50, 270, 300, 50);
      darkColorfulChoice.setBounds(500, 270, 300, 50);
      Playlist.addMenuButton(this, true);
      
      this.add(menuButton);
      this.add(settingsTitle);
      for(JLabel settingsLabel : getSettingsLabels())
        this.add(settingsLabel);
      for(JRadioButton settingsRadioButton : getSettingsRadioButtons())
        this.add(settingsRadioButton);
      this.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
      if(e.getSource() == settingsBasicChoice)
      {
        playPanel.setInstrumentSelection(basicSelection);
      }
      else if(e.getSource() == settingsAdvancedChoice)
      {
        playPanel.setInstrumentSelection(advancedSelection);
      }
      if(e.getSource() == lightSimpleChoice)
      {
        //MenuPanel
        menuPanel.setBackground(Color.WHITE);
        Playlist.setAppearance(menuTitle, Color.BLACK, Color.WHITE, null);
        for(JButton menuButton : menuPanel.getMenuButtons())
        {
          Playlist.setAppearance(menuButton, Color.BLACK, Color.LIGHT_GRAY, null);
          menuButton.addMouseListener(new MouseAdapter() 
          {
            public void mouseEntered(MouseEvent e) {
              menuButton.setBackground(Color.GRAY);
            }
            public void mouseExited(MouseEvent e) {
              menuButton.setBackground(Color.LIGHT_GRAY);
            }
          } );
        }

        //SettingsPanel
        settingsPanel.setBackground(Color.WHITE);
        Playlist.setAppearance(playTitle, Color.BLACK, Color.WHITE, null);
        for(JLabel settingsLabel : settingsPanel.getSettingsLabels())
          Playlist.setAppearance(settingsLabel, Color.BLACK, Color.WHITE, null);
        for(JRadioButton settingsRadioButton : settingsPanel.getSettingsRadioButtons())
          Playlist.setAppearance(settingsRadioButton, Color.BLACK, Color.WHITE, null);

        //HelpPanel
        helpPanel.setBackground(Color.WHITE);
        Playlist.setAppearance(helpTitle, Color.BLACK, Color.WHITE, null);
        for(JLabel helpLabel : helpPanel.getHelpLabels()) 
          Playlist.setAppearance(helpLabel, Color.BLACK, Color.WHITE, null);

        //SongListPanel
        songListPanel.setBackground(Color.WHITE);
        Playlist.setAppearance(songListTitle, Color.BLACK, Color.WHITE, null);
        for(JLabel songListLabel1 : songListPanel.getSLMainLabels())
          Playlist.setAppearance(songListLabel1, Color.BLACK, Color.WHITE, null);
        for(JLabel songListLabel2 : songListPanel.getSLMinorLabels())
          Playlist.setAppearance(songListLabel2, Color.BLACK, Color.WHITE, null);

        //PlayPanel
        playPanel.setBackground(Color.WHITE);
        Playlist.setAppearance(playTitle, Color.BLACK, Color.WHITE, null);
        for(JLabel playLabel : playPanel.getPlayLabels())
          Playlist.setAppearance(playLabel, Color.BLACK, Color.LIGHT_GRAY, null);
        for(JComboBox playComboBox : playPanel.getPlayComboBoxs())
        {
          Playlist.setAppearance(playComboBox, Color.BLACK, Color.LIGHT_GRAY, null);
          playComboBox.addMouseListener(new MouseAdapter() 
          {
            public void mouseEntered(MouseEvent e) { 
              playComboBox.setBackground(Color.LIGHT_GRAY);
            }
            public void mouseExited(MouseEvent e) {
              playComboBox.setBackground(Color.LIGHT_GRAY);
            }
          } );
        }
        for(JButton playButton : playPanel.getPlayButtons())
        {
          Playlist.setAppearance(playButton, Color.BLACK, Color.LIGHT_GRAY, null);
          playButton.addMouseListener(new MouseAdapter() 
          {
            public void mouseEntered(MouseEvent e) { 
                playButton.setBackground(Color.GRAY);
            }
            public void mouseExited(MouseEvent e) {
                playButton.setBackground(Color.LIGHT_GRAY);
            }
          } );
        }

        //MenuButtons
        Playlist.addMenuButton(settingsPanel, true);
        Playlist.addMenuButton(helpPanel, true);
        Playlist.addMenuButton(songListPanel, true);
        Playlist.addMenuButton(playPanel, true);
      }
      else if(e.getSource() == darkSimpleChoice)
      {
        //MenuPanel
        menuPanel.setBackground(Color.BLACK);
        Playlist.setAppearance(menuTitle, Color.WHITE, Color.BLACK, null);
        for(JButton menuButton : menuPanel.getMenuButtons())
        {
          Playlist.setAppearance(menuButton, Color.WHITE, Color.DARK_GRAY, null);
          menuButton.addMouseListener(new MouseAdapter() 
          {
            public void mouseEntered(MouseEvent e) {
              menuButton.setBackground(Color.GRAY);
            }
            public void mouseExited(MouseEvent e) {
              menuButton.setBackground(Color.DARK_GRAY);
            }
          } );
        }

        //SettingsPanel
        settingsPanel.setBackground(Color.BLACK);
        Playlist.setAppearance(settingsTitle, Color.WHITE, Color.BLACK, null);
        for(JLabel settingsLabel : settingsPanel.getSettingsLabels())
          Playlist.setAppearance(settingsLabel, Color.WHITE, Color.BLACK, null);
        for(JRadioButton settingsRadioButton : settingsPanel.getSettingsRadioButtons())
          Playlist.setAppearance(settingsRadioButton, Color.WHITE, Color.BLACK, null);

        //HelpPanel
        helpPanel.setBackground(Color.BLACK);
        Playlist.setAppearance(helpTitle, Color.WHITE, Color.BLACK, null);
        for(JLabel helpLabel : helpPanel.getHelpLabels()) 
          Playlist.setAppearance(helpLabel, Color.WHITE, Color.BLACK, null);

        //SongListPanel
        songListPanel.setBackground(Color.BLACK);
        Playlist.setAppearance(songListTitle, Color.WHITE, Color.BLACK, null);
        for(JLabel songListLabel1 : songListPanel.getSLMainLabels())
          Playlist.setAppearance(songListLabel1, Color.WHITE, Color.BLACK, null);
        for(JLabel songListLabel2 : songListPanel.getSLMinorLabels())
          Playlist.setAppearance(songListLabel2, Color.WHITE, Color.BLACK, null);

        //PlayPanel
        playPanel.setBackground(Color.BLACK);
        Playlist.setAppearance(playTitle, Color.WHITE, Color.BLACK, null);
        for(JLabel playLabel : playPanel.getPlayLabels())
          Playlist.setAppearance(playLabel, Color.WHITE, Color.BLACK, null);
        for(JComboBox playComboBox : playPanel.getPlayComboBoxs())
        {
          Playlist.setAppearance(playComboBox, Color.WHITE, Color.DARK_GRAY, null);
          playComboBox.addMouseListener(new MouseAdapter() 
          {
            public void mouseEntered(MouseEvent e) { 
              playComboBox.setBackground(Color.DARK_GRAY);
            }
            public void mouseExited(MouseEvent e) {
              playComboBox.setBackground(Color.DARK_GRAY);
            }
          } );
        }
        for(JButton playButton : playPanel.getPlayButtons())
        {
          Playlist.setAppearance(menuTitle, Color.WHITE, Color.LIGHT_GRAY, null);
          playButton.addMouseListener(new MouseAdapter() 
          {
            public void mouseEntered(MouseEvent e) { 
                playButton.setBackground(Color.GRAY);
            }
            public void mouseExited(MouseEvent e) {
                playButton.setBackground(Color.LIGHT_GRAY);
            }
          } );
        }
        
        //MenuButtons
        Playlist.addMenuButton(settingsPanel, false);
        Playlist.addMenuButton(helpPanel, false);
        Playlist.addMenuButton(songListPanel, false);
        Playlist.addMenuButton(playPanel, false);
      }
      else if(e.getSource() == lightColorfulChoice) //CHANGE Color.WHITE to ANTOTHER COLOR
      {
        //MenuPanel
        menuPanel.setBackground(new Color(241, 192, 232));
        Playlist.setAppearance(menuTitle, Color.BLACK, new Color(230, 159, 255), null);
        for(JButton menuButton : menuPanel.getMenuButtons())
        {
          Playlist.setAppearance(menuButton, Color.BLACK, new Color(163, 196, 243), null);
          menuButton.addMouseListener(new MouseAdapter() 
          {
            public void mouseEntered(MouseEvent e) { 
              menuButton.setBackground(new Color(142, 236, 245));
            }
            public void mouseExited(MouseEvent e) {
              menuButton.setBackground(new Color(163, 196, 243));
            }
          } );
        }

        //SettingsPanel
        settingsPanel.setBackground(new Color(207, 186, 240));
        Playlist.setAppearance(settingsTitle, Color.BLACK, new Color(207, 186, 240), null);
        for(JLabel settingsLabel : settingsPanel.getSettingsLabels())
          Playlist.setAppearance(settingsLabel, Color.BLACK, new Color(207, 186, 240), null);
        for(JRadioButton settingsRadioButton : settingsPanel.getSettingsRadioButtons())
          Playlist.setAppearance(settingsRadioButton, Color.BLACK, new Color(207, 186, 240), null);

        //HelpPanel
        helpPanel.setBackground(new Color(252, 246, 189));
        Playlist.setAppearance(helpTitle, Color.BLACK, new Color(252, 246, 189), null);
        for(JLabel helpLabel : helpPanel.getHelpLabels()) 
          Playlist.setAppearance(helpLabel, Color.BLACK, new Color(252, 246, 189), null);

        //SongListPanel
        songListPanel.setBackground(new Color(253, 228, 207));
        Playlist.setAppearance(songListTitle, Color.BLACK, new Color(253, 228, 207), null);
        for(JLabel songListLabel1 : songListPanel.getSLMainLabels())
          Playlist.setAppearance(songListLabel1, Color.BLACK, new Color(253, 228, 207), null);
        for(JLabel songListLabel2 : songListPanel.getSLMinorLabels())
          Playlist.setAppearance(songListLabel2, Color.BLACK, new Color(253, 228, 207), null);

        //PlayPanel
        playPanel.setBackground(new Color(152, 245, 225));
        Playlist.setAppearance(playTitle, Color.BLACK, new Color(152, 245, 225), null);
        for(JLabel playLabel : playPanel.getPlayLabels())
          Playlist.setAppearance(playLabel, Color.BLACK, new Color(152, 245, 225), null);
        for(JComboBox playComboBox : playPanel.getPlayComboBoxs())
        {
          Playlist.setAppearance(playComboBox, Color.BLACK, new Color(193, 251, 164), null);
          playComboBox.addMouseListener(new MouseAdapter() 
          {
            public void mouseEntered(MouseEvent e) {
              playComboBox.setBackground(new Color(208, 244, 222));
            }
            public void mouseExited(MouseEvent e) {
              playComboBox.setBackground(new Color(193, 251, 164));
            }
          } );
        }
        for(JButton playButton : playPanel.getPlayButtons())
        {
          Playlist.setAppearance(playButton, Color.BLACK, new Color(255, 153, 200), null);
          playButton.addMouseListener(new MouseAdapter() 
          {
            public void mouseEntered(MouseEvent e) {
              playButton.setBackground(new Color(255, 214, 224));
            }
            public void mouseExited(MouseEvent e) {
              playButton.setBackground(new Color(255, 153, 200));
            }
          } );
        }

        //MenuButtons
        Playlist.addMenuButton(settingsPanel, true);
        Playlist.addMenuButton(helpPanel, true);
        Playlist.addMenuButton(songListPanel, true);
        Playlist.addMenuButton(playPanel, true);
      }
      else if(e.getSource() == darkColorfulChoice) //CHANGE THE Color.BLACK to ANOTHER COLOR
      {
        //MenuPanel
        menuPanel.setBackground(new Color(142, 31, 121));
        Playlist.setAppearance(menuTitle, Color.WHITE, new Color(142, 31, 121), null);
        for(JButton menuButton : menuPanel.getMenuButtons())
        {
          Playlist.setAppearance(menuButton, Color.WHITE, new Color(19, 70, 144), null); 
          menuButton.addMouseListener(new MouseAdapter() 
          {
            public void mouseEntered(MouseEvent e) {
              menuButton.setBackground(new Color(13, 131, 142));
            }
            public void mouseExited(MouseEvent e) {
              menuButton.setBackground(new Color(19, 70, 144));
            }
          } );
        }

        //SettingsPanel
        settingsPanel.setBackground(new Color(73, 30, 140));
        Playlist.setAppearance(settingsTitle, Color.WHITE, new Color(73, 30, 140), null);
        for(JLabel settingsLabel : settingsPanel.getSettingsLabels())
          Playlist.setAppearance(settingsLabel, Color.WHITE, new Color(73, 30, 140), null);
        for(JRadioButton settingsRadioButton : settingsPanel.getSettingsRadioButtons())
          Playlist.setAppearance(settingsRadioButton, Color.WHITE, new Color(73, 30, 140), null);

        //HelpPanel
        helpPanel.setBackground(new Color(169, 153, 8));
        Playlist.setAppearance(helpTitle, Color.WHITE, new Color(169, 153, 8), null);
        for(JLabel helpLabel : helpPanel.getHelpLabels()) 
          Playlist.setAppearance(helpLabel, Color.WHITE, new Color(169, 153, 8), null);

        //SongListPanel
        songListPanel.setBackground(new Color(177, 85, 7));
        Playlist.setAppearance(songListTitle, Color.WHITE, new Color(177, 85, 7), null);
        for(JLabel songListLabel1 : songListPanel.getSLMainLabels())
          Playlist.setAppearance(songListLabel1, Color.WHITE, new Color(177, 85, 7), null);
        for(JLabel songListLabel2 : songListPanel.getSLMinorLabels())
          Playlist.setAppearance(songListLabel2, Color.WHITE, new Color(177, 85, 7), null);

        //PlayPanel
        playPanel.setBackground(new Color(14, 145, 117));
        Playlist.setAppearance(playTitle, Color.WHITE, new Color(14, 145, 117), null);
        for(JLabel playLabel : playPanel.getPlayLabels())
          Playlist.setAppearance(playLabel, Color.WHITE, new Color(14, 145, 117), null);
        for(JComboBox playComboBox : playPanel.getPlayComboBoxs())
        {  
          Playlist.setAppearance(playComboBox, Color.WHITE, new Color(14, 132, 59), null); 
          playComboBox.addMouseListener(new MouseAdapter() 
          {
            public void mouseEntered(MouseEvent e) { 
              playComboBox.setBackground(new Color(34, 146, 78));
            }
            public void mouseExited(MouseEvent e) {
              playComboBox.setBackground(new Color(14, 132, 59)); 
            }
          } );
        }
        for(JButton playButton : playPanel.getPlayButtons())
        {
          Playlist.setAppearance(playButton, Color.WHITE, new Color(163, 0, 75), null);
          playButton.addMouseListener(new MouseAdapter() 
          {
            public void mouseEntered(MouseEvent e) { 
                playButton.setBackground(new Color(188, 0, 46));
            }
            public void mouseExited(MouseEvent e) {
                playButton.setBackground(new Color(163, 0, 75)); 
            }
          } );
        }
        
        //MenuButtons
        Playlist.addMenuButton(settingsPanel, false);
        Playlist.addMenuButton(helpPanel, false);
        Playlist.addMenuButton(songListPanel, false);
        Playlist.addMenuButton(playPanel, false);
      }
    }
  } //SettingsPanel END
  public class HelpPanel extends JPanel implements ChangeListener // USE <html> <br> </html>
  {
    private JLabel arrowHelp; 
    private JLabel arrow;
    private JLabel songListHelp;
    private JLabel songList; 
    private JLabel themeHelp;
    private JLabel theme; 
    private JLabel instrumentHelp;
    private JLabel instrument; 
    private JLabel songCatHelp;
    private JLabel songCat; 
    private JLabel subSongHelp; 
    private JLabel subSong;
    private JLabel speedHelp; 
    private JLabel speed;
    private JLabel repetitionHelp;
    private JLabel repetition;
    
    public JLabel[] getHelpLabels()
    {
      JLabel[] helpLabels = {arrowHelp, arrow, songListHelp, songList, themeHelp, theme, instrumentHelp, instrument, songCatHelp, songCat, subSongHelp, subSong, speedHelp, speed, repetitionHelp, repetition};
      return helpLabels;
    }

    public HelpPanel()
    {
      this.setBounds(0, 0, 1000, 600); //REVISE & EDIT
      this.setBackground(Color.WHITE);
      this.setLayout(null);

      helpTitle = new JLabel("-- HELP --");
      helpTitle.setHorizontalAlignment(JLabel.CENTER);
      Playlist.setAppearance(helpTitle, Color.BLACK, Color.WHITE, new Font("Comic Sans MS", Font.BOLD, 30));

      arrowHelp = new JLabel("Navigating Musical Java: ");
      Playlist.setAppearance(arrowHelp, Color.BLACK, Color.WHITE, new Font("Constantia", Font.BOLD, 20));  
      arrow = new JLabel("<html>Press the buttons to navigate Musical Java. The top right arrow brings you back to the Menu. <br>In the Menu, select 1 of the 4 buttons to go the pane that you want to go to. <br>The 'PLAY' button lets you go the pane where you can choose a song. <br>The 'PLAYLIST' button shows you an overview of what songs are currently in Musical Java. <br>The 'SETTINGS' button lets you adjust the appearance of Musical Java. <br>The 'HELP' button brings you to this page. </html>");
      Playlist.setAppearance(arrow, Color.BLACK, Color.WHITE, new Font("DengXian", Font.PLAIN, 15));

      songListHelp = new JLabel("Viewing Playlist: ");
      Playlist.setAppearance(songListHelp, Color.BLACK, Color.WHITE, new Font("Constantia", Font.BOLD, 20));
      songList = new JLabel("<html>The bolded text is the song category that you can select in the 'PLAY' pane. <br>The songs under the bolded text are the songs that belong to the song category that you can select in the 'PLAY' pane. </html>");
      Playlist.setAppearance(songList, Color.BLACK, Color.WHITE, new Font("DengXian", Font.PLAIN, 15));

      themeHelp = new JLabel("Color Theme Selection: ");
      Playlist.setAppearance(themeHelp, Color.BLACK, Color.WHITE, new Font("Constantia", Font.BOLD, 20));
      theme = new JLabel("<html>There are several color themes that you can select. The default color theme is 'Light Theme - Simple'. You can change this in 'SETTINGS'.</html>");
      Playlist.setAppearance(theme, Color.BLACK, Color.WHITE, new Font("DengXian", Font.PLAIN, 15));

      instrumentHelp = new JLabel("Instrument Selection: ");
      Playlist.setAppearance(instrumentHelp, Color.BLACK, Color.WHITE, new Font("Constantia", Font.BOLD, 20));
      instrument = new JLabel("<html>You can choose from a wide range of instruments. The default instrument selection is set to 'Basic'. You can change this in 'SETTINGS'. </html>");
      Playlist.setAppearance(instrument, Color.BLACK, Color.WHITE, new Font("DengXian", Font.PLAIN, 15));

      songCatHelp = new JLabel("Song Category Selection: ");
      Playlist.setAppearance(songCatHelp, Color.BLACK, Color.WHITE, new Font("Constantia", Font.BOLD, 20));
      songCat = new JLabel("<html>The song categories are the groups that the specific songs you want to play are in. The default song category is set to 'Jingle Bells'. </html>");
      Playlist.setAppearance(songCat, Color.BLACK, Color.WHITE, new Font("DengXian", Font.PLAIN, 15));

      subSongHelp = new JLabel("Song Variation/Type Selection: ");
      Playlist.setAppearance(subSongHelp, Color.BLACK, Color.WHITE, new Font("Constantia", Font.BOLD, 20));
      subSong = new JLabel("<html>The song variation/type is the specific song that you want Musical Java to play. The default song variation is set to 'Jingle Bells - Original'. </html>");
      Playlist.setAppearance(subSong, Color.BLACK, Color.WHITE, new Font("DengXian", Font.PLAIN, 15));
      
      speedHelp = new JLabel("Playback Speed Selection: ");
      Playlist.setAppearance(speedHelp, Color.BLACK, Color.WHITE, new Font("Constantia", Font.BOLD, 20));
      speed = new JLabel("<html>The playback speed is how fast/slow you want the song to play. The default playback speed is '1.00X', setting the song to its ORIGINAL pace. </html>");
      Playlist.setAppearance(speed, Color.BLACK, Color.WHITE, new Font("DengXian", Font.PLAIN, 15));
      
      repetitionHelp = new JLabel("Repetition Selection: ");
      Playlist.setAppearance(repetitionHelp, Color.BLACK, Color.WHITE, new Font("Constantia", Font.BOLD, 20));
      repetition = new JLabel("<html>The number of repetitions is how many times you want the selected song to REPEAT. The default number of repetitions is '0'. </html>");
      Playlist.setAppearance(repetition, Color.BLACK, Color.WHITE, new Font("DengXian", Font.PLAIN, 15));

      Playlist.addMenuButton(this, true);

      helpTitle.setBounds(0, 15, 1000, 50);
      arrowHelp.setBounds(45, 63, 950, 50);
      arrow.setBounds(45, 72, 800, 150);
      songListHelp.setBounds(45, 197, 950, 50);
      songList.setBounds(45, 200, 950, 100);
      themeHelp.setBounds(45, 267, 950, 50);
      theme.setBounds(45, 284, 950, 50);
      instrumentHelp.setBounds(45, 313, 950, 50);
      instrument.setBounds(45, 329, 950, 50);
      songCatHelp.setBounds(45, 357, 950, 50);
      songCat.setBounds(45, 374, 950, 50);
      subSongHelp.setBounds(45, 402, 950, 50);
      subSong.setBounds(45, 419, 950, 50);
      speedHelp.setBounds(45, 447, 950, 50);
      speed.setBounds(45, 464, 950, 50);
      repetitionHelp.setBounds(45, 492, 950, 50);
      repetition.setBounds(45, 509, 950, 50);
  
      this.add(menuButton);
      this.add(helpTitle);
      for(JLabel helpLabel : getHelpLabels())
        this.add(helpLabel);
      this.setVisible(false);
    }
    @Override
    public void stateChanged(ChangeEvent e) //ADD BACK TO MENU BUTTON AT TOP LEFT CORNER
    {
      playPanel.setBounds(0, 0, Playlist.this.getWidth(), Playlist.this.getHeight());
    }
  } //HelpPanel END
  public class SongListPanel extends JPanel implements ChangeListener //ADD BACK TO MENU BUTTON AT TOP LEFT CORNER
  {
    private JLabel demonTitle;
    private JLabel demonSubSongs;  
    private JLabel jingleTitle;
    private JLabel jingleSubSongs; 
    private JLabel miraculousTitle;
    private JLabel miraculousSubSongs; 
    private JLabel persona5Title; 
    private JLabel persona5SubSongs;
    private JLabel twinkleTitle;
    private JLabel twinkleSubSongs;

    private JLabel[] sLMainLabels = {demonTitle, jingleTitle, miraculousTitle, persona5Title, twinkleTitle};
    private JLabel[] sLMinorLabels = {demonSubSongs, jingleSubSongs, miraculousSubSongs, persona5SubSongs, twinkleSubSongs};

    private JLabel getMainLabel(int i)
    {
      if(i == 0)
        return demonTitle;
      else if(i == 1)
        return jingleTitle;
      else if(i == 2)
        return miraculousTitle;
      else if(i == 3)
        return persona5Title;
      else if(i == 4)
        return twinkleTitle;   
      return null;   
    }
    private JLabel getMinorLabel(int i)
    {
      if(i == 0)
        return demonSubSongs;
      else if(i == 1)
        return jingleSubSongs;
      else if(i == 2)
        return miraculousSubSongs;
      else if(i == 3)
        return persona5SubSongs;
      else if(i == 4)
        return twinkleSubSongs;
      return null;
    }

    private JLabel[] getSLMainLabels() 
    {
      JLabel[] sLMainLabels = {demonTitle, jingleTitle, miraculousTitle, persona5Title, twinkleTitle};
      return sLMainLabels;
    }
    private JLabel[] getSLMinorLabels() 
    {
      JLabel[] sLMinorLabels = {demonSubSongs, jingleSubSongs, miraculousSubSongs, persona5SubSongs, twinkleSubSongs};
      return sLMinorLabels;
    }

    public SongListPanel()
    {
      this.setBounds(0, 0, 1000, 600); //REVISE & EDIT
      this.setBackground(Color.WHITE);
      this.setLayout(null);

      songListTitle = new JLabel("-- PLAYLIST --");
      songListTitle.setHorizontalAlignment(JLabel.CENTER);
      Playlist.setAppearance(songListTitle, Color.BLACK, Color.WHITE, new Font("Comic Sans MS", Font.BOLD, 30));

      demonTitle = new JLabel();
      demonSubSongs = new JLabel();  
      jingleTitle = new JLabel();
      jingleSubSongs = new JLabel(); 
      miraculousTitle = new JLabel();
      miraculousSubSongs = new JLabel(); 
      persona5Title = new JLabel(); 
      persona5SubSongs = new JLabel();
      twinkleTitle = new JLabel();
      twinkleSubSongs = new JLabel();

      int uselessStatementExecution = 0;
      for(int i = 0; i < sLMainLabels.length - 1; i++) // VERSION 1.0
      {
        // MAIN LABELS
        getMainLabel(i).setText(songList[i]);
        Playlist.setAppearance(getMainLabel(i), Color.BLACK, Color.WHITE, new Font("Constantia", Font.BOLD, 25));
        String[] subSongList = {};
        if(i == 0) subSongList = DemonSlayer.getSubSongList();
        if(i == 1) subSongList = JingleBells.getSubSongList();
        if(i == 2) subSongList = Miraculous.getSubSongList();
        if(i == 3) subSongList = Persona5.getSubSongList();
        if(i == 4) subSongList = TwinkleTwinkle.getSubSongList();
        // MINOR LABELS
        String labelText = "<html>";
        for(String subSong : subSongList)
        {
          if(subSong != null)
            labelText += subSong + "<br>";
          uselessStatementExecution++;
        }
        labelText += "</html>";
        getMinorLabel(i).setText(labelText);
        Playlist.setAppearance(getMinorLabel(i), Color.BLACK, Color.WHITE, new Font("DengXian", Font.PLAIN, 20));
      }
      // At this time, 'uselessStatementExecution' should be 7 because there are 7 SubSongs.
      /* 
      int i = 0; // VERSION 2.0
      demonTitle = new JLabel();
      demonTitle.setText(songList[i]);
      Playlist.setAppearance(demonTitle, Color.BLACK, Color.WHITE, new Font("Constantia", Font.BOLD, 25));

      demonSubSongs = new JLabel();
      String labelText0 = "<html>";
      for(String subSong : DemonSlayer.getSubSongList())
        labelText0 += subSong + "<br>";
      demonSubSongs.setText(labelText0 + "</html>");
      Playlist.setAppearance(demonSubSongs, Color.BLACK, Color.WHITE, new Font("DengXian", Font.PLAIN, 20));
      
      i++;
      jingleTitle = new JLabel();
      jingleTitle.setText(songList[i]);
      Playlist.setAppearance(jingleTitle, Color.BLACK, Color.WHITE, new Font("Constantia", Font.BOLD, 25));
      
      jingleSubSongs = new JLabel();
      String labelText1 = "<html>";
      for(String subSong : JingleBells.getSubSongList())
        labelText1 += subSong + "<br>";
      jingleSubSongs.setText(labelText1 + "</html>");
      Playlist.setAppearance(jingleSubSongs, Color.BLACK, Color.WHITE, new Font("DengXian", Font.PLAIN, 20));

      i++;
      miraculousTitle = new JLabel();
      miraculousTitle.setText(songList[i]);
      Playlist.setAppearance(miraculousTitle, Color.BLACK, Color.WHITE, new Font("Constantia", Font.BOLD, 25));
      
      miraculousSubSongs = new JLabel();
      String labelText2 = "<html>";
      for(String subSong : Miraculous.getSubSongList())
        labelText2 += subSong + "<br>";
      miraculousSubSongs.setText(labelText2 + "</html>");
      Playlist.setAppearance(miraculousSubSongs, Color.BLACK, Color.WHITE, new Font("DengXian", Font.PLAIN, 20));

      i++;
      persona5Title = new JLabel();
      persona5Title.setText(songList[i]);
      Playlist.setAppearance(persona5Title, Color.BLACK, Color.WHITE, new Font("Constantia", Font.BOLD, 25));
      
      persona5SubSongs = new JLabel();
      String labelText3 = "<html>";
      for(String subSong : Persona5.getSubSongList())
        labelText3 += subSong + "<br>";
        persona5SubSongs.setText(labelText3 + "</html>");
      Playlist.setAppearance(persona5SubSongs, Color.BLACK, Color.WHITE, new Font("DengXian", Font.PLAIN, 20));
      
      i++;
      twinkleTitle = new JLabel();
      twinkleTitle.setText(songList[i]);
      Playlist.setAppearance(twinkleTitle, Color.BLACK, Color.WHITE, new Font("Constantia", Font.BOLD, 25));
      
      twinkleSubSongs = new JLabel();
      String labelText4 = "<html>";
      for(String subSong : TwinkleTwinkle.getSubSongList())
        labelText4 += subSong + "<br>";
      twinkleSubSongs.setText(labelText4 + "</html>");
      Playlist.setAppearance(twinkleSubSongs, Color.BLACK, Color.WHITE, new Font("DengXian", Font.PLAIN, 20));
      */
      songListTitle.setBounds(0, 15, 1000, 50);
      int yCoor = 66;
      demonTitle.setBounds(50, yCoor, 450, 50);
      yCoor += 9;
      demonSubSongs.setBounds(50, yCoor, 450, 100);
      yCoor += 75;
      jingleTitle.setBounds(50, yCoor, 450, 50);
      yCoor += 9;
      jingleSubSongs.setBounds(50, yCoor, 450, 100);
      yCoor += 75;
      miraculousTitle.setBounds(50, yCoor, 450, 50);
      yCoor += 9;
      miraculousSubSongs.setBounds(50, yCoor, 450, 100);
      yCoor += 75;
      persona5Title.setBounds(50, yCoor, 450, 50);
      yCoor += 9;
      persona5SubSongs.setBounds(50, yCoor, 450, 100);
      yCoor += 75;
      twinkleTitle.setBounds(50, yCoor, 450, 50);
      yCoor += 9;
      twinkleSubSongs.setBounds(50, yCoor, 450, 100);
      yCoor += 75;

      Playlist.addMenuButton(this, true);

      this.add(menuButton);
      this.add(songListTitle);
      for(JLabel mainLabel : getSLMainLabels())
        this.add(mainLabel);
      for(JLabel minorLabel : getSLMinorLabels())
        this.add(minorLabel);
      this.setVisible(false);
    }
    
    @Override
    public void stateChanged(ChangeEvent e)
    {
      playPanel.setBounds(0, 0, Playlist.this.getWidth(), Playlist.this.getHeight());
    }
  } //SongListPanel END
  public class PlayPanel extends JPanel implements ActionListener //ADD BACK TO MENU BUTTON AT TOP LEFT CORNER
  {
    private JLabel instrumentTitle; 
    private JComboBox instrumentSelection;
    private JLabel songTitle;
    private JComboBox songSelection; 
    private JLabel subSongTitle;
    private JComboBox subSongSelection;
    private JLabel speedTitle;
    private JComboBox speedSelection;
    private JLabel repetitionTitle;
    private JComboBox repetitionSelection;
    private JButton playButton;

    public JLabel[] getPlayLabels()
    {
      JLabel[] playLabels = {instrumentTitle, songTitle, subSongTitle, speedTitle, repetitionTitle};
      return playLabels;
    }
    public JComboBox[] getPlayComboBoxs() 
    {
      JComboBox[] playComboBoxs = {instrumentSelection, songSelection, subSongSelection, speedSelection, repetitionSelection};
      return playComboBoxs;
    }
    public JButton[] getPlayButtons()
    {
      JButton[] playButtons = {playButton};
      return playButtons;
    }
    
    public PlayPanel()
    {
      this.setBounds(0, 0, 1000, 600);
      this.setBackground(Color.WHITE);
      this.setLayout(null);

      playTitle = new JLabel("-- PLAY A SONG --");
      playTitle.setHorizontalAlignment(JLabel.CENTER); 
      Playlist.setAppearance(playTitle, Color.BLACK, Color.WHITE, new Font("Comic Sans MS", Font.BOLD, 30));

      instrumentTitle = new JLabel("Instrument");
      instrumentTitle.setFont(new Font("Constantia", Font.BOLD, 25));
      instrumentTitle.setForeground(Color.BLACK);
      Playlist.setAppearance(instrumentTitle, Color.BLACK, Color.WHITE, new Font("Constantia", Font.BOLD, 25));

      instrumentSelection = new JComboBox();
      for(String instrument : basicSelection)
        instrumentSelection.addItem(instrument);
      Playlist.setAppearance(instrumentSelection, Color.BLACK, Color.LIGHT_GRAY, new Font("DengXian", Font.PLAIN, 20));
      instrumentSelection.addActionListener(this);
      
      songTitle = new JLabel("Song Category: ");
      Playlist.setAppearance(songTitle, Color.BLACK, Color.WHITE, new Font("Constantia", Font.BOLD, 25));

      songSelection = new JComboBox();
      for(String song : songList)
      {
        songSelection.addItem(song);
        if(song.equals("Jingle Bells"))
          songSelection.setSelectedItem(song);
      }  
      Playlist.setAppearance(songSelection, Color.BLACK, Color.LIGHT_GRAY, new Font("DengXian", Font.PLAIN, 20));
      songSelection.addActionListener(this);

      subSongTitle = new JLabel("Song Variation/Type: ");  
      Playlist.setAppearance(subSongTitle, Color.BLACK, Color.WHITE, new Font("Constantia", Font.BOLD, 25));

      subSongSelection = new JComboBox();
      for(String subSong : JingleBells.getSubSongList())
      {
        subSongSelection.addItem(subSong);
        if(subSong.equals("Jingle Bells - Original"))
          subSongSelection.setSelectedItem(subSong);
      }
      Playlist.setAppearance(subSongSelection, Color.BLACK, Color.LIGHT_GRAY, new Font("DengXian", Font.PLAIN, 20));
      subSongSelection.addActionListener(this);
      
      speedTitle = new JLabel("Playback Speed: ");
      Playlist.setAppearance(speedTitle, Color.BLACK, Color.WHITE, new Font("Constantia", Font.BOLD, 25));

      speedSelection = new JComboBox();
      for(double speed : playbackOptions)
      {
        String formattedSpeed = String.format("%.2f", speed);
        speedSelection.addItem(formattedSpeed + "X");
      }
      speedSelection.setSelectedItem("1.00X");
      speedSelection.setFont(new Font("DengXian", Font.PLAIN, 20));
      speedSelection.setForeground(Color.BLACK);
      speedSelection.setBackground(Color.LIGHT_GRAY);
      Playlist.setAppearance(speedSelection, Color.BLACK, Color.LIGHT_GRAY, new Font("DengXian", Font.PLAIN, 20));
      speedSelection.addActionListener(this);

      repetitionTitle = new JLabel("Number of Repetitions: "); //0 - 5
      Playlist.setAppearance(repetitionTitle, Color.BLACK, Color.WHITE, new Font("Constantia", Font.BOLD, 25));
      
      repetitionSelection = new JComboBox(new String[] {"0", "1", "2", "3", "4", "5"});
      Playlist.setAppearance(repetitionSelection, Color.BLACK, Color.LIGHT_GRAY, new Font("DengXian", Font.PLAIN, 20));
      repetitionSelection.addActionListener(this);

      playButton = new JButton("PLAY");
      Playlist.setAppearance(playButton, Color.BLACK, Color.LIGHT_GRAY, new Font("Times New Roman", Font.BOLD, 25));
      playButton.setFocusable(false);
      playButton.addActionListener(this);
      playButton.addMouseListener(new MouseAdapter() 
      {
        public void mouseEntered(MouseEvent e) { 
            playButton.setBackground(Color.GRAY);
        }
        public void mouseExited(MouseEvent e) {
            playButton.setBackground(Color.LIGHT_GRAY);
        }
      } );
      
      playTitle.setBounds(0, 15, 1000, 50);
      instrumentTitle.setBounds(50, 66, 200, 50);
      instrumentSelection.setBounds(50, 106, 900, 30);
      songTitle.setBounds(50, 144, 200, 50);   
      songSelection.setBounds(50, 184, 900, 30);
      subSongTitle.setBounds(50, 222, 400, 50); 
      subSongSelection.setBounds(50, 262, 900, 30);
      speedTitle.setBounds(50, 300, 200, 50);  
      speedSelection.setBounds(50, 340, 900, 30); 
      repetitionTitle.setBounds(50, 378, 400, 50);
      repetitionSelection.setBounds(50, 416, 900, 30);  
      playButton.setBounds(425, 470, 150, 50);

      Playlist.addMenuButton(this, true);

      this.add(menuButton);
      this.add(playTitle);
      for(JLabel playTitle : getPlayLabels())
        this.add(playTitle);
      for(JComboBox playComboBox : getPlayComboBoxs())
        this.add(playComboBox);
      for(JButton playButton : getPlayButtons())
        this.add(playButton);
      this.setVisible(false);
    }

    /**
     * Precondition: The instrument, song category, specific song, tempo, and number of repetitions must be specified, meaning they are already chosen by the user. The instrument specified must include the 'Default' that allows the user to have a choice in whether they would like to hear how the song sounds like with the original instrument. 
     * Postcondition: The song that the user wants to be played is heard. The button can't be pressed again for another song until the current song finishs playing (to ensure that that user won't press the button multiple times in a row, preventing the program from playing the same song too many times). 
     */
    public void setInstrumentSelection(String[] list)
    {
      instrumentSelection.removeAllItems();
      for(String instrument : list)
        instrumentSelection.addItem(instrument);
    }

     @Override
    public void actionPerformed(ActionEvent e)
    {
      if(e.getSource() == songSelection)
      {
        String songSelected = songSelection.getSelectedItem().toString();
        subSongSelection.removeAllItems();
        String[] subSongList = {};
        if(songSelected.equals("Demon Slayer"))
          subSongList = DemonSlayer.getSubSongList();
        else if(songSelected.equals("Jingle Bells"))
          subSongList = JingleBells.getSubSongList();
        else if(songSelected.equals("Miraculous Ladybug"))
          subSongList = Miraculous.getSubSongList();
        else if(songSelected.equals("Persona 5"))
          subSongList = Persona5.getSubSongList();
        else if(songSelected.equals("Twinkle Twinkle Little Star"))
          subSongList = TwinkleTwinkle.getSubSongList();
        for(String subSong : subSongList)
          subSongSelection.addItem(subSong);
      } // SongSelection Button END
      else if(e.getSource() == playButton) 
      {
        String instrument = instrumentSelection.getSelectedItem().toString();
        String song = songSelection.getSelectedItem().toString();
        String subSong = subSongSelection.getSelectedItem().toString();
        Double speed = Double.parseDouble(speedSelection.getSelectedItem().toString().substring(0, 4));
        Integer repetitions = Integer.parseInt(repetitionSelection.getSelectedItem().toString());
        playSong(instrument, song, subSong, speed, repetitions);
      } // PlayButton END
    } // ActionPerformed Method END
    private void playSong(String instrument, String specificSong, String specificSubSong, double playbackSpeed, int repetitions)
    {
      int count = 1;
      demonSlayer = new DemonSlayer();
      jingle = new JingleBells();
      miraculous = new Miraculous();
      persona5 = new Persona5();
      twinkle = new TwinkleTwinkle();

      setSongs(instrument, playbackSpeed);
      while(count <= (repetitions + 1))
      {
        if(specificSubSong.contains("Gurenge"))
          demonSlayer.playGurenge();
        else if(specificSubSong.contains("Nezuko's Theme"))
          demonSlayer.playNezuko();
        else if(specificSubSong.contains("Jingle Bells - Original"))
          jingle.playOriginal();
        else if(specificSubSong.contains("Var. I - Brillante"))
          jingle.playBrillante();
        else if(specificSubSong.contains("It's Ladybug"))
          miraculous.playLadybug();
        else if(specificSubSong.contains("Life Will Change"))
          persona5.playLifeWillChange();
        else if(specificSubSong.contains("Twinkle Twinkle Little Star - Original"))
          twinkle.playOriginal();
        count++;
      }
    } // PlaySong Method END
  } //PlayPanel END

  public static void setAppearance(JLabel label, Color fg, Color bg, Font font)
  {
    label.setForeground(fg);
    label.setBackground(bg);
    if(font != null)
      label.setFont(font);
  }
  public static void setAppearance(JComboBox comboBox, Color fg, Color bg, Font font)
  {
    comboBox.setForeground(fg);
    comboBox.setBackground(bg);
    if(font != null)
      comboBox.setFont(font);
  }
  public static void setAppearance(JButton button, Color fg, Color bg, Font font)
  { 
    button.setForeground(fg);
    button.setBackground(bg);
    if(font != null)
      button.setFont(font);
  }
  public static void setAppearance(JRadioButton radioButton, Color fg, Color bg, Font font)
  {
    radioButton.setForeground(fg);
    radioButton.setBackground(bg);
    if(font != null)
      radioButton.setFont(font);
  }

  public void setSongs(String instrument, double playbackSpeed)
  {
    DemonSlayer.setInstrSpeed(instrument, playbackSpeed);
    JingleBells.setInstrSpeed(instrument, playbackSpeed);
    Miraculous.setInstrSpeed(instrument, playbackSpeed);
    Persona5.setInstrSpeed(instrument, playbackSpeed);
    TwinkleTwinkle.setInstrSpeed(instrument, playbackSpeed);
  }
  private static void addMenuButton(JPanel jPanel, boolean light)
  {
    ImageIcon menuButtonIcon; // TBD
    if(light)
      menuButtonIcon = new ImageIcon("MBlight.png");
    else 
      menuButtonIcon = new ImageIcon("MBdark.png");
    Image img = menuButtonIcon.getImage() ;  
    Image newimg = img.getScaledInstance(75, 75, java.awt.Image.SCALE_SMOOTH ) ;  
    menuButtonIcon = new ImageIcon(newimg);
    menuButton = new JButton();
    menuButton.setIcon(menuButtonIcon);
    menuButton.setBounds(25, 0, 75, 75);
    menuButton.setOpaque(false);
    menuButton.setContentAreaFilled(false);
    menuButton.setBorderPainted(false);
    menuButton.addMouseListener(new MouseAdapter()
    {
      public void mouseClicked(MouseEvent e) {
        jPanel.setVisible(false);
        menuPanel.setVisible(true);
      }
    } );
  }
}