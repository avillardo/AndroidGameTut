package com.avillardo.enedlagame;

import java.util.List;

import com.avillardo.framework.Game;
import com.avillardo.framework.Graphics;
import com.avillardo.framework.Screen;
import com.avillardo.framework.Input.TouchEvent;


public class MainMenuScreen extends Screen {
	public MainMenuScreen(Game game) {
		super(game);
	}
	
	@Override
	public void update(float deltaTime) {
		Graphics g = game.getGraphics();
		List<TouchEvent> touchEvents = game.getInput().getTouchEvents();
		
		int len = touchEvents.size();
		for (int i = 0; i < len; i++) {
			
			//CONTINUE HERE
			
		}
	}
	
}
