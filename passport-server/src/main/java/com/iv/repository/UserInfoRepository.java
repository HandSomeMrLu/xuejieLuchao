package com.iv.repository;

import com.iv.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

    public UserInfo findByUsername(String username);

    public UserInfo findByUserId(Long userId);

    public void deleteBy(Long userId);
}
