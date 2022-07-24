package org.cadets.roadtoaviao.background;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class LeftBackground {
    private Texture backImg;
    private SpriteBatch backBatch;
    private final int xPos;
    private int yPos;
    private final int speed = 5;

    public LeftBackground() {
        xPos = 0;
    }

    public void init() {
        backBatch = new SpriteBatch();
        backImg = new Texture("LeftBack.png");
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
        backBatch.dispose();
    }

    private void checkLimits() {
        if (yPos <= -840) {
            yPos = 0;
        }
    }
}
