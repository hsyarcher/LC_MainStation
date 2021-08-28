package com.lc.service;

import com.lc.entity.Bill;
import com.lc.form.SelectBillForm;
import com.lc.vo.ResultVO;

public interface BillService {

    // 添加账单
    ResultVO addBill(Bill bill);

    // 查看账单
    ResultVO selectBill(SelectBillForm billForm);
}
