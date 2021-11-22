package com.bridgelabz.MoodAnalyser;

public class moodAnalyser {
	private String message;

	public moodAnalyser() {
	}

	public moodAnalyser(String message) {
		this.message = message;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to mood analyser Program");
	}

	public String analyseMood(String message) {
		this.message = message;
		return analyseMood();
	}

	public String analyseMood() {
		try {
			if (message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException exception) {
			return "HAPPY";
		}
	}
}