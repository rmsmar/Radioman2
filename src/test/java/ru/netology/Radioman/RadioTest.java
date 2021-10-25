package ru.netology.Radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio(10);

    @Test
    public void decreaseCurrentVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void decreaseCurrentVolumeDown() {
        radio.setCurrentVolume(90);
        radio.decreaseCurrentVolume();
        assertEquals(89, radio.getCurrentVolume());
    }

    @Test
    public void decreaseCurrentChannel() {
        radio.setCurrentStation(0);
        radio.decreaseCurrentStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void decreaseCurrentChannelDown() {
        radio.setCurrentStation(5);
        radio.decreaseCurrentStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void increaseCurrentChannel() {
        radio.setCurrentStation(10);
        radio.increaseCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void increaseCurrentChannelUp() {
        radio.setCurrentStation(5);
        radio.increaseCurrentStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void increaseCurrentVolume() {
        radio.setCurrentVolume(100);
        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void increaseCurrentVolumeUp() {
        radio.setCurrentVolume(89);
        radio.increaseCurrentVolume();
        assertEquals(90, radio.getCurrentVolume());
    }
}


