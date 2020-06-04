
public class Person implements Comparable<Person> {

	private String name;
	private int age;
	private int year;
	private String nif;

	public Person(String name, int age, int year) {
		super();
		this.name = name;
		this.age = age;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	@Override
	public int compareTo(Person o) {
		
			return Integer.valueOf(this.age).compareTo(Integer.valueOf(o.getAge()));
			
	}

}
