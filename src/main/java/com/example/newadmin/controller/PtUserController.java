package com.example.newadmin.controller;

import com.example.newadmin.domain.PtOrder;
import com.example.newadmin.domain.PtUser;
import com.example.newadmin.service.IPtUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
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

@Api(value="用户controller",tags={"用户管理"})
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

    @ApiOperation("增加新的用户")
    @GetMapping("/register")
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
    @ApiOperation("用户登录")
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
                map.put("user",list.get(0));
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
     * 查询所有用户信息
     */
    @ApiOperation("查询所有用户信息")
    @PostMapping("/list")
    @ResponseBody
    public HashMap<String,Object>  list(PtUser ptUser)
    {
        List<PtUser> list = ptUserService.selectPtUserList(ptUser);
        map.put("code",1);
        map.put("msg","查询成功");
        map.put("data",list);
        return map;
    }

    /**
     *
     * */
    @ApiOperation("用户信息修改")
    @GetMapping("/updateinfo")
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

    /**
     * 检查用户名是否注册
     * */
    @ApiOperation("检查某个用户名是否注册")
    @PostMapping("/checkname")
    @ResponseBody
    public String checkname(String username)
    {
        PtUser ptUser = new PtUser();
        ptUser.setUsername(username);
        try {
            List<PtUser> list = ptUserService.selectPtUserList(ptUser);
            if(list.size()>0){
                return "yes";
            }else{
                return "no";
            }
        }catch (Exception e){
            System.out.println(e);
            return "yes";
        }
    }

    /**
     * 检查电话号码是否注册
     * */
    @ApiOperation("检查某个电话号码是否注册")
    @PostMapping("/checkphone")
    @ResponseBody
    public String checkphone(String phone)
    {
        PtUser ptUser = new PtUser();
        ptUser.setPhone(phone);
        try{
            List<PtUser> list = ptUserService.selectPtUserList(ptUser);
            if(list.size()>0){
                return "yes";
            }else{
                return "no";
            }
        }catch (Exception e){
            System.out.println(e);
            return "yes";
        }
    }


}
