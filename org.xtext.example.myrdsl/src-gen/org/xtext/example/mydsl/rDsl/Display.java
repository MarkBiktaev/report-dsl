/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Display</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Display#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Display#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Display#getLinkto <em>Linkto</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDisplay()
 * @model
 * @generated
 */
public interface Display extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDisplay_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Display#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.rDsl.DisplayType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.DisplayType
   * @see #setValue(DisplayType)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDisplay_Value()
   * @model
   * @generated
   */
  DisplayType getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Display#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.DisplayType
   * @see #getValue()
   * @generated
   */
  void setValue(DisplayType value);

  /**
   * Returns the value of the '<em><b>Linkto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Linkto</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Linkto</em>' reference.
   * @see #setLinkto(Display)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDisplay_Linkto()
   * @model
   * @generated
   */
  Display getLinkto();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Display#getLinkto <em>Linkto</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Linkto</em>' reference.
   * @see #getLinkto()
   * @generated
   */
  void setLinkto(Display value);

} // Display
