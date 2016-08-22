package football.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import football.pojo.ExcelResult;

public interface ExcelResultRepository extends CrudRepository<ExcelResult, Integer> {

	public List<ExcelResult> findByGameDate(Date valueOf);

}
