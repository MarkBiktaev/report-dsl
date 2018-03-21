/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Width Type Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.WidthTypeValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getWidthTypeValue()
 * @model
 * @generated
 */
public interface WidthTypeValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.rDsl.WidthType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.WidthType
   * @see #setValue(WidthType)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getWidthTypeValue_Value()
   * @model
   * @generated
   */
  WidthType getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.WidthTypeValue#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.WidthType
   * @see #getValue()
   * @generated
   */
  void setValue(WidthType value);

} // WidthTypeValue
