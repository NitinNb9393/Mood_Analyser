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

	public String analyseMood(String message) throws moodAnalysisException {
		this.message = message;
		return analyseMood();
	}

	public String analyseMood() throws moodAnalysisException {
		try {
			if (message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException exception) {
			throw new moodAnalysisException(moodAnalysisException.ExceptionType.ENTERED_NULL,
					"Please enter proper message");
		}
	}
}