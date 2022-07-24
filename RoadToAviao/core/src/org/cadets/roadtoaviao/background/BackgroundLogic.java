package org.cadets.roadtoaviao.background;

public class BackgroundLogic {
    private final LeftBackground leftBackground;
    private final Background background;
    private final RightBackground rightBackground;

    public BackgroundLogic() {
        leftBackground = new LeftBackground();
        background = new Background();
        rightBackground = new RightBackground();
    }

    public void init() {
        leftBackground.init();
        background.init();
        rightBackground.init();
    }

    public void start() {
        leftBackground.start();
        background.start();
        rightBackground.start();
    }

    public void dispose() {
        leftBackground.dispose();
        background.dispose();
        rightBackground.dispose();
    }
}
