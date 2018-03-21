/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Styles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Styles#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getStyles()
 * @model
 * @generated
 */
public interface Styles extends EObject
{
  /**
   * Returns the value of the '<em><b>Style</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.rDsl.Style}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' containment reference list.
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getStyles_Style()
   * @model containment="true"
   * @generated
   */
  EList<Style> getStyle();

} // Styles
