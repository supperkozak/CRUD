package crud.model;

import javax.persistence.*;

@Entity
@Table(name = "BOOKS")

public class Book {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "AUTHOR")
	private String author;
	
	@Column(name = "PRISE")
	private int prise;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrise() {
		return prise;
	}
	public void setPrise(int prise) {
		this.prise = prise;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", prise=" + prise + "]";
	}
	
	 	
	

}
