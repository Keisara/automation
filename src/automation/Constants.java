package automation;

public class Constants {
	public static final String URL = "https://github.com/";
	 
    public static final String Username = "K.eisakyu@gmail.com";
    public static final String UsernameFail = "emailFail@gmail.com";
    public static final String Password = "automationtest8";
    public static final String PasswordFail = "passwordFail";
    public static final String Blank = "";
    
    public static final String case1 = "Case 1: Login with a valid username and password | Expected Result: User is able to login";
    public static final String case2 = "Case 2: Login with an invalid username and invalid password | Expected Result: User is unable to login";	
    public static final String case3 = "Case 3: Login with a valid username and invalid password | Expected Result: User is unable to login"; 
    public static final String case4 = "Case 4: Login without entering a username and password | Expected Result: User is unable to login";
    		
	public static final String[] usernameArray = {Username, UsernameFail, Username, Blank}; 
	public static final String[] passwordArray = {Password, PasswordFail, PasswordFail, Blank}; 
	public static final String[] caseArray = {case1, case2, case3, case4};
	
}
