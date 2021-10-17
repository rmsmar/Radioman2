package ru.netology.Radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldNextChannel() {
        Radio station = new Radio();
        station.setCurrentChannel(7);
        station.nextChannel();
        assertEquals(8, station.getCurrentChannel());
    }

    @Test
    public void shouldSetNextChannel() {
        Radio station = new Radio(5,9);
        station.nextChannel();
        assertEquals(6, station.getCurrentChannel());
    }

    @Test
    void shouldSetPrevChannel() {
        Radio station = new Radio(6,9);
        station.prevChannel();
        assertEquals(5, station.getCurrentChannel());
    }

    @Test
    public void shouldSetPrevChannelFromMin() {
        int expectedMaxChannel = 10;
        Radio station = new Radio(0 , expectedMaxChannel);
        station.prevChannel();
        assertEquals(expectedMaxChannel, station.getCurrentChannel());
    }

    @Test
    public void shouldSetNextChannelFromMax() {
        Radio radio = new Radio(10, 10);
        radio.nextChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void shouldPrevChannelFromMin() {
        //предыдущий канал с минимального значения
        Radio station = new Radio();
        station.setCurrentChannel(0);
        station.prevChannel();
        assertEquals(9, station.getCurrentChannel());
    }

    @Test
    //предыдущий канал с многозначного значения
    public void shouldPrevChannelFromAnyValue() {
        Radio station = new Radio();
        station.setCurrentChannel(320);
        station.prevChannel();
        assertEquals(8, station.getCurrentChannel());
    }

    @Test
    public void shouldNextChannelFromMax() {
        //следующий канал после максимального
        Radio station = new Radio();
        station.setCurrentChannel(9);
        station.nextChannel();
        assertEquals(0, station.getCurrentChannel());
    }

    @Test
    //следующий канал после многозначного номера
    public void shouldNextChannelMulti() {
        Radio station = new Radio();
        station.setCurrentChannel(120);
        station.nextChannel();
        assertEquals(0, station.getCurrentChannel());
    }

    @Test
    public void shouldSetChannel() {
        Radio station = new Radio();
        station.setCurrentChannel(2);
        assertEquals(2, station.getCurrentChannel());
    }

    @Test
    //ввести многозначные номера каналов
    public void shouldSetChannelAny() {
        Radio station = new Radio();
        station.setCurrentChannel(35);
        assertEquals(9, station.getCurrentChannel());
    }

    @Test
    //следующий канал после многозначного отрицательного значения
    public void shouldNextChannelMinus() {
        Radio station = new Radio();
        station.setCurrentChannel(-520);
        station.nextChannel();
        assertEquals(1, station.getCurrentChannel());
    }

    @Test
    //предыдущий канал после многозначного отрицательного значения
    public void shouldPrevChannelMinus() {
        Radio station = new Radio();
        station.setCurrentChannel(-320);
        station.prevChannel();
        assertEquals(9, station.getCurrentChannel());
    }

    @Test
    //ввести многозначные отрицательные номера каналов
    public void shouldSetChannelMinus() {
        Radio station = new Radio();
        station.setCurrentChannel(-20);
        assertEquals(0, station.getCurrentChannel());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(9);
        station.increaseVolume();
        assertEquals(10, station.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(1);
        station.decreaseVolume();
        assertEquals(0, station.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeFromAnyVolume() {
        //увеличить громкость с любого значения до максимального
        Radio station = new Radio();
        station.setCurrentVolume(100);
        station.increaseVolume();
        assertEquals(100, station.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeFromAnyVolume() {
        //уменьшить громкость с любого многозначного значения
        Radio station = new Radio();
        station.setCurrentVolume(100);
        station.decreaseVolume();
        assertEquals(99, station.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeFromMin() {
        //уменьшить громкость с минимального значения
        Radio station = new Radio();
        station.setCurrentVolume(0);
        station.decreaseVolume();
        assertEquals(0, station.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeFromMax() {
        //увеличить громкость с максимального значения
        Radio station = new Radio();
        station.setCurrentVolume(10);
        station.increaseVolume();
        assertEquals(11, station.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeFromAnyMinus() {
        //уменьшить громкость с любого отрицательного значения
        Radio station = new Radio();
        station.setCurrentVolume(-100);
        station.decreaseVolume();
        assertEquals(0, station.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeFromAnyMinus() {
        //увеличить громкость с любого отрицательного значения
        Radio station = new Radio();
        station.setCurrentVolume(-100);
        station.increaseVolume();
        assertEquals(1, station.getCurrentVolume());
    }
}


