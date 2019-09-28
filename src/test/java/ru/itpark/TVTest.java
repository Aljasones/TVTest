package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TVTest {
    @Test
    public void shouldSetCurrentChannelWhenVolumeOutOfUpperBounds(){
        TV tv = new TV();
        int before = tv.getCurrentChannel();
        tv.setCurrentChannel(1000);

        int actual = tv.getCurrentChannel();
        assertEquals(before, actual);
    }
    @Test
    public void shouldSetCurrentChannelWhenVolumeOutOfLowerBounds(){
        TV tv = new TV();
        int before = tv.getCurrentChannel();
        tv.setCurrentChannel(-1000);

        int actual = tv.getCurrentChannel();
        assertEquals(before, actual);
    }
}
