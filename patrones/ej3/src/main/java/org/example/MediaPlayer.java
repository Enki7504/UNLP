package org.example;

import java.util.ArrayList;

public class MediaPlayer {
    private ArrayList<Media> mediaList;

    public MediaPlayer(){
        mediaList = new ArrayList<>();
    }

    public void addMedia(Media media){
        mediaList.add(media);
    }

    public void play(){
        mediaList.stream().forEach(media -> media.play());
    }
}
