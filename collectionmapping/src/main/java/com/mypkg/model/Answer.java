package com.mypkg.model;

public class Answer {
	int id;
	String answer;
	String posterName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getPosterName() {
		return posterName;
	}
	public void setPosterName(String posterName) {
		this.posterName = posterName;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + ", posterName=" + posterName + "]";
	}
	
}
