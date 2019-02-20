package com.ftl.test;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class Test{
	public static void main(String[] args) throws Exception {
		Configuration configuration = new Configuration(Configuration.getVersion());
		configuration.setDirectoryForTemplateLoading(new File("D:\\workspace\\eclipse\\test-maven-web\\src\\main\\resources"));
		configuration.setDefaultEncoding("UTF-8");
		Template template = configuration.getTemplate("test.ftl");
		HashMap map = new HashMap();
		map.put("name", "shenbo");
		map.put("message", "今天又下雨了");
		FileWriter fileWriter = new FileWriter("D:\\workspace\\eclipse\\test-maven-web\\src\\main\\resources/test.html");
		template.process(map, fileWriter);
		fileWriter.close();
		
	}
}

