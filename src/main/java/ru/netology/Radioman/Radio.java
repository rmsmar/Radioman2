package ru.netology.Radioman;

public class Radio {
    private int currentChannel;
    private int maxChannel = 10;
    private int minChannel = 0;

    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public void increaseCurrentChannel() {
        if (currentChannel >= maxChannel) {
            currentChannel = minChannel;
            return;
        }
        currentChannel += 1;
    }

    public void decreaseCurrentChannel() {
        if (currentChannel <= minChannel) {
            currentChannel = maxChannel;
            return;
        }
        currentChannel -= 1;
    }

    public void increaseCurrentVolume() {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
            return;
        }
        currentVolume += 1;
    }

    public void decreaseCurrentVolume() {
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
            return;
        }
        currentVolume -= 1;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public void setMinChannel(int minChannel) {
        this.minChannel = minChannel;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }
}