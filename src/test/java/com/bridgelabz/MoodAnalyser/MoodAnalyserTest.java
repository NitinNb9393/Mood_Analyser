package com.bridgelabz.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		moodAnalyser moodAnalyser = new moodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in Sad Mood");
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenMessage_WhenInAnyMood_ShouldReturnHappy() {
		moodAnalyser moodAnalyser = new moodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in Any Mood");
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		moodAnalyser moodAnalyser = new moodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in Happy Mood");
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad_UsingParameterizedConstructor() {
		moodAnalyser moodAnalyser = new moodAnalyser("I am in Sad Mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenNullMood_ShouldReturnHappy() {
		moodAnalyser moodAnalyser = new moodAnalyser(null);
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
}