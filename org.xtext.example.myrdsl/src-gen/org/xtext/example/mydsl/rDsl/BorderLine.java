/**
 */
package org.xtext.example.mydsl.rDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Border Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.BorderLine#getStyle <em>Style</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.BorderLine#getWidth <em>Width</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.BorderLine#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getBorderLine()
 * @model
 * @generated
 */
public interface BorderLine extends BorderAll
{
  /**
   * Returns the value of the '<em><b>Style</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.rDsl.BorderLineStyleType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.BorderLineStyleType
   * @see #setStyle(BorderLineStyleType)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getBorderLine_Style()
   * @model
   * @generated
   */
  BorderLineStyleType getStyle();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.BorderLine#getStyle <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.BorderLineStyleType
   * @see #getStyle()
   * @generated
   */
  void setStyle(BorderLineStyleType value);

  /**
   * Returns the value of the '<em><b>Width</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Width</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Width</em>' containment reference.
   * @see #setWidth(BorderWidth)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getBorderLine_Width()
   * @model containment="true"
   * @generated
   */
  BorderWidth getWidth();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.BorderLine#getWidth <em>Width</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width</em>' containment reference.
   * @see #getWidth()
   * @generated
   */
  void setWidth(BorderWidth value);

  /**
   * Returns the value of the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' containment reference.
   * @see #setColor(Color)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getBorderLine_Color()
   * @model containment="true"
   * @generated
   */
  Color getColor();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.BorderLine#getColor <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' containment reference.
   * @see #getColor()
   * @generated
   */
  void setColor(Color value);

} // BorderLine
