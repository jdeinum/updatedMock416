package mockSQL;

import java.util.Random;

import static mockSQL.SQL.sanitizeString;

public class Main {

    private static void handleSQL(Request request, SQL db, Random rd) {
        String studentId = request.getParameter("studId");
        StringBuilder sb = new StringBuilder("SELECT * FROM Students where studId='");

        if (rd.nextBoolean()) {
            sb.append(sanitizeString(studentId));
        } else {
            sb.append("123456");
        }

        sb.append("'");

        String query = sb.toString();

        db.executeQuery(query);

    }

    private static void handleSQLBad(Request request, SQL db, Random rd) {
        String studentId = request.getParameter("studId");
        StringBuilder sb = new StringBuilder("SELECT * FROM Students where studId='");

        if (rd.nextBoolean()) {
            sb.append(studentId);
        } else {
            sb.append("123456");
        }

        sb.append("'");

        String query = sb.toString();

        db.executeQuery(query);

    }

    public static void main(String[] args) {
        Request req = new Request();
        SQL db = new SQL();
        Random rd = new Random();

        System.out.println("Starting SQL handle...");
        handleSQL(req, db, rd);
        System.out.println("Ending SQL handle.");
    }
}
