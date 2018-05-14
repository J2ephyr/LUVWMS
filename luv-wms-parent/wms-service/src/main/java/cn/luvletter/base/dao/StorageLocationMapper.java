package cn.luvletter.base.dao;

import cn.luvletter.base.model.StorageLocation;
import cn.luvletter.base.model.StorageLocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageLocationMapper {
    int countByExample(StorageLocationExample example);

    int deleteByExample(StorageLocationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StorageLocation record);

    int insertSelective(StorageLocation record);

    List<StorageLocation> selectByExample(StorageLocationExample example);

    StorageLocation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StorageLocation record, @Param("example") StorageLocationExample example);

    int updateByExample(@Param("record") StorageLocation record, @Param("example") StorageLocationExample example);

    int updateByPrimaryKeySelective(StorageLocation record);

    int updateByPrimaryKey(StorageLocation record);
}