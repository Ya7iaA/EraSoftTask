package com.product.service;

import com.product.model.Items;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ItemServiceImpl implements ItemService {

    private DataSource dataSource;
    private Connection connection = null;
    private Statement statement = null;
    private String query;

    public ItemServiceImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Items> listItems() {
        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            query = "SELECT * FROM ITEMS";
            ResultSet resultSet = statement.executeQuery(query);

            List<Items> listItems = new ArrayList<>();

            while (resultSet.next()) {
                Items item = new Items();
                item.setItemId(resultSet.getLong("ITEM_ID"));
                item.setItemName(resultSet.getString("ITEM_NAME"));
                item.setItemPrice(resultSet.getDouble("ITEM_PRICE"));
                item.setItemQuantity(resultSet.getInt("ITEM_QUANTITY"));

                listItems.add(item);
            }
            return  listItems;
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("SQLException in closing resources: " + e.getMessage());
            }
        }
        return new ArrayList<>();
    }

    @Override
    public void addItem(Items items) {
        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            query = "INSERT INTO ITEMS (ITEM_NAME, ITEM_PRICE, ITEM_QUANTITY) " +
                    "VALUES ('" + items.getItemName() + "', " + items.getItemPrice() + ", " + items.getItemQuantity() + ")";
            statement.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("SQLException in closing resources: " + e.getMessage());
            }
        }
    }

    @Override
    public void removeItem(long itemId) {
        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            query = "DELETE ITEMS WHERE ITEM_ID = " + itemId;
            statement.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("SQLException in closing resources: " + e.getMessage());
            }
        }
    }

    @Override
    public void editItem(Items items) {
        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            query = "UPDATE ITEMS SET ITEM_NAME = '" + items.getItemName() + "', ITEM_PRICE = " + items.getItemPrice() +
                    ", ITEM_QUANTITY = " + items.getItemQuantity() + " WHERE ITEM_ID = " + items.getItemId();
            statement.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("SQLException in closing resources: " + e.getMessage());
            }
        }
    }
}