package com.kosuke.awsimageupload.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="USER_PROFILE", schema="IMAGE_UPLOAD")
public class UserProfile implements Serializable {
		
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="USER_PROFILE_ID", unique=true, nullable=false, length=40)
	private String userProfileId;
	
	@Column(name="USER_NAME", unique=true, nullable=false, length=20)
	private String username;
	
	@Column(name="USER_PROFILE_IMAGE_LINK")
	private String userProfileImageLink;
	
	@Column(name="CREATE_DATE")
	private LocalDateTime createDate;
	
	@Column(name="CREATE_PRG_NM")
	private String createPrgNm;
	
	@OneToMany(mappedBy="userProfile", cascade=CascadeType.ALL)
	private List<UserProfileDetail> userProfileDetail;
	
//	public UserProfile() {};
//	
//	public UserProfile(String userProfileId, String username, String userProfileImageLink) {
//		this.userProfileId = userProfileId;
//		this.username = username;
//		this.userProfileImageLink = userProfileImageLink;
//	}
//	
//	public String getUserprofileId() {
//		return userProfileId;
//	}
//	
//	public void setUserProfileId(String userProfileId) {
//		this.userProfileId = userProfileId;
//	}
//	
//	public String getUsername() {
//		return username;
//	}
//	
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	
	public Optional<String> getUserProfileImageLink() {
		return Optional.ofNullable(userProfileImageLink);
	}
//	
//	public void setUserProfileImageLink(String userProfileImageLink) {
//		this.userProfileImageLink = userProfileImageLink;
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		UserProfile other = (UserProfile) obj;
//		return Objects.equals(userProfileImageLink, other.userProfileImageLink) &&
//			   Objects.equals(username, other.username) &&
//			   Objects.equals(userProfileId, other.userProfileId);
//	}
//	
//	@Override
//	public int hashCode() {
//		return Objects.hash(userProfileImageLink, username, userProfileId);
//	}
}
