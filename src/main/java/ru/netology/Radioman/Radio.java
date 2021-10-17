package ru.netology.Radioman;

public class Radio {
    private int currentChannel;
    private int maxChannel = 9;
    private int minChannel = 0;

    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(){
    }

    public Radio(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public Radio(int currentChannel, int maxChannel) {
        this.currentChannel = currentChannel;
        this.maxChannel = maxChannel;
    }

    public Radio (int currentChannel, int maxChannel, int minChannel, int currentVolume, int maxVolume, int minVolume) {
        this.currentChannel = currentChannel;
        this.maxChannel = maxChannel;
        this.minChannel = minChannel;
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void nextChannel() {
        if (currentChannel == maxChannel) {
            this.currentChannel = minChannel;
            return;
        }
        currentChannel++;
    }

    public void prevChannel() {
        if (currentChannel == minChannel) {
            this.currentChannel = maxChannel;
            return;
        }
        currentChannel--;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            this.currentChannel = maxChannel;
            return;
        }
        if (currentChannel < minChannel) {
            this.currentChannel = minChannel;
            return;
        }
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
        return;
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
        return;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }
}