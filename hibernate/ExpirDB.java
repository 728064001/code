package com.test;

import junit.framework.TestCase;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class ExpirDB extends TestCase {
	public void testDB(){
		//读取hibernate.hbm.xml配置文件；
		Configuration cfg = new Configuration().configure();
		
		SchemaExport se = new SchemaExport(cfg);
		
		se.create(true, true);

	}
}
