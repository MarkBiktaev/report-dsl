/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VAlignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.VAlignment#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.VAlignment#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.VAlignment#getLinkto <em>Linkto</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getVAlignment()
 * @model
 * @generated
 */
public interface VAlignment extends EObject
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
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getVAlignment_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.VAlignment#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.rDsl.ValignmentType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.ValignmentType
   * @see #setValue(ValignmentType)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getVAlignment_Value()
   * @model
   * @generated
   */
  ValignmentType getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.VAlignment#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.ValignmentType
   * @see #getValue()
   * @generated
   */
  void setValue(ValignmentType value);

  /**
   * Returns the value of the '<em><b>Linkto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Linkto</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Linkto</em>' reference.
   * @see #setLinkto(VAlignment)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getVAlignment_Linkto()
   * @model
   * @generated
   */
  VAlignment getLinkto();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.VAlignment#getLinkto <em>Linkto</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Linkto</em>' reference.
   * @see #getLinkto()
   * @generated
   */
  void setLinkto(VAlignment value);

} // VAlignment
