package model;

import javax.swing.*;
import java.awt.*;

public class EnemyBullet extends Bullet {
//    public static Image IMG_BULLET_ENEMY = new ImageIcon(
//            EnemyBullet.class.getResource("/images/Button_Enemy.png"))
//            .getImage();
    public EnemyBullet(int id, int x, int y, int size, int orientation) {
        super(id, x, y, size, orientation);
    }

    @Override
    public void move() {
        super.move();
    }
}
