package com.avillardo.enedlagame;

import com.avillardo.framework.Screen;
import com.avillardo.framework.implementation.AndroidGame;

public class EnedlaGame extends AndroidGame {

	@Override
	public Screen getInitScreen() {
		return new LoadingScreen(this);
	}
	
}
