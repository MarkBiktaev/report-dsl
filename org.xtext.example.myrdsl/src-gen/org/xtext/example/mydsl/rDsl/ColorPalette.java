/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Palette</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.ColorPalette#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.ColorPalette#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.ColorPalette#getLinkto <em>Linkto</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getColorPalette()
 * @model
 * @generated
 */
public interface ColorPalette extends EObject
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
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getColorPalette_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.ColorPalette#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference list.
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getColorPalette_Value()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getValue();

  /**
   * Returns the value of the '<em><b>Linkto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Linkto</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Linkto</em>' reference.
   * @see #setLinkto(ColorPalette)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getColorPalette_Linkto()
   * @model
   * @generated
   */
  ColorPalette getLinkto();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.ColorPalette#getLinkto <em>Linkto</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Linkto</em>' reference.
   * @see #getLinkto()
   * @generated
   */
  void setLinkto(ColorPalette value);

} // ColorPalette
