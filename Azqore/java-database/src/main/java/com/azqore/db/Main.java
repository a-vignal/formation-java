package com.azqore.db;

import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class Main {

    private static Object e;

    public static void main(String[] args) throws SQLException, ParseException {

        List<Employees> employees = new ArrayList<>();

        employees.add(new Employees(1L,"A","B"));
        employees.add(new Employees(2L,"C","D"));
        employees.add(new Employees(3L,"E","F"));

        employees.stream()
                .map(e -> new Employees(e.id(),e.firstName(),e.lastName() + "P"));




       // employees.stream().filter()


        /*     System.out.println("Hello world");
        FruitDao fruitDao = new FruitDao();

    //    List<Fruit> fruitList = fruitDao.fechAll();
    //    fruitList.forEach(f -> System.out.println(f));

        Optional<Fruit> fruitOptional1 = fruitDao.fetchById(190L);
        if(fruitOptional1.isPresent()){
            System.out.println(fruitOptional1);
        } else {System.out.println("Enreg inexistant");}*/

    //    Fruit fruit = new Fruit(0L,"Orange",LocalDate.of(2024,12,12) );
    //    Fruit savedFruit = fruitDao.save(fruit);
    //    System.out.println(fruitDao.fetchById(4L));

    /*
        String url = "jdbc:mysql://localhost:3306/example?serverTimezone=UTC";
        String user = "root";
        String password = "";
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Driver MySQL introuvable");
        }

        try {
            System.out.println("Tentative connexion");
            connection = DriverManager.getConnection(url, user, password);

            // Faire la requete SELECT ALL
            Statement st = connection.createStatement();
            String query = "SELECT *,expiration_date FROM fruits";
            ResultSet resultSet = st.executeQuery(query);

            while (resultSet.next()) {
                long id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Date expirationDate = resultSet.getDate("expiration_date");
                Fruit fruit = new Fruit(id, name, expirationDate);
                System.out.println(fruit);
            }

            // Faire une insertion





        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null && connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println("Fermeture impossible");
            }
        }*/
    }
}
