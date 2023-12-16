package code;

import java.util.Arrays;

public class Student {
	private int id;
	private String name;
	private int[] marks;
	private int total;
	private double avg;
	
	public Student(int id, String name, int[] marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.total = this.marks[0]+this.marks[1]+this.marks[2];
		this.avg = total/3;	
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + ", total=" + total
				+ ", avg=" + avg + "]";
	}
	

}
