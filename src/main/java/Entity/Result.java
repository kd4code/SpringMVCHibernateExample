package Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="RESULT")
public class Result implements Serializable{
	 
 @Id
 @Column(name="Roll_no")
 private int roll;
 @Column(name="Name")
 private String name;
 @Column(name="Maths")
 private int math;
 @Column(name="Science")
 private int science;
 @Column(name="English")
 private int english;
 
public Result() {
	super();
}

public Result(int roll, String name, int math, int science, int english) {
	super();
	this.roll = roll;
	this.name = name;
	this.math = math;
	this.science = science;
	this.english = english;
}



public int getRoll() {
	return roll;
}

public void setRoll(int roll) {
	this.roll = roll;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getMath() {
	return math;
}

public void setMath(int math) {
	this.math = math;
}

public int getScience() {
	return science;
}

public void setScience(int science) {
	this.science = science;
}

public int getEnglish() {
	return english;
}

public void setEnglish(int english) {
	this.english = english;
}

@Override
public String toString() {
	return "Result [roll=" + roll + ", name=" + name + ", math=" + math + ", science=" + science + ", english="
			+ english + "]";
}


 
}
