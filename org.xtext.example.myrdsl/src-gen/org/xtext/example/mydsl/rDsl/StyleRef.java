/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.StyleRef#getRefname <em>Refname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getStyleRef()
 * @model
 * @generated
 */
public interface StyleRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Refname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refname</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refname</em>' reference.
   * @see #setRefname(Style)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getStyleRef_Refname()
   * @model
   * @generated
   */
  Style getRefname();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.StyleRef#getRefname <em>Refname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Refname</em>' reference.
   * @see #getRefname()
   * @generated
   */
  void setRefname(Style value);

} // StyleRef
