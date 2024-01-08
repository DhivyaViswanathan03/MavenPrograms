package in.ineuron.test;

import in.ineuron.beans.Student;

public class TestApp {

	public static void main(String[] args) {
		
		Student s1=new Student(10,"divs",30);
		Student s2=new Student(10,"divs",30);
		
		System.out.println("HashCode of s1 is:"+s1.hashCode());
		System.out.println("HashCode of s2 is:"+s2.hashCode());
		
		System.out.println("JVM maintained hashcode of s1 is:"+System.identityHashCode(s1));
		System.out.println("JVM maintained hashcode of s2 is:"+System.identityHashCode(s2));
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.hashCode()==s2.hashCode());
		

	}

}
