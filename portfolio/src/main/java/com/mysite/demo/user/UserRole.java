package com.mysite.demo.user;
import lombok.Getter;
@Getter
public enum UserRole {
	ADMIN("ROLE-ADMIN"),
	USER("ROLE_USER");

	UserRole(String value){
		this.value = value;
	}
	private String value;
}
