package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class MediaPlayerTest {
	
	MediaPlayer mediaPlayer;
	Audio audio;
	VideoFile videoFile;
	VideoStream videoStream;
	AdapterVideo adapterVideo;

	
	@BeforeEach
	void setUp() throws Exception {
		audio = new Audio();
		videoFile = new VideoFile();
		videoStream = new VideoStream();
		adapterVideo = new AdapterVideo(videoStream);
		mediaPlayer = new MediaPlayer();

		mediaPlayer.addMedia(audio);
		mediaPlayer.addMedia(videoFile);
		mediaPlayer.addMedia(adapterVideo);
	}
	
    @Test
    public void testAudio() {
        assertEquals("Playing audio", audio.play());
    }

	@Test
	public void testVideo() {
		assertEquals("Playing video", videoFile.play());
	}

	@Test
	public void testAdapterVideo() {
		assertEquals("Reproduciendo video", adapterVideo.play());
	}
}
