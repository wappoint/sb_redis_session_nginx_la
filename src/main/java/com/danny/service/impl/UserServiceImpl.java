package com.danny.service.impl;

import com.danny.constants.UserConstants;
import com.danny.service.UserService;
import com.danny.vo.user.UserVO;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author 676002187@qq.com
 */
@Service
@Cacheable
public class UserServiceImpl implements UserService {
    /**
     * @param userVO
     */
    @Cacheable (value = UserConstants.USER_VO, key = UserConstants.KEY_USER_VO)
    @Override
    public void addCache(UserVO userVO) {
        System.out.println("cached userVO");
    }
}
