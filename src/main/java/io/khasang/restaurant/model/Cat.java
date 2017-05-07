package io.khasang.restaurant.model;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Aleksandr on 07.05.2017.
 */
public class Cat {

    private JdbcTemplate jdbcTemplate;

    public Cat() {
    }

    public Cat(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String createCatTable() {
        jdbcTemplate.execute("DROP TABLE IF EXISTS cats");
        jdbcTemplate.execute("CREATE TABLE cats(\n" +
                "id INTEGER CONSTRAINT firstkey PRIMARY KEY, \n" +
                "name VARCHAR (255) NOT NULL);"
        );
        return "table cats created";
    }
}
