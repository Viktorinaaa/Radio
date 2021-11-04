package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    ////////////////////////////////////////////////////////////////////////

    @ParameterizedTest
    @CsvSource(
            value = {"'Mid', 5, 5",
                    "'Min', 0, 0",
                    "'Max', 9, 9"
            }
    )
    public void getCurrentRS(String name, int currentRS, int expected) {
        Radio radio = new Radio();

        radio.setCurrentRS(currentRS);
        int actual = radio.getCurrentRS();
        //int expected = 0;

        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource(
            value = {"'Mid', 3, 4",
                    "'Min', 0, 1",
                    "'Max', 9, 0",
                    "'UnderMin', -1, 0",
                    "'OverMax', 10, 0",
                    "'UnderMin1', -10, 0",
                    "'OverMax1', 100, 0"
            }
    )
    void increaseRS(String name, int currentRS, int expected) {
        Radio radio = new Radio();

        radio.setCurrentRS(currentRS);
        radio.increaseRS();

        int actual = radio.getCurrentRS();
        //int expected = 0;

        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource(
            value = {"'Mid', 6, 5",
                    "'Min', 0, 9",
                    "'Max', 9, 8",
                    "'UnderMin', -1, 0",
                    "'OverMax', 20, 0"
            }
    )
    void decreaseRS(String name, int currentRS, int expected) {
        Radio radio = new Radio();

        radio.setCurrentRS(currentRS);
        radio.decreaseRS();

        int actual = radio.getCurrentRS();
        //int expected = 9;

        assertEquals(expected, actual);
    }


    //////////////////////////////////////////////////////////////////////

    @ParameterizedTest
    @CsvSource(
            value = {"'Mid', 3, 3",
                    "'Min', 0, 0",
                    "'Max', 10, 10"
            }
    )
    void getCurrentVolume(String name, int currentVolume, int expected) {
        Radio radio = new Radio();

        radio.setCurrentVolume(currentVolume);
        int actual = radio.getCurrentVolume();
        //int expected = 2;

        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource(
            value = {"'Mid', 3, 4",
                    "'Min', 0, 1",
                    "'Max', 10, 10",
                    "'UnderMin', -1, 0",
                    "'OverMax', 20, 0"
            }
    )
    void increaseVolume(String name, int currentVolume, int expected) {
        Radio radio = new Radio();

        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        //int expected = 1;

        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource(
            value = {"'Mid', 3, 2",
                    "'Min', 0, 0",
                    "'Max', 10, 9",
                    "'UnderMin', -1, 0",
                    "'OverMax', 20, 0"
            }
    )
    void decreaseVolume(String name, int currentVolume, int expected) {
        Radio radio = new Radio();

        radio.setCurrentVolume(currentVolume);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        //int expected = 4;

        assertEquals(expected, actual);
    }


}

