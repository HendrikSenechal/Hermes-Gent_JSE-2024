package domain;

import domain.LanguageManager;
import resources.Language;

public class DomainController {
	private LanguageManager languageManager;
	
	public void setLanguageManager(Language language) {
		LanguageManager.setLanguage(language);
	}
	
	public void getLanguageManager(Language language) {
		LanguageManager.setLanguage(language);
	}
}
