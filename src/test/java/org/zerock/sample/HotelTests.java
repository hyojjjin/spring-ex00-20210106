package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
//일을 처리하는 방법 제시
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//WEB-INF 폴더 안에 있는 contextpath의 경로에 접근
@Log4j
//log문의 출력을 도와주는 오픈소스
public class HotelTests {
	
	@Setter(onMethod_=@Autowired)
	private SampleHotel hotel;
	
	@Test
	public void test() {
		assertNotNull(hotel);
	
		log.info(hotel);
		log.info("-------------");
		log.info(hotel.getChef());
	}

}
