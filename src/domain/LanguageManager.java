
package domain;

import resources.Language;

public class LanguageManager {
	private static Language selectedLanguage;

	public static void setLanguage(Language lang) {
		selectedLanguage = lang;
	}

	public static Language getLanguage() {
		return selectedLanguage;
	}
}