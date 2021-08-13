package testPtj;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Mainclass {
	public static void main(String[] args) {
		//TransportationWalk transportationWalk = new TransportationWalk();
		//transportationWalk.move();
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
																			//리소스의 내용
		//Bean을 가져오고 Bean이 여러개 있을 수 있으니 id 알려주고 마지막에 데이터의 탑입을 적는다.
                        //타입을 적을 때 유의 해야한다.
		TransportationWalk transportationWalk = ctx.getBean("tWalk",TransportationWalk.class);
		//객체 가져오기 데이터타입은 TransportationWalk
		transportationWalk.move();
		
		ctx.close();
		//기존: 클래스를 만들고 클래스를 사용하기위해 new를이용하여 메모리에 동적으로 로딩후 레퍼런스를 이용하여 메소드나 속성에 접근하는방식
		//스프링에서도 기존의 방식을 사용하지만 효율적이고 다른업무에 집중을 할 수있도록 객체를 생성하는 다른방법을 고안했다. 그것이 컨데이너이다
		//컨테이너 안에 생성된 객체는 bean  
		//xml ->라이브러리 파일들을 땡겨오는 파일
		//객체를 사용할때new 대신 리소스폴더에 xml파일로 컨테이너 역할의 폴더를 만든후 path를 이용하여 폴더 생성후 컨테이너 안에있는 bean의 객체를 getbean으로 가져온다 생성은 컨테이너가 알아서!
	
	}
}
