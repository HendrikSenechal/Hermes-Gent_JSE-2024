package domain;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.io.File;
import java.io.IOException;


import domain.Namecard;

public class NamecardRepository {
	private ArrayList<Namecard> Namecards = new ArrayList<Namecard>();

	public NamecardRepository() {
	}

	public void addNamecard(String name, String surname, Company company) {
		Namecards.add(new Namecard(name, surname, company));
		if (Namecards.size() >= 8)
			print();
	}

	public void print() {
		throw new IllegalArgumentException();
		// TODO: - find way to print out & clear list
	}
	
	
}
