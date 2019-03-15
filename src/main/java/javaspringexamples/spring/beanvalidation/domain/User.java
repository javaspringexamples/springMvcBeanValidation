package javaspringexamples.spring.beanvalidation.domain;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class User {

	@Size(min = 3, max = 20)
	String username;

	@Pattern(regexp = "^[a-zA-Z]\\w{3,14}$")
	String password;

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