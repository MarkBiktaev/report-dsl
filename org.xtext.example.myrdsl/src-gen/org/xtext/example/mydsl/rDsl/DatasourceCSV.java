/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datasource CSV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.DatasourceCSV#getUrl <em>Url</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.DatasourceCSV#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.DatasourceCSV#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.DatasourceCSV#getHeaderline <em>Headerline</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDatasourceCSV()
 * @model
 * @generated
 */
public interface DatasourceCSV extends EObject
{
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
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDatasourceCSV_Url()
   * @model
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.DatasourceCSV#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

  /**
   * Returns the value of the '<em><b>Charset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Charset</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Charset</em>' attribute.
   * @see #setCharset(String)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDatasourceCSV_Charset()
   * @model
   * @generated
   */
  String getCharset();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.DatasourceCSV#getCharset <em>Charset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Charset</em>' attribute.
   * @see #getCharset()
   * @generated
   */
  void setCharset(String value);

  /**
   * Returns the value of the '<em><b>Delimiter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delimiter</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delimiter</em>' attribute.
   * @see #setDelimiter(String)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDatasourceCSV_Delimiter()
   * @model
   * @generated
   */
  String getDelimiter();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.DatasourceCSV#getDelimiter <em>Delimiter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delimiter</em>' attribute.
   * @see #getDelimiter()
   * @generated
   */
  void setDelimiter(String value);

  /**
   * Returns the value of the '<em><b>Headerline</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Headerline</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Headerline</em>' containment reference.
   * @see #setHeaderline(BooleanLiteral)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDatasourceCSV_Headerline()
   * @model containment="true"
   * @generated
   */
  BooleanLiteral getHeaderline();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.DatasourceCSV#getHeaderline <em>Headerline</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Headerline</em>' containment reference.
   * @see #getHeaderline()
   * @generated
   */
  void setHeaderline(BooleanLiteral value);

} // DatasourceCSV
