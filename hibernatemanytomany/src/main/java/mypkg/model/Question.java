package mypkg.model;
import java.util.*;
public class Question {
	
	private int id;
	private String name;
	private Map<String ,User> answers;
	public Question(String name, Map<String, User> answers) {
		super();
		
		this.name = name;
		this.answers = answers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, User> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<String, User> answers) {
		this.answers = answers;
	}

}
