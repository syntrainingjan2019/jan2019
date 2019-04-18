package com.mypkg;
import javax.persistence.*;

@Entity
@Table(name="course")
public class Course {
	@Id
	@GeneratedValue
	@Column(name="course_id")
	private long courseId;
	@Column(name="course_name")
	private String courseName;
	public Course(){		
	}
	public Course(String courseName ){		
		this.courseName=courseName;
	}
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
