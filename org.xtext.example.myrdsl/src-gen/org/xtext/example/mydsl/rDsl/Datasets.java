/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datasets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Datasets#getDataset <em>Dataset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDatasets()
 * @model
 * @generated
 */
public interface Datasets extends EObject
{
  /**
   * Returns the value of the '<em><b>Dataset</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.rDsl.Dataset}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dataset</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dataset</em>' containment reference list.
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDatasets_Dataset()
   * @model containment="true"
   * @generated
   */
  EList<Dataset> getDataset();

} // Datasets
