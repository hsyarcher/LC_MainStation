package com.lc.controller;

import com.lc.entity.Bill;
import com.lc.form.SelectBillForm;
import com.lc.service.BillService;
import com.lc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lc/bill")
public class BillController {

    @Autowired
    private BillService billService;

    // 添加账单
    @PostMapping("/add")
    public ResultVO addBill(Bill bill){
        return billService.addBill(bill);
    }

    // 查看账单
    @GetMapping("/select")
    public ResultVO selectBill(SelectBillForm billForm){
        return billService.selectBill(billForm);
    }
}
