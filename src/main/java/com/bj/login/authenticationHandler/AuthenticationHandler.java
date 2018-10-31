package com.bj.login.authenticationHandler;


import com.bj.applicationContextHelper.ApplicationContextHelper;
import com.bj.cuser.entity.CUser;
import com.bj.cuser.service.CUserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AuthenticationHandler  implements UserDetailsService {
    Log logger = LogFactory.getLog(AuthenticationHandler.class);


     //CUserService mUserSer = (CUserService) ApplicationContext.getBean(CUserService.class);
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //根据username换取账户信息
        CUserService mUserSer = (CUserService) ApplicationContextHelper.getBean(CUserService.class);
        List<CUser> mCUsers = new ArrayList<CUser>();
        mCUsers.addAll(mUserSer.getUserInfoById(username));
        if(mCUsers.size() == 0){
            return null;
        }

        CUser mUser = mCUsers.get(0);

        Collection<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(mUser.getRole());
        auths.add(authority);
        User user = new User(username, mUser.getPassword(), auths);

        logger.info("Authentication Certification success... \n");
        return user;
    }

}
