package com.example.newadmin.controller;

import java.util.HashMap;
import java.util.List;

import com.example.newadmin.domain.PtUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.newadmin.domain.PtOrder;
import com.example.newadmin.service.IPtOrderService;


/**
 * 预约订单信息Controller
 *
 * @author root
 * @date 2023-01-26
 */
@Controller
@RequestMapping("/api/order")
public class PtOrderController {

    @Autowired
    private IPtOrderService ptOrderService;
    private HashMap<String,Object> map = new HashMap<>();



    /**
     * 查询预约订单信息列表
     */
    @PostMapping("/list")
    @ResponseBody
    public HashMap<String,Object>  list(PtOrder ptOrder)
    {
        List<PtOrder> list = ptOrderService.selectPtOrderList(ptOrder);
        map.put("code",1);
        map.put("data",list);
        return map;
    }



    /**
     * 新增保存预约订单信息
     */
    @GetMapping("/add")
    @ResponseBody
    public HashMap<String,Object> addSave(PtOrder ptOrder)
    {
        try {
            int i = ptOrderService.insertPtOrder(ptOrder);
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
     * 修改保存预约订单信息
     */
    @GetMapping("/edit")
    @ResponseBody
    public HashMap<String,Object> editSave(PtOrder ptOrder)
    {
        try {
            int i = ptOrderService.updatePtOrder(ptOrder);
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
     * 删除预约订单信息
     */
    @PostMapping( "/remove")
    @ResponseBody
    public HashMap<String,Object>  remove(String ids)
    {
        try {
            int i = ptOrderService.deletePtOrderByIds(ids);
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


    /**
     * 获取用户个人的订单数据
     * */
    @PostMapping("/getmyorder")
    @ResponseBody
    public HashMap<String,Object> getUserorder(Long uid,Long state)
    {
        PtOrder ptUser = new PtOrder();
        ptUser.setUid(uid);
        ptUser.setState(state);
        try {
            List<PtOrder> list = ptOrderService.selectPtOrderList(ptUser);
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
