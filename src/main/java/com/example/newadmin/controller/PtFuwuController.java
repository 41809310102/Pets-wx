package com.example.newadmin.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.newadmin.domain.PtFuwu;
import com.example.newadmin.service.IPtFuwuService;


/**
 * 医院服务信息表Controller
 *
 * @author root
 * @date 2023-01-26
 */
@Controller
@RequestMapping("/api/fuwu")
public class PtFuwuController
{
    private String prefix = "api/fuwu";

    @Autowired
    private IPtFuwuService ptFuwuService;
    private HashMap<String,Object> map = new HashMap<>();



    /**
     * 查询医院服务信息表列表
     */

    @PostMapping("/list")
    @ResponseBody
    public HashMap<String,Object> list(PtFuwu ptFuwu)
    {
        List<PtFuwu> list = ptFuwuService.selectPtFuwuList(ptFuwu);
        map.put("code",1);
        map.put("data",list);
        return map;
    }





    /**
     * 新增保存医院服务信息表
     */

    @PostMapping("/add")
    @ResponseBody
    public HashMap<String,Object> addSave(PtFuwu ptFuwu)
    {
        try {
            int i = ptFuwuService.insertPtFuwu(ptFuwu);
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

    /**
     * 修改保存医院服务信息表
     */
    @PostMapping("/edit")
    @ResponseBody
    public HashMap<String,Object> editSave(PtFuwu ptFuwu)
    {
        try {
            int i = ptFuwuService.updatePtFuwu(ptFuwu);
            if(i>0){
                map.put("code",1);
                map.put("msg","修改成功");
            }else{
                map.put("code",-1);
                map.put("msg","修改失败");
            }
        }catch (Exception e){
            System.out.println(e);
            map.put("code",-1);
            map.put("msg","服务器发生错误，请联系管理员");
        }
        return map;
    }

    /**
     * 删除医院服务信息表
     */
    @PostMapping( "/remove")
    @ResponseBody
    public HashMap<String,Object> remove(String ids)
    {
        try {
            int i = ptFuwuService.deletePtFuwuByIds(ids);
            if(i>0){
                map.put("code",1);
                map.put("msg","删除成功");
            }else{
                map.put("code",-1);
                map.put("msg","删除失败");
            }
        }catch (Exception e){
            System.out.println(e);
            map.put("code",-1);
            map.put("msg","服务器发生错误，请联系管理员");
        }
        return map;
    }
}
