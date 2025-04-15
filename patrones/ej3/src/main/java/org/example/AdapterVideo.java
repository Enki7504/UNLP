package org.example;

public class AdapterVideo extends Media {
    private VideoStream videoStream;

    public AdapterVideo(VideoStream videoStream) {
        this.videoStream = videoStream;
    }

    public String play() {
        return videoStream.reproduce();
    }
}
