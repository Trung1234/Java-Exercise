package userinterface;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


public class MyFrame extends JFrame{
    public static final int WIDTH_FRAME = 28 * 20;
    public static final int HEIGHT_FRAME = 29 * 20;
     MyPanel myPanel;

    public MyFrame() {
        setTitle("Game Tank 1990");

        //set kich cho khung tranh
        setSize(WIDTH_FRAME, HEIGHT_FRAME);

        //show ra giua man hinh
        setLocationRelativeTo(null);
        setResizable(false);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        init();
        playMusic();

    }
    public void playMusic()  {
        // open the sound file as a Java input stream
        String gongFile = "src/sound/xf1.mid";
        InputStream in = null;
        try {
            in = new FileInputStream(gongFile);
            AudioStream audioStream = new AudioStream(in);

            // play the audio clip with the audioplayer class
            AudioPlayer.player.start(audioStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // create an audiostream from the inputstream

    }

    private void init() {
        myPanel = new MyPanel();
        add(myPanel);
    }


}
