/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.DynamicParameterValue#getDataset <em>Dataset</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.DynamicParameterValue#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.DynamicParameterValue#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.DynamicParameterValue#getDefault <em>Default</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.DynamicParameterValue#getSort <em>Sort</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.DynamicParameterValue#getSorttype <em>Sorttype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDynamicParameterValue()
 * @model
 * @generated
 */
public interface DynamicParameterValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Dataset</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dataset</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dataset</em>' reference.
   * @see #setDataset(Dataset)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDynamicParameterValue_Dataset()
   * @model
   * @generated
   */
  Dataset getDataset();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.DynamicParameterValue#getDataset <em>Dataset</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dataset</em>' reference.
   * @see #getDataset()
   * @generated
   */
  void setDataset(Dataset value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' containment reference.
   * @see #setLabel(JSExpression)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDynamicParameterValue_Label()
   * @model containment="true"
   * @generated
   */
  JSExpression getLabel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.DynamicParameterValue#getLabel <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' containment reference.
   * @see #getLabel()
   * @generated
   */
  void setLabel(JSExpression value);

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
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDynamicParameterValue_Value()
   * @model containment="true"
   * @generated
   */
  JSExpression getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.DynamicParameterValue#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(JSExpression value);

  /**
   * Returns the value of the '<em><b>Default</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.rDsl.JSExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' containment reference list.
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDynamicParameterValue_Default()
   * @model containment="true"
   * @generated
   */
  EList<JSExpression> getDefault();

  /**
   * Returns the value of the '<em><b>Sort</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sort</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sort</em>' reference.
   * @see #setSort(DatasetField)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDynamicParameterValue_Sort()
   * @model
   * @generated
   */
  DatasetField getSort();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.DynamicParameterValue#getSort <em>Sort</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort</em>' reference.
   * @see #getSort()
   * @generated
   */
  void setSort(DatasetField value);

  /**
   * Returns the value of the '<em><b>Sorttype</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.rDsl.SortType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sorttype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sorttype</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.SortType
   * @see #setSorttype(SortType)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDynamicParameterValue_Sorttype()
   * @model
   * @generated
   */
  SortType getSorttype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.DynamicParameterValue#getSorttype <em>Sorttype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sorttype</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.SortType
   * @see #getSorttype()
   * @generated
   */
  void setSorttype(SortType value);

} // DynamicParameterValue
