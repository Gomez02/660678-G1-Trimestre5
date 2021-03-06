/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.onlineshop.integracion.jdbc;

import edu.co.sena.onlineshop.integracion.dao.*;
import edu.co.sena.onlineshop.integracion.factory.*;
import edu.co.sena.onlineshop.integracion.dto.*;
import edu.co.sena.onlineshop.integracion.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ItemCarritoDaoImpl extends AbstractDAO implements ItemCarritoDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT CARRITO_COMPRAS_ID_CARRITO, PRODUCTO_ID_PRODUCTO, CANTIDAD, VALOR_UNITARIO, VALOR_TOTAL FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( CARRITO_COMPRAS_ID_CARRITO, PRODUCTO_ID_PRODUCTO, CANTIDAD, VALOR_UNITARIO, VALOR_TOTAL ) VALUES ( ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET CARRITO_COMPRAS_ID_CARRITO = ?, PRODUCTO_ID_PRODUCTO = ?, CANTIDAD = ?, VALOR_UNITARIO = ?, VALOR_TOTAL = ? WHERE CARRITO_COMPRAS_ID_CARRITO = ? AND PRODUCTO_ID_PRODUCTO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE CARRITO_COMPRAS_ID_CARRITO = ? AND PRODUCTO_ID_PRODUCTO = ?";

	/** 
	 * Index of column CARRITO_COMPRAS_ID_CARRITO
	 */
	protected static final int COLUMN_CARRITO_COMPRAS_ID_CARRITO = 1;

	/** 
	 * Index of column PRODUCTO_ID_PRODUCTO
	 */
	protected static final int COLUMN_PRODUCTO_ID_PRODUCTO = 2;

	/** 
	 * Index of column CANTIDAD
	 */
	protected static final int COLUMN_CANTIDAD = 3;

	/** 
	 * Index of column VALOR_UNITARIO
	 */
	protected static final int COLUMN_VALOR_UNITARIO = 4;

	/** 
	 * Index of column VALOR_TOTAL
	 */
	protected static final int COLUMN_VALOR_TOTAL = 5;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 5;

	/** 
	 * Index of primary-key column CARRITO_COMPRAS_ID_CARRITO
	 */
	protected static final int PK_COLUMN_CARRITO_COMPRAS_ID_CARRITO = 1;

	/** 
	 * Index of primary-key column PRODUCTO_ID_PRODUCTO
	 */
	protected static final int PK_COLUMN_PRODUCTO_ID_PRODUCTO = 2;

	/** 
	 * Inserts a new row in the item_carrito table.
	 */
	public ItemCarritoPk insert(ItemCarrito dto) throws ItemCarritoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			StringBuffer values = new StringBuffer();
			sql.append( "INSERT INTO " + getTableName() + " (" );
			int modifiedCount = 0;
			if (dto.isCarritoComprasIdCarritoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CARRITO_COMPRAS_ID_CARRITO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isProductoIdProductoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "PRODUCTO_ID_PRODUCTO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isCantidadModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CANTIDAD" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isValorUnitarioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "VALOR_UNITARIO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isValorTotalModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "VALOR_TOTAL" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (modifiedCount==0) {
				// nothing to insert
				throw new IllegalStateException( "Nothing to insert" );
			}
		
			sql.append( ") VALUES (" );
			sql.append( values );
			sql.append( ")" );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isCarritoComprasIdCarritoModified()) {
				stmt.setString( index++, dto.getCarritoComprasIdCarrito() );
			}
		
			if (dto.isProductoIdProductoModified()) {
				stmt.setString( index++, dto.getProductoIdProducto() );
			}
		
			if (dto.isCantidadModified()) {
				if (dto.isCantidadNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getCantidad() );
				}
		
			}
		
			if (dto.isValorUnitarioModified()) {
				if (dto.isValorUnitarioNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getValorUnitario() );
				}
		
			}
		
			if (dto.isValorTotalModified()) {
				if (dto.isValorTotalNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getValorTotal() );
				}
		
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ItemCarritoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the item_carrito table.
	 */
	public void update(ItemCarritoPk pk, ItemCarrito dto) throws ItemCarritoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			sql.append( "UPDATE " + getTableName() + " SET " );
			boolean modified = false;
			if (dto.isCarritoComprasIdCarritoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CARRITO_COMPRAS_ID_CARRITO=?" );
				modified=true;
			}
		
			if (dto.isProductoIdProductoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "PRODUCTO_ID_PRODUCTO=?" );
				modified=true;
			}
		
			if (dto.isCantidadModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CANTIDAD=?" );
				modified=true;
			}
		
			if (dto.isValorUnitarioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "VALOR_UNITARIO=?" );
				modified=true;
			}
		
			if (dto.isValorTotalModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "VALOR_TOTAL=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE CARRITO_COMPRAS_ID_CARRITO=? AND PRODUCTO_ID_PRODUCTO=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isCarritoComprasIdCarritoModified()) {
				stmt.setString( index++, dto.getCarritoComprasIdCarrito() );
			}
		
			if (dto.isProductoIdProductoModified()) {
				stmt.setString( index++, dto.getProductoIdProducto() );
			}
		
			if (dto.isCantidadModified()) {
				if (dto.isCantidadNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getCantidad() );
				}
		
			}
		
			if (dto.isValorUnitarioModified()) {
				if (dto.isValorUnitarioNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getValorUnitario() );
				}
		
			}
		
			if (dto.isValorTotalModified()) {
				if (dto.isValorTotalNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getValorTotal() );
				}
		
			}
		
			stmt.setString( index++, pk.getCarritoComprasIdCarrito() );
			stmt.setString( index++, pk.getProductoIdProducto() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ItemCarritoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the item_carrito table.
	 */
	public void delete(ItemCarritoPk pk) throws ItemCarritoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setString( 1, pk.getCarritoComprasIdCarrito() );
			stmt.setString( 2, pk.getProductoIdProducto() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ItemCarritoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the item_carrito table that matches the specified primary-key value.
	 */
	public ItemCarrito findByPrimaryKey(ItemCarritoPk pk) throws ItemCarritoDaoException
	{
		return findByPrimaryKey( pk.getCarritoComprasIdCarrito(), pk.getProductoIdProducto() );
	}

	/** 
	 * Returns all rows from the item_carrito table that match the criteria 'CARRITO_COMPRAS_ID_CARRITO = :carritoComprasIdCarrito AND PRODUCTO_ID_PRODUCTO = :productoIdProducto'.
	 */
	public ItemCarrito findByPrimaryKey(String carritoComprasIdCarrito, String productoIdProducto) throws ItemCarritoDaoException
	{
		ItemCarrito ret[] = findByDynamicSelect( SQL_SELECT + " WHERE CARRITO_COMPRAS_ID_CARRITO = ? AND PRODUCTO_ID_PRODUCTO = ?", new Object[] { carritoComprasIdCarrito, productoIdProducto } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the item_carrito table that match the criteria ''.
	 */
	public ItemCarrito[] findAll() throws ItemCarritoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY CARRITO_COMPRAS_ID_CARRITO, PRODUCTO_ID_PRODUCTO", null );
	}

	/** 
	 * Returns all rows from the item_carrito table that match the criteria 'PRODUCTO_ID_PRODUCTO = :productoIdProducto'.
	 */
	public ItemCarrito[] findByProducto(String productoIdProducto) throws ItemCarritoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PRODUCTO_ID_PRODUCTO = ?", new Object[] { productoIdProducto } );
	}

	/** 
	 * Returns all rows from the item_carrito table that match the criteria 'CARRITO_COMPRAS_ID_CARRITO = :carritoComprasIdCarrito'.
	 */
	public ItemCarrito[] findByCarritoCompras(String carritoComprasIdCarrito) throws ItemCarritoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CARRITO_COMPRAS_ID_CARRITO = ?", new Object[] { carritoComprasIdCarrito } );
	}

	/** 
	 * Returns all rows from the item_carrito table that match the criteria 'CARRITO_COMPRAS_ID_CARRITO = :carritoComprasIdCarrito'.
	 */
	public ItemCarrito[] findWhereCarritoComprasIdCarritoEquals(String carritoComprasIdCarrito) throws ItemCarritoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CARRITO_COMPRAS_ID_CARRITO = ? ORDER BY CARRITO_COMPRAS_ID_CARRITO", new Object[] { carritoComprasIdCarrito } );
	}

	/** 
	 * Returns all rows from the item_carrito table that match the criteria 'PRODUCTO_ID_PRODUCTO = :productoIdProducto'.
	 */
	public ItemCarrito[] findWhereProductoIdProductoEquals(String productoIdProducto) throws ItemCarritoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PRODUCTO_ID_PRODUCTO = ? ORDER BY PRODUCTO_ID_PRODUCTO", new Object[] { productoIdProducto } );
	}

	/** 
	 * Returns all rows from the item_carrito table that match the criteria 'CANTIDAD = :cantidad'.
	 */
	public ItemCarrito[] findWhereCantidadEquals(int cantidad) throws ItemCarritoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CANTIDAD = ? ORDER BY CANTIDAD", new Object[] {  new Integer(cantidad) } );
	}

	/** 
	 * Returns all rows from the item_carrito table that match the criteria 'VALOR_UNITARIO = :valorUnitario'.
	 */
	public ItemCarrito[] findWhereValorUnitarioEquals(double valorUnitario) throws ItemCarritoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE VALOR_UNITARIO = ? ORDER BY VALOR_UNITARIO", new Object[] {  new Double(valorUnitario) } );
	}

	/** 
	 * Returns all rows from the item_carrito table that match the criteria 'VALOR_TOTAL = :valorTotal'.
	 */
	public ItemCarrito[] findWhereValorTotalEquals(double valorTotal) throws ItemCarritoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE VALOR_TOTAL = ? ORDER BY VALOR_TOTAL", new Object[] {  new Double(valorTotal) } );
	}

	/**
	 * Method 'ItemCarritoDaoImpl'
	 * 
	 */
	public ItemCarritoDaoImpl()
	{
	}

	/**
	 * Method 'ItemCarritoDaoImpl'
	 * 
	 * @param userConn
	 */
	public ItemCarritoDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "onlineshop.item_carrito";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected ItemCarrito fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			ItemCarrito dto = new ItemCarrito();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected ItemCarrito[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			ItemCarrito dto = new ItemCarrito();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		ItemCarrito ret[] = new ItemCarrito[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(ItemCarrito dto, ResultSet rs) throws SQLException
	{
		dto.setCarritoComprasIdCarrito( rs.getString( COLUMN_CARRITO_COMPRAS_ID_CARRITO ) );
		dto.setProductoIdProducto( rs.getString( COLUMN_PRODUCTO_ID_PRODUCTO ) );
		dto.setCantidad( rs.getInt( COLUMN_CANTIDAD ) );
		if (rs.wasNull()) {
			dto.setCantidadNull( true );
		}
		
		dto.setValorUnitario( rs.getDouble( COLUMN_VALOR_UNITARIO ) );
		if (rs.wasNull()) {
			dto.setValorUnitarioNull( true );
		}
		
		dto.setValorTotal( rs.getDouble( COLUMN_VALOR_TOTAL ) );
		if (rs.wasNull()) {
			dto.setValorTotalNull( true );
		}
		
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(ItemCarrito dto)
	{
		dto.setCarritoComprasIdCarritoModified( false );
		dto.setProductoIdProductoModified( false );
		dto.setCantidadModified( false );
		dto.setValorUnitarioModified( false );
		dto.setValorTotalModified( false );
	}

	/** 
	 * Returns all rows from the item_carrito table that match the specified arbitrary SQL statement
	 */
	public ItemCarrito[] findByDynamicSelect(String sql, Object[] sqlParams) throws ItemCarritoDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ItemCarritoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the item_carrito table that match the specified arbitrary SQL statement
	 */
	public ItemCarrito[] findByDynamicWhere(String sql, Object[] sqlParams) throws ItemCarritoDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ItemCarritoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
