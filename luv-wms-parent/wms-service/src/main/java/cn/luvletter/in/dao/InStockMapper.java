package cn.luvletter.in.dao;

import cn.luvletter.in.model.InStock;
import cn.luvletter.in.model.InStockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface InStockMapper {
    int countByExample(InStockExample example);

    int deleteByExample(InStockExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InStock record);

    int insertSelective(InStock record);

    List<InStock> selectByExample(InStockExample example);

    InStock selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InStock record, @Param("example") InStockExample example);

    int updateByExample(@Param("record") InStock record, @Param("example") InStockExample example);

    int updateByPrimaryKeySelective(InStock record);

    int updateByPrimaryKey(InStock record);
}