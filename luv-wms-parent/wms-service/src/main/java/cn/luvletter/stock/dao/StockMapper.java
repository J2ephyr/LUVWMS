package cn.luvletter.stock.dao;

import cn.luvletter.stock.model.Stock;
import cn.luvletter.stock.model.StockExample;
import java.util.List;
import java.util.Map;

import cn.luvletter.stock.vo.StockVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StockMapper {
    int countByExample(StockExample example);

    int deleteByExample(StockExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Stock record);

    int insertSelective(Stock record);

    List<Stock> selectByExample(StockExample example);

    Stock selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Stock record, @Param("example") StockExample example);

    int updateByExample(@Param("record") Stock record, @Param("example") StockExample example);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);

    List<StockVo> selectStockVo(Map<String, String> params);

    long countStockVo(Map<String, String> params);
}