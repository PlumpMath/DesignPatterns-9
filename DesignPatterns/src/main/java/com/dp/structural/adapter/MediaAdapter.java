package com.dp.structural.adapter;

public class MediaAdapter implements MediaPlayer {
	
	private VideoPlayer videoPlayer;
	
	public MediaAdapter(String type) {
		if (type.equals("video")) {
			this.videoPlayer = new VLCMediaPlayer();
		}
	}

	@Override
	public void play(String fileName, String fileType) {
		if (fileType.equals("video")) {
			this.videoPlayer.playVideo(fileName, fileType);
		}
	}
}
