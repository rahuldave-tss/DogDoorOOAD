package model;

public class Remote {
    private DogDoor dogDoor;

    public Remote(DogDoor dogDoor) {
        this.dogDoor = dogDoor;
    }

    public void pressButton(){
        if(dogDoor.isOpen())dogDoor.setOpen(false);
        else dogDoor.setOpen(true);
    }
}
