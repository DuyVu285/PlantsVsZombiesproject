import java.awt.event.ActionEvent;
import javax.swing.*;
public class Peashooter extends Plant {

    public Timer shootTimer;
    public Timer fasterTimer;
    public Peashooter(GamePanel parent,int x,int y) {
        super(parent,x,y);
            shootTimer = new Timer(2000,(ActionEvent e) -> {
                if(gp.laneZombies.get(y).size() > 0) {
                    gp.lanePeas.get(y).add(new Pea(gp, y, 103 + this.x * 100));
                }
            });
            shootTimer.start();
           
        }
    public boolean Checklocation(int y)
    {
        if (GamePanel.lanePlantNut[y]!= 0 && GamePanel.lanePlantSun[y] != 0)
        {
            return true;
        }
        return false;
    }
    @Override
    public void stop(){
        shootTimer.stop();
        fasterTimer.stop();
    }

}
