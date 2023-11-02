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
import com.ruoyi.system.domain.VideoCategory;
import com.ruoyi.system.service.IVideoCategoryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 视频分类Controller
 * 
 * @author ruoyi
 * @date 2023-11-02
 */
@RestController
@RequestMapping("/niuyin/category")
public class VideoCategoryController extends BaseController
{
    @Autowired
    private IVideoCategoryService videoCategoryService;

    /**
     * 查询视频分类列表
     */
    @PreAuthorize("@ss.hasPermi('niuyin:category:list')")
    @GetMapping("/list")
    public TableDataInfo list(VideoCategory videoCategory)
    {
        startPage();
        List<VideoCategory> list = videoCategoryService.selectVideoCategoryList(videoCategory);
        return getDataTable(list);
    }

    /**
     * 导出视频分类列表
     */
    @PreAuthorize("@ss.hasPermi('niuyin:category:export')")
    @Log(title = "视频分类", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VideoCategory videoCategory)
    {
        List<VideoCategory> list = videoCategoryService.selectVideoCategoryList(videoCategory);
        ExcelUtil<VideoCategory> util = new ExcelUtil<VideoCategory>(VideoCategory.class);
        util.exportExcel(response, list, "视频分类数据");
    }

    /**
     * 获取视频分类详细信息
     */
    @PreAuthorize("@ss.hasPermi('niuyin:category:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(videoCategoryService.selectVideoCategoryById(id));
    }

    /**
     * 新增视频分类
     */
    @PreAuthorize("@ss.hasPermi('niuyin:category:add')")
    @Log(title = "视频分类", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VideoCategory videoCategory)
    {
        return toAjax(videoCategoryService.insertVideoCategory(videoCategory));
    }

    /**
     * 修改视频分类
     */
    @PreAuthorize("@ss.hasPermi('niuyin:category:edit')")
    @Log(title = "视频分类", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VideoCategory videoCategory)
    {
        return toAjax(videoCategoryService.updateVideoCategory(videoCategory));
    }

    /**
     * 删除视频分类
     */
    @PreAuthorize("@ss.hasPermi('niuyin:category:remove')")
    @Log(title = "视频分类", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(videoCategoryService.deleteVideoCategoryByIds(ids));
    }
}
