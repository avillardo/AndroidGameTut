package com.avillardo.framework;

public interface Game {
	
	public Audio getAudio();
	
	public Input getInput();
	
	public FileIO getFileIO();
	
	public Graphics getGraphics();
	
	public void scrunsetScreen(Screen screen);
	//laptop
	public Screen getCurrentScreen();
	
	public Screen getInitScreen();

}
//laptop