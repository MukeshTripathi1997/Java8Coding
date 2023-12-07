package in.mukeshit.beans;

public class Person {
	private String name;
	private String jop;
	private Long phno;
	
	public Person(String name, String jop, Long phno) {
		this.name = name;
		this.jop = jop;
		this.phno = phno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJop() {
		return jop;
	}
	public void setJop(String jop) {
		this.jop = jop;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", jop=" + jop + ", phno=" + phno + "]";
	}
	
	

}
