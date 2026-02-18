package model;

import java.util.ArrayList;
import java.util.List;

public class DogDoor {
    private boolean open=false;
    private List<Bark> allowedBarks=new ArrayList<>();

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
        if(this.open){
            try {
                System.out.println("The Dog Door opens....");
                Thread.sleep(10000);
                this.open=false;
                System.out.println("The Dog Door Closes....");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void addAllowedBark(Bark bark){
        allowedBarks.add(bark);
    }

    public List<Bark> getAllowedBarks(){
        return allowedBarks;
    }

}
