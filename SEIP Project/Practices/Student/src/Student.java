
public class Student {
	private String Id;
	private String name;
	private int age;
	public Student(String id, String name, int age) {
		super();
		this.Id = id;
		this.name = name;
		this.age = age;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
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
	
	

}
