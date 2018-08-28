package cn.com.bestoyc.springbootjpa.service;

import cn.com.bestoyc.springbootjpa.entity.OyUser;

import java.util.List;

/**
 * @author oyc
 * @Title:
 * @Description:用户服务接口类
 * @date 2018/7/1615:06
 */
public interface OyUserService {
    List<OyUser> getUserList();
}
