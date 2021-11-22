package com.bridgelabz.MoodAnalyser;

public class moodAnalyser {
	public static void main(String[] args) {
		System.out.println("Welcome to mood analyser Program");
	}

	public String analyseMood(String message) {
		if (message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
	}
}