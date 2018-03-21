/**
 */
package org.xtext.example.mydsl.rDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hide All</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.HideAll#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.HideAll#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getHideAll()
 * @model
 * @generated
 */
public interface HideAll extends Visibility
{
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
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getHideAll_Expression()
   * @model containment="true"
   * @generated
   */
  JSExpression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.HideAll#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(JSExpression value);

  /**
   * Returns the value of the '<em><b>Format</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.rDsl.OutputFormatType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Format</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Format</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.OutputFormatType
   * @see #setFormat(OutputFormatType)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getHideAll_Format()
   * @model
   * @generated
   */
  OutputFormatType getFormat();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.HideAll#getFormat <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Format</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.OutputFormatType
   * @see #getFormat()
   * @generated
   */
  void setFormat(OutputFormatType value);

} // HideAll
