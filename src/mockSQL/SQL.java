package mockSQL;

import mockSQL.Stuff;


public class SQL implements Stuff {

	public String password;
	public String passwd;
	public String pass;

	public SQL() {
		password = "hi";
		passwd = "hello";
		pass = "sup";
	}





    public static String sanitizeString(String string) {
        // mock sanitization
        return string;
    }

    public void executeQuery(String query) {}

    public void stuff() {}

    public void test() {}

}
