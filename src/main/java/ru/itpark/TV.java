package ru.itpark;

public class TV {
    private int currentChannel;
    private int currentVolume;

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel < 0){
            return;
        }
        if (currentChannel > 100) {
            return;
        }
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public void increaseCurrentChannel() {

    }
    public void decreaseCurrentChannel() {

    }
    public void increaseCurrentVolume() {

    }
    public void decreaseCurrentVolume() {

    }
}
