package com.example.newadmin.controller;

import java.util.HashMap;
import java.util.List;

import com.example.newadmin.domain.PtOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.newadmin.domain.PtPet;
import com.example.newadmin.service.IPtPetService;


/**
 * 宠物信息表Controller
 *
 * @author root
 * @date 2023-01-26
 */
@Controller
@RequestMapping("/api/pet")
public class PtPetController
{
    private String prefix = "api/pet";

    @Autowired
    private IPtPetService ptPetService;
    private HashMap<String,Object> map = new HashMap<>();



    /**
     * 查询宠物信息表列表
     */
    @PostMapping("/list")
    @ResponseBody
    public HashMap<String, Object> list(PtPet ptPet)
    {

        List<PtPet> list = ptPetService.selectPtPetList(ptPet);
        map.put("code",1);
        map.put("data",list);
        return map;
    }

    /**
     * 新增保存宠物信息表
     */

    @GetMapping("/add")
    @ResponseBody
    public HashMap<String, Object> addSave(PtPet ptPet)
    {
        try {
            int i = ptPetService.insertPtPet(ptPet);
            if(i>0){
                map.put("code",1);
                map.put("msg","宠物信息添加成功");
            }else{
                map.put("code",-1);
                map.put("msg","宠物信息添加失败");
            }
        }catch (Exception e){
            System.out.println(e);
            map.put("code",-1);
            map.put("msg","系统错误");
        }
        return map;
    }


    /**
     * 修改保存宠物信息表
     */
    @PostMapping("/edit")
    @ResponseBody
    public HashMap<String, Object> editSave(PtPet ptPet)
    {
        try {
            int i = ptPetService.updatePtPet(ptPet);
            if(i>0){
                map.put("code",1);
                map.put("msg","宠物信息修改成功");
            }else{
                map.put("code",-1);
                map.put("msg","宠物信息修改失败");
            }
        }catch (Exception e){
            map.put("code",-1);
            map.put("msg","系统错误");
        }
        return map;
    }

    /**
     * 删除宠物信息表
     */
    @PostMapping( "/remove")
    @ResponseBody
    public HashMap<String, Object> remove(String ids)
    {
        try {
            int i = ptPetService.deletePtPetByIds(ids);
            if(i>0){
                map.put("code",1);
                map.put("msg","宠物信息删除成功");
            }else{
                map.put("code",-1);
                map.put("msg","宠物信息删除失败");
            }
        }catch (Exception e){
            map.put("code",-1);
            map.put("msg","系统错误");
        }
        return map;
    }

    /**
     * 获取用户个人的宠物信息
     * */
    @PostMapping("/getmypets")
    @ResponseBody
    public HashMap<String,Object> getUserpets(Long masterid)
    {
        PtPet ptUser = new PtPet();
        ptUser.setMasterId(masterid);
        try {
            List<PtPet> list = ptPetService.selectPtPetList(ptUser);
            map.put("code",1);
            map.put("msg","获取成功");
            map.put("data",list);
            return map;
        }catch (Exception e){
            System.out.println(e);
            map.put("code",-1);
            map.put("msg","服务器发生错误");
        }
        return map;
    }
}
