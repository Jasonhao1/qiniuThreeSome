package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 视频对象 video
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
public class Video extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 视频ID */
    private String videoId;

    /** 发布地点 */
    @Excel(name = "发布地点")
    private String publishCity;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 视频标题 */
    @Excel(name = "视频标题")
    private String videoTitle;

    /** 视频简介 */
    @Excel(name = "视频简介")
    private String videoDesc;

    /** 视频地址 */
    @Excel(name = "视频地址")
    private String videoUrl;

    /** 观看数 */
    @Excel(name = "观看数")
    private Long viewNum;

    /** 点赞数 */
    @Excel(name = "点赞数")
    private Long likeNum;

    /** 收藏数 */
    @Excel(name = "收藏数")
    private Long favoritesNum;

    /** 删除标志（0代表存在 1代表删除） */
    private String delFlag;

    public void setVideoId(String videoId) 
    {
        this.videoId = videoId;
    }

    public String getVideoId() 
    {
        return videoId;
    }
    public void setPublishCity(String publishCity) 
    {
        this.publishCity = publishCity;
    }

    public String getPublishCity() 
    {
        return publishCity;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setVideoTitle(String videoTitle) 
    {
        this.videoTitle = videoTitle;
    }

    public String getVideoTitle() 
    {
        return videoTitle;
    }
    public void setVideoDesc(String videoDesc) 
    {
        this.videoDesc = videoDesc;
    }

    public String getVideoDesc() 
    {
        return videoDesc;
    }
    public void setVideoUrl(String videoUrl) 
    {
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() 
    {
        return videoUrl;
    }
    public void setViewNum(Long viewNum) 
    {
        this.viewNum = viewNum;
    }

    public Long getViewNum() 
    {
        return viewNum;
    }
    public void setLikeNum(Long likeNum) 
    {
        this.likeNum = likeNum;
    }

    public Long getLikeNum() 
    {
        return likeNum;
    }
    public void setFavoritesNum(Long favoritesNum) 
    {
        this.favoritesNum = favoritesNum;
    }

    public Long getFavoritesNum() 
    {
        return favoritesNum;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("videoId", getVideoId())
            .append("publishCity", getPublishCity())
            .append("userId", getUserId())
            .append("videoTitle", getVideoTitle())
            .append("videoDesc", getVideoDesc())
            .append("videoUrl", getVideoUrl())
            .append("viewNum", getViewNum())
            .append("likeNum", getLikeNum())
            .append("favoritesNum", getFavoritesNum())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
