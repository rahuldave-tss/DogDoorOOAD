package model;

public class Bark {
    private String sound;

    public Bark(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
    public boolean equals(Bark bark){
        return this.getSound().equals(bark.getSound());
    }

    @Override
    public String toString() {
        return "Bark{" +
                "sound='" + sound + '\'' +
                '}';
    }
}
