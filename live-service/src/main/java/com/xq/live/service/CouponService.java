package com.xq.live.service;

import com.xq.live.common.Pager;
import com.xq.live.model.Coupon;
import com.xq.live.vo.in.CouponInVo;
import com.xq.live.vo.out.CouponOut;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author zhangpeng32
 * @date 2018-02-08 21:35
 * @copyright:hbxq
 **/
public interface CouponService {
    /**
     * 根据id查询
     * @param id
     * @return
     */
    Coupon get(Long id);

    /**
     * 分页查询
     * @param inVo
     * @return
     */
    Pager<CouponOut> list(CouponInVo inVo);

    /**
     * 查最热
     * @param inVo
     * @return
     */
    List<CouponOut> top(CouponInVo inVo);

    /**
     * 新增
     * @param coupon
     * @return
     */
    Long add(Coupon coupon);

    /**
     * 根据couponCode查询记录
     * @param couponCode
     * @return
     */
    CouponOut getByCouponCode(String couponCode);

    /**
     * 根据id查询详情
     * @param id
     * @return
     */
    CouponOut selectById(Long id);
}
