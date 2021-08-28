package com.lc.service.impl;

import com.lc.dao.CelebrityMapper;
import com.lc.entity.Celebrity;
import com.lc.enums.ResultEnum;
import com.lc.service.CelebrityService;
import com.lc.utils.ResultVOUtil;
import com.lc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CelebrityServiceImpl implements CelebrityService {

    @Autowired
    private CelebrityMapper celebrityMapper;

    @Override
    public ResultVO insertCelebrity(Celebrity celebrity) {
        int insert = celebrityMapper.insertSelective(celebrity);
        if(insert != 1){
            return ResultVOUtil.error(ResultEnum.DATABASE_OPTION_ERROR);
        }
        return ResultVOUtil.success("添加成功");
    }

    // 用户查看名人榜
    @Override
    public ResultVO selectAllCelebrity() {
        List<Celebrity> celebrityList = celebrityMapper.selectAll();
        if(celebrityList == null){
            return ResultVOUtil.error(ResultEnum.CELEBRITY_NOT_EXIST_ERROR);
        }
        return ResultVOUtil.success(celebrityList);
    }

    // 管理员修改名人信息
    @Override
    public ResultVO updateCelebrity(Celebrity celebrity) {
        int update = celebrityMapper.updateByPrimaryKeySelective(celebrity);
        if(update != 1){
            return ResultVOUtil.error(ResultEnum.DATABASE_OPTION_ERROR);
        }
        return ResultVOUtil.success("修改成功");
    }

    // 管理员删除名人信息
    @Override
    public ResultVO deleteCelebrity(Long celebrityid) {
        Celebrity celebrity = celebrityMapper.selectByPrimaryKey(celebrityid);
        if(celebrity == null){
            return ResultVOUtil.error(ResultEnum.CELEBRITY_NOT_EXIST_ERROR);
        }
        int delete = celebrityMapper.deleteByPrimaryKey(celebrityid);
        if(delete != 1){
            return ResultVOUtil.error(ResultEnum.DATABASE_OPTION_ERROR);
        }
        return ResultVOUtil.success("删除成功");
    }
}
