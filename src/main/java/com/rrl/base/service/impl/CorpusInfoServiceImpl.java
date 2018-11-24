package com.rrl.base.service.impl;

import com.rrl.base.dao.CorpusInfoMapper;
import com.rrl.base.model.CorpusInfo;
import com.rrl.base.service.CorpusInfoService;
import com.rrl.base.core.AbstractService;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by maliang on 2018/11/24.
 */
@Service
public class CorpusInfoServiceImpl extends AbstractService<CorpusInfo> implements CorpusInfoService {
    @Resource
    private CorpusInfoMapper tCorpusInfoMapper;

}
