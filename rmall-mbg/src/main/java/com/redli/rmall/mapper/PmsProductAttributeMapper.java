package com.redli.rmall.mapper;

import com.redli.rmall.model.PmsProductAttribute;
import com.redli.rmall.model.PmsProductAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductAttributeMapper {
    long countByExample(PmsProductAttributeExample example);

    int deleteByExample(PmsProductAttributeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttribute row);

    int insertSelective(PmsProductAttribute row);

    List<PmsProductAttribute> selectByExample(PmsProductAttributeExample example);

    PmsProductAttribute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") PmsProductAttribute row, @Param("example") PmsProductAttributeExample example);

    int updateByExample(@Param("row") PmsProductAttribute row, @Param("example") PmsProductAttributeExample example);

    int updateByPrimaryKeySelective(PmsProductAttribute row);

    int updateByPrimaryKey(PmsProductAttribute row);
}