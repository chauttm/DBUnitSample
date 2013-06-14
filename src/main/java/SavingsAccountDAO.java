import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: chauttm
 * Date: 6/13/13
 * Time: 3:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class SavingsAccountDAO {
    private Connection dbConnection;

    public SavingsAccountDAO(DataSource dataSource) throws SQLException {
        this.dbConnection = dataSource.getConnection();
    }

    public SavingsAccountDTO findByAccountNumber(String accountNumber) throws SQLException {
        String queryString = "SELECT * FROM SAVINGS_ACCOUNT WHERE ACCOUNT_NUMBER='" + accountNumber + "'";
        ResultSet resultSet = dbConnection.createStatement().executeQuery(queryString);
        if(resultSet.next())
            return new SavingsAccountDTO(accountNumber, resultSet.getString("description"),resultSet.getDouble("balance"));
        else
            return null;
    }
}

