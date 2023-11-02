package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.VideoCategoryMapper;
import com.ruoyi.system.domain.VideoCategory;
import com.ruoyi.system.service.IVideoCategoryService;

/**
 * 视频分类Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-11-02
 */
@Service
public class VideoCategoryServiceImpl implements IVideoCategoryService 
{
    @Autowired
    private VideoCategoryMapper videoCategoryMapper;

    /**
     * 查询视频分类
     * 
     * @param id 视频分类主键
     * @return 视频分类
     */
    @Override
    public VideoCategory selectVideoCategoryById(Long id)
    {
        return videoCategoryMapper.selectVideoCategoryById(id);
    }

    /**
     * 查询视频分类列表
     * 
     * @param videoCategory 视频分类
     * @return 视频分类
     */
    @Override
    public List<VideoCategory> selectVideoCategoryList(VideoCategory videoCategory)
    {
        return videoCategoryMapper.selectVideoCategoryList(videoCategory);
    }

    /**
     * 新增视频分类
     * 
     * @param videoCategory 视频分类
     * @return 结果
     */
    @Override
    public int insertVideoCategory(VideoCategory videoCategory)
    {
        return videoCategoryMapper.insertVideoCategory(videoCategory);
    }

    /**
     * 修改视频分类
     * 
     * @param videoCategory 视频分类
     * @return 结果
     */
    @Override
    public int updateVideoCategory(VideoCategory videoCategory)
    {
        return videoCategoryMapper.updateVideoCategory(videoCategory);
    }

    /**
     * 批量删除视频分类
     * 
     * @param ids 需要删除的视频分类主键
     * @return 结果
     */
    @Override
    public int deleteVideoCategoryByIds(Long[] ids)
    {
        return videoCategoryMapper.deleteVideoCategoryByIds(ids);
    }

    /**
     * 删除视频分类信息
     * 
     * @param id 视频分类主键
     * @return 结果
     */
    @Override
    public int deleteVideoCategoryById(Long id)
    {
        return videoCategoryMapper.deleteVideoCategoryById(id);
    }
}
