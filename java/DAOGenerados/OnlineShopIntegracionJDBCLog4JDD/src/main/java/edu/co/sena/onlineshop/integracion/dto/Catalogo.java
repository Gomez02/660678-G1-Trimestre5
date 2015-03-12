/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.onlineshop.integracion.dto;

import edu.co.sena.onlineshop.integracion.dao.*;
import edu.co.sena.onlineshop.integracion.factory.*;
import edu.co.sena.onlineshop.integracion.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Catalogo implements Serializable
{
	/** 
	 * This attribute maps to the column ID_CATALOGO in the catalogo table.
	 */
	protected int idCatalogo;

	/** 
	 * This attribute represents whether the attribute idCatalogo has been modified since being read from the database.
	 */
	protected boolean idCatalogoModified = false;

	/** 
	 * This attribute maps to the column NOMBRE_CATALOGO in the catalogo table.
	 */
	protected String nombreCatalogo;

	/** 
	 * This attribute represents whether the attribute nombreCatalogo has been modified since being read from the database.
	 */
	protected boolean nombreCatalogoModified = false;

	/** 
	 * This attribute maps to the column DECRIPCION in the catalogo table.
	 */
	protected String decripcion;

	/** 
	 * This attribute represents whether the attribute decripcion has been modified since being read from the database.
	 */
	protected boolean decripcionModified = false;

	/**
	 * Method 'Catalogo'
	 * 
	 */
	public Catalogo()
	{
	}

	/**
	 * Method 'getIdCatalogo'
	 * 
	 * @return int
	 */
	public int getIdCatalogo()
	{
		return idCatalogo;
	}

	/**
	 * Method 'setIdCatalogo'
	 * 
	 * @param idCatalogo
	 */
	public void setIdCatalogo(int idCatalogo)
	{
		this.idCatalogo = idCatalogo;
		this.idCatalogoModified = true;
	}

	/** 
	 * Sets the value of idCatalogoModified
	 */
	public void setIdCatalogoModified(boolean idCatalogoModified)
	{
		this.idCatalogoModified = idCatalogoModified;
	}

	/** 
	 * Gets the value of idCatalogoModified
	 */
	public boolean isIdCatalogoModified()
	{
		return idCatalogoModified;
	}

	/**
	 * Method 'getNombreCatalogo'
	 * 
	 * @return String
	 */
	public String getNombreCatalogo()
	{
		return nombreCatalogo;
	}

	/**
	 * Method 'setNombreCatalogo'
	 * 
	 * @param nombreCatalogo
	 */
	public void setNombreCatalogo(String nombreCatalogo)
	{
		this.nombreCatalogo = nombreCatalogo;
		this.nombreCatalogoModified = true;
	}

	/** 
	 * Sets the value of nombreCatalogoModified
	 */
	public void setNombreCatalogoModified(boolean nombreCatalogoModified)
	{
		this.nombreCatalogoModified = nombreCatalogoModified;
	}

	/** 
	 * Gets the value of nombreCatalogoModified
	 */
	public boolean isNombreCatalogoModified()
	{
		return nombreCatalogoModified;
	}

	/**
	 * Method 'getDecripcion'
	 * 
	 * @return String
	 */
	public String getDecripcion()
	{
		return decripcion;
	}

	/**
	 * Method 'setDecripcion'
	 * 
	 * @param decripcion
	 */
	public void setDecripcion(String decripcion)
	{
		this.decripcion = decripcion;
		this.decripcionModified = true;
	}

	/** 
	 * Sets the value of decripcionModified
	 */
	public void setDecripcionModified(boolean decripcionModified)
	{
		this.decripcionModified = decripcionModified;
	}

	/** 
	 * Gets the value of decripcionModified
	 */
	public boolean isDecripcionModified()
	{
		return decripcionModified;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof Catalogo)) {
			return false;
		}
		
		final Catalogo _cast = (Catalogo) _other;
		if (idCatalogo != _cast.idCatalogo) {
			return false;
		}
		
		if (idCatalogoModified != _cast.idCatalogoModified) {
			return false;
		}
		
		if (nombreCatalogo == null ? _cast.nombreCatalogo != nombreCatalogo : !nombreCatalogo.equals( _cast.nombreCatalogo )) {
			return false;
		}
		
		if (nombreCatalogoModified != _cast.nombreCatalogoModified) {
			return false;
		}
		
		if (decripcion == null ? _cast.decripcion != decripcion : !decripcion.equals( _cast.decripcion )) {
			return false;
		}
		
		if (decripcionModified != _cast.decripcionModified) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + idCatalogo;
		_hashCode = 29 * _hashCode + (idCatalogoModified ? 1 : 0);
		if (nombreCatalogo != null) {
			_hashCode = 29 * _hashCode + nombreCatalogo.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreCatalogoModified ? 1 : 0);
		if (decripcion != null) {
			_hashCode = 29 * _hashCode + decripcion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (decripcionModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CatalogoPk
	 */
	public CatalogoPk createPk()
	{
		return new CatalogoPk(idCatalogo);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.onlineshop.integracion.dto.Catalogo: " );
		ret.append( "idCatalogo=" + idCatalogo );
		ret.append( ", nombreCatalogo=" + nombreCatalogo );
		ret.append( ", decripcion=" + decripcion );
		return ret.toString();
	}

}