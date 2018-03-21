/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Table#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Table#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Table#getDataset <em>Dataset</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Table#getHeaderrows <em>Headerrows</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Table#getDetailrows <em>Detailrows</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Table#getFooterrows <em>Footerrows</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends ReportElements, ComplexElements
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
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getTable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Table#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.rDsl.LabelProperties}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getTable_Properties()
   * @model containment="true"
   * @generated
   */
  EList<LabelProperties> getProperties();

  /**
   * Returns the value of the '<em><b>Dataset</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dataset</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dataset</em>' reference.
   * @see #setDataset(Dataset)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getTable_Dataset()
   * @model
   * @generated
   */
  Dataset getDataset();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Table#getDataset <em>Dataset</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dataset</em>' reference.
   * @see #getDataset()
   * @generated
   */
  void setDataset(Dataset value);

  /**
   * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.rDsl.Column}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' containment reference list.
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getTable_Columns()
   * @model containment="true"
   * @generated
   */
  EList<Column> getColumns();

  /**
   * Returns the value of the '<em><b>Headerrows</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.rDsl.Row}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Headerrows</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Headerrows</em>' containment reference list.
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getTable_Headerrows()
   * @model containment="true"
   * @generated
   */
  EList<Row> getHeaderrows();

  /**
   * Returns the value of the '<em><b>Detailrows</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.rDsl.Row}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Detailrows</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Detailrows</em>' containment reference list.
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getTable_Detailrows()
   * @model containment="true"
   * @generated
   */
  EList<Row> getDetailrows();

  /**
   * Returns the value of the '<em><b>Footerrows</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.rDsl.Row}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Footerrows</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Footerrows</em>' containment reference list.
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getTable_Footerrows()
   * @model containment="true"
   * @generated
   */
  EList<Row> getFooterrows();

} // Table
