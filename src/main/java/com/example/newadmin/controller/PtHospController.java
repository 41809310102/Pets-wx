package com.example.newadmin.controller;

import java.util.HashMap;
import java.util.List;

import com.example.newadmin.domain.PtUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.newadmin.domain.PtHosp;
import com.example.newadmin.service.IPtHospService;

/**
 * 宠物医院信息表Controller
 *
 * @author root
 * @date 2023-01-25
 */
@Api(value="宠物医院controller",tags={"宠物医院信息管理"})
@Controller
@RequestMapping("/api/hosp")
public class PtHospController
{
    private String prefix = "api/hosp";

    @Autowired
    private IPtHospService ptHospService;
    private HashMap<String,Object> map = new HashMap<>();


    /**
     * 查询宠物医院信息表列表
     */
    @ApiOperation("查询宠物医院信息")
    @PostMapping("/get_all_hosp")
    @ResponseBody
    public HashMap<String,Object> list(PtHosp ptHosp)
    {
        List<PtHosp> list = ptHospService.selectPtHospList(ptHosp);
        map.put("code",1);
        map.put("data",list);
        return map;
    }


    /**
     * 新增保存宠物医院信息表
     */
    @ApiOperation("新增宠物医院信息")
    @PostMapping("/add_hosp")
    @ResponseBody
    public HashMap<String,Object> addSave(PtHosp ptHosp)
    {
        try {
            int i = ptHospService.insertPtHosp(ptHosp);
            if(i>0){
                map.put("code",1);
                map.put("msg","新增成功");
            }else{
                map.put("code",-1);
                map.put("msg","新增失败");
            }
        }catch (Exception e){
            System.out.println(e);
            map.put("code",-1);
            map.put("msg","服务器发生错误，请联系管理员");
        }
        return map;
    }



    @ApiOperation("修改宠物医院信息")
    @PostMapping("/edit")
    @ResponseBody
    public HashMap<String,Object> editSave(PtHosp ptHosp)
    {
        int i = ptHospService.updatePtHosp(ptHosp);
        if(i>0){
            map.put("code",1);
            map.put("msg","修改成功");
        }else{
            map.put("code",-1);
            map.put("msg","修改失败！！！");
        }
        return map;
    }

    /**
     * 删除宠物医院信息表
     */
    @ApiOperation("删除宠物医院信息")
    @PostMapping( "/remove")
    @ResponseBody
    public HashMap<String,Object> remove(String ids)
    {
        int i = ptHospService.deletePtHospByIds(ids);
        if(i>0){
            map.put("code",1);
            map.put("msg","删除成功");
        }else{
            map.put("code",-1);
            map.put("msg","删除失败");
        }
        return map;
    }
}
