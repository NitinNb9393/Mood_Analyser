package com.bridgelabz.MoodAnalyser;

class moodAnalysisException extends Exception {
	ExceptionType type;

	enum ExceptionType {
		ENTERED_NULL, ENTERED_EMPTY
	}

	public moodAnalysisException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}