package com.psm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.psm.bean.Product;
import com.psm.util.DBConnection;

public class ProductDao {

	static Scanner sc = new Scanner(System.in);

	public void insertProduct(Product product) throws DataAccessException {
		int affectedRows = 0;
		String insertQuery = "INSERT INTO product(product_name, category, price, quantity, manufacturer) VALUES(?, ?, ?, ?, ?)";
		try (Connection conn = DBConnection.getConnectionMy();
				PreparedStatement ps = conn.prepareStatement(insertQuery)) {
			ps.setString(1, product.getProductName());
			ps.setString(2, product.getCategory());
			ps.setDouble(3, product.getPrice());
			ps.setInt(4, product.getQuantity());
			ps.setString(5, product.getManufacturer());
			affectedRows = ps.executeUpdate();
			if (affectedRows > 0) {
				System.out.println(affectedRows + " Inserted Successfully!!");
			} else {
				System.out.println(affectedRows + " Rows Inserted!!");
			}
		} catch (SQLException e) {
			throw new DataAccessException("Failed To insert the Value", e);
		}
	}// end of insertProduct

	public List<Product> viewAllProducts() throws DataAccessException {
		String selectQuery = "SELECT * FROM product";
		List<Product> list = new ArrayList<Product>();
		try (Connection conn = DBConnection.getConnectionMy();
				PreparedStatement prepStmt = conn.prepareStatement(selectQuery);) {
			try (ResultSet rs = prepStmt.executeQuery();) {
				while (rs.next()) {
					list.add(mapRow(rs));
				}
			}
		} catch (SQLException e) {
			throw new DataAccessException("Failed to Fetch the Products", e);
		}
		return list;
	}// end of viewAllProducts

	public Product searchProductById(int id) throws DataAccessException {
		String sql = "SELECT product_id, product_name, category, price, quantity, manufacturer "
				+ "FROM product WHERE product_id = ?";
		try (Connection conn = DBConnection.getConnectionMy(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			try (ResultSet rs = ps.executeQuery()) {
				return rs.next() ? mapRow(rs) : null;
			}
		} catch (SQLException e) {
			throw new DataAccessException("Failed to fetch product " + id, e);
		}
	}// end of searchProductById

	public boolean doesIdExist(int id) throws DataAccessException {
		return searchProductById(id) != null;
	}// end of doesIdExist

	private Product mapRow(ResultSet rs) throws SQLException {
		return new Product(rs.getInt("product_id"), rs.getString("product_name"), rs.getString("category"),
				rs.getDouble("price"), rs.getInt("quantity"), rs.getString("manufacturer"));
	}// end of mapRow

	public void updateProduct(int id, Product product) throws DataAccessException {

		String updateQuery = "UPDATE product SET product_name = ?, category = ?, price = ?, quantity = ?, manufacturer = ? WHERE product_id = ?";

		try (Connection conn = DBConnection.getConnectionMy();
				PreparedStatement prepStmt = conn.prepareStatement(updateQuery);) {
			prepStmt.setString(1, product.getProductName());
			prepStmt.setString(2, product.getCategory());
			prepStmt.setDouble(3, product.getPrice());
			prepStmt.setInt(4, product.getQuantity());
			prepStmt.setString(5, product.getManufacturer());
			prepStmt.setInt(6, id);

			int affectedRows = prepStmt.executeUpdate();

			System.out.println(affectedRows + " Rows Updated!!");

		} catch (SQLException e) {
			throw new DataAccessException("Failed to Update the Product", e);
		}

	}// end of updateProduct

	public boolean deleteProduct(int id) throws DataAccessException {
		String sql = "DELETE FROM product WHERE product_id = ?";
		try (Connection conn = DBConnection.getConnectionMy(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			throw new DataAccessException("Failed to delete product " + id, e);
		}
	}// end of deleteProduct

	public List<Product> findLowStock(int threshold) throws DataAccessException {
		String sql = "SELECT product_id, product_name, category, price, quantity, manufacturer "
				+ "FROM product WHERE quantity < ?";
		List<Product> list = new ArrayList<>();
		try (Connection conn = DBConnection.getConnectionMy(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, threshold);
			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					list.add(mapRow(rs));
				}
			}
		} catch (SQLException e) {
			throw new DataAccessException("Failed to fetch low stock products", e);
		}
		return list;
	}// end of findLowStock

	public List<Product> searchProductByCategory(String category) throws DataAccessException {
		String searchQuery = "SELECT * FROM product WHERE category = ?";
		List<Product> proList = new ArrayList<Product>();
		try (Connection conn = DBConnection.getConnectionMy();
				PreparedStatement prepStmt = conn.prepareStatement(searchQuery);) {
			prepStmt.setString(1, category);

			try (ResultSet rs = prepStmt.executeQuery();) {
				while (rs.next()) {
					proList.add(mapRow(rs));
				}
			}
		} catch (SQLException e) {
			throw new DataAccessException("Failed to Fetch the Products", e);
		}
		return proList;
	}// end of searchProductByCategory

}
