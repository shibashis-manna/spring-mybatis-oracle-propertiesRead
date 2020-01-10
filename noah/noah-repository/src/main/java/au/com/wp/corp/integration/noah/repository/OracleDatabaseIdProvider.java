package au.com.wp.corp.integration.noah.repository;

import org.apache.ibatis.mapping.DatabaseIdProvider;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Oracle database ID provider for Mybatis configuration
 * Created by N039289
 */
public class OracleDatabaseIdProvider implements DatabaseIdProvider {
    @Override
    /**
	 * This method sets properties
	 */
    public void setProperties(Properties properties) {
    	// This method sets properties
    }

    @Override
    /**
	 * This method generates datasource
	 */
    public String getDatabaseId(DataSource dataSource) throws SQLException {
        return "Oracle";
    }
}
