package cn.luvletter.util;



import cn.luvletter.exception.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * JDBC工具类
 * Created by ZhangShuzheng on 2017/1/10.
 */
@Component
public class JdbcUtil {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JdbcUtil(JdbcTemplate jdbcTemplate){
        Assert.notNull(jdbcTemplate, "JdbcTemplate can not be null!");
        this.jdbcTemplate = jdbcTemplate;
    }
	// 更新数据
	public int updateByParams(String sql, Object... args) throws SQLException {
        return jdbcTemplate.update(sql, args);
    }

	// 查询多条记录
	public List<Map<String,Object>> selectByParams(String sql, Object... args)  {
		return jdbcTemplate.queryForList(sql, args);
	}
	/**
	 * @Description: 查询多条记录，并转换为bean
	 * @Date: 21:25 2018/2/24
	 */
	public <T> List<T> selectBean(String sql, Class<T> clazz, Object... args) {
		List<Map<String,Object>> list = this.selectByParams(sql,args);
		List<T> resultList = new ArrayList<T>();
		for(Map<String,Object> var2:list){
			T bean = BeanUtils.map2Bean(var2, clazz);
			resultList.add(bean);
		}
		return resultList;
	}
}
