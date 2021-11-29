package com.kosuke.awsimageupload.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserProfileDetailPK implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name="USER_PROFILE_ID", nullable=false, length=40)
	private String userProfileId;
	
	@Column(name="USER_ADDRESS", unique=true, nullable=false)
	private String userAddress;
}
