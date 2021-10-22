package ru.netology.Radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        radio.setCurrentChannel(0);
        radio.decreaseCurrentChannel();
        assertEquals(10, radio.getCurrentChannel());
    }

    @Test
    public void decreaseCurrentChannelDown() {
        radio.setCurrentChannel(5);
        radio.decreaseCurrentChannel();
        assertEquals(4, radio.getCurrentChannel());
    }

    @Test
    public void increaseCurrentChannel() {
        radio.setCurrentChannel(10);
        radio.increaseCurrentChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void increaseCurrentChannelUp() {
        radio.setCurrentChannel(5);
        radio.increaseCurrentChannel();
        assertEquals(6, radio.getCurrentChannel());
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


