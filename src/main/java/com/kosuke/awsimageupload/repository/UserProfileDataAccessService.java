package com.kosuke.awsimageupload.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kosuke.awsimageupload.datastore.FakeUserProfileDataStore;
import com.kosuke.awsimageupload.model.UserProfile;


/**
 * FakeUserProfileクラスからデータを取得するクラス
 * @author torit
 *
 */
@Repository
public interface UserProfileDataAccessService extends JpaRepository<UserProfile, String> {
	
}
