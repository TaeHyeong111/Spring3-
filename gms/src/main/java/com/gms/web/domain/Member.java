package com.gms.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data // d
public class Member {
	private String userId, ssn, name, roll, teamId, password, age, subject, gender;
	
}
