package com.dp.structural.adapter;

public class VLCMediaPlayer implements VideoPlayer {

	@Override
	public void playVideo(String fileName, String fileType) {
		System.out.println("Playing file of type " + fileType + " with name " + fileName);
	}
}
