package kr.ac.jbnu.se.tetris;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Bgm extends Thread{
    private boolean isloop;
    public Bgm(boolean isloop) {
            try {
                this.isloop = isloop;
            } catch (Exception e) {
            }
        }
    public void close(Clip clip){
        isloop = false;
        clip.close();
        this.interrupt();
    }
    public void run(){
        try {
            do{
                File Clap = new File("mario.wav");
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(Clap)) ;
                clip.start();
            }while(isloop);
        }
        catch(Exception e){

        }
    }
}
