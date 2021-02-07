package com.company.project.service;

import com.company.project.mapper.TAccountMapper;
import com.company.project.model.TAccount;
import com.company.project.service.TAccountService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2021/02/07.
 */
@Service
@Transactional
public class TAccountServiceImpl  implements TAccountService {
    @Resource
    private TAccountMapper tAccountMapper;

}
