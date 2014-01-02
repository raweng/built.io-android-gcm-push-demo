package com.raweng.gcmdemo;

import android.app.Application;

import com.raweng.built.Built;

public class MainApplication extends Application{

	@Override
	public void onCreate() {
		super.onCreate();
		
		try {
			Built.initializeWithApiKey(getApplicationContext(), API_KEY, API_UID);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
