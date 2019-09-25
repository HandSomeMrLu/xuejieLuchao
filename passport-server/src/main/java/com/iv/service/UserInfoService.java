package com.iv.service;

import com.iv.annotation.Auth;
import com.iv.entity.RoleInfo;
import com.iv.entity.UserInfo;
import com.iv.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserInfoService implements UserDetailsService {

    @Autowired
    UserInfoRepository userInfoRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo user = userInfoRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        List<GrantedAuthority> authorities = new ArrayList<>();

        List<RoleInfo> roles = user.getRoles();

        for (RoleInfo role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getRole()));
        }

        return new User(user.getUsername(), user.getPassword(), authorities);
    }

    public UserInfo findUserInfo(Long userId) {
        return userInfoRepository.findByUserId(userId);
    }

    public void modifyUserInfo(UserInfo user) {
        userInfoRepository.save(user);
    }

    @Auth
    public void deleteUserInfo(Long userId) {
        userInfoRepository.deleteBy(userId);
    }

    @Auth
    public void addUserInfo(UserInfo user) {
        userInfoRepository.save(user);
    }

}
