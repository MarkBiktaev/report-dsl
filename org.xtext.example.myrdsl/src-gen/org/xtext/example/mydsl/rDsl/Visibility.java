/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Visibility#isShow <em>Show</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getVisibility()
 * @model
 * @generated
 */
public interface Visibility extends EObject
{
  /**
   * Returns the value of the '<em><b>Show</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Show</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Show</em>' attribute.
   * @see #setShow(boolean)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getVisibility_Show()
   * @model
   * @generated
   */
  boolean isShow();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Visibility#isShow <em>Show</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Show</em>' attribute.
   * @see #isShow()
   * @generated
   */
  void setShow(boolean value);

} // Visibility
