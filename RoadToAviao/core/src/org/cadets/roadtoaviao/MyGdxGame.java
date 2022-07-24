package org.cadets.roadtoaviao;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.ScreenUtils;
import org.cadets.roadtoaviao.background.Background;
import org.cadets.roadtoaviao.background.BackgroundLogic;
import org.cadets.roadtoaviao.player.Player;

public class MyGdxGame extends ApplicationAdapter {
	private final BackgroundLogic background = new BackgroundLogic();
	private final Player player = new Player();
	private OrthographicCamera camera;
	
	@Override
	public void create () {
		background.init();
		camera = new OrthographicCamera();
		camera.setToOrtho(true,1200,800);
		player.init();

	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 0);
		camera.translate(10,10);
		camera.update();
		background.start();
		player.start();
	}

	@Override
	public void dispose () {
		player.dispose();
		background.dispose();
	}
}
