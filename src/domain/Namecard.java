package domain;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Namecard {
	private String name;
	private String surname;
	private Company company;
	
	public Namecard(String name, String surname, Company company) {
		setSurname(surname);
		setName(name);
		setCompany(company);
	}
	
	public void image() {
        try {
			BufferedImage image = ImageIO.read(new File("/images/Namecard_Template.png"));
            Graphics2D g2d = image.createGraphics();
            Font font = new Font("/fonts/", Font.BOLD, 20);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCompany(Company company) {
		this.company = company;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public Company getCompany() {
		return company;
	}
}
