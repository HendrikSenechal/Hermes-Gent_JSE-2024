package main;

import cui.JseApplication;
import domain.DomainController;

public class Startup {
	public static void main(String[] args) {
		Startup startup = new Startup();
		startup.startSplendor();
	}

	public void startSplendor() {
		JseApplication jseApp = new JseApplication(new DomainController());
		jseApp.start();
	}
}

