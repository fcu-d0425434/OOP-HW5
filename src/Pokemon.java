
public class Pokemon {

	private String name;
	private int cp;

	public Pokemon(String name, int cp) {
		this.name = name;
		this.cp = cp;

	}

	public String getname() {
		return this.name;

	}

	public int getcp() {
		return this.cp;

	}

	public void setcp() {
		this.cp += 500;

	}
}
