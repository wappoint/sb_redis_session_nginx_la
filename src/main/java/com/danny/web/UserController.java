package com.danny.web;

import com.danny.constants.UserConstants;
import com.danny.domain.ResultData;
import com.danny.service.UserService;
import com.danny.vo.user.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author 676002187@qq.com
 */
@Api (tags = {"用户信息"}, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping (value = "/user")
public class UserController {
    @Autowired private UserService userService;

    @ApiOperation (value = "添加用户信息", notes = "添加用户信息", response = String.class, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping (value = "/addCache", method = RequestMethod.POST)
    public ResponseEntity<ResultData> addCache(@RequestBody UserVO userVO, HttpSession session) {
        ResultData resultData;
        userService.addCache(userVO);
        session.setAttribute(UserConstants.USER_VO, userVO);
        resultData = new ResultData(session.getId(), HttpStatus.OK, "添加缓存成功", "");
        return ResponseEntity.status(HttpStatus.OK).body(resultData);
    }

    @ApiOperation (value = "获取用户信息", notes = "获取用户信息", response = String.class, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping (value = "/getSession", method = RequestMethod.GET)
    public ResponseEntity<ResultData> getSession(HttpSession session) {
        ResultData resultData;
        resultData = new ResultData(session.getId(), HttpStatus.OK, "获取UserVO", session.getAttribute(UserConstants.USER_VO));
        return ResponseEntity.status(HttpStatus.OK).body(resultData);
    }
}
