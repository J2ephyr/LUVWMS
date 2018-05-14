package cn.luvletter.in.dao;

import cn.luvletter.in.model.InStockDtl;
import cn.luvletter.in.model.InStockDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface InStockDtlMapper {
    int countByExample(InStockDtlExample example);

    int deleteByExample(InStockDtlExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InStockDtl record);

    int insertSelective(InStockDtl record);

    List<InStockDtl> selectByExample(InStockDtlExample example);

    InStockDtl selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InStockDtl record, @Param("example") InStockDtlExample example);

    int updateByExample(@Param("record") InStockDtl record, @Param("example") InStockDtlExample example);

    int updateByPrimaryKeySelective(InStockDtl record);

    int updateByPrimaryKey(InStockDtl record);
}