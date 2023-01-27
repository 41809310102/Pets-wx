package com.example.newadmin.controller;

import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.newadmin.domain.PtFuwuShop;
import com.example.newadmin.service.IPtFuwuShopService;

/**
 * 服务信息Controller
 *
 * @author root
 * @date 2023-01-26
 */
@Controller
@RequestMapping("/api/shop")
public class PtFuwuShopController
{
    private String prefix = "api/shop";

    @Autowired
    private IPtFuwuShopService ptFuwuShopService;
    private HashMap<String,Object> map = new HashMap<>();


    /**
     * 查询服务信息列表
     */
    @PostMapping("/list")
    @ResponseBody
    public  HashMap<String,Object> list(PtFuwuShop ptFuwuShop)
    {
        List<PtFuwuShop> list = ptFuwuShopService.selectPtFuwuShopList(ptFuwuShop);
        map.put("code",1);
        map.put("data",list);
        return map;
    }


    /**
     * 新增保存服务信息
     */
    @PostMapping("/add")
    @ResponseBody
    public HashMap<String,Object> addSave(PtFuwuShop ptFuwuShop)
    {
        try {
            int i = ptFuwuShopService.insertPtFuwuShop(ptFuwuShop);
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
     * 修改保存服务信息
     */
    @PostMapping("/edit")
    @ResponseBody
    public HashMap<String,Object> editSave(PtFuwuShop ptFuwuShop)
    {
        try {
            int i = ptFuwuShopService.updatePtFuwuShop(ptFuwuShop);
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
     * 删除服务信息
     */
    @PostMapping( "/remove")
    @ResponseBody
    public HashMap<String,Object> remove(String ids)
    {
        try {
            int i = ptFuwuShopService.deletePtFuwuShopByIds(ids);
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
