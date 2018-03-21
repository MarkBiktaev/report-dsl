/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.ElementProperty#getColorpalette <em>Colorpalette</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.ElementProperty#getFont <em>Font</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.ElementProperty#getFontSize <em>Font Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getElementProperty()
 * @model
 * @generated
 */
public interface ElementProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Colorpalette</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Colorpalette</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Colorpalette</em>' containment reference.
   * @see #setColorpalette(ColorPalette)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getElementProperty_Colorpalette()
   * @model containment="true"
   * @generated
   */
  ColorPalette getColorpalette();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.ElementProperty#getColorpalette <em>Colorpalette</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Colorpalette</em>' containment reference.
   * @see #getColorpalette()
   * @generated
   */
  void setColorpalette(ColorPalette value);

  /**
   * Returns the value of the '<em><b>Font</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Font</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Font</em>' containment reference.
   * @see #setFont(Font)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getElementProperty_Font()
   * @model containment="true"
   * @generated
   */
  Font getFont();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.ElementProperty#getFont <em>Font</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Font</em>' containment reference.
   * @see #getFont()
   * @generated
   */
  void setFont(Font value);

  /**
   * Returns the value of the '<em><b>Font Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Font Size</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Font Size</em>' containment reference.
   * @see #setFontSize(FontSize)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getElementProperty_FontSize()
   * @model containment="true"
   * @generated
   */
  FontSize getFontSize();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.ElementProperty#getFontSize <em>Font Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Font Size</em>' containment reference.
   * @see #getFontSize()
   * @generated
   */
  void setFontSize(FontSize value);

} // ElementProperty
