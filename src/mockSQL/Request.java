package mockSQL;

public class Request {
    String getParameter(String param) {
        return System.getenv(param);
    }
}
