package model;

import java.util.List;

public class BarkRecognizer {
    private DogDoor dogDoor;

    public BarkRecognizer(DogDoor dogDoor) {
        this.dogDoor = dogDoor;
    }

    public void recognize(Bark bark){
        System.out.println("Bark Recognizer: Heard a "+bark.getSound());
        boolean recognized=false;
        List<Bark> allowedBarks=dogDoor.getAllowedBarks();
        for(Bark bark1:allowedBarks){
            if(bark1.equals(bark)){
                recognized=true;
                break;
            }
        }
        if(recognized){
            if(dogDoor.isOpen())dogDoor.setOpen(false);
            else dogDoor.setOpen(true);
            return;
        }
        System.out.println("This dog is not allowed...");

    }
}
