package com.lanou3g.utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public interface ExecetueInter {
    Statement execute(Connection conn) throws SQLException;
}
