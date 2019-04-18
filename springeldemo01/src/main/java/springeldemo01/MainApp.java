package springeldemo01;

import org.springframework.expression.*;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpressionParser parser = new SpelExpressionParser();
		System.out.println(parser.parseExpression("'welcome to spel'+' test01'").getValue());
		System.out.println(parser.parseExpression("10 * 10/2").getValue());
		System.out.println(parser.parseExpression("'Today is: '+new java.util.Date()").getValue());
		System.out.println(parser.parseExpression("true or false").getValue());
		System.out.println(parser.parseExpression("'hello'.length()==7").getValue());
	}

}
