package cn.luvletter.stock.dao;

import cn.luvletter.stock.model.StockDtl;
import cn.luvletter.stock.model.StockDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StockDtlMapper {
    int countByExample(StockDtlExample example);

    int deleteByExample(StockDtlExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StockDtl record);

    int insertSelective(StockDtl record);

    List<StockDtl> selectByExample(StockDtlExample example);

    StockDtl selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StockDtl record, @Param("example") StockDtlExample example);

    int updateByExample(@Param("record") StockDtl record, @Param("example") StockDtlExample example);

    int updateByPrimaryKeySelective(StockDtl record);

    int updateByPrimaryKey(StockDtl record);
}