package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.VideoMapper;
import com.ruoyi.system.domain.Video;
import com.ruoyi.system.service.IVideoService;

/**
 * 视频Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
@Service
public class VideoServiceImpl implements IVideoService 
{
    @Autowired
    private VideoMapper videoMapper;

    /**
     * 查询视频
     * 
     * @param videoId 视频主键
     * @return 视频
     */
    @Override
    public Video selectVideoByVideoId(String videoId)
    {
        return videoMapper.selectVideoByVideoId(videoId);
    }

    /**
     * 查询视频列表
     * 
     * @param video 视频
     * @return 视频
     */
    @Override
    public List<Video> selectVideoList(Video video)
    {
        return videoMapper.selectVideoList(video);
    }

    /**
     * 新增视频
     * 
     * @param video 视频
     * @return 结果
     */
    @Override
    public int insertVideo(Video video)
    {
        video.setCreateTime(DateUtils.getNowDate());
        return videoMapper.insertVideo(video);
    }

    /**
     * 修改视频
     * 
     * @param video 视频
     * @return 结果
     */
    @Override
    public int updateVideo(Video video)
    {
        video.setUpdateTime(DateUtils.getNowDate());
        return videoMapper.updateVideo(video);
    }

    /**
     * 批量删除视频
     * 
     * @param videoIds 需要删除的视频主键
     * @return 结果
     */
    @Override
    public int deleteVideoByVideoIds(String[] videoIds)
    {
        return videoMapper.deleteVideoByVideoIds(videoIds);
    }

    /**
     * 删除视频信息
     * 
     * @param videoId 视频主键
     * @return 结果
     */
    @Override
    public int deleteVideoByVideoId(String videoId)
    {
        return videoMapper.deleteVideoByVideoId(videoId);
    }
}
