package hibernateonetoonemapping;
import javax.persistence.*;
@Entity
@Table(name="students")
public class Student {
	@Id
	@Column(name="sid")
	private int studentId;
	@Column(name="sname",length=30)
	private String studentName;
	@Column(name="grp",length=30)
	private String grp;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getGrp() {
		return grp;
	}
	public void setGrp(String grp) {
		this.grp = grp;
	}
	
}
