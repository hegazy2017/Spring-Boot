package com.Academia.security.User.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity()
@Table(name = "Aca_users")
@Setter
@Getter
@NoArgsConstructor
public class AppUser {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="Aca_USER_APP_SEQ")
	@SequenceGenerator(name="Aca_USER_APP_SEQ" ,sequenceName = "Aca_USER_APP_SEQ",allocationSize = 1)
	@JsonIgnore
	@Column(name = "ID", nullable = false)
	private Long id;
	
	@JsonProperty("userName")
	@Column(name="USER_NAME")
	private String userName;

	@JsonProperty("fullName")
	@Column(name="fullName")
	private String fullName;
	
	@JsonProperty("password")
	@Column(name="password")
	private String password;

	@JsonProperty("old_password")
	@Column(name="OLD_PASSWORD")
	private String oldPassword;	
	
    @Column(name = "reset_password_token")
    private String resetPasswordToken;
	
	@JsonProperty("isEnabled")
	@Column(name="isEnabled")
	private boolean isEnabled;

	@JsonProperty("isCredentialsNonExpired")
	@Column(name="isCredentialsNonExpired")
	private boolean isCredentialsNonExpired;
	
	@JsonProperty("isAccountNonLocked")
	@Column(name="isAccountNonLocked")
	private boolean isAccountNonLocked;
	
	@JsonProperty("isAccountNonExpired")
	@Column(name="isAccountNonExpired")
	private boolean isAccountNonExpired;

	//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ROLE_ID",referencedColumnName = "ROLE_ID")
	private Role roles;
	
	public AppUser(Long id) {
		super();
		this.id = id;
	}

	public AppUser(Long id, String userName, String fullName, String password, String oldPassword,
			String resetPasswordToken, boolean isEnabled, boolean isCredentialsNonExpired, boolean isAccountNonLocked,
			boolean isAccountNonExpired, Role roles) {
		super();
		this.id = id;
		this.userName = userName;
		this.fullName = fullName;
		this.password = password;
		this.oldPassword = oldPassword;
		this.resetPasswordToken = resetPasswordToken;
		this.isEnabled = isEnabled;
		this.isCredentialsNonExpired = isCredentialsNonExpired;
		this.isAccountNonLocked = isAccountNonLocked;
		this.isAccountNonExpired = isAccountNonExpired;
		this.roles = roles;
	}

	
	
	
	
	
	
	

}

	
	

