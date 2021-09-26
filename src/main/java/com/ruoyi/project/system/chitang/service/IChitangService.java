package com.ruoyi.project.system.chitang.service;

import java.util.List;
import com.ruoyi.project.system.chitang.domain.Chitang;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2021-09-26
 */
public interface IChitangService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Chitang selectChitangById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param chitang 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Chitang> selectChitangList(Chitang chitang);

    /**
     * 新增【请填写功能名称】
     * 
     * @param chitang 【请填写功能名称】
     * @return 结果
     */
    public int insertChitang(Chitang chitang);

    /**
     * 修改【请填写功能名称】
     * 
     * @param chitang 【请填写功能名称】
     * @return 结果
     */
    public int updateChitang(Chitang chitang);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteChitangByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteChitangById(Long id);
}
