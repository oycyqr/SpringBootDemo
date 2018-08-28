package cn.com.bestoyc.springbootjpa.controller;

import cn.com.bestoyc.springbootjpa.entity.OyUser;
import cn.com.bestoyc.springbootjpa.service.OyUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author oyc
 * @Title:
 * @Description:用户控制类
 * @date 2018/7/1615:10
 */
@Controller
@RequestMapping("/user")
public class OyUserController {
    /**
     * 依赖注入，注入用户服务类
     */
    @Resource
    private OyUserService oyUserService;

    /**
     * 查询用户列表
     * @param model
     * @return
     */
    @RequestMapping("list")
    public String list(ModelMap model){
        List<OyUser> users = oyUserService.getUserList();
        model.addAttribute("users",users);
        return "user";
    }
}
