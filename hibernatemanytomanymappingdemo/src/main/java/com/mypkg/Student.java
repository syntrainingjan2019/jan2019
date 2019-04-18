package com.mypkg;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="Student")
public class Student {
	@Id
	@GeneratedValue
	@Column(name="student_id")
	private long studentId;
	@Column(name="student_name",length=100)
	private String studentname;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="student_course",joinColumns={ @JoinColumn(name="student_id") }, inverseJoinColumns = { @JoinColumn(name = "course_id") })
	private Set<Course> courses=new HashSet<Course>();
	public Student(String studentname, Set<Course> courses) {
		super();
		this.studentname = studentname;
		this.courses = courses;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

}
