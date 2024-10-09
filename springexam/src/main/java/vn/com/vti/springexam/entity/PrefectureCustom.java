package vn.com.vti.springexam.entity;

import java.util.Date;

public class PrefectureCustom  extends Prefecture{
	private String infrastructureName;
	private Date registDate;
	public String getInfrastructureName() {
		return infrastructureName;
	}
	public void setInfrastructureName(String infrastructureName) {
		this.infrastructureName = infrastructureName;
	}
	public Date getRegistDate() {
		return registDate;
	}
	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}
}
