package com.RohanSoni;

public class Main {
    public static void main(String[] args) {
        // Bathroom
                //
        // Kitchen
                // Refrigerator
                // RO
        // DrawingRoom
                // AC
                // LED
        // StudyRoom
                // Library
                // Computer
        // Bedroom
                // Bed
        StudyRoom studyRoom = new StudyRoom(10,8,8,new Library(4,3),
                true,true,2,2,1,
                new Computer("Dell","32 inches",16,"ssd",2000));

        studyRoom.getLibrary().getBook().add("Steve Jobs");
        studyRoom.getLibrary().getBook().add("Autobiography of a yogi");
        studyRoom.getLibrary().getBook().add("Rich dad poor dad");

        studyRoom.getLibrary().searchForReading();
    }
}
