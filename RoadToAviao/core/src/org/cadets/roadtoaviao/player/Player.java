package org.cadets.roadtoaviao.player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Player {

    private int xPos;
    private int yPos;
    private int speed;
    private SpriteBatch batch;
    private Texture img;

    public Player() {
        xPos = 600;
        yPos = 50;
        speed = 5;
    }

    public void init() {
        batch = new SpriteBatch();
        img = new Texture("car.png");
    }

    public void start() {
        batch.begin();
        batch.draw(img,xPos,yPos);
        batch.end();
        moveLeft();
        moveRight();
    }

    public void dispose() {
        batch.dispose();
        img.dispose();
    }

    public void moveRight() {
        if (Gdx.input.isKeyPressed(Input.Keys.D)) {
            xPos += speed;
        }
    }

    public void moveLeft() {
        if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            xPos -= speed;
        }
    }
}
