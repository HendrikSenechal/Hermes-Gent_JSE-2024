package resources;

import java.util.ResourceBundle;
import exceptions.LanguageChoiceException;

public class Language {
    private static ResourceBundle resourceBundle;

    public Language(int choice) {
        switch (choice) {
            case 1:
				resourceBundle = ResourceBundle.getBundle("resources.messages_en");
                break;
            case 2:
				resourceBundle = ResourceBundle.getBundle("resources.messages_nl");
                break;
            default:
                throw new LanguageChoiceException();
        }
    }

    public static String getString(String key) {
        return resourceBundle.getString(key);
    }

}