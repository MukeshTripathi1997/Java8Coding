package in.mukeshit.beans;

public class Person {
private Integer age;
private String name;
private String jop;
public Person(Integer age, String name, String jop) {
	this.age = age;
	this.name = name;
	this.jop = jop;
}

public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
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

@Override
public String toString() {
	return "Person [age=" + age + ", name=" + name + ", jop=" + jop + "]";
}
	



}
