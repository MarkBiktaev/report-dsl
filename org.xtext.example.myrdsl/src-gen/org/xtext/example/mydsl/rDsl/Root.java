/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Root#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject
{
  /**
   * Returns the value of the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root</em>' containment reference.
   * @see #setRoot(Report)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getRoot_Root()
   * @model containment="true"
   * @generated
   */
  Report getRoot();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Root#getRoot <em>Root</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root</em>' containment reference.
   * @see #getRoot()
   * @generated
   */
  void setRoot(Report value);

} // Root
