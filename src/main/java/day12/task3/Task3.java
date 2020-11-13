package day12.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> musicBands = new ArrayList<>();

        musicBands.add(new MusicBand("Ramstein", 1964));
        musicBands.add(new MusicBand("Nirvana", 1960));
        musicBands.add(new MusicBand("Mettalica", 1952));
        musicBands.add(new MusicBand("MicleJackson", 1960));
        musicBands.add(new MusicBand("Riachna", 2005));
        musicBands.add(new MusicBand("SpiceGirls", 2010));
        musicBands.add(new MusicBand("Snapnot", 1999));

        for (MusicBand music: musicBands){
            System.out.println(music.year + " "+ music.name);
        }

        for (MusicBand music: groupsAfter2000(musicBands)){
            System.out.println(music.year+" "+music.name);
        }

    }


    public static List<MusicBand> groupsAfter2000  (List<MusicBand> musicBands) {
           // musicBands.get(1).getYear()

            List<MusicBand> groupsafter = new ArrayList<>();

            for (MusicBand music:musicBands) {
                if (music.getYear()>2000) {
                    groupsafter.add(music);
                }

            }
            return groupsafter;
        }


    }
