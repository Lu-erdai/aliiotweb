package com.ruoyi.project.api;


import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.project.system.chitang.domain.Chitang;
import com.ruoyi.project.system.chitang.service.IChitangService;
import com.ruoyi.project.system.user.domain.User;
import com.ruoyi.project.system.user.service.IUserService;
import com.ruoyi.project.system.user.service.UserServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Description:
 * @Param:
 * @return:
 * @Author: luwx
 * @Date: 2021/9/24
 */


@Api("阿里物联网数据接口")
@RestController
@RequestMapping("/aliiot/api")
public class AliiotApi {
    @Autowired
    private IUserService userService;

    @Autowired
    private IChitangService chitangService;


    @CrossOrigin
    @GetMapping("/login")
    @ResponseBody
    public Long getHisData(@RequestParam String username, @RequestParam String password, HttpServletResponse response) {

        User user = new User();
        user.setLoginName(username);
        user.setApppassword(password);
        List<User> users = userService.selectUserList(user);
        Long userId = null;
        if(users.size()>0){
            User user1 = users.get(0);
            userId = user1.getUserId();
        }

        return userId;
    }


    //获取用户归属的池塘
    @CrossOrigin
    @GetMapping("/getUserChitangs")
    @ResponseBody
    public AjaxResult getUserChitangs(@RequestParam Long userId) {

        List<Chitang> chitangs = chitangService.selectAllUserChitangs(userId);

        return AjaxResult.success(chitangs);

    }






}
