package com.example.newadmin.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.newadmin.mapper.PtFuwuMapper;
import com.example.newadmin.domain.PtFuwu;
import com.example.newadmin.service.IPtFuwuService;


/**
 * 医院服务信息表Service业务层处理
 *
 * @author root
 * @date 2023-01-26
 */
@Service
public class PtFuwuServiceImpl implements IPtFuwuService
{
    @Autowired
    private PtFuwuMapper ptFuwuMapper;

    /**
     * 查询医院服务信息表
     *
     * @param id 医院服务信息表主键
     * @return 医院服务信息表
     */
    @Override
    public PtFuwu selectPtFuwuById(Long id)
    {
        return ptFuwuMapper.selectPtFuwuById(id);
    }

    /**
     * 查询医院服务信息表列表
     *
     * @param ptFuwu 医院服务信息表
     * @return 医院服务信息表
     */
    @Override
    public List<PtFuwu> selectPtFuwuList(PtFuwu ptFuwu)
    {
        return ptFuwuMapper.selectPtFuwuList(ptFuwu);
    }

    /**
     * 新增医院服务信息表
     *
     * @param ptFuwu 医院服务信息表
     * @return 结果
     */
    @Override
    public int insertPtFuwu(PtFuwu ptFuwu)
    {
        return ptFuwuMapper.insertPtFuwu(ptFuwu);
    }

    /**
     * 修改医院服务信息表
     *
     * @param ptFuwu 医院服务信息表
     * @return 结果
     */
    @Override
    public int updatePtFuwu(PtFuwu ptFuwu)
    {
        return ptFuwuMapper.updatePtFuwu(ptFuwu);
    }

    /**
     * 批量删除医院服务信息表
     *
     * @param ids 需要删除的医院服务信息表主键
     * @return 结果
     */
    @Override
    public int deletePtFuwuByIds(String ids)
    {
        return ptFuwuMapper.deletePtFuwuByIds(new String[5]);
    }

    /**
     * 删除医院服务信息表信息
     *
     * @param id 医院服务信息表主键
     * @return 结果
     */
    @Override
    public int deletePtFuwuById(Long id)
    {
        return ptFuwuMapper.deletePtFuwuById(id);
    }
}
