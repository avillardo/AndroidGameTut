package com.avillardo.framework;

public interface Game {
	
	public Audio getAudio();
	
	public Input getInput();
	
	public FIleIO getFileIO();
	
	public Graphics getGraphics();
	
	public void setScreen(Screen screen);
	
	public Screen getCurrentScreen();
	
	public Screen getInitScreen();

}
