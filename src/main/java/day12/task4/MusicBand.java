package day12.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MusicBand {
    private int year;

    public String getName() {
        return name;
    }

    private String name;
    private List<Participant> participants;

    public List<Participant> getMembers() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public MusicBand(int year, String name, List<Participant> participants) {
        this.year = year;
        this.name = name;
        this.participants = participants;
    }

    public int getYear() {
        return year;
    }



   public static void transferMembers  (MusicBand srcMusicBand, MusicBand tgtMusicBand ){
       tgtMusicBand.participants.addAll(srcMusicBand.participants);
       srcMusicBand.participants.clear();
   }

    public void printMembers() {
        for (Participant participant:participants ){
            System.out.println(participant);
        }
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "year=" + year +
                ", name='" + name + '\'' +
                ", participant=" + participants +
                '}';
    }
}
