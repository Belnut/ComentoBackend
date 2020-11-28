package com.mumuni.dao;

import com.mumuni.vo.*;
import java.util.List;

public interface MovieDAO {
	public List<MovieVO> selectMovie() throws Exception;
}
