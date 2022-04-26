package co.jp.netwisdom.entity;

public class Userinfo {
	
	private String username;
	private String password;
	private String sex;
	private String major;
	private String intro;

	public void setUsername(String username){
		this.username = username;
	}
	
	public String getUsername(){
		return this.username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}
	
	public Userinfo(String username,String password,String sex,String major,String intro){
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.major = major;
		this.intro = intro;
	}
	
	public Object[] getObjArray(){
		Object[] vals = {
			this.username,
			this.password,
			this.sex,
			this.major,
			this.intro
		};
		return vals;
	}
}
