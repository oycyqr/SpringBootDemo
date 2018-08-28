package cn.com.bestoyc.springbootjpa.service.Impl;

import cn.com.bestoyc.springbootjpa.dao.OyUserRepository;
import cn.com.bestoyc.springbootjpa.entity.OyUser;
import cn.com.bestoyc.springbootjpa.service.OyUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author oyc
 * @Description: 用户服务实现类
 * @date 2018/7/1 615:07
 */
@Service
public class OyUserServerImpl implements OyUserService {
    /**
     * 依赖注入，注入用户JPA接口类
     */
    @Resource
    private OyUserRepository oyUserRepository;

    @Override
    public List<OyUser> getUserList() {
        List<OyUser> list = oyUserRepository.findAll();
        return list;
    }
}
