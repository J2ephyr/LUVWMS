package cn.luvletter.order.dao;

import cn.luvletter.order.model.OrderDtl;
import cn.luvletter.order.model.OrderDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDtlMapper {
    int countByExample(OrderDtlExample example);

    int deleteByExample(OrderDtlExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderDtl record);

    int insertSelective(OrderDtl record);

    List<OrderDtl> selectByExample(OrderDtlExample example);

    OrderDtl selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderDtl record, @Param("example") OrderDtlExample example);

    int updateByExample(@Param("record") OrderDtl record, @Param("example") OrderDtlExample example);

    int updateByPrimaryKeySelective(OrderDtl record);

    int updateByPrimaryKey(OrderDtl record);
}