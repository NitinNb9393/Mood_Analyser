package com.bridgelabz.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		moodAnalyser moodAnalyser = new moodAnalyser();
		String mood = null;
		try {
			mood = moodAnalyser.analyseMood("I am in Sad Mood");
		} catch (moodAnalysisException e) {
			e.printStackTrace();
		}
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenMessage_WhenInAnyMood_ShouldReturnHappy() {
		moodAnalyser moodAnalyser = new moodAnalyser();
		String mood = null;
		try {
			mood = moodAnalyser.analyseMood("I am in Any Mood");
		} catch (moodAnalysisException e) {
			e.printStackTrace();
		}
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		moodAnalyser moodAnalyser = new moodAnalyser();
		String mood = null;
		try {
			mood = moodAnalyser.analyseMood("I am in Happy Mood");
		} catch (moodAnalysisException e) {
			e.printStackTrace();
		}
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad_UsingParameterizedConstructor() {
		moodAnalyser moodAnalyser = new moodAnalyser("I am in Sad Mood");
		String mood = null;
		try {
			mood = moodAnalyser.analyseMood();
		} catch (moodAnalysisException e) {
			e.printStackTrace();
		}
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy_UsingParameterizedConstructor() {
		moodAnalyser moodAnalyser = new moodAnalyser("I am in Happy Mood");
		String mood = null;
		try {
			mood = moodAnalyser.analyseMood();
		} catch (moodAnalysisException e) {
			e.printStackTrace();
		}
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenNullMood_ShouldThrow_MoodAnalysisException() {
		moodAnalyser moodAnalyser = new moodAnalyser(null);
		try {
			moodAnalyser.analyseMood();
		} catch (moodAnalysisException e) {
			Assert.assertEquals(moodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
}