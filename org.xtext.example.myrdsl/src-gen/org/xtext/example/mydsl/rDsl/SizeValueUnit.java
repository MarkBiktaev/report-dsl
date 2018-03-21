/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Size Value Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.SizeValueUnit#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getSizeValueUnit()
 * @model
 * @generated
 */
public interface SizeValueUnit extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.rDsl.SizeUnit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.SizeUnit
   * @see #setValue(SizeUnit)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getSizeValueUnit_Value()
   * @model
   * @generated
   */
  SizeUnit getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.SizeValueUnit#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.SizeUnit
   * @see #getValue()
   * @generated
   */
  void setValue(SizeUnit value);

} // SizeValueUnit
