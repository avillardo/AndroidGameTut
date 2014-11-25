package com.avillardo.framework.implementation;

import java.io.IOException;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;

import com.avillardo.framework.Music;

public class AndroidMusic implements Music, OnCompletionListener, 
OnSeekCompleteListener, OnPreparedListener, OnVideoSizeChangedListener {

	MediaPlayer mediaPlayer;
	boolean isPrepared = false;
	
	public AndroidMusic(AssetFileDescriptor assetDescriptor) {
		mediaPlayer = new MediaPlayer();
		try {
			mediaPlayer.setDataSource(assetDescriptor.getFileDescriptor(),
					assetDescriptor.getStartOffset(),
					assetDescriptor.getLength());
			mediaPlayer.prepare();
			isPrepared = true;
			mediaPlayer.setOnCompletionListener(this);
			mediaPlayer.setOnSeekCompleteListener(this);
			mediaPlayer.setOnPreparedListener(this);
			mediaPlayer.setOnVideoSizeChangedListener(this);
		} catch (Exception e) {
			throw new RuntimeException("Couldn't load music");
		}
	}
	
	@Override
	public void dispose() {
		
		if (this.mediaPlayer.isPlaying()) {
			this.mediaPlayer.stop();
		}
		this.mediaPlayer.release();
	}
	
	@Override
	public boolean isLooping() {
		return mediaPlayer.isLooping();
	}
	
	@Override
	public boolean isPlaying() {
		return this.mediaPlayer.isPlaying();
	}
	
	@Override
	public boolean isStopped() {
		return !isPrepared;
	}
	
	@Override
	public void pause() {
		if (this.mediaPlayer.isPlaying())
			mediaPlayer.pause();
	}
	
	
	
	
}
