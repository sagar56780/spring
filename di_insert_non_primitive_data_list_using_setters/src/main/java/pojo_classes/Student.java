package pojo_classes;

import java.util.List;

public class Student {
	List<College> colleges;

	public List<College> getColleges() {
		return colleges;
	}

	public void setColleges(List<College> colleges) {
		this.colleges = colleges;
	}

	@Override
	public String toString() {
		return "Student [colleges=" + colleges + "]";
	}

}
