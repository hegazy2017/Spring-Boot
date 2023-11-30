package com.Academia.security.User.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity()
@Table(name = "Aca_roles")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("role_id")
	@Column(name="ROLE_ID")
	private Long roleId;

	@JsonProperty("role_name")
	@NotBlank(message = "Must enter Role Name")
	@Column(name="ROLE_NAME")
	private String role_name;
	

	

	

}