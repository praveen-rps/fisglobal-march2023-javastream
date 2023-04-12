package springjdbcdemo.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import springjdbcdemo.model.SalesTable;

public class SalesDaoImpl implements SalesDao {
	
	JdbcTemplate template;
	

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public List<SalesTable> listAll() {
		// TODO Auto-generated method stub
		
		return null;
	}

	public String addData(SalesTable sales) {
		// TODO Auto-generated method stub
		String sql = "insert into salestable values(?,?,?)";
		template.update(sql,sales.getEname(),sales.getJob(),sales.getSal());
		
		return "data is inserted";
	}

	public String deleteData(String ename) {
		// TODO Auto-generated method stub
		String sql = "delete from salestable where ename=?";
		template.update(sql,ename);
		return null;
	}

	public SalesTable searchTable(String ename) {
		// TODO Auto-generated method stub
		template.update(" ");
		return null;
	}

}
