package football.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import football.pojo.ExcelResult;

public interface ExcelResultRepository extends CrudRepository<ExcelResult, Integer> {

	public List<ExcelResult> findByGameDate(Date valueOf);

	public List<ExcelResult> findByHomeOrAwayOrderByGameIdDesc(String home, String away, Pageable pageable);
	
	public List<ExcelResult> findByAwayOrderByGameIdDesc(String away, Pageable pageable);
	
	public List<ExcelResult> findByHomeOrderByGameIdDesc(String home, Pageable pageable);
}
