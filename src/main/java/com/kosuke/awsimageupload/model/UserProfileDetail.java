package com.kosuke.awsimageupload.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="USER_PROFILE_DETAIL", schema="IMAGE_UPLOAD")
public class UserProfileDetail {

	@EmbeddedId
	private UserProfileDetailPK id;
	
	@Column(name="AGE", length=3)
	private Integer age;
	
	@Column(name="INCOME", precision=12, scale=1)
	private BigDecimal income;
	
	@Column(name="CREATE_DATE")
	private LocalDateTime createDate;
	
	@Column(name="CREATE_PRG_NM")
	private String createPrgNm;
	
	@ManyToOne
	@JoinColumn(name="USER_PROFILE_ID", referencedColumnName="USER_PROFILE_ID", nullable=false, insertable=false, updatable=false)
//	@JoinColumn(name="USER_PROFILE_ID", nullable=false, insertable=false, updatable=false)
	private UserProfile userProfile;
}
