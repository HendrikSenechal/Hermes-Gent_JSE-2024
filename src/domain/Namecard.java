package domain;

public class Namecard {
	private String name;
	private String surname;
	private Company company;
	
	public Namecard(String name, String surname, Company company) {
		setSurname(surname);
		setName(name);
		setCompany(company);
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
