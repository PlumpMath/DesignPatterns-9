package com.dp.structural.adapter;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		MediaPlayer player = new AudioPlayer();
		player.play("test.mp3", "audio");
		player.play("test.mp4", "video");
	}

}
