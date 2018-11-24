package com.rrl.base.web;

import com.rrl.base.core.Result;
import com.rrl.base.model.CorpusInfo;
import com.rrl.base.service.CorpusInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by ml on 2018/11/24.
*/
@RestController
@RequestMapping("/corpus/info")
public class CorpusInfoController {
    @Resource
    private CorpusInfoService corpusInfoService;

    @PostMapping
    public Result add(@RequestBody CorpusInfo corpusInfo) {
        corpusInfoService.save(corpusInfo);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        corpusInfoService.deleteById(id);
        return Result.success();
    }

    @PutMapping
    public Result update(@RequestBody CorpusInfo corpusInfo) {
        corpusInfoService.update(corpusInfo);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        CorpusInfo corpusInfo = corpusInfoService.findById(id);
        return Result.success(corpusInfo);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<CorpusInfo> list = corpusInfoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return Result.success(pageInfo);
    }
}
