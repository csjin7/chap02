package chap06;

public class Memba implements Comparable<Memba> {
	String name;
	
	public Memba(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Memba o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}

}
