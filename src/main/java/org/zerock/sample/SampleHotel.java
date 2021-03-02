package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@Getter
//@AllArgsConstructor
//모든 필드에 대해 기본 생성자를 생성 

@RequiredArgsConstructor
//NonNull이나 final이 붙은 객체에 생성자 생성
public class SampleHotel {

		private Chef chef;
		
//		public SampleHotel(Chef chef) {
//			this.chef = chef;
//		}
	
}
