package com.ruoyi.project.system.device.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.device.mapper.IotDeviceMapper;
import com.ruoyi.project.system.device.domain.IotDevice;
import com.ruoyi.project.system.device.service.IIotDeviceService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-09-28
 */
@Service
public class IotDeviceServiceImpl implements IIotDeviceService 
{
    @Autowired
    private IotDeviceMapper iotDeviceMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public IotDevice selectIotDeviceById(String id)
    {
        return iotDeviceMapper.selectIotDeviceById(id);
    }

    @Override
    public IotDevice selectIotDeviceByDeviceName(String deviceName) {
        return iotDeviceMapper.selectIotDeviceByDeviceName(deviceName);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param iotDevice 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<IotDevice> selectIotDeviceList(IotDevice iotDevice)
    {
        return iotDeviceMapper.selectIotDeviceList(iotDevice);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param iotDevice 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertIotDevice(IotDevice iotDevice)
    {
        return iotDeviceMapper.insertIotDevice(iotDevice);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param iotDevice 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateIotDevice(IotDevice iotDevice)
    {
        return iotDeviceMapper.updateIotDevice(iotDevice);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteIotDeviceByIds(String ids)
    {
        return iotDeviceMapper.deleteIotDeviceByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteIotDeviceById(String id)
    {
        return iotDeviceMapper.deleteIotDeviceById(id);
    }
}
