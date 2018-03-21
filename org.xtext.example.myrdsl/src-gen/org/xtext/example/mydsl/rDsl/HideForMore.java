/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hide For More</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.HideForMore#getFormat <em>Format</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.HideForMore#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getHideForMore()
 * @model
 * @generated
 */
public interface HideForMore extends Visibility
{
  /**
   * Returns the value of the '<em><b>Format</b></em>' attribute list.
   * The list contents are of type {@link org.xtext.example.mydsl.rDsl.OutputFormatType}.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.rDsl.OutputFormatType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Format</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Format</em>' attribute list.
   * @see org.xtext.example.mydsl.rDsl.OutputFormatType
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getHideForMore_Format()
   * @model unique="false"
   * @generated
   */
  EList<OutputFormatType> getFormat();

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(JSExpression)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getHideForMore_Expression()
   * @model containment="true"
   * @generated
   */
  JSExpression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.HideForMore#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(JSExpression value);

} // HideForMore
