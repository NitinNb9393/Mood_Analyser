package com.bridgelabz.MoodAnalyser;

import org.junit.Assert;

public class MoodAnalyserTest {
    @org.junit.Test
    void givenMessage_WhenSad_ShouldReturnSad() {
        moodAnalyser moodAnalyser = new moodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Sad Mood");
        Assert.assertEquals("SAD", mood);
    }
}
