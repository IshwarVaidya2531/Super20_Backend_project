package com.tka.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "faculty_attendance")
public class FacultyAttendance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "faculty_id", nullable = false)
	private Faculty faculty;

	@ManyToOne
	@JoinColumn(name = "class_schedule_id", nullable = false)
	private ClassSchedule classSchedule;

	@Temporal(TemporalType.DATE)
	private Date date;

	private String status;

	public FacultyAttendance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FacultyAttendance(Long id, Faculty faculty, ClassSchedule classSchedule, Date date, String status) {
		super();
		this.id = id;
		this.faculty = faculty;
		this.classSchedule = classSchedule;
		this.date = date;
		this.status = status;
	}

	public FacultyAttendance(Faculty faculty, ClassSchedule classSchedule, Date date, String status) {
		super();
		this.faculty = faculty;
		this.classSchedule = classSchedule;
		this.date = date;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public ClassSchedule getClassSchedule() {
		return classSchedule;
	}

	public void setClassSchedule(ClassSchedule classSchedule) {
		this.classSchedule = classSchedule;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "FacultyAttendance [id=" + id + ", faculty=" + faculty + ", classSchedule=" + classSchedule + ", date="
				+ date + ", status=" + status + "]";
	}
		
}
