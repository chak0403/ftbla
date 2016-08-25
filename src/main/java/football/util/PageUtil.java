package football.util;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public class PageUtil {
	public static final Pageable FIRST_TEN = new PageRequest(0, 10);
	public static final Pageable FIRST_SIX = new PageRequest(0, 10);
}
