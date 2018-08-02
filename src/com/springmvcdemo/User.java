package com.springmvcdemo;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class User {

	@NotBlank(message = "Name can't left blank")
	@Size(min = 2, max = 20, message = "Size 2 to 20")
	@Pattern(regexp = "^[\\p{Alnum}\\s]+$", message = "name can only contain alpha numeric characters and spaces")
	private String name;

	private Integer id;

	// required, strong password, min length
	@NotBlank(message = "password can't left blank")
	@Size(min = 8, message = "password can't be less than 8 chars")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).+$", message = "password must contain at least one digit, one lower char and one upper char, one special char, and doesn't contain spaces")
	private String password;

	// required, a valid email format
	@NotBlank(message = "email can’t left blank")
	@Email(message = "please enter a valid email", regexp = ".+@.+\\..+")
	private String email;

	// required, date in the past
	@NotNull(message = "birth date can't left blank")
	@Past
	private Date birth;

	// required, min is 15 and max is 100
	@NotNull(message = "age is required")
	@Min(value = 5, message = "age can't be less than 5")
	@Max(value = 100, message = "age can't be greater than 100")
	private Integer age;

	// value between 50 and 300
	@Range(min = 50, max = 300, message = "height has to be within 50 and 300")
	private Integer height;

	// can't be empty; there must be at least one.
	@NotEmpty(message = "you must choose at least one")
	private String[] hobbies;

	public User() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
}