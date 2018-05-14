package cn.luvletter.base.dao;

import cn.luvletter.base.model.StorageArea;
import cn.luvletter.base.model.StorageAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageAreaMapper {
    int countByExample(StorageAreaExample example);

    int deleteByExample(StorageAreaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StorageArea record);

    int insertSelective(StorageArea record);

    List<StorageArea> selectByExample(StorageAreaExample example);

    StorageArea selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StorageArea record, @Param("example") StorageAreaExample example);

    int updateByExample(@Param("record") StorageArea record, @Param("example") StorageAreaExample example);

    int updateByPrimaryKeySelective(StorageArea record);

    int updateByPrimaryKey(StorageArea record);
}