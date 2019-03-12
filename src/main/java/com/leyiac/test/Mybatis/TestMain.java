package com.leyiac.test.Mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class TestMain {

	public static void main(String[] args) throws IOException {
		
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = factory.openSession();
		
		List<TestModel> list = session.selectList("com.leyiac.test.Mybatis.TestMapper.getModel");
		for (TestModel testModel : list) {
			System.out.println(testModel);
			String s = testModel.getTitle();
			String src = "";
			if (s.indexOf("<img ") != -1){
				s = s.substring(s.indexOf("<img"), s.indexOf(">"));
				
				Document doc = Jsoup.parse(s);
				Element srcele = doc.getElementsByTag("img").first();
				src = srcele.attr("src");
				
				
			}
		}
		
	}
	
}
