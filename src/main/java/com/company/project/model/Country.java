package com.company.project.model;

import com.company.project.support.dbhandler.StringListTypeHandler;
import org.apache.ibatis.type.JdbcType;
import tk.mybatis.mapper.annotation.ColumnType;

import javax.persistence.*;
import java.util.List;

public class Country {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 名称
     */
    private String countryname;

    /**
     * 代码
     */
    private String countrycode;

    @ColumnType(
            column = "country_info",
            jdbcType = JdbcType.VARCHAR,
            typeHandler = StringListTypeHandler.class)
    private List<String> countryInfo;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return countryname - 名称
     */
    public String getCountryname() {
        return countryname;
    }

    /**
     * 设置名称
     *
     * @param countryname 名称
     */
    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    /**
     * 获取代码
     *
     * @return countrycode - 代码
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * 设置代码
     *
     * @param countrycode 代码
     */
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }


    public List<String> getCountryInfo() {
        return countryInfo;
    }

    public void setCountryInfo(List<String> countryInfo) {
        this.countryInfo = countryInfo;
    }
}