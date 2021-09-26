package com.ruoyi.project.system.chitang.controller;

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
import com.ruoyi.project.system.chitang.domain.Chitang;
import com.ruoyi.project.system.chitang.service.IChitangService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2021-09-26
 */
@Controller
@RequestMapping("/system/chitang")
public class ChitangController extends BaseController
{
    private String prefix = "system/chitang";

    @Autowired
    private IChitangService chitangService;

    @RequiresPermissions("system:chitang:view")
    @GetMapping()
    public String chitang()
    {
        return prefix + "/chitang";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:chitang:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Chitang chitang)
    {
        startPage();
        List<Chitang> list = chitangService.selectChitangList(chitang);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:chitang:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Chitang chitang)
    {
        List<Chitang> list = chitangService.selectChitangList(chitang);
        ExcelUtil<Chitang> util = new ExcelUtil<Chitang>(Chitang.class);
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
    @RequiresPermissions("system:chitang:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Chitang chitang)
    {
        return toAjax(chitangService.insertChitang(chitang));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Chitang chitang = chitangService.selectChitangById(id);
        mmap.put("chitang", chitang);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:chitang:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Chitang chitang)
    {
        return toAjax(chitangService.updateChitang(chitang));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:chitang:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(chitangService.deleteChitangByIds(ids));
    }
}
