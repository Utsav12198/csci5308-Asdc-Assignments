
public interface IBankOfCanada {

	public enum UserValidation {

		LOGIN_SUCCESSFULL, LOGIN_FAILURE

	}

	public UserValidation userLogin(String username, String pwd);

}
