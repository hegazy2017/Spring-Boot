package com.Academia.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="MSG_STATUS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MsgStatus {
	
	@Id
	@Column(name="ID",nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private Long id;
	@JsonProperty("status_code")
	@Column(name="STATUS_CODE")
	private int statusCode;
	@JsonProperty("status_desc")
	@Column(name="STATUS_DESC")
	private String statusDesc;

}
