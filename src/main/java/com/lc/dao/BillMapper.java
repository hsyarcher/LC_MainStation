package com.lc.dao;

import com.lc.entity.Bill;
import com.lc.form.SelectBillForm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BillMapper {
    int deleteByPrimaryKey(Long billid);

    int insert(Bill record);

    int insertSelective(Bill record);

    Bill selectByPrimaryKey(Long billid);
    List<Bill> selectAll(SelectBillForm billForm);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);
}