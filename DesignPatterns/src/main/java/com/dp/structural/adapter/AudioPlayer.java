package com.dp.structural.adapter;

/**
 * Adapter pattern works as a bridge between two incompatible interfaces.
 * This pattern involves a single class which is responsible to join functionalities of 
 * independent or incompatible interfaces.
 * A real life example could be a case of card reader which acts as an adapter between memory 
 * card and a laptop. You plugin the memory card into card reader and card reader into the 
 * laptop so that memory card can be read via laptop.
 * @author rahuldev
 *
 */
public class AudioPlayer implements MediaPlayer {
	
	@Override
	public void play(String fileName, String fileType) {
		if (fileType.equals("audio")) {
			System.out.println("Playing file of type " + fileType + " with name " + fileName);
		} else {
			MediaAdapter adapter = new MediaAdapter(fileType);
			adapter.play(fileName, fileType);
		}
	}
}
