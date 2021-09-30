package com.ruoyi.project.system.device.mapper;

import java.util.List;
import com.ruoyi.project.system.device.domain.IotDevice;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2021-09-28
 */
public interface IotDeviceMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public IotDevice selectIotDeviceById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param iotDevice 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<IotDevice> selectIotDeviceList(IotDevice iotDevice);

    /**
     * 新增【请填写功能名称】
     * 
     * @param iotDevice 【请填写功能名称】
     * @return 结果
     */
    public int insertIotDevice(IotDevice iotDevice);

    /**
     * 修改【请填写功能名称】
     * 
     * @param iotDevice 【请填写功能名称】
     * @return 结果
     */
    public int updateIotDevice(IotDevice iotDevice);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteIotDeviceById(String id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteIotDeviceByIds(String[] ids);

    IotDevice selectIotDeviceByDeviceName(String deviceName);
}
