package ch3.adt;

import org.junit.Test;

import ch3.adt.MyString;

import static org.junit.Assert.*;

public class MyStringTest {

    @Test
    public void valueOf() {

        MyString s = MyString.valueOf(true);
        assertEquals(4, s.length());
        assertEquals('t', s.charAt(0));
        assertEquals('r', s.charAt(1));
        assertEquals('u', s.charAt(2));
        assertEquals('e', s.charAt(3));
    }

    @Test
    public void length() {
    }

    @Test
    public void charAt() {
    }

    @Test
    public void substring() {
    }
}