package com.company.project.controller;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.TAccount;
import com.company.project.service.TAccountService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2021/01/05.
 */
@RestController
@RequestMapping("/t/account")
public class TAccountController {
    @Resource
    private TAccountService tAccountService;

    @PostMapping("/add")
    public Result add(TAccount tAccount) {
        tAccountService.save(tAccount);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        tAccountService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(TAccount tAccount) {
        tAccountService.update(tAccount);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        TAccount tAccount = tAccountService.findById(id);
        return ResultGenerator.genSuccessResult(tAccount);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TAccount> list = tAccountService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
