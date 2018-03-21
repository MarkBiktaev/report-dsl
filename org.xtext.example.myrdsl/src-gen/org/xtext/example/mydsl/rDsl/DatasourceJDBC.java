/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datasource JDBC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.DatasourceJDBC#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.DatasourceJDBC#getUrl <em>Url</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.DatasourceJDBC#getUser <em>User</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.DatasourceJDBC#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDatasourceJDBC()
 * @model
 * @generated
 */
public interface DatasourceJDBC extends EObject
{
  /**
   * Returns the value of the '<em><b>Driver</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Driver</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Driver</em>' attribute.
   * @see #setDriver(String)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDatasourceJDBC_Driver()
   * @model
   * @generated
   */
  String getDriver();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.DatasourceJDBC#getDriver <em>Driver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Driver</em>' attribute.
   * @see #getDriver()
   * @generated
   */
  void setDriver(String value);

  /**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDatasourceJDBC_Url()
   * @model
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.DatasourceJDBC#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

  /**
   * Returns the value of the '<em><b>User</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User</em>' attribute.
   * @see #setUser(String)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDatasourceJDBC_User()
   * @model
   * @generated
   */
  String getUser();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.DatasourceJDBC#getUser <em>User</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>User</em>' attribute.
   * @see #getUser()
   * @generated
   */
  void setUser(String value);

  /**
   * Returns the value of the '<em><b>Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Password</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Password</em>' attribute.
   * @see #setPassword(String)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDatasourceJDBC_Password()
   * @model
   * @generated
   */
  String getPassword();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.DatasourceJDBC#getPassword <em>Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Password</em>' attribute.
   * @see #getPassword()
   * @generated
   */
  void setPassword(String value);

} // DatasourceJDBC
