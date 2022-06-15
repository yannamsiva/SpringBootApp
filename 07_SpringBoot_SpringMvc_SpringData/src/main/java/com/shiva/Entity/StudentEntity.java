package com.shiva.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentEntity {

	@Id
	@GeneratedValue
	private int sno;
	private String sname;
	private String saddd;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddd() {
		return saddd;
	}
	public void setSaddd(String saddd) {
		this.saddd = saddd;
	}
	
	
}
