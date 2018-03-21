/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Size Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.SizeValue#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.SizeValue#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getSizeValue()
 * @model
 * @generated
 */
public interface SizeValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getSizeValue_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.SizeValue#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.rDsl.LengthUnit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.LengthUnit
   * @see #setUnit(LengthUnit)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getSizeValue_Unit()
   * @model
   * @generated
   */
  LengthUnit getUnit();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.SizeValue#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.LengthUnit
   * @see #getUnit()
   * @generated
   */
  void setUnit(LengthUnit value);

} // SizeValue
