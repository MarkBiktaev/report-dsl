/**
 */
package org.xtext.example.mydsl.rDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.StringColor#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getStringColor()
 * @model
 * @generated
 */
public interface StringColor extends Color
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.rDsl.ColorType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.ColorType
   * @see #setValue(ColorType)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getStringColor_Value()
   * @model
   * @generated
   */
  ColorType getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.StringColor#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.ColorType
   * @see #getValue()
   * @generated
   */
  void setValue(ColorType value);

} // StringColor
