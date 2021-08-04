/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 * @Zheng
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * @author Zheng
 * <p>
 * demo
 */

public class demo {

    public static void main(String[] args) {
        Album album = new Album("Red", "Taylor Swift");
        album.addSong("22", 4.90);
        album.addSong("Red", 3.80);
        album.addSong("All Too Well", 5.50);

//        album.PlayAlbum(album.getSongs());

        LinkedList<Song> Playlist = new LinkedList<Song>();

        album.addToPlayList("All Too Well", Playlist);
        album.addToPlayList(1,Playlist);
        album.addToPlayList(2,Playlist);


        Play(Playlist);
    }

    public static void Play(LinkedList<Song> playlist){
        ListIterator<Song> iterator = playlist.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;


        if (playlist.size() <=0){
            System.out.println("Playlist is empty.");
            return;
        }else {
            System.out.println("Now playing " + iterator.next().getTitle());

        }

        System.out.println("=============================");
        System.out.println("Please enther 1 ~ 8" +
            "\n 1: print the option"+
            "\n 2: add song to playlist" +
            "\n 3: pause the play" +
            "\n 4: Resume playing the song"+
            "\n 5: play the next song" +
            "\n 6: play the previous song" +
            "\n 7: stop play music" +
            "\n 8: print the playlist");

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 1://print the option
                    System.out.println("Please enter 1 ~ 8" +
                        "\n 1: print the option"+
                        "\n 2: add song to playlist" +
                        "\n 3: pause the play" +
                        "\n 4: Resume playing the song"+
                        "\n 5: play the next song" +
                        "\n 6: play the previous song" +
                        "\n 7: stop play music" +
                        "\n 8: print the playlist");
                    break;
                case 2://add song to play list
                    System.out.println("Pleas enter the name of song: ");
                    String name = scanner.next();
                    scanner.nextLine();
                    System.out.println("Please enter the duration of the song: ");
                    double duration = scanner.nextDouble();
                    scanner.nextLine();
                    Song newsong = new Song(name,duration);
                    playlist.add(newsong);


                    break;
                case 3:// pause the play
                    System.out.println("Pause the playing");
                    iterator.previous();


                    break;
                case 4://
                    System.out.println("Now playing " + iterator.next().getTitle());

                    break;
                case 5:
                    if(!forward) {
                        if (iterator.hasNext()){
                            iterator.next();

                        }
                        forward = true;
                    }

                        if (iterator.hasNext()) {

                            System.out.println("Now playing " + iterator.next().getTitle());
                            break;
                        }else {System.out.println("Reach the end of playlist");
                        break;}




                case 6:
                    if(forward) {
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        forward = false;

                    }


                        if (iterator.hasPrevious()){

                            System.out.println("Now playing " + iterator.previous().getTitle());
                            break;
                        }else {
                            System.out.println("Reach the beginning of the playlist");
                            forward =true;
                            break;
                        }


                case 7:
                    quit = true;
                    System.out.println("Stopped");


                    break;
                case 8:
                    for (Song i :playlist){
                        System.out.println(i.toString());
                    }


                    break;



            }


        }

    }

}
