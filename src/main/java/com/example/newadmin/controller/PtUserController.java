package com.example.newadmin.controller;

import com.example.newadmin.domain.PtUser;
import com.example.newadmin.service.IPtUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;


/**
 * 用户信息Controller
 *
 * @author user
 * @date 2023-01-25
 */
@Controller
@RequestMapping("/api/user")
public class PtUserController
{
    @Autowired
    private IPtUserService ptUserService;
    private HashMap<String,Object> map = new HashMap<>();
    /**
     * 用户注册
     * */
    @PostMapping("/register")
    @ResponseBody
    public HashMap<String,Object> addSave(PtUser ptUser)
    {
      try {
          int i = ptUserService.insertPtUser(ptUser);
          if(i>0){
              map.put("code",1);
              map.put("msg","注册成功");
          }else{
              map.put("code",-1);
              map.put("msg","注册失败");
          }
      }catch (Exception e){
          System.out.println(e);
          map.put("code",-1);
          map.put("msg","服务器发生错误，请联系管理员");
      }
        return map;
    }

    /**
     * 用户登录
     * */
    @PostMapping("/login")
    @ResponseBody
    public HashMap<String,Object> login(String username, String password)
    {
        PtUser ptUser = new PtUser();
        ptUser.setUsername(username);
        ptUser.setPassword(password);
        try {
           List<PtUser> list = ptUserService.selectPtUserList(ptUser);
            if(list.size()>0){
                map.put("code",1);
                map.put("msg","身份验证成功");
            }else{
                map.put("code",-1);
                map.put("msg","身份验证失败");
            }
        }catch (Exception e){
            System.out.println(e);
            map.put("code",-1);
            map.put("msg","服务器发生错误，请联系管理员");
        }
        return map;
    }


    /**
     * 用户注册
     * */
    @PostMapping("/updateinfo")
    @ResponseBody
    public HashMap<String,Object> updateinfo(PtUser ptUser)
    {
        try {
            int i = ptUserService.updatePtUser(ptUser);
            if(i>0){
                map.put("code",1);
                map.put("msg","用户信息修改成功");
            }else{
                map.put("code",-1);
                map.put("msg","用户信息修改失败");
            }
        }catch (Exception e){
            System.out.println(e);
            map.put("code",-1);
            map.put("msg","服务器发生错误，请联系管理员");
        }
        return map;
    }

}