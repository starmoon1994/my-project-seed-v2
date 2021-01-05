package com.company.project.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "t_account")
public class TAccount {
    /**
     * 账户ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 全局id
     */
    @Column(name = "GLOBAL_ID")
    private String globalId;

    /**
     * 总金额
     */
    @Column(name = "TOTAL_AMT")
    private BigDecimal totalAmt;

    /**
     * 冻结金额
     */
    @Column(name = "FROZEN_AMT")
    private BigDecimal frozenAmt;

    /**
     * 是否热点账户
     */
    @Column(name = "HOT_ACCOUNT")
    private Byte hotAccount;

    /**
     * 创建时间
     */
    @Column(name = "CR_DATETIME")
    private Date crDatetime;

    /**
     * 更新时间
     */
    @Column(name = "LM_DATETIME")
    private Date lmDatetime;

    /**
     * 版本号
     */
    @Column(name = "VERSION")
    private Integer version;

    /**
     * 获取账户ID
     *
     * @return ID - 账户ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置账户ID
     *
     * @param id 账户ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取全局id
     *
     * @return GLOBAL_ID - 全局id
     */
    public String getGlobalId() {
        return globalId;
    }

    /**
     * 设置全局id
     *
     * @param globalId 全局id
     */
    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    /**
     * 获取总金额
     *
     * @return TOTAL_AMT - 总金额
     */
    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    /**
     * 设置总金额
     *
     * @param totalAmt 总金额
     */
    public void setTotalAmt(BigDecimal totalAmt) {
        this.totalAmt = totalAmt;
    }

    /**
     * 获取冻结金额
     *
     * @return FROZEN_AMT - 冻结金额
     */
    public BigDecimal getFrozenAmt() {
        return frozenAmt;
    }

    /**
     * 设置冻结金额
     *
     * @param frozenAmt 冻结金额
     */
    public void setFrozenAmt(BigDecimal frozenAmt) {
        this.frozenAmt = frozenAmt;
    }

    /**
     * 获取是否热点账户
     *
     * @return HOT_ACCOUNT - 是否热点账户
     */
    public Byte getHotAccount() {
        return hotAccount;
    }

    /**
     * 设置是否热点账户
     *
     * @param hotAccount 是否热点账户
     */
    public void setHotAccount(Byte hotAccount) {
        this.hotAccount = hotAccount;
    }

    /**
     * 获取创建时间
     *
     * @return CR_DATETIME - 创建时间
     */
    public Date getCrDatetime() {
        return crDatetime;
    }

    /**
     * 设置创建时间
     *
     * @param crDatetime 创建时间
     */
    public void setCrDatetime(Date crDatetime) {
        this.crDatetime = crDatetime;
    }

    /**
     * 获取更新时间
     *
     * @return LM_DATETIME - 更新时间
     */
    public Date getLmDatetime() {
        return lmDatetime;
    }

    /**
     * 设置更新时间
     *
     * @param lmDatetime 更新时间
     */
    public void setLmDatetime(Date lmDatetime) {
        this.lmDatetime = lmDatetime;
    }

    /**
     * 获取版本号
     *
     * @return VERSION - 版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}