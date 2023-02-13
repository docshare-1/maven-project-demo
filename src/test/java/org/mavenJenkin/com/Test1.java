package org.mavenJenkin.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.project.com.App;

public class Test1 {
	
	@Test
	public void testMsg() {
		Assertions.assertEquals("Hello Jenkins", App.msg());
	}

}
