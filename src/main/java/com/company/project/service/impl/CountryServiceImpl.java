package com.company.project.service.impl;

import com.company.project.mapper.CountryMapper;
import com.company.project.model.Country;
import com.company.project.service.CountryService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/05/18.
 */
@Service
@Transactional
public class CountryServiceImpl extends AbstractService<Country> implements CountryService {
    @Resource
    private CountryMapper countryMapper;

}
