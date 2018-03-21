/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Border Side</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.BorderSide#getRight <em>Right</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.BorderSide#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.BorderSide#getTop <em>Top</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.BorderSide#getBottom <em>Bottom</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getBorderSide()
 * @model
 * @generated
 */
public interface BorderSide extends EObject
{
  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(BorderLine)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getBorderSide_Right()
   * @model containment="true"
   * @generated
   */
  BorderLine getRight();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.BorderSide#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(BorderLine value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(BorderLine)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getBorderSide_Left()
   * @model containment="true"
   * @generated
   */
  BorderLine getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.BorderSide#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(BorderLine value);

  /**
   * Returns the value of the '<em><b>Top</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Top</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Top</em>' containment reference.
   * @see #setTop(BorderLine)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getBorderSide_Top()
   * @model containment="true"
   * @generated
   */
  BorderLine getTop();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.BorderSide#getTop <em>Top</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Top</em>' containment reference.
   * @see #getTop()
   * @generated
   */
  void setTop(BorderLine value);

  /**
   * Returns the value of the '<em><b>Bottom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bottom</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bottom</em>' containment reference.
   * @see #setBottom(BorderLine)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getBorderSide_Bottom()
   * @model containment="true"
   * @generated
   */
  BorderLine getBottom();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.BorderSide#getBottom <em>Bottom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bottom</em>' containment reference.
   * @see #getBottom()
   * @generated
   */
  void setBottom(BorderLine value);

} // BorderSide
