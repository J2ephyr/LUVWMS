package cn.luvletter.out.dao;

import cn.luvletter.out.model.OutStock;
import cn.luvletter.out.model.OutStockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OutStockMapper {
    int countByExample(OutStockExample example);

    int deleteByExample(OutStockExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OutStock record);

    int insertSelective(OutStock record);

    List<OutStock> selectByExample(OutStockExample example);

    OutStock selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OutStock record, @Param("example") OutStockExample example);

    int updateByExample(@Param("record") OutStock record, @Param("example") OutStockExample example);

    int updateByPrimaryKeySelective(OutStock record);

    int updateByPrimaryKey(OutStock record);
}