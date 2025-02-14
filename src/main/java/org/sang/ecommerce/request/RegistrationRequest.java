package org.sang.ecommerce.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.sang.ecommerce.constant.Role;

@Getter
@Setter
@Builder
public class RegistrationRequest {
	@NotEmpty(message = "Firstname is required")
	@NotBlank(message = "Firstname is required")//tránh trường hợp người dùng nhập mỗi space vào
	private String firstName;
	@NotEmpty(message = "Lastname is required")
	@NotBlank(message = "Lastname is required")
	private String lastName;
	@Email(message = "Email not formatted")
	@NotEmpty(message = "Email is required")
	@NotBlank(message = "Email is required")
	private String email;
	@NotEmpty(message = "Password is required")
	@NotBlank(message = "Password is required")
	@Size(min = 8,message = "Password should contains 8 characters at least")
	private String password;

	private Role role;

}