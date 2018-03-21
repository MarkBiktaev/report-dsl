/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.List#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.List#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.List#getHeaderelements <em>Headerelements</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.List#getDetailelements <em>Detailelements</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.List#getFooterelements <em>Footerelements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getList()
 * @model
 * @generated
 */
public interface List extends ReportElements, ComplexElements
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
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getList_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.List#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getList_Properties()
   * @model containment="true"
   * @generated
   */
  EList<LabelProperties> getProperties();

  /**
   * Returns the value of the '<em><b>Headerelements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.rDsl.ReportElements}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Headerelements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Headerelements</em>' containment reference list.
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getList_Headerelements()
   * @model containment="true"
   * @generated
   */
  EList<ReportElements> getHeaderelements();

  /**
   * Returns the value of the '<em><b>Detailelements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.rDsl.ReportElements}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Detailelements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Detailelements</em>' containment reference list.
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getList_Detailelements()
   * @model containment="true"
   * @generated
   */
  EList<ReportElements> getDetailelements();

  /**
   * Returns the value of the '<em><b>Footerelements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.rDsl.ReportElements}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Footerelements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Footerelements</em>' containment reference list.
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getList_Footerelements()
   * @model containment="true"
   * @generated
   */
  EList<ReportElements> getFooterelements();

} // List
