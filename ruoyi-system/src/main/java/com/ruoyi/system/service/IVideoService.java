package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Video;

/**
 * 视频Service接口
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
public interface IVideoService 
{
    /**
     * 查询视频
     * 
     * @param videoId 视频主键
     * @return 视频
     */
    public Video selectVideoByVideoId(String videoId);

    /**
     * 查询视频列表
     * 
     * @param video 视频
     * @return 视频集合
     */
    public List<Video> selectVideoList(Video video);

    /**
     * 新增视频
     * 
     * @param video 视频
     * @return 结果
     */
    public int insertVideo(Video video);

    /**
     * 修改视频
     * 
     * @param video 视频
     * @return 结果
     */
    public int updateVideo(Video video);

    /**
     * 批量删除视频
     * 
     * @param videoIds 需要删除的视频主键集合
     * @return 结果
     */
    public int deleteVideoByVideoIds(String[] videoIds);

    /**
     * 删除视频信息
     * 
     * @param videoId 视频主键
     * @return 结果
     */
    public int deleteVideoByVideoId(String videoId);
}
