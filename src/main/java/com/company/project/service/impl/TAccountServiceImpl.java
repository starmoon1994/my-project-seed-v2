package com.company.project.service.impl;

import com.company.project.core.AbstractService;
import com.company.project.mapper.TAccountMapper;
import com.company.project.model.TAccount;
import com.company.project.service.TAccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2021/01/05.
 */
@Service
@Transactional
public class TAccountServiceImpl extends AbstractService<TAccount> implements TAccountService {
    @Resource
    private TAccountMapper tAccountMapper;

}
