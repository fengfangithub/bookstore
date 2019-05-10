package com.fengfan.bookstore.vo;

import java.util.List;

/**
 * @ClassName CouponVo
 * @Author fengfan
 * @Date 2019/5/5 15:12
 * @Description TODO
 * @Version 1.0
 **/
public class CouponVo {
    private List<CouponGainVo> dotUse;
    private List<CouponGainVo> use;
    private List<CouponGainVo> overdue;

    public List<CouponGainVo> getDotUse() {
        return dotUse;
    }

    public void setDotUse(List<CouponGainVo> dotUse) {
        this.dotUse = dotUse;
    }

    public List<CouponGainVo> getUse() {
        return use;
    }

    public void setUse(List<CouponGainVo> use) {
        this.use = use;
    }

    public List<CouponGainVo> getOverdue() {
        return overdue;
    }

    public void setOverdue(List<CouponGainVo> overdue) {
        this.overdue = overdue;
    }
}
