package co.jp.netwisdom.entity;

public class Hobby {

	private String username;
	private String hobby;
	private String[] hobbyArray;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public Hobby(String username, String hobby) {
		super();
		this.username = username;
		this.hobby = hobby;
	}
	
	public Hobby(String username, String hobby,String[] hobbyArray) {
		super();
		this.username = username;
		this.hobby = hobby;
		this.hobbyArray = hobbyArray;
	}
	
	public String[] getHobbyArray() {
		return hobbyArray;
	}
	public void setHobbyArray(String[] hobbyArray) {
		this.hobbyArray = hobbyArray;
	}
	
	
}
