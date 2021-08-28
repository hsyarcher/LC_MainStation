package com.lc.service.impl;

import com.lc.dao.HomeMapper;
import com.lc.dao.SummaryMapper;
import com.lc.dao.UserMapper;
import com.lc.entity.Home;
import com.lc.entity.Summary;
import com.lc.entity.User;
import com.lc.enums.ResultEnum;
import com.lc.form.HomeForm;
import com.lc.service.HomeService;
import com.lc.utils.ResultVOUtil;
import com.lc.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private HomeMapper homeMapper;

    @Autowired
    private SummaryMapper summaryMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public ResultVO updateHome(HomeForm homeForm) {
        Home home = homeMapper.selectByPrimaryKey(homeForm.getUserid());
        if(home == null){
            return ResultVOUtil.error(ResultEnum.USER_NOT_EXIST_ERROR);
        }
        BeanUtils.copyProperties(homeForm,home);
        List<Summary> summaryList = summaryMapper.selectAllByUserid(homeForm.getUserid());
        home.setSummaryList(summaryList);
        int update = homeMapper.updateByPrimaryKeySelective(home);
        if(update != 1){
            return ResultVOUtil.error(ResultEnum.DATABASE_OPTION_ERROR);
        }
        User user = userMapper.selectByPrimaryKey(home.getUserid());
        user.setNickname(home.getNickname());
        user.setGrade(home.getGrade());
        user.setPhone(home.getPhone());
        user.setEmail(home.getEmail());
        user.setAvatar(home.getAvatar());
        Date date = new Date();
        user.setUpdateTime(date);
        update = userMapper.updateByPrimaryKeySelective(user);
        if(update != 1){
            return ResultVOUtil.error(ResultEnum.DATABASE_OPTION_ERROR);
        }
        return ResultVOUtil.success("修改成功");
    }

    @Override
    public ResultVO selectHome(Long userid) {
        Home home = homeMapper.selectByPrimaryKey(userid);
        List<Summary> summaryList = summaryMapper.selectAllByUserid(home.getUserid());
        home.setSummaryList(summaryList);
        return ResultVOUtil.success(home);
    }
}
