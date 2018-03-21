/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tick</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Tick#getPlace <em>Place</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Tick#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getTick()
 * @model
 * @generated
 */
public interface Tick extends EObject
{
  /**
   * Returns the value of the '<em><b>Place</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Place</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Place</em>' attribute.
   * @see #setPlace(String)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getTick_Place()
   * @model
   * @generated
   */
  String getPlace();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Tick#getPlace <em>Place</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Place</em>' attribute.
   * @see #getPlace()
   * @generated
   */
  void setPlace(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(BorderLine)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getTick_Value()
   * @model containment="true"
   * @generated
   */
  BorderLine getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Tick#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(BorderLine value);

} // Tick
