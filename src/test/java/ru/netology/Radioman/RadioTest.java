package ru.netology.Radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldSpecifyStationQuantityPositive() {
        Radio radio = new Radio((int) 120);
        radio.setStationsQuantity((int) 1);
        assertEquals(1, radio.getStationsQuantity());
    }

    @Test
    void shouldSpecifyStationQuantityNegative() {
        Radio radio = new Radio((int) 120);
        radio.setStationsQuantity((int) 121);
        assertEquals(10, radio.getStationsQuantity());
    }

    @Test
    void shouldSpecifyStationQuantityNegative2() {
        Radio radio = new Radio((int) 120);
        radio.setStationsQuantity((int) 0);
        assertEquals(10, radio.getStationsQuantity());
    }


    @Test
    void shouldSpecifyStationWithDefaultQuantityPositive() {
        radio.setStation(5);
        assertEquals(5, radio.getStation());
    }

    @Test
    void shouldSpecifyStationWithDefaultQuantityNegative() {
        radio.setStation(11);
        assertEquals(0, radio.getStation());
    }

    @Test
    void shouldSpecifyStationWithDefaultQuantityNegative2() {
        radio.setStation(-1);
        assertEquals(0, radio.getStation());
    }


    @Test
    void shouldSpecifyStationWithCustomQuantityPositive() {
        Radio radio = new Radio((int) 120);
        radio.setStationsQuantity((int) 60);
        radio.setStation(30);
        assertEquals(30, radio.getStation());
    }

    @Test
    void shouldSpecifyStationWithCustomQuantityNegative() {
        Radio radio = new Radio((int) 120);
        radio.setStationsQuantity((int) 60);
        radio.setStation(61);
        assertEquals(0, radio.getStation());
    }


    @Test
    void shouldSwitchStationUpDefault() {
        Radio radio = new Radio("Радио FM", 9);
        radio.switchStationUp(); // 9~10
        radio.switchStationUp(); // 10~0
        assertEquals(0, radio.getStation());
    }

    @Test
    void shouldSwitchStationDownDefault() {
        Radio radio = new Radio("Радио FM", 1);
        radio.switchStationDown(); // 1~0
        radio.switchStationDown(); // 0~10
        assertEquals(10, radio.getStation());
    }


    @Test
    void shouldIncreaseVolumeMax() {
        Radio radio = new Radio(99);
        radio.increaseVolume(); // 99~100
        radio.increaseVolume(); // 100~100
        assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolumeMin() {
        Radio radio = new Radio(1);
        radio.decreaseVolume(); // 1~0
        radio.decreaseVolume(); // 0~0
        assertEquals(0, radio.getVolume());
    }


    @Test
    void shouldSetVolumeNegative() {
        Radio radio = new Radio(101);
        assertEquals(30, radio.getVolume());
    }

    @Test
    void shouldSetVolumeNegative2() {
        Radio radio = new Radio(-1);
        assertEquals(30, radio.getVolume());
    }
}


