package entities;

// Generated May 26, 2015 1:52:35 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Atm generated by hbm2java
 */
@Entity
@Table(name = "atm", catalog = "atm")
public class Atm implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer atmid;
	private String address;
	private String leftMoney;
	private Set<Log> logs = new HashSet<Log>(0);

	public Atm() {
	}

	public Atm(String address, String leftMoney) {
		this.address = address;
		this.leftMoney = leftMoney;
	}

	public Atm(String address, String leftMoney, Set<Log> logs) {
		this.address = address;
		this.leftMoney = leftMoney;
		this.logs = logs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ATMID", unique = true, nullable = false)
	public Integer getAtmid() {
		return this.atmid;
	}

	public void setAtmid(Integer atmid) {
		this.atmid = atmid;
	}

	@Column(name = "Address", nullable = false)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "LeftMoney", nullable = false, length = 16777215)
	public String getLeftMoney() {
		return this.leftMoney;
	}

	public void setLeftMoney(String leftMoney) {
		this.leftMoney = leftMoney;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "atm")
	public Set<Log> getLogs() {
		return this.logs;
	}

	public void setLogs(Set<Log> logs) {
		this.logs = logs;
	}

}
