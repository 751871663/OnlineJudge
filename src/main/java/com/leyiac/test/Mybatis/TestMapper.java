package com.leyiac.test.Mybatis;

import java.util.List;

public interface TestMapper {
	
	public List<TestModel> getModel();
	
	public int insertModel(TestModel model);
	
}
