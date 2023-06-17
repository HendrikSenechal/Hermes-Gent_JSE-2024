package cui;

import java.util.Scanner;

import domain.DomainController;
import resources.Language;

public class JseApplication {
	private DomainController dc;
	private Language language;
	private Scanner input = new Scanner(System.in);

	public JseApplication(DomainController dc) {
		this.dc = dc;
	}

	public void start() {
		chooseLanguage();
		System.out.println(language.getString("languageChoice"));
		while (true) {
			System.out.println("");// list with all possible choices
			switch (input.next()) {
			case "1":
				break;
			}
		}
	}

	public void chooseLanguage() {
		String choice;
		do {
			System.out.println("Choose language, english: 1, nederlands: 2");
			choice = input.next();
			switch (choice) {
			case "1":
				language = new Language(1);
				break;
			case "2":
				language = new Language(2);
				break;
			default:
				System.out.println("That isn't an option");
				break;
			}
		} while (choice != "1" && choice != "2");

	}
}
