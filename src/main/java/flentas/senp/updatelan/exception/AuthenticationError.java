/**
	 * @author Shyam Sunder Meena
	 * @CreatedOn 17/02/2020 
	 * @apiNote contain all the custom exceptions response message.
	 */
package flentas.senp.updatelan.exception;


public class AuthenticationError {
    public static final String NOT_VALID_JSON_WEB_TOKEN = "Not a valid json web token";
    public static final String TOKEN_EXPIRED = " Aws Jwt Token has expired.";
}
