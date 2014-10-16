package com.avillardo.framework;

import com.avillardo.framework.Graphics.ImageFormat;

public interface Image {

	public int getWidth();
	public int getHeight();
	public ImageFormat getFormat();
	public void dispose();
}
