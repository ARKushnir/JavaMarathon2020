package day12.task4;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List <Participant>participants = new ArrayList<>();
        List <Participant> participants1 = new ArrayList<>();
        //List <MusicBand> musicBands = new ArrayList<>();
        //List <MusicBand> musicBands1 = new ArrayList<>();

        participants.add(new Participant("Artem"));
        participants.add(new Participant("Alexander"));

        participants1.add(new Participant("Amton"));
        participants1.add(new Participant("Egor"));


        MusicBand musicBand = new MusicBand(1991, "Eminem", participants);
        MusicBand musicBand1 = new MusicBand(1990, "Песняры", participants1);
        //musicBands.add(musicBand);
        //musicBands1.add(musicBand1);


        System.out.println(musicBand.getName());
        musicBand.printMembers();

        System.out.println(musicBand1.getName());
        musicBand1.printMembers();

        MusicBand.transferMembers(musicBand, musicBand1);

        System.out.println(musicBand.getName());
        musicBand.printMembers();

        System.out.println(musicBand1.getName());
        musicBand1.printMembers();

    }
}
