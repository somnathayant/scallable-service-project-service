package com.ms.PROJECTSERVICE.pojo;
// Generated 23 Nov, 2024 3:14:35 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Project generated by hbm2java
 */
@Entity
@Table(name = "project", catalog = "hrdept")
public class Project implements java.io.Serializable {

	private Integer projectId;
	private Emp emp;
	private String PName;
	private String PDuration;
	private Date PTo;
	private Date PFrom;
	private Set<Emp> emps = new HashSet<Emp>(0);

	public Project() {
	}

	public Project(Emp emp, String PName, String PDuration, Date PTo, Date PFrom, Set<Emp> emps) {
		this.emp = emp;
		this.PName = PName;
		this.PDuration = PDuration;
		this.PTo = PTo;
		this.PFrom = PFrom;
		this.emps = emps;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "project id", unique = true, nullable = false)
	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_id")
	public Emp getEmp() {
		return this.emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	@Column(name = "p_name", length = 45)
	public String getPName() {
		return this.PName;
	}

	public void setPName(String PName) {
		this.PName = PName;
	}

	@Column(name = "p_duration", length = 45)
	public String getPDuration() {
		return this.PDuration;
	}

	public void setPDuration(String PDuration) {
		this.PDuration = PDuration;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "p_to", length = 19)
	public Date getPTo() {
		return this.PTo;
	}

	public void setPTo(Date PTo) {
		this.PTo = PTo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "p_from", length = 19)
	public Date getPFrom() {
		return this.PFrom;
	}

	public void setPFrom(Date PFrom) {
		this.PFrom = PFrom;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
	public Set<Emp> getEmps() {
		return this.emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}

}
