/**
 */
package org.xtext.example.mydsl.rDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indent Side</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.IndentSide#getRight <em>Right</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.IndentSide#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.IndentSide#getTop <em>Top</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.IndentSide#getBottom <em>Bottom</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getIndentSide()
 * @model
 * @generated
 */
public interface IndentSide extends Padding
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
   * @see #setRight(IndentValue)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getIndentSide_Right()
   * @model containment="true"
   * @generated
   */
  IndentValue getRight();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.IndentSide#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(IndentValue value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(IndentValue)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getIndentSide_Left()
   * @model containment="true"
   * @generated
   */
  IndentValue getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.IndentSide#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(IndentValue value);

  /**
   * Returns the value of the '<em><b>Top</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Top</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Top</em>' containment reference.
   * @see #setTop(IndentValue)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getIndentSide_Top()
   * @model containment="true"
   * @generated
   */
  IndentValue getTop();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.IndentSide#getTop <em>Top</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Top</em>' containment reference.
   * @see #getTop()
   * @generated
   */
  void setTop(IndentValue value);

  /**
   * Returns the value of the '<em><b>Bottom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bottom</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bottom</em>' containment reference.
   * @see #setBottom(IndentValue)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getIndentSide_Bottom()
   * @model containment="true"
   * @generated
   */
  IndentValue getBottom();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.IndentSide#getBottom <em>Bottom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bottom</em>' containment reference.
   * @see #getBottom()
   * @generated
   */
  void setBottom(IndentValue value);

} // IndentSide
