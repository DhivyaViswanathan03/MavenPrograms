package in.ineuron.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class StudentDto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private Integer age;
	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String address;
	
	
	
}
