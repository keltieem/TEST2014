package expression;

public class FPExpression extends Expression {

	/**
	 * Constructor for FPExpression. This is a private constructor. Objects of
	 * this type can only be created by clients through a call to the static
	 * method 'getFPExpression(String)' or 'getFPExpression(Expression)'. This
	 * is to preserve the representation invariant and the sub-typing
	 * relationship.
	 * 
	 * @param expression
	 */
	private FPExpression(String expression) {
		super(expression);
	}

	/**
	 * 
	 * @param expression
	 * @return an FPExpression object with the same input expression if the
	 *         input expression is fully parenthesized.
	 * @throws IllegalArgumentException
	 *             if the input is not a valid fully parenthesized expression.
	 */
	public static FPExpression getFPExpression(String expression)
			throws IllegalArgumentException {
	    if(expression.equals("")){
	        throw new IllegalArgumentException("The expression cannot be null!");
	    }
	        
	    if(isFPExpression(expression) == false){
	        throw new IllegalArgumentException("This is not a fully parenthesized expression!");
	    }
	    else

		return new FPExpression(expression);
	}

	/**
	 * 
	 * @param expression
	 * @return an FPExpression object with the input expression string if the
	 *         input expression is fully parenthesized. 
	 * @throws IllegalArgumentException
	 *             if the input is not a valid fully parenthesized expression.
	 */
	public static FPExpression getFPExpression(Expression expression)
			throws IllegalArgumentException {
	    
	    String newExpression;
	    
        if(isFPExpression(expression) == false){
	        throw new IllegalArgumentException("This is not a fully parenthesized expression!");
	    }
	    else{
	        newExpression = expression.toString();
	        if(isFPExpression(newExpression) == false){
	            throw new IllegalArgumentException("This is not a fully parenthesized expression!");
	        }

	    }
        
		return new FPExpression(newExpression);

	}

	/**
	 * Given an Expression, check if the expression is a fully parenthesized
	 * expression.
	 * 
	 * @param expression
	 * @return true if expression is fully parenthesized and false otherwise
	 */
	public static boolean isFPExpression(Expression expression) {
		// This method is okay. Don't have to change this.
		return isFPExpression(expression.toString());
	}

	/**
	 * Given a String check if the string represents a fully parenthesized
	 * expression.
	 * 
	 * @param expression
	 * @return true if expression is fully parenthesized and false otherwise
	 */
	public static boolean isFPExpression(String expression) {
        String[] splitString;
        int countLeftRound = 0;
        int countRightRound = 0;
        int countLeftSquare = 0;
        int countRightSquare = 0;
        int countLeftCurly = 0;
        int countRightCurly = 0;
        
        splitString = expression.split("");
        
        for(int index = 0; index < splitString.length; index++ ){
           if(splitString[index] == "("){
               countLeftRound++;
           }
           if(splitString[index] == "["){
               countLeftSquare++;
           }
           if(splitString[index] == "{"){
               countLeftCurly++;
           }
           if(splitString[index] == ")"){
               countRightRound++;
           }
           if(splitString[index] == "]"){
               countRightSquare++;
           }
           if(splitString[index] == "}"){
               countRightCurly++;
           }
        }
        
        if(countLeftRound == countRightRound 
           && countLeftSquare == countRightSquare 
           && countLeftCurly == countRightCurly)
            return true;
        
        return false;
	}

}
