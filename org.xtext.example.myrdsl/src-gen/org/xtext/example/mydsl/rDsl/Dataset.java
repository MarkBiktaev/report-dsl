/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Dataset#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Dataset#getDatasourceref <em>Datasourceref</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Dataset#getField <em>Field</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Dataset#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Dataset#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDataset()
 * @model
 * @generated
 */
public interface Dataset extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDataset_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Dataset#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Datasourceref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datasourceref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datasourceref</em>' reference.
   * @see #setDatasourceref(Datasource)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDataset_Datasourceref()
   * @model
   * @generated
   */
  Datasource getDatasourceref();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Dataset#getDatasourceref <em>Datasourceref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datasourceref</em>' reference.
   * @see #getDatasourceref()
   * @generated
   */
  void setDatasourceref(Datasource value);

  /**
   * Returns the value of the '<em><b>Field</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.rDsl.DatasetField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' containment reference list.
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDataset_Field()
   * @model containment="true"
   * @generated
   */
  EList<DatasetField> getField();

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.rDsl.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' reference list.
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDataset_Parameter()
   * @model
   * @generated
   */
  EList<Parameter> getParameter();

  /**
   * Returns the value of the '<em><b>Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' attribute.
   * @see #setQuery(String)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDataset_Query()
   * @model
   * @generated
   */
  String getQuery();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Dataset#getQuery <em>Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' attribute.
   * @see #getQuery()
   * @generated
   */
  void setQuery(String value);

} // Dataset
