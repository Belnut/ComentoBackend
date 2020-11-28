package com.mumuni.service;

import com.mumuni.vo.*;
import java.util.List;

public interface MovieService {
	public List<MovieVO> selectMovie() throws Exception;
}
