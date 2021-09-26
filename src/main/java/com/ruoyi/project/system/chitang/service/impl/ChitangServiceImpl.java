package com.ruoyi.project.system.chitang.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.chitang.mapper.ChitangMapper;
import com.ruoyi.project.system.chitang.domain.Chitang;
import com.ruoyi.project.system.chitang.service.IChitangService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-09-26
 */
@Service
public class ChitangServiceImpl implements IChitangService 
{
    @Autowired
    private ChitangMapper chitangMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Chitang selectChitangById(Long id)
    {
        return chitangMapper.selectChitangById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param chitang 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Chitang> selectChitangList(Chitang chitang)
    {
        return chitangMapper.selectChitangList(chitang);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param chitang 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertChitang(Chitang chitang)
    {
        return chitangMapper.insertChitang(chitang);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param chitang 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateChitang(Chitang chitang)
    {
        return chitangMapper.updateChitang(chitang);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteChitangByIds(String ids)
    {
        return chitangMapper.deleteChitangByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteChitangById(Long id)
    {
        return chitangMapper.deleteChitangById(id);
    }
}
