package exceptions;

import domain.LanguageManager;

@SuppressWarnings("serial")
public class LanguageChoiceException extends IllegalArgumentException {
	public LanguageChoiceException() {
		super(LanguageManager.getLanguage().getString("error"));
	}

	public LanguageChoiceException(String s) {
		super(s);
	}
}