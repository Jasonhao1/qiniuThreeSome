package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 视频分类对象 video_category
 *
 * @author ruoyi
 * @date 2023-11-02
 */
public class VideoCategory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 视频分类id */
    private Long id;

    /** 视频分类名称 */
    @Excel(name = "视频分类名称")
    private String name;

    /** 视频分类描述 */
    @Excel(name = "视频分类描述")
    private String description;

    /** 状态，0：可用，1：禁用 */
    @Excel(name = "状态，0：可用，1：禁用")
    private String status;

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
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("name", getName())
                .append("description", getDescription())
                .append("status", getStatus())
                .toString();
    }
}
