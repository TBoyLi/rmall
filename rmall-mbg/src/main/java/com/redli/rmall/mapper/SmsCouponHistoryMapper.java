package com.redli.rmall.mapper;

import com.redli.rmall.model.SmsCouponHistory;
import com.redli.rmall.model.SmsCouponHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsCouponHistoryMapper {
    long countByExample(SmsCouponHistoryExample example);

    int deleteByExample(SmsCouponHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponHistory row);

    int insertSelective(SmsCouponHistory row);

    List<SmsCouponHistory> selectByExample(SmsCouponHistoryExample example);

    SmsCouponHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") SmsCouponHistory row, @Param("example") SmsCouponHistoryExample example);

    int updateByExample(@Param("row") SmsCouponHistory row, @Param("example") SmsCouponHistoryExample example);

    int updateByPrimaryKeySelective(SmsCouponHistory row);

    int updateByPrimaryKey(SmsCouponHistory row);
}