package com.azqore.db;

import com.azqore.db.Fruit;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
//import java.util.Date;

import java.util.List;
import java.util.Optional;

/**
* *DAO: Data Access Object
**/
public class FruitDao {

    Connection connection = ConnectionManager.getConnection();

    List<Fruit> fechAll() throws SQLException {
        List<Fruit> listFruit = new ArrayList<>();
        try {

            Statement pst = connection.createStatement();
            String query = "SELECT *,expiration_date FROM fruits";
            ResultSet resultSet = pst.executeQuery(query);
            int i = 0;
            while (resultSet.next()) {

                listFruit.add(getFruit(resultSet));
            }
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listFruit;
    }


    Optional<Fruit> fetchById(Long id) throws SQLException {
        Optional<Fruit> fetchedFruit = Optional.empty();
        String querySql = "SELECT *,expiration_date FROM fruits WHERE id=?";

        try {
        //    Statement st = connection.createStatement();
            PreparedStatement pst = connection.prepareStatement(querySql) ;
            pst.setLong(1, id);
            ResultSet resultSet = pst.executeQuery();
            if(resultSet.next()) {
                long idFruit = resultSet.getInt("id");
                String name = resultSet.getString("name");
                LocalDate expirationDate = resultSet.getObject("expiration_date", LocalDate.class);
                fetchedFruit = Optional.of(getFruit(resultSet));
            }
            pst.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return fetchedFruit;
    }

    Fruit save(Fruit fruit) throws SQLException {
        Fruit insertedFruit = null;
        String querySql = "INSERT INTO `fruits` (`name`,`expiration_date`) VALUES" +
                "(?,?)";
        try{
            PreparedStatement pst = ConnectionManager.getConnection().prepareStatement(querySql, Statement.RETURN_GENERATED_KEYS );
            pst.setString(1,fruit.getFruitName() );
            pst.setDate(2, Date.valueOf(fruit.getFruitDate()));
            pst.executeUpdate();

            ResultSet resultSet = pst.getGeneratedKeys();
         /*   Long generatedKey = pst.getGeneratedKeys().;
        /*    insertedFruit = new Fruit(generatedKey,
                    fruit.getFruitName(),
                    fruit.getFruitDate());
*/          pst.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return insertedFruit;
    }

    public Fruit getFruit(ResultSet resultSet) throws SQLException {

        long id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        LocalDate expirationDate = resultSet.getObject("expiration_date",LocalDate.class);
        Fruit newFruit = new Fruit(id, name, expirationDate);
        return newFruit;
    }
}
