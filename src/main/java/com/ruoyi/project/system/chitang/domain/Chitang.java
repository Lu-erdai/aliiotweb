package com.ruoyi.project.system.chitang.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 sys_chitang
 * 
 * @author ruoyi
 * @date 2021-09-26
 */
public class Chitang extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 池塘主键 */
    private Long id;

    /** 池塘名称 */
    @Excel(name = "池塘名称")
    private String name;

    /** 塘主名称 */
    @Excel(name = "塘主名称")
    private String pondmaster;

    /** 面积（亩） */
    @Excel(name = "面积", readConverterExp = "亩=")
    private Long area;

    /** 水深 */
    @Excel(name = "水深")
    private Long deep;

    /** 建造日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "建造日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date buildDay;

    /** 建造费用 */
    @Excel(name = "建造费用")
    private String buildCost;

    /** 设备编号 */
    @Excel(name = "设备编号")
    private String devNum;

    /** 所属项目 */
    @Excel(name = "所属项目")
    private Long project;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phone;

    /** 经度 */
    @Excel(name = "经度")
    private Long longitude;

    /** 纬度 */
    @Excel(name = "纬度")
    private Long latitude;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setPondmaster(String pondmaster)
    {
        this.pondmaster = pondmaster;
    }

    public String getPondmaster()
    {
        return pondmaster;
    }
    public void setArea(Long area)
    {
        this.area = area;
    }

    public Long getArea()
    {
        return area;
    }
    public void setDeep(Long deep)
    {
        this.deep = deep;
    }

    public Long getDeep()
    {
        return deep;
    }
    public void setBuildDay(Date buildDay)
    {
        this.buildDay = buildDay;
    }

    public Date getBuildDay()
    {
        return buildDay;
    }
    public void setBuildCost(String buildCost)
    {
        this.buildCost = buildCost;
    }

    public String getBuildCost()
    {
        return buildCost;
    }
    public void setDevNum(String devNum)
    {
        this.devNum = devNum;
    }

    public String getDevNum()
    {
        return devNum;
    }
    public void setProject(Long project)
    {
        this.project = project;
    }

    public Long getProject()
    {
        return project;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getPhone()
    {
        return phone;
    }
    public void setLongitude(Long longitude)
    {
        this.longitude = longitude;
    }

    public Long getLongitude()
    {
        return longitude;
    }
    public void setLatitude(Long latitude)
    {
        this.latitude = latitude;
    }

    public Long getLatitude()
    {
        return latitude;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("pondmaster", getPondmaster())
            .append("area", getArea())
            .append("deep", getDeep())
            .append("buildDay", getBuildDay())
            .append("buildCost", getBuildCost())
            .append("devNum", getDevNum())
            .append("project", getProject())
            .append("phone", getPhone())
            .append("longitude", getLongitude())
            .append("latitude", getLatitude())
            .append("remark", getRemark())
            .toString();
    }
}
