/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 * @Zheng
 */

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Zheng
 */

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;





    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }




    public  boolean addSong(String title, double duration){
        Song newsong = new Song(title,duration);

//        Iterator<Song> songIterator = songs.iterator();
//
//        while (songIterator.hasNext()){
//            int comparison = songIterator.next().getTitle().compareTo(title);
//            if (comparison ==0){
//                // equal, same title song already there. Dont add
//                System.out.println(title + " has already on the list. ");
//                return false;
//            }else if (comparison >0){
//                // new song should appear before this one
//                songIterator.
//
//
//
//            }
//        }
//
//        return false;

            if (findSong(title) ==null) {
                this.songs.add(newsong);
                System.out.println(title + " has been added to the album. ");
                return true;
            }

        return false;
    }

    public Song findSong(String title){

        for (int i =0; i < songs.size(); i++){
            if (songs.get(i).getTitle().equals(title)){
                return songs.get(i);
            }
        }
        return null;
    }

//    private boolean findSongs(String title){
//
//        for (int i =0; i < songs.size(); i++){
//            if (songs.get(i).getTitle().equals(title)){
//
//                return true;
//            }
//        }
//        return false;
//    }

    public boolean addToPlayList(int number, LinkedList<Song> playlist){
        int index = number-1;
       if ((index >=0) && (index < playlist.size())) {playlist.add(this.songs.get(index));
           System.out.println(songs.get(index).getTitle() + " has been successfully added to the playlist.");
           return true;}
       else return false;
    }

    public boolean addToPlayList (String title, LinkedList<Song> playlist){
        if(findSong(title).getTitle().equals(title)){
            playlist.add(findSong(title));
            System.out.println(title + " has been successfully added to the playlist.");
            return true;
        }else {
            System.out.println(title + " is not in the Album.");
            return false;
        }

    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void PlayAlbum(ArrayList<Song> albumlist){
        for (Song i : albumlist){
            System.out.println(i.getTitle());
        }

    }


}
