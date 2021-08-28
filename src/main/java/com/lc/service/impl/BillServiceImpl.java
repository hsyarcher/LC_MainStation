package com.lc.service.impl;

import com.lc.dao.BillMapper;
import com.lc.entity.Bill;
import com.lc.enums.ResultEnum;
import com.lc.form.SelectBillForm;
import com.lc.service.BillService;
import com.lc.utils.ResultVOUtil;
import com.lc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillMapper billMapper;

    @Override
    public ResultVO addBill(Bill bill) {
        Date date = new Date();
        bill.setBillTime(date);
        int insert = billMapper.insertSelective(bill);
        if(insert != 1){
            return ResultVOUtil.error(ResultEnum.DATABASE_OPTION_ERROR);
        }
        return ResultVOUtil.success("添加成功");
    }

    @Override
    public ResultVO selectBill(SelectBillForm billForm) {
        List<Bill> billList = billMapper.selectAll(billForm);
        if(billList == null){
            return ResultVOUtil.error(ResultEnum.BILL_NOT_EXIST_ERROR);
        }
        return ResultVOUtil.success(billList);
    }
}
