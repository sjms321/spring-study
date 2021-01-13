package testPtj001;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Mainclass {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		TranspotationWalk transpotationWalk = 
				ctx.getBean("tWalk",TranspotationWalk.class);
		transpotationWalk.move();
		
		ctx.close();
		
	}
}
