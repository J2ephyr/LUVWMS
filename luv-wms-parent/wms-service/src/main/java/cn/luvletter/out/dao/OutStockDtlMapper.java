package cn.luvletter.out.dao;

import cn.luvletter.out.model.OutStockDtl;
import cn.luvletter.out.model.OutStockDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OutStockDtlMapper {
    int countByExample(OutStockDtlExample example);

    int deleteByExample(OutStockDtlExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OutStockDtl record);

    int insertSelective(OutStockDtl record);

    List<OutStockDtl> selectByExample(OutStockDtlExample example);

    OutStockDtl selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OutStockDtl record, @Param("example") OutStockDtlExample example);

    int updateByExample(@Param("record") OutStockDtl record, @Param("example") OutStockDtlExample example);

    int updateByPrimaryKeySelective(OutStockDtl record);

    int updateByPrimaryKey(OutStockDtl record);
}