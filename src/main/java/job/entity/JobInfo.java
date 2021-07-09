package job.entity;

import javax.persistence.*;

@Entity
@Table(name = "JobInfo")
public class JobInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;	                 
	@Column(name = "company_name")
	private String companyName;	              
	@Column(name = "company_addr")
	private String companyAddr;	                
	@Column(name = "company_info")
	private String companyInfo	; 
	@Column(name = "job_name")
	private String jobName;    	           
	@Column(name = "job_addr")
	private String jobAddr;	               
	@Column(name = "job_info")
	private String jobInfo;	    
	@Column(name = "salary_min")
	private int salaryMin;	              
	@Column(name = "salary_max")
	private int salaryMax;                        
	@Column(name = "url")
	private String url;	                                       
	@Column(name = "time")
	private String time;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddr() {
		return companyAddr;
	}
	public void setCompanyAddr(String companyAddr) {
		this.companyAddr = companyAddr;
	}
	public String getCompanyInfo() {
		return companyInfo;
	}
	public void setCompanyInfo(String companyInfo) {
		this.companyInfo = companyInfo;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getJobAddr() {
		return jobAddr;
	}
	public void setJobAddr(String jobAddr) {
		this.jobAddr = jobAddr;
	}
	public String getJobInfo() {
		return jobInfo;
	}
	public void setJobInfo(String jobInfo) {
		this.jobInfo = jobInfo;
	}
	public int getSalaryMin() {
		return salaryMin;
	}
	public void setSalaryMin(int salaryMin) {
		this.salaryMin = salaryMin;
	}
	public int getSalaryMax() {
		return salaryMax;
	}
	public void setSalaryMax(int salaryMax) {
		this.salaryMax = salaryMax;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}	
	
	
}
