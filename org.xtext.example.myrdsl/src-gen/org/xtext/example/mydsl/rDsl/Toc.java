/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Toc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Toc#getStyle <em>Style</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Toc#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getToc()
 * @model
 * @generated
 */
public interface Toc extends EObject
{
  /**
   * Returns the value of the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' containment reference.
   * @see #setStyle(StyleRef)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getToc_Style()
   * @model containment="true"
   * @generated
   */
  StyleRef getStyle();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Toc#getStyle <em>Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' containment reference.
   * @see #getStyle()
   * @generated
   */
  void setStyle(StyleRef value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(JSExpression)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getToc_Value()
   * @model containment="true"
   * @generated
   */
  JSExpression getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Toc#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(JSExpression value);

} // Toc
