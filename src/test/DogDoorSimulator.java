package test;

import model.Bark;
import model.BarkRecognizer;
import model.DogDoor;
import model.Remote;

public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        door.addAllowedBark(new Bark("rowlf"));
        door.addAllowedBark(new Bark("rooowlf"));
        door.addAllowedBark(new Bark("rawlf"));
        door.addAllowedBark(new Bark("woof"));
        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);
        // Simulate the hardware hearing a bark
        System.out.println("Bruce starts barking.");
        recognizer.recognize(new Bark("rowlf"));
        System.out.println("\nBruce has gone outside...");


        System.out.println("\nBruce’s all done...");
        System.out.println("...but he’s stuck outside!");
        // Simulate the hardware hearing a bark (not Bruce!)
        System.out.println("Bitsie started barking...");
        Bark smallDogBark = new Bark("yip");
        System.out.println("A small dog starts barking.");
        recognizer.recognize(smallDogBark);

        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) { }

        // Simulate the hardware hearing a bark again
        System.out.println("Bruce starts barking.");
        recognizer.recognize(new Bark("rooowlf"));
        System.out.println("\nBruce’s back inside...");
    }
}

