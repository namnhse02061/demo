package namnhse.MusicApp.ORM;

import java.io.Serializable;

public class Songs implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5688628138622412294L;
	private int id;
	private String name;
	private String link;

	public Songs() {

	}

	public Songs(int id, String name, String link) {

		this.id = id;
		this.name = name;
		this.link = link;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}
