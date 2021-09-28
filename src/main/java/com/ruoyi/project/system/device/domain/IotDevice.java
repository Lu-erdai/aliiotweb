package com.ruoyi.project.system.device.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 iot_device
 * 
 * @author ruoyi
 * @date 2021-09-28
 */
public class IotDevice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal M1OXHi;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal M1OXLow;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String M1T1Span;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String M1T2Span;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String M1T3Span;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long M1WorkMode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long M1WorkState;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal M2OXHi;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal M2OXLow;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String M2T1Span;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String M2T2Span;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String M2T3Span;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long M2WorkMode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long M2WorkState;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String deviceName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal dox;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date lastCommTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date lastDataTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long onlineState;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal pH;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String productKey;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal waterTemp;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date onOffTime;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setM1OXHi(BigDecimal M1OXHi)
    {
        this.M1OXHi = M1OXHi;
    }

    public BigDecimal getM1OXHi()
    {
        return M1OXHi;
    }
    public void setM1OXLow(BigDecimal M1OXLow)
    {
        this.M1OXLow = M1OXLow;
    }

    public BigDecimal getM1OXLow()
    {
        return M1OXLow;
    }
    public void setM1T1Span(String M1T1Span)
    {
        this.M1T1Span = M1T1Span;
    }

    public String getM1T1Span()
    {
        return M1T1Span;
    }
    public void setM1T2Span(String M1T2Span)
    {
        this.M1T2Span = M1T2Span;
    }

    public String getM1T2Span()
    {
        return M1T2Span;
    }
    public void setM1T3Span(String M1T3Span)
    {
        this.M1T3Span = M1T3Span;
    }

    public String getM1T3Span()
    {
        return M1T3Span;
    }
    public void setM1WorkMode(Long M1WorkMode)
    {
        this.M1WorkMode = M1WorkMode;
    }

    public Long getM1WorkMode()
    {
        return M1WorkMode;
    }
    public void setM1WorkState(Long M1WorkState)
    {
        this.M1WorkState = M1WorkState;
    }

    public Long getM1WorkState()
    {
        return M1WorkState;
    }
    public void setM2OXHi(BigDecimal M2OXHi)
    {
        this.M2OXHi = M2OXHi;
    }

    public BigDecimal getM2OXHi()
    {
        return M2OXHi;
    }
    public void setM2OXLow(BigDecimal M2OXLow)
    {
        this.M2OXLow = M2OXLow;
    }

    public BigDecimal getM2OXLow()
    {
        return M2OXLow;
    }
    public void setM2T1Span(String M2T1Span)
    {
        this.M2T1Span = M2T1Span;
    }

    public String getM2T1Span()
    {
        return M2T1Span;
    }
    public void setM2T2Span(String M2T2Span)
    {
        this.M2T2Span = M2T2Span;
    }

    public String getM2T2Span()
    {
        return M2T2Span;
    }
    public void setM2T3Span(String M2T3Span)
    {
        this.M2T3Span = M2T3Span;
    }

    public String getM2T3Span()
    {
        return M2T3Span;
    }
    public void setM2WorkMode(Long M2WorkMode)
    {
        this.M2WorkMode = M2WorkMode;
    }

    public Long getM2WorkMode()
    {
        return M2WorkMode;
    }
    public void setM2WorkState(Long M2WorkState)
    {
        this.M2WorkState = M2WorkState;
    }

    public Long getM2WorkState()
    {
        return M2WorkState;
    }
    public void setDeviceName(String deviceName)
    {
        this.deviceName = deviceName;
    }

    public String getDeviceName()
    {
        return deviceName;
    }
    public void setDox(BigDecimal dox)
    {
        this.dox = dox;
    }

    public BigDecimal getDox()
    {
        return dox;
    }
    public void setLastCommTime(Date lastCommTime)
    {
        this.lastCommTime = lastCommTime;
    }

    public Date getLastCommTime()
    {
        return lastCommTime;
    }
    public void setLastDataTime(Date lastDataTime)
    {
        this.lastDataTime = lastDataTime;
    }

    public Date getLastDataTime()
    {
        return lastDataTime;
    }
    public void setOnlineState(Long onlineState)
    {
        this.onlineState = onlineState;
    }

    public Long getOnlineState()
    {
        return onlineState;
    }
    public void setPH(BigDecimal pH)
    {
        this.pH = pH;
    }

    public BigDecimal getPH()
    {
        return pH;
    }
    public void setProductKey(String productKey)
    {
        this.productKey = productKey;
    }

    public String getProductKey()
    {
        return productKey;
    }
    public void setWaterTemp(BigDecimal waterTemp)
    {
        this.waterTemp = waterTemp;
    }

    public BigDecimal getWaterTemp()
    {
        return waterTemp;
    }
    public void setOnOffTime(Date onOffTime)
    {
        this.onOffTime = onOffTime;
    }

    public Date getOnOffTime()
    {
        return onOffTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("M1OXHi", getM1OXHi())
            .append("M1OXLow", getM1OXLow())
            .append("M1T1Span", getM1T1Span())
            .append("M1T2Span", getM1T2Span())
            .append("M1T3Span", getM1T3Span())
            .append("M1WorkMode", getM1WorkMode())
            .append("M1WorkState", getM1WorkState())
            .append("M2OXHi", getM2OXHi())
            .append("M2OXLow", getM2OXLow())
            .append("M2T1Span", getM2T1Span())
            .append("M2T2Span", getM2T2Span())
            .append("M2T3Span", getM2T3Span())
            .append("M2WorkMode", getM2WorkMode())
            .append("M2WorkState", getM2WorkState())
            .append("deviceName", getDeviceName())
            .append("dox", getDox())
            .append("lastCommTime", getLastCommTime())
            .append("lastDataTime", getLastDataTime())
            .append("onlineState", getOnlineState())
            .append("pH", getPH())
            .append("productKey", getProductKey())
            .append("waterTemp", getWaterTemp())
            .append("onOffTime", getOnOffTime())
            .toString();
    }
}
