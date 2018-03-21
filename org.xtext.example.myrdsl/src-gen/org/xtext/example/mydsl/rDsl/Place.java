/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Place#getPosition <em>Position</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Place#getAnchor <em>Anchor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends EObject
{
  /**
   * Returns the value of the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Position</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Position</em>' attribute.
   * @see #setPosition(String)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getPlace_Position()
   * @model
   * @generated
   */
  String getPosition();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Place#getPosition <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' attribute.
   * @see #getPosition()
   * @generated
   */
  void setPosition(String value);

  /**
   * Returns the value of the '<em><b>Anchor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anchor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anchor</em>' attribute.
   * @see #setAnchor(String)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getPlace_Anchor()
   * @model
   * @generated
   */
  String getAnchor();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Place#getAnchor <em>Anchor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Anchor</em>' attribute.
   * @see #getAnchor()
   * @generated
   */
  void setAnchor(String value);

} // Place
