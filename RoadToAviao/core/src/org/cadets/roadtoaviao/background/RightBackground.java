package org.cadets.roadtoaviao.background;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class RightBackground {
    private SpriteBatch backBatch;
    private Texture backImg;
    private final int xPos;
    private int yPos;
    private final int speed;

    public RightBackground() {
        xPos = 900;
        yPos = 0;
        speed = 5;
    }

    public void init() {
        backBatch = new SpriteBatch();
        backImg = new Texture("RightBack.png");
    }

    public void start() {
        backBatch.begin();
        backBatch.draw(backImg,xPos,yPos);
        backBatch.end();

        //yPos -= speed;

        checkLimits();
    }

    public void dispose() {
        backBatch.dispose();
        backImg.dispose();
    }

    private void checkLimits() {
        if (yPos <= -840) {
            yPos = 0;
        }
    }
}
