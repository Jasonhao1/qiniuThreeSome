package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Video;
import com.ruoyi.system.service.IVideoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 视频Controller
 * 
 * @author ruoyi
 * @date 2023-11-01
 */
@RestController
@RequestMapping("/system/video")
public class VideoController extends BaseController
{
    @Autowired
    private IVideoService videoService;

    /**
     * 查询视频列表
     */
    @PreAuthorize("@ss.hasPermi('system:video:list')")
    @GetMapping("/list")
    public TableDataInfo list(Video video)
    {
        startPage();
        List<Video> list = videoService.selectVideoList(video);
        return getDataTable(list);
    }

    /**
     * 导出视频列表
     */
    @PreAuthorize("@ss.hasPermi('system:video:export')")
    @Log(title = "视频", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Video video)
    {
        List<Video> list = videoService.selectVideoList(video);
        ExcelUtil<Video> util = new ExcelUtil<Video>(Video.class);
        util.exportExcel(response, list, "视频数据");
    }

    /**
     * 获取视频详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:video:query')")
    @GetMapping(value = "/{videoId}")
    public AjaxResult getInfo(@PathVariable("videoId") String videoId)
    {
        return success(videoService.selectVideoByVideoId(videoId));
    }

    /**
     * 新增视频
     */
    @PreAuthorize("@ss.hasPermi('system:video:add')")
    @Log(title = "视频", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Video video)
    {
        return toAjax(videoService.insertVideo(video));
    }

    /**
     * 修改视频
     */
    @PreAuthorize("@ss.hasPermi('system:video:edit')")
    @Log(title = "视频", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Video video)
    {
        return toAjax(videoService.updateVideo(video));
    }

    /**
     * 删除视频
     */
    @PreAuthorize("@ss.hasPermi('system:video:remove')")
    @Log(title = "视频", businessType = BusinessType.DELETE)
	@DeleteMapping("/{videoIds}")
    public AjaxResult remove(@PathVariable String[] videoIds)
    {
        return toAjax(videoService.deleteVideoByVideoIds(videoIds));
    }
}
