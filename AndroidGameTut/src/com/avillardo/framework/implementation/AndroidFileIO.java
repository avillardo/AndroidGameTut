package com.avillardo.framework.implementation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Environment;
import android.preference.PreferenceManager;

import com.avillardo.framework.FileIO;

public class AndroidFileIO  implements FileIO{
	Context context;
	AssetManager assets;
	String externalStrongPath;
	
	public AndroidFileIO(Context context) {
		this.context = context;
		this.assets = context.getAssets();
		this.externalStrongPath = Environment.getExternalStorageDirectory()
				.getAbsolutePath() + File.separator;
	}

}
