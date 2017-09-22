package com.newlecture.webapp.dao.spring;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.newlecture.webapp.dao.NoticeDao;
import com.newlecture.webapp.entity.Notice;
import com.newlecture.webapp.entity.NoticeView;

public class SpringNoticeDao implements NoticeDao {
	@Autowired//ioc콘테이너에 있는 값을 가져온다.
	private DataSource dataSource;
	@Override
	public List<NoticeView> getList(int page, String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public NoticeView get(String id) {
		
		String sql = "SELECT * FROM NoticeView WHERE  id = ?";
		
		
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.queryForObject(sql, requiredType);	//오브젝트의 정보를 줘야한다. 
		
		return null;
	}

	@Override
	public int update(String id, String title, String content) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Notice getEdit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
