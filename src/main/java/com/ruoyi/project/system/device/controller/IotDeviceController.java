package com.ruoyi.project.system.device.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.system.device.domain.IotDevice;
import com.ruoyi.project.system.device.service.IIotDeviceService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2021-09-28
 */
@Controller
@RequestMapping("/system/device")
public class IotDeviceController extends BaseController
{
    private String prefix = "system/device";

    @Autowired
    private IIotDeviceService iotDeviceService;

    @RequiresPermissions("system:device:view")
    @GetMapping()
    public String device()
    {
        return prefix + "/device";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:device:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(IotDevice iotDevice)
    {
        startPage();
        List<IotDevice> list = iotDeviceService.selectIotDeviceList(iotDevice);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:device:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(IotDevice iotDevice)
    {
        List<IotDevice> list = iotDeviceService.selectIotDeviceList(iotDevice);
        ExcelUtil<IotDevice> util = new ExcelUtil<IotDevice>(IotDevice.class);
        return util.exportExcel(list, "【请填写功能名称】数据");
    }

    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @RequiresPermissions("system:device:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(IotDevice iotDevice)
    {
        return toAjax(iotDeviceService.insertIotDevice(iotDevice));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        IotDevice iotDevice = iotDeviceService.selectIotDeviceById(id);
        mmap.put("iotDevice", iotDevice);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:device:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(IotDevice iotDevice)
    {
        return toAjax(iotDeviceService.updateIotDevice(iotDevice));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:device:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(iotDeviceService.deleteIotDeviceByIds(ids));
    }
}
