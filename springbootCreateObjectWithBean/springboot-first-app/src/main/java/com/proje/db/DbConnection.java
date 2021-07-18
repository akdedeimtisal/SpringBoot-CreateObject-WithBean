package com.proje.db;

public class DbConnection {
	public String url;
	private String username;
	private String password;
	
	
	public void openConnection() {
		System.out.println("URL: " + url);
		System.out.println("Username: " + username );
		System.out.println("Password: " + password);
		System.out.println("Connection is opened");
	}
	
	public void closeConnection() {
		System.out.println("Connection is closed");
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
