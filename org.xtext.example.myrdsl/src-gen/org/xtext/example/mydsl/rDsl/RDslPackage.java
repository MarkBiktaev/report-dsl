/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.rDsl.RDslFactory
 * @model kind="package"
 * @generated
 */
public interface RDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/RDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RDslPackage eINSTANCE = org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.RootImpl <em>Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.RootImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getRoot()
   * @generated
   */
  int ROOT = 0;

  /**
   * The feature id for the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__ROOT = 0;

  /**
   * The number of structural features of the '<em>Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.ReportImpl <em>Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.ReportImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getReport()
   * @generated
   */
  int REPORT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__NAME = 0;

  /**
   * The feature id for the '<em><b>Datasources</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__DATASOURCES = 1;

  /**
   * The feature id for the '<em><b>Datasets</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__DATASETS = 2;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__PARAMETERS = 3;

  /**
   * The feature id for the '<em><b>Styles</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__STYLES = 4;

  /**
   * The feature id for the '<em><b>Pagesetup</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__PAGESETUP = 5;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__BODY = 6;

  /**
   * The feature id for the '<em><b>Element Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__ELEMENT_PROPERTIES = 7;

  /**
   * The number of structural features of the '<em>Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.elementPropertiesImpl <em>element Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.elementPropertiesImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getelementProperties()
   * @generated
   */
  int ELEMENT_PROPERTIES = 2;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_PROPERTIES__PROPERTIES = 0;

  /**
   * The number of structural features of the '<em>element Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_PROPERTIES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.ElementPropertyImpl <em>Element Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.ElementPropertyImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getElementProperty()
   * @generated
   */
  int ELEMENT_PROPERTY = 3;

  /**
   * The feature id for the '<em><b>Colorpalette</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_PROPERTY__COLORPALETTE = 0;

  /**
   * The feature id for the '<em><b>Font</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_PROPERTY__FONT = 1;

  /**
   * The feature id for the '<em><b>Font Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_PROPERTY__FONT_SIZE = 2;

  /**
   * The number of structural features of the '<em>Element Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_PROPERTY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.DatasourcesImpl <em>Datasources</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.DatasourcesImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getDatasources()
   * @generated
   */
  int DATASOURCES = 4;

  /**
   * The feature id for the '<em><b>Datasource</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASOURCES__DATASOURCE = 0;

  /**
   * The number of structural features of the '<em>Datasources</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASOURCES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.DatasourceImpl <em>Datasource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.DatasourceImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getDatasource()
   * @generated
   */
  int DATASOURCE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASOURCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASOURCE__TYPE = 1;

  /**
   * The number of structural features of the '<em>Datasource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASOURCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.DatasourceSampleImpl <em>Datasource Sample</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.DatasourceSampleImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getDatasourceSample()
   * @generated
   */
  int DATASOURCE_SAMPLE = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASOURCE_SAMPLE__TYPE = 0;

  /**
   * The number of structural features of the '<em>Datasource Sample</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASOURCE_SAMPLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.DatasourceJDBCImpl <em>Datasource JDBC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.DatasourceJDBCImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getDatasourceJDBC()
   * @generated
   */
  int DATASOURCE_JDBC = 7;

  /**
   * The feature id for the '<em><b>Driver</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASOURCE_JDBC__DRIVER = 0;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASOURCE_JDBC__URL = 1;

  /**
   * The feature id for the '<em><b>User</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASOURCE_JDBC__USER = 2;

  /**
   * The feature id for the '<em><b>Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASOURCE_JDBC__PASSWORD = 3;

  /**
   * The number of structural features of the '<em>Datasource JDBC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASOURCE_JDBC_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.DatasourceCSVImpl <em>Datasource CSV</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.DatasourceCSVImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getDatasourceCSV()
   * @generated
   */
  int DATASOURCE_CSV = 8;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASOURCE_CSV__URL = 0;

  /**
   * The feature id for the '<em><b>Charset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASOURCE_CSV__CHARSET = 1;

  /**
   * The feature id for the '<em><b>Delimiter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASOURCE_CSV__DELIMITER = 2;

  /**
   * The feature id for the '<em><b>Headerline</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASOURCE_CSV__HEADERLINE = 3;

  /**
   * The number of structural features of the '<em>Datasource CSV</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASOURCE_CSV_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.DatasetsImpl <em>Datasets</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.DatasetsImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getDatasets()
   * @generated
   */
  int DATASETS = 9;

  /**
   * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASETS__DATASET = 0;

  /**
   * The number of structural features of the '<em>Datasets</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASETS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.DatasetImpl <em>Dataset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.DatasetImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getDataset()
   * @generated
   */
  int DATASET = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET__NAME = 0;

  /**
   * The feature id for the '<em><b>Datasourceref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET__DATASOURCEREF = 1;

  /**
   * The feature id for the '<em><b>Field</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET__FIELD = 2;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET__PARAMETER = 3;

  /**
   * The feature id for the '<em><b>Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET__QUERY = 4;

  /**
   * The number of structural features of the '<em>Dataset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.DatasetFieldImpl <em>Dataset Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.DatasetFieldImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getDatasetField()
   * @generated
   */
  int DATASET_FIELD = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET_FIELD__NAME = 0;

  /**
   * The number of structural features of the '<em>Dataset Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASET_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.SimpleDatasetFieldImpl <em>Simple Dataset Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.SimpleDatasetFieldImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getSimpleDatasetField()
   * @generated
   */
  int SIMPLE_DATASET_FIELD = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_DATASET_FIELD__NAME = DATASET_FIELD__NAME;

  /**
   * The number of structural features of the '<em>Simple Dataset Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_DATASET_FIELD_FEATURE_COUNT = DATASET_FIELD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.ComputedDatasetFieldImpl <em>Computed Dataset Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.ComputedDatasetFieldImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getComputedDatasetField()
   * @generated
   */
  int COMPUTED_DATASET_FIELD = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTED_DATASET_FIELD__NAME = DATASET_FIELD__NAME;

  /**
   * The feature id for the '<em><b>Aggregation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTED_DATASET_FIELD__AGGREGATION = DATASET_FIELD_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Datatype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTED_DATASET_FIELD__DATATYPE = DATASET_FIELD_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTED_DATASET_FIELD__ARGUMENT = DATASET_FIELD_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTED_DATASET_FIELD__FILTER = DATASET_FIELD_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Computed Dataset Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPUTED_DATASET_FIELD_FEATURE_COUNT = DATASET_FIELD_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.ParametersImpl <em>Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.ParametersImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getParameters()
   * @generated
   */
  int PARAMETERS = 14;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS__PARAMETER = 0;

  /**
   * The number of structural features of the '<em>Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.ParameterValueImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getParameterValue()
   * @generated
   */
  int PARAMETER_VALUE = 20;

  /**
   * The number of structural features of the '<em>Parameter Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.StaticParameterValuesImpl <em>Static Parameter Values</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.StaticParameterValuesImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getStaticParameterValues()
   * @generated
   */
  int STATIC_PARAMETER_VALUES = 15;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_PARAMETER_VALUES__VALUE = PARAMETER_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_PARAMETER_VALUES__SORT = PARAMETER_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sorttype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_PARAMETER_VALUES__SORTTYPE = PARAMETER_VALUE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Static Parameter Values</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_PARAMETER_VALUES_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.StaticParameterValueImpl <em>Static Parameter Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.StaticParameterValueImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getStaticParameterValue()
   * @generated
   */
  int STATIC_PARAMETER_VALUE = 16;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_PARAMETER_VALUE__LABEL = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_PARAMETER_VALUE__VALUE = 1;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_PARAMETER_VALUE__DEFAULT = 2;

  /**
   * The number of structural features of the '<em>Static Parameter Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_PARAMETER_VALUE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.DynamicParameterValuesImpl <em>Dynamic Parameter Values</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.DynamicParameterValuesImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getDynamicParameterValues()
   * @generated
   */
  int DYNAMIC_PARAMETER_VALUES = 17;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_PARAMETER_VALUES__VALUE = PARAMETER_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dynamic Parameter Values</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_PARAMETER_VALUES_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.DynamicParameterValueImpl <em>Dynamic Parameter Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.DynamicParameterValueImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getDynamicParameterValue()
   * @generated
   */
  int DYNAMIC_PARAMETER_VALUE = 18;

  /**
   * The feature id for the '<em><b>Dataset</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_PARAMETER_VALUE__DATASET = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_PARAMETER_VALUE__LABEL = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_PARAMETER_VALUE__VALUE = 2;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_PARAMETER_VALUE__DEFAULT = 3;

  /**
   * The feature id for the '<em><b>Sort</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_PARAMETER_VALUE__SORT = 4;

  /**
   * The feature id for the '<em><b>Sorttype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_PARAMETER_VALUE__SORTTYPE = 5;

  /**
   * The number of structural features of the '<em>Dynamic Parameter Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_PARAMETER_VALUE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.ParameterImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 19;

  /**
   * The feature id for the '<em><b>Controltype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__CONTROLTYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 1;

  /**
   * The feature id for the '<em><b>Promt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__PROMT = 2;

  /**
   * The feature id for the '<em><b>Help</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__HELP = 3;

  /**
   * The feature id for the '<em><b>Hide</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__HIDE = 4;

  /**
   * The feature id for the '<em><b>Required</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__REQUIRED = 5;

  /**
   * The feature id for the '<em><b>Duplicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__DUPLICATE = 6;

  /**
   * The feature id for the '<em><b>Valuetype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__VALUETYPE = 7;

  /**
   * The feature id for the '<em><b>Paramtype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__PARAMTYPE = 8;

  /**
   * The feature id for the '<em><b>Datatype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__DATATYPE = 9;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__VALUES = 10;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.StylesImpl <em>Styles</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.StylesImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getStyles()
   * @generated
   */
  int STYLES = 21;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLES__STYLE = 0;

  /**
   * The number of structural features of the '<em>Styles</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.PageSetupImpl <em>Page Setup</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.PageSetupImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getPageSetup()
   * @generated
   */
  int PAGE_SETUP = 22;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_SETUP__PROPERTIES = 0;

  /**
   * The number of structural features of the '<em>Page Setup</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_SETUP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.BodyImpl <em>Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.BodyImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getBody()
   * @generated
   */
  int BODY = 23;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.ReportElementsImpl <em>Report Elements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.ReportElementsImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getReportElements()
   * @generated
   */
  int REPORT_ELEMENTS = 24;

  /**
   * The number of structural features of the '<em>Report Elements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT_ELEMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.BasicElementsImpl <em>Basic Elements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.BasicElementsImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getBasicElements()
   * @generated
   */
  int BASIC_ELEMENTS = 25;

  /**
   * The number of structural features of the '<em>Basic Elements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_ELEMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.ComplexElementsImpl <em>Complex Elements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.ComplexElementsImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getComplexElements()
   * @generated
   */
  int COMPLEX_ELEMENTS = 26;

  /**
   * The number of structural features of the '<em>Complex Elements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_ELEMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.LabelImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__NAME = REPORT_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__CONTENT = REPORT_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__PROPERTIES = REPORT_ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = REPORT_ELEMENTS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.TextImpl <em>Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.TextImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getText()
   * @generated
   */
  int TEXT = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__NAME = REPORT_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__CONTENT = REPORT_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__PROPERTIES = REPORT_ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FEATURE_COUNT = REPORT_ELEMENTS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.DynamicTextImpl <em>Dynamic Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.DynamicTextImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getDynamicText()
   * @generated
   */
  int DYNAMIC_TEXT = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_TEXT__NAME = REPORT_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_TEXT__CONTENT = REPORT_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_TEXT__PROPERTIES = REPORT_ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Dynamic Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_TEXT_FEATURE_COUNT = REPORT_ELEMENTS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.xDataImpl <em>xData</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.xDataImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getxData()
   * @generated
   */
  int XDATA = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDATA__NAME = REPORT_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDATA__CONTENT = REPORT_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDATA__PROPERTIES = REPORT_ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>xData</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDATA_FEATURE_COUNT = REPORT_ELEMENTS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.ImageImpl <em>Image</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.ImageImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getImage()
   * @generated
   */
  int IMAGE = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__NAME = REPORT_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__TYPE = REPORT_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__CONTENT = REPORT_ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__PROPERTIES = REPORT_ELEMENTS_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Image</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_FEATURE_COUNT = REPORT_ELEMENTS_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.ChartImpl <em>Chart</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.ChartImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getChart()
   * @generated
   */
  int CHART = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART__NAME = REPORT_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART__TYPE = REPORT_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Subtype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART__SUBTYPE = REPORT_ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Dataset</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART__DATASET = REPORT_ELEMENTS_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART__PROPERTIES = REPORT_ELEMENTS_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART__TITLE = REPORT_ELEMENTS_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Legend</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART__LEGEND = REPORT_ELEMENTS_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Plot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART__PLOT = REPORT_ELEMENTS_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Axe</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART__AXE = REPORT_ELEMENTS_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Xaxe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART__XAXE = REPORT_ELEMENTS_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Yaxe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART__YAXE = REPORT_ELEMENTS_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Colorpalette</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART__COLORPALETTE = REPORT_ELEMENTS_FEATURE_COUNT + 11;

  /**
   * The number of structural features of the '<em>Chart</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART_FEATURE_COUNT = REPORT_ELEMENTS_FEATURE_COUNT + 12;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.LegendImpl <em>Legend</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.LegendImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getLegend()
   * @generated
   */
  int LEGEND = 33;

  /**
   * The feature id for the '<em><b>Place</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEGEND__PLACE = 0;

  /**
   * The feature id for the '<em><b>Orientation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEGEND__ORIENTATION = 1;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEGEND__TITLE = 2;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEGEND__VISIBILITY = 3;

  /**
   * The number of structural features of the '<em>Legend</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEGEND_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.XAxeImpl <em>XAxe</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.XAxeImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getXAxe()
   * @generated
   */
  int XAXE = 34;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XAXE__VALUE = 0;

  /**
   * The number of structural features of the '<em>XAxe</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XAXE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.YAxeImpl <em>YAxe</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.YAxeImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getYAxe()
   * @generated
   */
  int YAXE = 35;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YAXE__VALUE = 0;

  /**
   * The number of structural features of the '<em>YAxe</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YAXE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.AxeImpl <em>Axe</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.AxeImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getAxe()
   * @generated
   */
  int AXE = 36;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AXE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Data</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AXE__DATA = 1;

  /**
   * The feature id for the '<em><b>Groupingby</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AXE__GROUPINGBY = 2;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AXE__TITLE = 3;

  /**
   * The feature id for the '<em><b>Line</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AXE__LINE = 4;

  /**
   * The feature id for the '<em><b>Majorgrid</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AXE__MAJORGRID = 5;

  /**
   * The feature id for the '<em><b>Minorgrid</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AXE__MINORGRID = 6;

  /**
   * The number of structural features of the '<em>Axe</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AXE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.LineImpl <em>Line</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.LineImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getLine()
   * @generated
   */
  int LINE = 37;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Line</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.ChartGridImpl <em>Chart Grid</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.ChartGridImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getChartGrid()
   * @generated
   */
  int CHART_GRID = 38;

  /**
   * The feature id for the '<em><b>Scale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART_GRID__SCALE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART_GRID__VALUE = 1;

  /**
   * The feature id for the '<em><b>Tick</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART_GRID__TICK = 2;

  /**
   * The number of structural features of the '<em>Chart Grid</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART_GRID_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.TickImpl <em>Tick</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.TickImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getTick()
   * @generated
   */
  int TICK = 39;

  /**
   * The feature id for the '<em><b>Place</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICK__PLACE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICK__VALUE = 1;

  /**
   * The number of structural features of the '<em>Tick</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.ColorPaletteImpl <em>Color Palette</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.ColorPaletteImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getColorPalette()
   * @generated
   */
  int COLOR_PALETTE = 40;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_PALETTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_PALETTE__VALUE = 1;

  /**
   * The feature id for the '<em><b>Linkto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_PALETTE__LINKTO = 2;

  /**
   * The number of structural features of the '<em>Color Palette</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_PALETTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.PlaceImpl <em>Place</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.PlaceImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getPlace()
   * @generated
   */
  int PLACE = 41;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACE__POSITION = 0;

  /**
   * The feature id for the '<em><b>Anchor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACE__ANCHOR = 1;

  /**
   * The number of structural features of the '<em>Place</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.TitleImpl <em>Title</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.TitleImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getTitle()
   * @generated
   */
  int TITLE = 42;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Place</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE__PLACE = 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE__PROPERTIES = 2;

  /**
   * The number of structural features of the '<em>Title</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.ChartElementPropertiesImpl <em>Chart Element Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.ChartElementPropertiesImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getChartElementProperties()
   * @generated
   */
  int CHART_ELEMENT_PROPERTIES = 43;

  /**
   * The feature id for the '<em><b>Padding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART_ELEMENT_PROPERTIES__PADDING = 0;

  /**
   * The feature id for the '<em><b>Border</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART_ELEMENT_PROPERTIES__BORDER = 1;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART_ELEMENT_PROPERTIES__VISIBILITY = 2;

  /**
   * The feature id for the '<em><b>Font</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART_ELEMENT_PROPERTIES__FONT = 3;

  /**
   * The feature id for the '<em><b>Font Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART_ELEMENT_PROPERTIES__FONT_SIZE = 4;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART_ELEMENT_PROPERTIES__COLOR = 5;

  /**
   * The feature id for the '<em><b>Background Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART_ELEMENT_PROPERTIES__BACKGROUND_COLOR = 6;

  /**
   * The feature id for the '<em><b>Text Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART_ELEMENT_PROPERTIES__TEXT_STYLE = 7;

  /**
   * The feature id for the '<em><b>HAlign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART_ELEMENT_PROPERTIES__HALIGN = 8;

  /**
   * The feature id for the '<em><b>VAlign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART_ELEMENT_PROPERTIES__VALIGN = 9;

  /**
   * The feature id for the '<em><b>White Space</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART_ELEMENT_PROPERTIES__WHITE_SPACE = 10;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART_ELEMENT_PROPERTIES__STYLE = 11;

  /**
   * The feature id for the '<em><b>Display</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART_ELEMENT_PROPERTIES__DISPLAY = 12;

  /**
   * The number of structural features of the '<em>Chart Element Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHART_ELEMENT_PROPERTIES_FEATURE_COUNT = 13;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.ListImpl <em>List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.ListImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getList()
   * @generated
   */
  int LIST = 44;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__NAME = REPORT_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__PROPERTIES = REPORT_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Headerelements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__HEADERELEMENTS = REPORT_ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Detailelements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__DETAILELEMENTS = REPORT_ELEMENTS_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Footerelements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__FOOTERELEMENTS = REPORT_ELEMENTS_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_FEATURE_COUNT = REPORT_ELEMENTS_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.GridImpl <em>Grid</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.GridImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getGrid()
   * @generated
   */
  int GRID = 45;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID__NAME = REPORT_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID__PROPERTIES = REPORT_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID__COLUMNS = REPORT_ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Rows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID__ROWS = REPORT_ELEMENTS_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Grid</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_FEATURE_COUNT = REPORT_ELEMENTS_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.TableImpl <em>Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.TableImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getTable()
   * @generated
   */
  int TABLE = 46;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__NAME = REPORT_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__PROPERTIES = REPORT_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dataset</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__DATASET = REPORT_ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__COLUMNS = REPORT_ELEMENTS_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Headerrows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__HEADERROWS = REPORT_ELEMENTS_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Detailrows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__DETAILROWS = REPORT_ELEMENTS_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Footerrows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__FOOTERROWS = REPORT_ELEMENTS_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_FEATURE_COUNT = REPORT_ELEMENTS_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.CrossTableImpl <em>Cross Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.CrossTableImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getCrossTable()
   * @generated
   */
  int CROSS_TABLE = 47;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CROSS_TABLE__NAME = REPORT_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CROSS_TABLE__PROPERTIES = REPORT_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Cross Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CROSS_TABLE_FEATURE_COUNT = REPORT_ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.ColumnImpl <em>Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.ColumnImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getColumn()
   * @generated
   */
  int COLUMN = 48;

  /**
   * The feature id for the '<em><b>Order</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__ORDER = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__PROPERTIES = 1;

  /**
   * The number of structural features of the '<em>Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.RowImpl <em>Row</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.RowImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getRow()
   * @generated
   */
  int ROW = 49;

  /**
   * The feature id for the '<em><b>Order</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW__ORDER = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW__PROPERTIES = 1;

  /**
   * The feature id for the '<em><b>Cells</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW__CELLS = 2;

  /**
   * The number of structural features of the '<em>Row</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.CellImpl <em>Cell</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.CellImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getCell()
   * @generated
   */
  int CELL = 50;

  /**
   * The feature id for the '<em><b>Order</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL__ORDER = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL__PROPERTIES = 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL__ELEMENTS = 2;

  /**
   * The number of structural features of the '<em>Cell</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.PagePropertiesImpl <em>Page Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.PagePropertiesImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getPageProperties()
   * @generated
   */
  int PAGE_PROPERTIES = 51;

  /**
   * The feature id for the '<em><b>Font</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_PROPERTIES__FONT = 0;

  /**
   * The feature id for the '<em><b>Font Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_PROPERTIES__FONT_SIZE = 1;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_PROPERTIES__COLOR = 2;

  /**
   * The feature id for the '<em><b>Background Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_PROPERTIES__BACKGROUND_COLOR = 3;

  /**
   * The feature id for the '<em><b>Text Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_PROPERTIES__TEXT_STYLE = 4;

  /**
   * The feature id for the '<em><b>HAlign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_PROPERTIES__HALIGN = 5;

  /**
   * The feature id for the '<em><b>VAlign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_PROPERTIES__VALIGN = 6;

  /**
   * The feature id for the '<em><b>White Space</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_PROPERTIES__WHITE_SPACE = 7;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_PROPERTIES__STYLE = 8;

  /**
   * The feature id for the '<em><b>Display</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_PROPERTIES__DISPLAY = 9;

  /**
   * The feature id for the '<em><b>Border</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_PROPERTIES__BORDER = 10;

  /**
   * The feature id for the '<em><b>Padding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_PROPERTIES__PADDING = 11;

  /**
   * The feature id for the '<em><b>Margin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_PROPERTIES__MARGIN = 12;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_PROPERTIES__VISIBILITY = 13;

  /**
   * The feature id for the '<em><b>Pagebreak</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_PROPERTIES__PAGEBREAK = 14;

  /**
   * The feature id for the '<em><b>Toc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_PROPERTIES__TOC = 15;

  /**
   * The feature id for the '<em><b>Bookmark</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_PROPERTIES__BOOKMARK = 16;

  /**
   * The feature id for the '<em><b>Width</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_PROPERTIES__WIDTH = 17;

  /**
   * The feature id for the '<em><b>Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_PROPERTIES__HEIGHT = 18;

  /**
   * The number of structural features of the '<em>Page Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_PROPERTIES_FEATURE_COUNT = 19;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.LabelPropertiesImpl <em>Label Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.LabelPropertiesImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getLabelProperties()
   * @generated
   */
  int LABEL_PROPERTIES = 52;

  /**
   * The feature id for the '<em><b>Font</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROPERTIES__FONT = 0;

  /**
   * The feature id for the '<em><b>Font Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROPERTIES__FONT_SIZE = 1;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROPERTIES__COLOR = 2;

  /**
   * The feature id for the '<em><b>Background Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROPERTIES__BACKGROUND_COLOR = 3;

  /**
   * The feature id for the '<em><b>Text Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROPERTIES__TEXT_STYLE = 4;

  /**
   * The feature id for the '<em><b>HAlign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROPERTIES__HALIGN = 5;

  /**
   * The feature id for the '<em><b>VAlign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROPERTIES__VALIGN = 6;

  /**
   * The feature id for the '<em><b>White Space</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROPERTIES__WHITE_SPACE = 7;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROPERTIES__STYLE = 8;

  /**
   * The feature id for the '<em><b>Display</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROPERTIES__DISPLAY = 9;

  /**
   * The feature id for the '<em><b>Border</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROPERTIES__BORDER = 10;

  /**
   * The feature id for the '<em><b>Padding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROPERTIES__PADDING = 11;

  /**
   * The feature id for the '<em><b>Margin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROPERTIES__MARGIN = 12;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROPERTIES__VISIBILITY = 13;

  /**
   * The feature id for the '<em><b>Pagebreak</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROPERTIES__PAGEBREAK = 14;

  /**
   * The feature id for the '<em><b>Toc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROPERTIES__TOC = 15;

  /**
   * The feature id for the '<em><b>Bookmark</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROPERTIES__BOOKMARK = 16;

  /**
   * The feature id for the '<em><b>Width</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROPERTIES__WIDTH = 17;

  /**
   * The feature id for the '<em><b>Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROPERTIES__HEIGHT = 18;

  /**
   * The feature id for the '<em><b>Alttext</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROPERTIES__ALTTEXT = 19;

  /**
   * The number of structural features of the '<em>Label Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_PROPERTIES_FEATURE_COUNT = 20;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.FontImpl <em>Font</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.FontImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getFont()
   * @generated
   */
  int FONT = 53;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT__VALUE = 1;

  /**
   * The feature id for the '<em><b>Linkto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT__LINKTO = 2;

  /**
   * The number of structural features of the '<em>Font</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.FontSizeImpl <em>Font Size</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.FontSizeImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getFontSize()
   * @generated
   */
  int FONT_SIZE = 54;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_SIZE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_SIZE__VALUE = 1;

  /**
   * The feature id for the '<em><b>Linkto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_SIZE__LINKTO = 2;

  /**
   * The number of structural features of the '<em>Font Size</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_SIZE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.SizeValueUnitImpl <em>Size Value Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.SizeValueUnitImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getSizeValueUnit()
   * @generated
   */
  int SIZE_VALUE_UNIT = 55;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_VALUE_UNIT__VALUE = 0;

  /**
   * The number of structural features of the '<em>Size Value Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_VALUE_UNIT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.SizeValueImpl <em>Size Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.SizeValueImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getSizeValue()
   * @generated
   */
  int SIZE_VALUE = 56;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_VALUE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_VALUE__UNIT = 1;

  /**
   * The number of structural features of the '<em>Size Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.SizeValuePercentImpl <em>Size Value Percent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.SizeValuePercentImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getSizeValuePercent()
   * @generated
   */
  int SIZE_VALUE_PERCENT = 57;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_VALUE_PERCENT__VALUE = 0;

  /**
   * The number of structural features of the '<em>Size Value Percent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_VALUE_PERCENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.ColorImpl <em>Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.ColorImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getColor()
   * @generated
   */
  int COLOR = 58;

  /**
   * The number of structural features of the '<em>Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.StringColorImpl <em>String Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.StringColorImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getStringColor()
   * @generated
   */
  int STRING_COLOR = 59;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_COLOR__VALUE = COLOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_COLOR_FEATURE_COUNT = COLOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.HexColorImpl <em>Hex Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.HexColorImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getHexColor()
   * @generated
   */
  int HEX_COLOR = 60;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEX_COLOR__VALUE = COLOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Hex Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEX_COLOR_FEATURE_COUNT = COLOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.RgbColorImpl <em>Rgb Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.RgbColorImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getRgbColor()
   * @generated
   */
  int RGB_COLOR = 61;

  /**
   * The feature id for the '<em><b>R</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR__R = 0;

  /**
   * The feature id for the '<em><b>G</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR__G = 1;

  /**
   * The feature id for the '<em><b>B</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR__B = 2;

  /**
   * The number of structural features of the '<em>Rgb Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.TextStyleImpl <em>Text Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.TextStyleImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getTextStyle()
   * @generated
   */
  int TEXT_STYLE = 62;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_STYLE__NAME = 0;

  /**
   * The feature id for the '<em><b>I</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_STYLE__I = 1;

  /**
   * The feature id for the '<em><b>B</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_STYLE__B = 2;

  /**
   * The feature id for the '<em><b>U</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_STYLE__U = 3;

  /**
   * The feature id for the '<em><b>T</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_STYLE__T = 4;

  /**
   * The number of structural features of the '<em>Text Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_STYLE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.HAlignmentImpl <em>HAlignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.HAlignmentImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getHAlignment()
   * @generated
   */
  int HALIGNMENT = 63;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HALIGNMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HALIGNMENT__VALUE = 1;

  /**
   * The feature id for the '<em><b>Linkto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HALIGNMENT__LINKTO = 2;

  /**
   * The number of structural features of the '<em>HAlignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HALIGNMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.VAlignmentImpl <em>VAlignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.VAlignmentImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getVAlignment()
   * @generated
   */
  int VALIGNMENT = 64;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIGNMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIGNMENT__VALUE = 1;

  /**
   * The feature id for the '<em><b>Linkto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIGNMENT__LINKTO = 2;

  /**
   * The number of structural features of the '<em>VAlignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIGNMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.WhitespaceImpl <em>Whitespace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.WhitespaceImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getWhitespace()
   * @generated
   */
  int WHITESPACE = 65;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHITESPACE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHITESPACE__VALUE = 1;

  /**
   * The feature id for the '<em><b>Linkto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHITESPACE__LINKTO = 2;

  /**
   * The number of structural features of the '<em>Whitespace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHITESPACE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.DisplayImpl <em>Display</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.DisplayImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getDisplay()
   * @generated
   */
  int DISPLAY = 66;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPLAY__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPLAY__VALUE = 1;

  /**
   * The feature id for the '<em><b>Linkto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPLAY__LINKTO = 2;

  /**
   * The number of structural features of the '<em>Display</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPLAY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.BorderImpl <em>Border</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.BorderImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getBorder()
   * @generated
   */
  int BORDER = 67;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER__VALUE = 1;

  /**
   * The feature id for the '<em><b>Linkto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER__LINKTO = 2;

  /**
   * The number of structural features of the '<em>Border</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.BorderAllImpl <em>Border All</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.BorderAllImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getBorderAll()
   * @generated
   */
  int BORDER_ALL = 68;

  /**
   * The number of structural features of the '<em>Border All</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_ALL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.BorderSideImpl <em>Border Side</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.BorderSideImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getBorderSide()
   * @generated
   */
  int BORDER_SIDE = 69;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_SIDE__RIGHT = 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_SIDE__LEFT = 1;

  /**
   * The feature id for the '<em><b>Top</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_SIDE__TOP = 2;

  /**
   * The feature id for the '<em><b>Bottom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_SIDE__BOTTOM = 3;

  /**
   * The number of structural features of the '<em>Border Side</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_SIDE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.BorderLineImpl <em>Border Line</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.BorderLineImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getBorderLine()
   * @generated
   */
  int BORDER_LINE = 70;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_LINE__STYLE = BORDER_ALL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Width</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_LINE__WIDTH = BORDER_ALL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_LINE__COLOR = BORDER_ALL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Border Line</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_LINE_FEATURE_COUNT = BORDER_ALL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.BorderWidthImpl <em>Border Width</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.BorderWidthImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getBorderWidth()
   * @generated
   */
  int BORDER_WIDTH = 71;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_WIDTH__VALUE = 0;

  /**
   * The number of structural features of the '<em>Border Width</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_WIDTH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.WidthTypeValueImpl <em>Width Type Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.WidthTypeValueImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getWidthTypeValue()
   * @generated
   */
  int WIDTH_TYPE_VALUE = 72;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDTH_TYPE_VALUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Width Type Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDTH_TYPE_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.PaddingImpl <em>Padding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.PaddingImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getPadding()
   * @generated
   */
  int PADDING = 73;

  /**
   * The number of structural features of the '<em>Padding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PADDING_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.IndentAllImpl <em>Indent All</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.IndentAllImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getIndentAll()
   * @generated
   */
  int INDENT_ALL = 74;

  /**
   * The number of structural features of the '<em>Indent All</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDENT_ALL_FEATURE_COUNT = PADDING_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.IndentSideImpl <em>Indent Side</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.IndentSideImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getIndentSide()
   * @generated
   */
  int INDENT_SIDE = 75;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDENT_SIDE__RIGHT = PADDING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDENT_SIDE__LEFT = PADDING_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Top</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDENT_SIDE__TOP = PADDING_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Bottom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDENT_SIDE__BOTTOM = PADDING_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Indent Side</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDENT_SIDE_FEATURE_COUNT = PADDING_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.IndentValueImpl <em>Indent Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.IndentValueImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getIndentValue()
   * @generated
   */
  int INDENT_VALUE = 76;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDENT_VALUE__VALUE = INDENT_ALL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Indent Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDENT_VALUE_FEATURE_COUNT = INDENT_ALL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.PageBreakImpl <em>Page Break</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.PageBreakImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getPageBreak()
   * @generated
   */
  int PAGE_BREAK = 77;

  /**
   * The feature id for the '<em><b>Before</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_BREAK__BEFORE = 0;

  /**
   * The feature id for the '<em><b>After</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_BREAK__AFTER = 1;

  /**
   * The feature id for the '<em><b>Inside</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_BREAK__INSIDE = 2;

  /**
   * The feature id for the '<em><b>Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_BREAK__INTERVAL = 3;

  /**
   * The feature id for the '<em><b>Repeat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_BREAK__REPEAT = 4;

  /**
   * The number of structural features of the '<em>Page Break</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_BREAK_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.VisibilityImpl <em>Visibility</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.VisibilityImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getVisibility()
   * @generated
   */
  int VISIBILITY = 78;

  /**
   * The feature id for the '<em><b>Show</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIBILITY__SHOW = 0;

  /**
   * The number of structural features of the '<em>Visibility</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIBILITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.LegendVisibilityImpl <em>Legend Visibility</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.LegendVisibilityImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getLegendVisibility()
   * @generated
   */
  int LEGEND_VISIBILITY = 79;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEGEND_VISIBILITY__VALUE = 0;

  /**
   * The number of structural features of the '<em>Legend Visibility</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEGEND_VISIBILITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.HideAllImpl <em>Hide All</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.HideAllImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getHideAll()
   * @generated
   */
  int HIDE_ALL = 80;

  /**
   * The feature id for the '<em><b>Show</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_ALL__SHOW = VISIBILITY__SHOW;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_ALL__EXPRESSION = VISIBILITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_ALL__FORMAT = VISIBILITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Hide All</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_ALL_FEATURE_COUNT = VISIBILITY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.HideForOneImpl <em>Hide For One</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.HideForOneImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getHideForOne()
   * @generated
   */
  int HIDE_FOR_ONE = 81;

  /**
   * The feature id for the '<em><b>Show</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_FOR_ONE__SHOW = VISIBILITY__SHOW;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_FOR_ONE__VALUE = VISIBILITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Hide For One</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_FOR_ONE_FEATURE_COUNT = VISIBILITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.HideForMoreImpl <em>Hide For More</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.HideForMoreImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getHideForMore()
   * @generated
   */
  int HIDE_FOR_MORE = 82;

  /**
   * The feature id for the '<em><b>Show</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_FOR_MORE__SHOW = VISIBILITY__SHOW;

  /**
   * The feature id for the '<em><b>Format</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_FOR_MORE__FORMAT = VISIBILITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_FOR_MORE__EXPRESSION = VISIBILITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Hide For More</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_FOR_MORE_FEATURE_COUNT = VISIBILITY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.JSExpressionImpl <em>JS Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.JSExpressionImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getJSExpression()
   * @generated
   */
  int JS_EXPRESSION = 83;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JS_EXPRESSION__VALUE = 0;

  /**
   * The number of structural features of the '<em>JS Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JS_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.TocImpl <em>Toc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.TocImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getToc()
   * @generated
   */
  int TOC = 84;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOC__STYLE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOC__VALUE = 1;

  /**
   * The number of structural features of the '<em>Toc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.BookmarkImpl <em>Bookmark</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.BookmarkImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getBookmark()
   * @generated
   */
  int BOOKMARK = 85;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKMARK__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Bookmark</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKMARK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.StyleRefImpl <em>Style Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.StyleRefImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getStyleRef()
   * @generated
   */
  int STYLE_REF = 86;

  /**
   * The feature id for the '<em><b>Refname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_REF__REFNAME = 0;

  /**
   * The number of structural features of the '<em>Style Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_REF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.StyleImpl <em>Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.StyleImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getStyle()
   * @generated
   */
  int STYLE = 87;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE__PROPERTIES = 1;

  /**
   * The number of structural features of the '<em>Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.WidthImpl <em>Width</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.WidthImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getWidth()
   * @generated
   */
  int WIDTH = 88;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDTH__VALUE = 0;

  /**
   * The number of structural features of the '<em>Width</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDTH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.HeightImpl <em>Height</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.HeightImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getHeight()
   * @generated
   */
  int HEIGHT = 89;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEIGHT__VALUE = 0;

  /**
   * The number of structural features of the '<em>Height</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEIGHT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.AltTextImpl <em>Alt Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.AltTextImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getAltText()
   * @generated
   */
  int ALT_TEXT = 90;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALT_TEXT__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Alt Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALT_TEXT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.LiteralImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 91;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.IntLiteralImpl <em>Int Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.IntLiteralImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getIntLiteral()
   * @generated
   */
  int INT_LITERAL = 92;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.FloatLiteralImpl <em>Float Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.FloatLiteralImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getFloatLiteral()
   * @generated
   */
  int FLOAT_LITERAL = 93;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Float Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.StringLiteralImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 94;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.BooleanLiteralImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 95;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.NullLiteralImpl <em>Null Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.NullLiteralImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getNullLiteral()
   * @generated
   */
  int NULL_LITERAL = 96;

  /**
   * The number of structural features of the '<em>Null Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.impl.IDImpl <em>ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.impl.IDImpl
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getID()
   * @generated
   */
  int ID = 97;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.STRING <em>STRING</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.STRING
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getSTRING()
   * @generated
   */
  int STRING = 98;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.ChartSubType <em>Chart Sub Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.ChartSubType
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getChartSubType()
   * @generated
   */
  int CHART_SUB_TYPE = 99;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.PositionType <em>Position Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.PositionType
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getPositionType()
   * @generated
   */
  int POSITION_TYPE = 100;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.OrientationType <em>Orientation Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.OrientationType
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getOrientationType()
   * @generated
   */
  int ORIENTATION_TYPE = 101;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.SizeUnit <em>Size Unit</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.SizeUnit
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getSizeUnit()
   * @generated
   */
  int SIZE_UNIT = 102;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.LengthUnit <em>Length Unit</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.LengthUnit
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getLengthUnit()
   * @generated
   */
  int LENGTH_UNIT = 103;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.HalignmentType <em>Halignment Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.HalignmentType
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getHalignmentType()
   * @generated
   */
  int HALIGNMENT_TYPE = 104;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.ValignmentType <em>Valignment Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.ValignmentType
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getValignmentType()
   * @generated
   */
  int VALIGNMENT_TYPE = 105;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.WhitespaceType <em>Whitespace Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.WhitespaceType
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getWhitespaceType()
   * @generated
   */
  int WHITESPACE_TYPE = 106;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.DisplayType <em>Display Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.DisplayType
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getDisplayType()
   * @generated
   */
  int DISPLAY_TYPE = 107;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.BorderLineStyleType <em>Border Line Style Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.BorderLineStyleType
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getBorderLineStyleType()
   * @generated
   */
  int BORDER_LINE_STYLE_TYPE = 108;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.WidthType <em>Width Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.WidthType
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getWidthType()
   * @generated
   */
  int WIDTH_TYPE = 109;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.OutputFormatType <em>Output Format Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.OutputFormatType
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getOutputFormatType()
   * @generated
   */
  int OUTPUT_FORMAT_TYPE = 110;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.PageBreakType <em>Page Break Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.PageBreakType
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getPageBreakType()
   * @generated
   */
  int PAGE_BREAK_TYPE = 111;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.PageBreakValue <em>Page Break Value</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.PageBreakValue
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getPageBreakValue()
   * @generated
   */
  int PAGE_BREAK_VALUE = 112;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.SortType <em>Sort Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.SortType
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getSortType()
   * @generated
   */
  int SORT_TYPE = 113;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.BorderType <em>Border Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.BorderType
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getBorderType()
   * @generated
   */
  int BORDER_TYPE = 114;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.TargetType <em>Target Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.TargetType
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getTargetType()
   * @generated
   */
  int TARGET_TYPE = 115;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.DrillThroughType <em>Drill Through Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.DrillThroughType
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getDrillThroughType()
   * @generated
   */
  int DRILL_THROUGH_TYPE = 116;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.ColorType <em>Color Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.ColorType
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getColorType()
   * @generated
   */
  int COLOR_TYPE = 117;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.ParameterControlType <em>Parameter Control Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.ParameterControlType
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getParameterControlType()
   * @generated
   */
  int PARAMETER_CONTROL_TYPE = 118;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.ParameterValueType <em>Parameter Value Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.ParameterValueType
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getParameterValueType()
   * @generated
   */
  int PARAMETER_VALUE_TYPE = 119;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.ParameterType <em>Parameter Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.ParameterType
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getParameterType()
   * @generated
   */
  int PARAMETER_TYPE = 120;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.DataType <em>Data Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.DataType
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 121;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.StaticParameterSort <em>Static Parameter Sort</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.StaticParameterSort
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getStaticParameterSort()
   * @generated
   */
  int STATIC_PARAMETER_SORT = 122;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.rDsl.AggregatorFunction <em>Aggregator Function</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.rDsl.AggregatorFunction
   * @see org.xtext.example.mydsl.rDsl.impl.RDslPackageImpl#getAggregatorFunction()
   * @generated
   */
  int AGGREGATOR_FUNCTION = 123;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root</em>'.
   * @see org.xtext.example.mydsl.rDsl.Root
   * @generated
   */
  EClass getRoot();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Root#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root</em>'.
   * @see org.xtext.example.mydsl.rDsl.Root#getRoot()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Root();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Report <em>Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Report</em>'.
   * @see org.xtext.example.mydsl.rDsl.Report
   * @generated
   */
  EClass getReport();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Report#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.rDsl.Report#getName()
   * @see #getReport()
   * @generated
   */
  EAttribute getReport_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Report#getDatasources <em>Datasources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datasources</em>'.
   * @see org.xtext.example.mydsl.rDsl.Report#getDatasources()
   * @see #getReport()
   * @generated
   */
  EReference getReport_Datasources();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Report#getDatasets <em>Datasets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datasets</em>'.
   * @see org.xtext.example.mydsl.rDsl.Report#getDatasets()
   * @see #getReport()
   * @generated
   */
  EReference getReport_Datasets();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Report#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see org.xtext.example.mydsl.rDsl.Report#getParameters()
   * @see #getReport()
   * @generated
   */
  EReference getReport_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Report#getStyles <em>Styles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Styles</em>'.
   * @see org.xtext.example.mydsl.rDsl.Report#getStyles()
   * @see #getReport()
   * @generated
   */
  EReference getReport_Styles();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Report#getPagesetup <em>Pagesetup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pagesetup</em>'.
   * @see org.xtext.example.mydsl.rDsl.Report#getPagesetup()
   * @see #getReport()
   * @generated
   */
  EReference getReport_Pagesetup();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Report#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.xtext.example.mydsl.rDsl.Report#getBody()
   * @see #getReport()
   * @generated
   */
  EReference getReport_Body();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Report#getElementProperties <em>Element Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Properties</em>'.
   * @see org.xtext.example.mydsl.rDsl.Report#getElementProperties()
   * @see #getReport()
   * @generated
   */
  EReference getReport_ElementProperties();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.elementProperties <em>element Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>element Properties</em>'.
   * @see org.xtext.example.mydsl.rDsl.elementProperties
   * @generated
   */
  EClass getelementProperties();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.elementProperties#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.xtext.example.mydsl.rDsl.elementProperties#getProperties()
   * @see #getelementProperties()
   * @generated
   */
  EReference getelementProperties_Properties();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.ElementProperty <em>Element Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Property</em>'.
   * @see org.xtext.example.mydsl.rDsl.ElementProperty
   * @generated
   */
  EClass getElementProperty();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.ElementProperty#getColorpalette <em>Colorpalette</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Colorpalette</em>'.
   * @see org.xtext.example.mydsl.rDsl.ElementProperty#getColorpalette()
   * @see #getElementProperty()
   * @generated
   */
  EReference getElementProperty_Colorpalette();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.ElementProperty#getFont <em>Font</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Font</em>'.
   * @see org.xtext.example.mydsl.rDsl.ElementProperty#getFont()
   * @see #getElementProperty()
   * @generated
   */
  EReference getElementProperty_Font();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.ElementProperty#getFontSize <em>Font Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Font Size</em>'.
   * @see org.xtext.example.mydsl.rDsl.ElementProperty#getFontSize()
   * @see #getElementProperty()
   * @generated
   */
  EReference getElementProperty_FontSize();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Datasources <em>Datasources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datasources</em>'.
   * @see org.xtext.example.mydsl.rDsl.Datasources
   * @generated
   */
  EClass getDatasources();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.Datasources#getDatasource <em>Datasource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Datasource</em>'.
   * @see org.xtext.example.mydsl.rDsl.Datasources#getDatasource()
   * @see #getDatasources()
   * @generated
   */
  EReference getDatasources_Datasource();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Datasource <em>Datasource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datasource</em>'.
   * @see org.xtext.example.mydsl.rDsl.Datasource
   * @generated
   */
  EClass getDatasource();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Datasource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.rDsl.Datasource#getName()
   * @see #getDatasource()
   * @generated
   */
  EAttribute getDatasource_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Datasource#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.rDsl.Datasource#getType()
   * @see #getDatasource()
   * @generated
   */
  EReference getDatasource_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.DatasourceSample <em>Datasource Sample</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datasource Sample</em>'.
   * @see org.xtext.example.mydsl.rDsl.DatasourceSample
   * @generated
   */
  EClass getDatasourceSample();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.DatasourceSample#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.rDsl.DatasourceSample#getType()
   * @see #getDatasourceSample()
   * @generated
   */
  EAttribute getDatasourceSample_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.DatasourceJDBC <em>Datasource JDBC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datasource JDBC</em>'.
   * @see org.xtext.example.mydsl.rDsl.DatasourceJDBC
   * @generated
   */
  EClass getDatasourceJDBC();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.DatasourceJDBC#getDriver <em>Driver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Driver</em>'.
   * @see org.xtext.example.mydsl.rDsl.DatasourceJDBC#getDriver()
   * @see #getDatasourceJDBC()
   * @generated
   */
  EAttribute getDatasourceJDBC_Driver();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.DatasourceJDBC#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see org.xtext.example.mydsl.rDsl.DatasourceJDBC#getUrl()
   * @see #getDatasourceJDBC()
   * @generated
   */
  EAttribute getDatasourceJDBC_Url();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.DatasourceJDBC#getUser <em>User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>User</em>'.
   * @see org.xtext.example.mydsl.rDsl.DatasourceJDBC#getUser()
   * @see #getDatasourceJDBC()
   * @generated
   */
  EAttribute getDatasourceJDBC_User();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.DatasourceJDBC#getPassword <em>Password</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Password</em>'.
   * @see org.xtext.example.mydsl.rDsl.DatasourceJDBC#getPassword()
   * @see #getDatasourceJDBC()
   * @generated
   */
  EAttribute getDatasourceJDBC_Password();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.DatasourceCSV <em>Datasource CSV</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datasource CSV</em>'.
   * @see org.xtext.example.mydsl.rDsl.DatasourceCSV
   * @generated
   */
  EClass getDatasourceCSV();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.DatasourceCSV#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see org.xtext.example.mydsl.rDsl.DatasourceCSV#getUrl()
   * @see #getDatasourceCSV()
   * @generated
   */
  EAttribute getDatasourceCSV_Url();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.DatasourceCSV#getCharset <em>Charset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Charset</em>'.
   * @see org.xtext.example.mydsl.rDsl.DatasourceCSV#getCharset()
   * @see #getDatasourceCSV()
   * @generated
   */
  EAttribute getDatasourceCSV_Charset();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.DatasourceCSV#getDelimiter <em>Delimiter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delimiter</em>'.
   * @see org.xtext.example.mydsl.rDsl.DatasourceCSV#getDelimiter()
   * @see #getDatasourceCSV()
   * @generated
   */
  EAttribute getDatasourceCSV_Delimiter();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.DatasourceCSV#getHeaderline <em>Headerline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Headerline</em>'.
   * @see org.xtext.example.mydsl.rDsl.DatasourceCSV#getHeaderline()
   * @see #getDatasourceCSV()
   * @generated
   */
  EReference getDatasourceCSV_Headerline();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Datasets <em>Datasets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datasets</em>'.
   * @see org.xtext.example.mydsl.rDsl.Datasets
   * @generated
   */
  EClass getDatasets();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.Datasets#getDataset <em>Dataset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dataset</em>'.
   * @see org.xtext.example.mydsl.rDsl.Datasets#getDataset()
   * @see #getDatasets()
   * @generated
   */
  EReference getDatasets_Dataset();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Dataset <em>Dataset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dataset</em>'.
   * @see org.xtext.example.mydsl.rDsl.Dataset
   * @generated
   */
  EClass getDataset();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Dataset#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.rDsl.Dataset#getName()
   * @see #getDataset()
   * @generated
   */
  EAttribute getDataset_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.rDsl.Dataset#getDatasourceref <em>Datasourceref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Datasourceref</em>'.
   * @see org.xtext.example.mydsl.rDsl.Dataset#getDatasourceref()
   * @see #getDataset()
   * @generated
   */
  EReference getDataset_Datasourceref();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.Dataset#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field</em>'.
   * @see org.xtext.example.mydsl.rDsl.Dataset#getField()
   * @see #getDataset()
   * @generated
   */
  EReference getDataset_Field();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.mydsl.rDsl.Dataset#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Parameter</em>'.
   * @see org.xtext.example.mydsl.rDsl.Dataset#getParameter()
   * @see #getDataset()
   * @generated
   */
  EReference getDataset_Parameter();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Dataset#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Query</em>'.
   * @see org.xtext.example.mydsl.rDsl.Dataset#getQuery()
   * @see #getDataset()
   * @generated
   */
  EAttribute getDataset_Query();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.DatasetField <em>Dataset Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dataset Field</em>'.
   * @see org.xtext.example.mydsl.rDsl.DatasetField
   * @generated
   */
  EClass getDatasetField();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.DatasetField#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.rDsl.DatasetField#getName()
   * @see #getDatasetField()
   * @generated
   */
  EAttribute getDatasetField_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.SimpleDatasetField <em>Simple Dataset Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Dataset Field</em>'.
   * @see org.xtext.example.mydsl.rDsl.SimpleDatasetField
   * @generated
   */
  EClass getSimpleDatasetField();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.ComputedDatasetField <em>Computed Dataset Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Computed Dataset Field</em>'.
   * @see org.xtext.example.mydsl.rDsl.ComputedDatasetField
   * @generated
   */
  EClass getComputedDatasetField();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.ComputedDatasetField#getAggregation <em>Aggregation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aggregation</em>'.
   * @see org.xtext.example.mydsl.rDsl.ComputedDatasetField#getAggregation()
   * @see #getComputedDatasetField()
   * @generated
   */
  EAttribute getComputedDatasetField_Aggregation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.ComputedDatasetField#getDatatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Datatype</em>'.
   * @see org.xtext.example.mydsl.rDsl.ComputedDatasetField#getDatatype()
   * @see #getComputedDatasetField()
   * @generated
   */
  EAttribute getComputedDatasetField_Datatype();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.ComputedDatasetField#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument</em>'.
   * @see org.xtext.example.mydsl.rDsl.ComputedDatasetField#getArgument()
   * @see #getComputedDatasetField()
   * @generated
   */
  EReference getComputedDatasetField_Argument();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.ComputedDatasetField#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see org.xtext.example.mydsl.rDsl.ComputedDatasetField#getFilter()
   * @see #getComputedDatasetField()
   * @generated
   */
  EReference getComputedDatasetField_Filter();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Parameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameters</em>'.
   * @see org.xtext.example.mydsl.rDsl.Parameters
   * @generated
   */
  EClass getParameters();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.Parameters#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter</em>'.
   * @see org.xtext.example.mydsl.rDsl.Parameters#getParameter()
   * @see #getParameters()
   * @generated
   */
  EReference getParameters_Parameter();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.StaticParameterValues <em>Static Parameter Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Parameter Values</em>'.
   * @see org.xtext.example.mydsl.rDsl.StaticParameterValues
   * @generated
   */
  EClass getStaticParameterValues();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.StaticParameterValues#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.StaticParameterValues#getValue()
   * @see #getStaticParameterValues()
   * @generated
   */
  EReference getStaticParameterValues_Value();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.StaticParameterValues#getSort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sort</em>'.
   * @see org.xtext.example.mydsl.rDsl.StaticParameterValues#getSort()
   * @see #getStaticParameterValues()
   * @generated
   */
  EAttribute getStaticParameterValues_Sort();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.StaticParameterValues#getSorttype <em>Sorttype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sorttype</em>'.
   * @see org.xtext.example.mydsl.rDsl.StaticParameterValues#getSorttype()
   * @see #getStaticParameterValues()
   * @generated
   */
  EAttribute getStaticParameterValues_Sorttype();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.StaticParameterValue <em>Static Parameter Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Parameter Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.StaticParameterValue
   * @generated
   */
  EClass getStaticParameterValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.StaticParameterValue#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.xtext.example.mydsl.rDsl.StaticParameterValue#getLabel()
   * @see #getStaticParameterValue()
   * @generated
   */
  EAttribute getStaticParameterValue_Label();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.StaticParameterValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.StaticParameterValue#getValue()
   * @see #getStaticParameterValue()
   * @generated
   */
  EAttribute getStaticParameterValue_Value();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.StaticParameterValue#isDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default</em>'.
   * @see org.xtext.example.mydsl.rDsl.StaticParameterValue#isDefault()
   * @see #getStaticParameterValue()
   * @generated
   */
  EAttribute getStaticParameterValue_Default();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.DynamicParameterValues <em>Dynamic Parameter Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dynamic Parameter Values</em>'.
   * @see org.xtext.example.mydsl.rDsl.DynamicParameterValues
   * @generated
   */
  EClass getDynamicParameterValues();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.DynamicParameterValues#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.DynamicParameterValues#getValue()
   * @see #getDynamicParameterValues()
   * @generated
   */
  EReference getDynamicParameterValues_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.DynamicParameterValue <em>Dynamic Parameter Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dynamic Parameter Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.DynamicParameterValue
   * @generated
   */
  EClass getDynamicParameterValue();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.rDsl.DynamicParameterValue#getDataset <em>Dataset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dataset</em>'.
   * @see org.xtext.example.mydsl.rDsl.DynamicParameterValue#getDataset()
   * @see #getDynamicParameterValue()
   * @generated
   */
  EReference getDynamicParameterValue_Dataset();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.DynamicParameterValue#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label</em>'.
   * @see org.xtext.example.mydsl.rDsl.DynamicParameterValue#getLabel()
   * @see #getDynamicParameterValue()
   * @generated
   */
  EReference getDynamicParameterValue_Label();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.DynamicParameterValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.DynamicParameterValue#getValue()
   * @see #getDynamicParameterValue()
   * @generated
   */
  EReference getDynamicParameterValue_Value();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.DynamicParameterValue#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Default</em>'.
   * @see org.xtext.example.mydsl.rDsl.DynamicParameterValue#getDefault()
   * @see #getDynamicParameterValue()
   * @generated
   */
  EReference getDynamicParameterValue_Default();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.rDsl.DynamicParameterValue#getSort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Sort</em>'.
   * @see org.xtext.example.mydsl.rDsl.DynamicParameterValue#getSort()
   * @see #getDynamicParameterValue()
   * @generated
   */
  EReference getDynamicParameterValue_Sort();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.DynamicParameterValue#getSorttype <em>Sorttype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sorttype</em>'.
   * @see org.xtext.example.mydsl.rDsl.DynamicParameterValue#getSorttype()
   * @see #getDynamicParameterValue()
   * @generated
   */
  EAttribute getDynamicParameterValue_Sorttype();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.xtext.example.mydsl.rDsl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Parameter#getControltype <em>Controltype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Controltype</em>'.
   * @see org.xtext.example.mydsl.rDsl.Parameter#getControltype()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Controltype();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.rDsl.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Parameter#getPromt <em>Promt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Promt</em>'.
   * @see org.xtext.example.mydsl.rDsl.Parameter#getPromt()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Promt();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Parameter#getHelp <em>Help</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Help</em>'.
   * @see org.xtext.example.mydsl.rDsl.Parameter#getHelp()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Help();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Parameter#getHide <em>Hide</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hide</em>'.
   * @see org.xtext.example.mydsl.rDsl.Parameter#getHide()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Hide();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Parameter#getRequired <em>Required</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Required</em>'.
   * @see org.xtext.example.mydsl.rDsl.Parameter#getRequired()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Required();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Parameter#getDuplicate <em>Duplicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Duplicate</em>'.
   * @see org.xtext.example.mydsl.rDsl.Parameter#getDuplicate()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Duplicate();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Parameter#getValuetype <em>Valuetype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valuetype</em>'.
   * @see org.xtext.example.mydsl.rDsl.Parameter#getValuetype()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Valuetype();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Parameter#getParamtype <em>Paramtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Paramtype</em>'.
   * @see org.xtext.example.mydsl.rDsl.Parameter#getParamtype()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Paramtype();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Parameter#getDatatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Datatype</em>'.
   * @see org.xtext.example.mydsl.rDsl.Parameter#getDatatype()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Datatype();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Parameter#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Values</em>'.
   * @see org.xtext.example.mydsl.rDsl.Parameter#getValues()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Values();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.ParameterValue <em>Parameter Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.ParameterValue
   * @generated
   */
  EClass getParameterValue();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Styles <em>Styles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Styles</em>'.
   * @see org.xtext.example.mydsl.rDsl.Styles
   * @generated
   */
  EClass getStyles();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.Styles#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Style</em>'.
   * @see org.xtext.example.mydsl.rDsl.Styles#getStyle()
   * @see #getStyles()
   * @generated
   */
  EReference getStyles_Style();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.PageSetup <em>Page Setup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page Setup</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageSetup
   * @generated
   */
  EClass getPageSetup();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.PageSetup#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageSetup#getProperties()
   * @see #getPageSetup()
   * @generated
   */
  EReference getPageSetup_Properties();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body</em>'.
   * @see org.xtext.example.mydsl.rDsl.Body
   * @generated
   */
  EClass getBody();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.Body#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.example.mydsl.rDsl.Body#getElements()
   * @see #getBody()
   * @generated
   */
  EReference getBody_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.ReportElements <em>Report Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Report Elements</em>'.
   * @see org.xtext.example.mydsl.rDsl.ReportElements
   * @generated
   */
  EClass getReportElements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.BasicElements <em>Basic Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Elements</em>'.
   * @see org.xtext.example.mydsl.rDsl.BasicElements
   * @generated
   */
  EClass getBasicElements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.ComplexElements <em>Complex Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Elements</em>'.
   * @see org.xtext.example.mydsl.rDsl.ComplexElements
   * @generated
   */
  EClass getComplexElements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see org.xtext.example.mydsl.rDsl.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Label#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.rDsl.Label#getName()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Label#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see org.xtext.example.mydsl.rDsl.Label#getContent()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Content();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.Label#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.xtext.example.mydsl.rDsl.Label#getProperties()
   * @see #getLabel()
   * @generated
   */
  EReference getLabel_Properties();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text</em>'.
   * @see org.xtext.example.mydsl.rDsl.Text
   * @generated
   */
  EClass getText();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Text#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.rDsl.Text#getName()
   * @see #getText()
   * @generated
   */
  EAttribute getText_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Text#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see org.xtext.example.mydsl.rDsl.Text#getContent()
   * @see #getText()
   * @generated
   */
  EAttribute getText_Content();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.Text#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.xtext.example.mydsl.rDsl.Text#getProperties()
   * @see #getText()
   * @generated
   */
  EReference getText_Properties();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.DynamicText <em>Dynamic Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dynamic Text</em>'.
   * @see org.xtext.example.mydsl.rDsl.DynamicText
   * @generated
   */
  EClass getDynamicText();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.DynamicText#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.rDsl.DynamicText#getName()
   * @see #getDynamicText()
   * @generated
   */
  EAttribute getDynamicText_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.DynamicText#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content</em>'.
   * @see org.xtext.example.mydsl.rDsl.DynamicText#getContent()
   * @see #getDynamicText()
   * @generated
   */
  EReference getDynamicText_Content();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.DynamicText#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.xtext.example.mydsl.rDsl.DynamicText#getProperties()
   * @see #getDynamicText()
   * @generated
   */
  EReference getDynamicText_Properties();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.xData <em>xData</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>xData</em>'.
   * @see org.xtext.example.mydsl.rDsl.xData
   * @generated
   */
  EClass getxData();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.xData#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.rDsl.xData#getName()
   * @see #getxData()
   * @generated
   */
  EAttribute getxData_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.xData#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content</em>'.
   * @see org.xtext.example.mydsl.rDsl.xData#getContent()
   * @see #getxData()
   * @generated
   */
  EReference getxData_Content();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.xData#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.xtext.example.mydsl.rDsl.xData#getProperties()
   * @see #getxData()
   * @generated
   */
  EReference getxData_Properties();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Image <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image</em>'.
   * @see org.xtext.example.mydsl.rDsl.Image
   * @generated
   */
  EClass getImage();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Image#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.rDsl.Image#getName()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Image#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.rDsl.Image#getType()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Image#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content</em>'.
   * @see org.xtext.example.mydsl.rDsl.Image#getContent()
   * @see #getImage()
   * @generated
   */
  EReference getImage_Content();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.Image#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.xtext.example.mydsl.rDsl.Image#getProperties()
   * @see #getImage()
   * @generated
   */
  EReference getImage_Properties();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Chart <em>Chart</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chart</em>'.
   * @see org.xtext.example.mydsl.rDsl.Chart
   * @generated
   */
  EClass getChart();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Chart#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.rDsl.Chart#getName()
   * @see #getChart()
   * @generated
   */
  EAttribute getChart_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Chart#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.rDsl.Chart#getType()
   * @see #getChart()
   * @generated
   */
  EAttribute getChart_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Chart#getSubtype <em>Subtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Subtype</em>'.
   * @see org.xtext.example.mydsl.rDsl.Chart#getSubtype()
   * @see #getChart()
   * @generated
   */
  EAttribute getChart_Subtype();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.rDsl.Chart#getDataset <em>Dataset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dataset</em>'.
   * @see org.xtext.example.mydsl.rDsl.Chart#getDataset()
   * @see #getChart()
   * @generated
   */
  EReference getChart_Dataset();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.Chart#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.xtext.example.mydsl.rDsl.Chart#getProperties()
   * @see #getChart()
   * @generated
   */
  EReference getChart_Properties();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Chart#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.xtext.example.mydsl.rDsl.Chart#getTitle()
   * @see #getChart()
   * @generated
   */
  EReference getChart_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Chart#getLegend <em>Legend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Legend</em>'.
   * @see org.xtext.example.mydsl.rDsl.Chart#getLegend()
   * @see #getChart()
   * @generated
   */
  EReference getChart_Legend();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Chart#getPlot <em>Plot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Plot</em>'.
   * @see org.xtext.example.mydsl.rDsl.Chart#getPlot()
   * @see #getChart()
   * @generated
   */
  EAttribute getChart_Plot();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Chart#getAxe <em>Axe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Axe</em>'.
   * @see org.xtext.example.mydsl.rDsl.Chart#getAxe()
   * @see #getChart()
   * @generated
   */
  EAttribute getChart_Axe();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Chart#getXaxe <em>Xaxe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Xaxe</em>'.
   * @see org.xtext.example.mydsl.rDsl.Chart#getXaxe()
   * @see #getChart()
   * @generated
   */
  EReference getChart_Xaxe();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Chart#getYaxe <em>Yaxe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Yaxe</em>'.
   * @see org.xtext.example.mydsl.rDsl.Chart#getYaxe()
   * @see #getChart()
   * @generated
   */
  EReference getChart_Yaxe();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Chart#getColorpalette <em>Colorpalette</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Colorpalette</em>'.
   * @see org.xtext.example.mydsl.rDsl.Chart#getColorpalette()
   * @see #getChart()
   * @generated
   */
  EReference getChart_Colorpalette();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Legend <em>Legend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Legend</em>'.
   * @see org.xtext.example.mydsl.rDsl.Legend
   * @generated
   */
  EClass getLegend();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Legend#getPlace <em>Place</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Place</em>'.
   * @see org.xtext.example.mydsl.rDsl.Legend#getPlace()
   * @see #getLegend()
   * @generated
   */
  EReference getLegend_Place();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Legend#getOrientation <em>Orientation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Orientation</em>'.
   * @see org.xtext.example.mydsl.rDsl.Legend#getOrientation()
   * @see #getLegend()
   * @generated
   */
  EAttribute getLegend_Orientation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Legend#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.xtext.example.mydsl.rDsl.Legend#getTitle()
   * @see #getLegend()
   * @generated
   */
  EReference getLegend_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Legend#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Visibility</em>'.
   * @see org.xtext.example.mydsl.rDsl.Legend#getVisibility()
   * @see #getLegend()
   * @generated
   */
  EReference getLegend_Visibility();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.XAxe <em>XAxe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XAxe</em>'.
   * @see org.xtext.example.mydsl.rDsl.XAxe
   * @generated
   */
  EClass getXAxe();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.XAxe#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.XAxe#getValue()
   * @see #getXAxe()
   * @generated
   */
  EReference getXAxe_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.YAxe <em>YAxe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>YAxe</em>'.
   * @see org.xtext.example.mydsl.rDsl.YAxe
   * @generated
   */
  EClass getYAxe();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.YAxe#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.YAxe#getValue()
   * @see #getYAxe()
   * @generated
   */
  EReference getYAxe_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Axe <em>Axe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Axe</em>'.
   * @see org.xtext.example.mydsl.rDsl.Axe
   * @generated
   */
  EClass getAxe();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Axe#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.rDsl.Axe#getType()
   * @see #getAxe()
   * @generated
   */
  EAttribute getAxe_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Axe#getData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data</em>'.
   * @see org.xtext.example.mydsl.rDsl.Axe#getData()
   * @see #getAxe()
   * @generated
   */
  EReference getAxe_Data();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Axe#getGroupingby <em>Groupingby</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Groupingby</em>'.
   * @see org.xtext.example.mydsl.rDsl.Axe#getGroupingby()
   * @see #getAxe()
   * @generated
   */
  EReference getAxe_Groupingby();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Axe#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.xtext.example.mydsl.rDsl.Axe#getTitle()
   * @see #getAxe()
   * @generated
   */
  EReference getAxe_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Axe#getLine <em>Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Line</em>'.
   * @see org.xtext.example.mydsl.rDsl.Axe#getLine()
   * @see #getAxe()
   * @generated
   */
  EReference getAxe_Line();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Axe#getMajorgrid <em>Majorgrid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Majorgrid</em>'.
   * @see org.xtext.example.mydsl.rDsl.Axe#getMajorgrid()
   * @see #getAxe()
   * @generated
   */
  EReference getAxe_Majorgrid();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Axe#getMinorgrid <em>Minorgrid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Minorgrid</em>'.
   * @see org.xtext.example.mydsl.rDsl.Axe#getMinorgrid()
   * @see #getAxe()
   * @generated
   */
  EReference getAxe_Minorgrid();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Line <em>Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Line</em>'.
   * @see org.xtext.example.mydsl.rDsl.Line
   * @generated
   */
  EClass getLine();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Line#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.Line#getValue()
   * @see #getLine()
   * @generated
   */
  EReference getLine_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.ChartGrid <em>Chart Grid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chart Grid</em>'.
   * @see org.xtext.example.mydsl.rDsl.ChartGrid
   * @generated
   */
  EClass getChartGrid();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.ChartGrid#getScale <em>Scale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scale</em>'.
   * @see org.xtext.example.mydsl.rDsl.ChartGrid#getScale()
   * @see #getChartGrid()
   * @generated
   */
  EAttribute getChartGrid_Scale();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.ChartGrid#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.ChartGrid#getValue()
   * @see #getChartGrid()
   * @generated
   */
  EReference getChartGrid_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.ChartGrid#getTick <em>Tick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tick</em>'.
   * @see org.xtext.example.mydsl.rDsl.ChartGrid#getTick()
   * @see #getChartGrid()
   * @generated
   */
  EReference getChartGrid_Tick();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Tick <em>Tick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tick</em>'.
   * @see org.xtext.example.mydsl.rDsl.Tick
   * @generated
   */
  EClass getTick();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Tick#getPlace <em>Place</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Place</em>'.
   * @see org.xtext.example.mydsl.rDsl.Tick#getPlace()
   * @see #getTick()
   * @generated
   */
  EAttribute getTick_Place();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Tick#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.Tick#getValue()
   * @see #getTick()
   * @generated
   */
  EReference getTick_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.ColorPalette <em>Color Palette</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color Palette</em>'.
   * @see org.xtext.example.mydsl.rDsl.ColorPalette
   * @generated
   */
  EClass getColorPalette();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.ColorPalette#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.rDsl.ColorPalette#getName()
   * @see #getColorPalette()
   * @generated
   */
  EAttribute getColorPalette_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.ColorPalette#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.ColorPalette#getValue()
   * @see #getColorPalette()
   * @generated
   */
  EReference getColorPalette_Value();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.rDsl.ColorPalette#getLinkto <em>Linkto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Linkto</em>'.
   * @see org.xtext.example.mydsl.rDsl.ColorPalette#getLinkto()
   * @see #getColorPalette()
   * @generated
   */
  EReference getColorPalette_Linkto();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Place <em>Place</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Place</em>'.
   * @see org.xtext.example.mydsl.rDsl.Place
   * @generated
   */
  EClass getPlace();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Place#getPosition <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Position</em>'.
   * @see org.xtext.example.mydsl.rDsl.Place#getPosition()
   * @see #getPlace()
   * @generated
   */
  EAttribute getPlace_Position();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Place#getAnchor <em>Anchor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Anchor</em>'.
   * @see org.xtext.example.mydsl.rDsl.Place#getAnchor()
   * @see #getPlace()
   * @generated
   */
  EAttribute getPlace_Anchor();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Title <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Title</em>'.
   * @see org.xtext.example.mydsl.rDsl.Title
   * @generated
   */
  EClass getTitle();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Title#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.Title#getValue()
   * @see #getTitle()
   * @generated
   */
  EAttribute getTitle_Value();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Title#getPlace <em>Place</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Place</em>'.
   * @see org.xtext.example.mydsl.rDsl.Title#getPlace()
   * @see #getTitle()
   * @generated
   */
  EAttribute getTitle_Place();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Title#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see org.xtext.example.mydsl.rDsl.Title#getProperties()
   * @see #getTitle()
   * @generated
   */
  EReference getTitle_Properties();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.ChartElementProperties <em>Chart Element Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chart Element Properties</em>'.
   * @see org.xtext.example.mydsl.rDsl.ChartElementProperties
   * @generated
   */
  EClass getChartElementProperties();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.ChartElementProperties#getPadding <em>Padding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Padding</em>'.
   * @see org.xtext.example.mydsl.rDsl.ChartElementProperties#getPadding()
   * @see #getChartElementProperties()
   * @generated
   */
  EReference getChartElementProperties_Padding();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.ChartElementProperties#getBorder <em>Border</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Border</em>'.
   * @see org.xtext.example.mydsl.rDsl.ChartElementProperties#getBorder()
   * @see #getChartElementProperties()
   * @generated
   */
  EReference getChartElementProperties_Border();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.ChartElementProperties#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Visibility</em>'.
   * @see org.xtext.example.mydsl.rDsl.ChartElementProperties#getVisibility()
   * @see #getChartElementProperties()
   * @generated
   */
  EReference getChartElementProperties_Visibility();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.ChartElementProperties#getFont <em>Font</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Font</em>'.
   * @see org.xtext.example.mydsl.rDsl.ChartElementProperties#getFont()
   * @see #getChartElementProperties()
   * @generated
   */
  EReference getChartElementProperties_Font();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.ChartElementProperties#getFontSize <em>Font Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Font Size</em>'.
   * @see org.xtext.example.mydsl.rDsl.ChartElementProperties#getFontSize()
   * @see #getChartElementProperties()
   * @generated
   */
  EReference getChartElementProperties_FontSize();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.ChartElementProperties#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Color</em>'.
   * @see org.xtext.example.mydsl.rDsl.ChartElementProperties#getColor()
   * @see #getChartElementProperties()
   * @generated
   */
  EReference getChartElementProperties_Color();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.ChartElementProperties#getBackgroundColor <em>Background Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Background Color</em>'.
   * @see org.xtext.example.mydsl.rDsl.ChartElementProperties#getBackgroundColor()
   * @see #getChartElementProperties()
   * @generated
   */
  EReference getChartElementProperties_BackgroundColor();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.ChartElementProperties#getTextStyle <em>Text Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text Style</em>'.
   * @see org.xtext.example.mydsl.rDsl.ChartElementProperties#getTextStyle()
   * @see #getChartElementProperties()
   * @generated
   */
  EReference getChartElementProperties_TextStyle();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.ChartElementProperties#getHAlign <em>HAlign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>HAlign</em>'.
   * @see org.xtext.example.mydsl.rDsl.ChartElementProperties#getHAlign()
   * @see #getChartElementProperties()
   * @generated
   */
  EReference getChartElementProperties_HAlign();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.ChartElementProperties#getVAlign <em>VAlign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>VAlign</em>'.
   * @see org.xtext.example.mydsl.rDsl.ChartElementProperties#getVAlign()
   * @see #getChartElementProperties()
   * @generated
   */
  EReference getChartElementProperties_VAlign();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.ChartElementProperties#getWhiteSpace <em>White Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>White Space</em>'.
   * @see org.xtext.example.mydsl.rDsl.ChartElementProperties#getWhiteSpace()
   * @see #getChartElementProperties()
   * @generated
   */
  EReference getChartElementProperties_WhiteSpace();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.ChartElementProperties#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Style</em>'.
   * @see org.xtext.example.mydsl.rDsl.ChartElementProperties#getStyle()
   * @see #getChartElementProperties()
   * @generated
   */
  EReference getChartElementProperties_Style();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.ChartElementProperties#getDisplay <em>Display</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Display</em>'.
   * @see org.xtext.example.mydsl.rDsl.ChartElementProperties#getDisplay()
   * @see #getChartElementProperties()
   * @generated
   */
  EReference getChartElementProperties_Display();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.List <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List</em>'.
   * @see org.xtext.example.mydsl.rDsl.List
   * @generated
   */
  EClass getList();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.List#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.rDsl.List#getName()
   * @see #getList()
   * @generated
   */
  EAttribute getList_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.List#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.xtext.example.mydsl.rDsl.List#getProperties()
   * @see #getList()
   * @generated
   */
  EReference getList_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.List#getHeaderelements <em>Headerelements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Headerelements</em>'.
   * @see org.xtext.example.mydsl.rDsl.List#getHeaderelements()
   * @see #getList()
   * @generated
   */
  EReference getList_Headerelements();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.List#getDetailelements <em>Detailelements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Detailelements</em>'.
   * @see org.xtext.example.mydsl.rDsl.List#getDetailelements()
   * @see #getList()
   * @generated
   */
  EReference getList_Detailelements();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.List#getFooterelements <em>Footerelements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Footerelements</em>'.
   * @see org.xtext.example.mydsl.rDsl.List#getFooterelements()
   * @see #getList()
   * @generated
   */
  EReference getList_Footerelements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Grid <em>Grid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grid</em>'.
   * @see org.xtext.example.mydsl.rDsl.Grid
   * @generated
   */
  EClass getGrid();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Grid#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.rDsl.Grid#getName()
   * @see #getGrid()
   * @generated
   */
  EAttribute getGrid_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.Grid#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.xtext.example.mydsl.rDsl.Grid#getProperties()
   * @see #getGrid()
   * @generated
   */
  EReference getGrid_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.Grid#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see org.xtext.example.mydsl.rDsl.Grid#getColumns()
   * @see #getGrid()
   * @generated
   */
  EReference getGrid_Columns();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.Grid#getRows <em>Rows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rows</em>'.
   * @see org.xtext.example.mydsl.rDsl.Grid#getRows()
   * @see #getGrid()
   * @generated
   */
  EReference getGrid_Rows();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Table <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table</em>'.
   * @see org.xtext.example.mydsl.rDsl.Table
   * @generated
   */
  EClass getTable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Table#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.rDsl.Table#getName()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.Table#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.xtext.example.mydsl.rDsl.Table#getProperties()
   * @see #getTable()
   * @generated
   */
  EReference getTable_Properties();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.rDsl.Table#getDataset <em>Dataset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dataset</em>'.
   * @see org.xtext.example.mydsl.rDsl.Table#getDataset()
   * @see #getTable()
   * @generated
   */
  EReference getTable_Dataset();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.Table#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see org.xtext.example.mydsl.rDsl.Table#getColumns()
   * @see #getTable()
   * @generated
   */
  EReference getTable_Columns();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.Table#getHeaderrows <em>Headerrows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Headerrows</em>'.
   * @see org.xtext.example.mydsl.rDsl.Table#getHeaderrows()
   * @see #getTable()
   * @generated
   */
  EReference getTable_Headerrows();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.Table#getDetailrows <em>Detailrows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Detailrows</em>'.
   * @see org.xtext.example.mydsl.rDsl.Table#getDetailrows()
   * @see #getTable()
   * @generated
   */
  EReference getTable_Detailrows();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.Table#getFooterrows <em>Footerrows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Footerrows</em>'.
   * @see org.xtext.example.mydsl.rDsl.Table#getFooterrows()
   * @see #getTable()
   * @generated
   */
  EReference getTable_Footerrows();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.CrossTable <em>Cross Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cross Table</em>'.
   * @see org.xtext.example.mydsl.rDsl.CrossTable
   * @generated
   */
  EClass getCrossTable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.CrossTable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.rDsl.CrossTable#getName()
   * @see #getCrossTable()
   * @generated
   */
  EAttribute getCrossTable_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.CrossTable#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.xtext.example.mydsl.rDsl.CrossTable#getProperties()
   * @see #getCrossTable()
   * @generated
   */
  EReference getCrossTable_Properties();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Column <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column</em>'.
   * @see org.xtext.example.mydsl.rDsl.Column
   * @generated
   */
  EClass getColumn();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Column#getOrder <em>Order</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Order</em>'.
   * @see org.xtext.example.mydsl.rDsl.Column#getOrder()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Order();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.Column#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.xtext.example.mydsl.rDsl.Column#getProperties()
   * @see #getColumn()
   * @generated
   */
  EReference getColumn_Properties();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Row <em>Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Row</em>'.
   * @see org.xtext.example.mydsl.rDsl.Row
   * @generated
   */
  EClass getRow();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Row#getOrder <em>Order</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Order</em>'.
   * @see org.xtext.example.mydsl.rDsl.Row#getOrder()
   * @see #getRow()
   * @generated
   */
  EAttribute getRow_Order();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.Row#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.xtext.example.mydsl.rDsl.Row#getProperties()
   * @see #getRow()
   * @generated
   */
  EReference getRow_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.Row#getCells <em>Cells</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cells</em>'.
   * @see org.xtext.example.mydsl.rDsl.Row#getCells()
   * @see #getRow()
   * @generated
   */
  EReference getRow_Cells();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Cell <em>Cell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cell</em>'.
   * @see org.xtext.example.mydsl.rDsl.Cell
   * @generated
   */
  EClass getCell();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Cell#getOrder <em>Order</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Order</em>'.
   * @see org.xtext.example.mydsl.rDsl.Cell#getOrder()
   * @see #getCell()
   * @generated
   */
  EAttribute getCell_Order();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.Cell#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.xtext.example.mydsl.rDsl.Cell#getProperties()
   * @see #getCell()
   * @generated
   */
  EReference getCell_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.Cell#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.example.mydsl.rDsl.Cell#getElements()
   * @see #getCell()
   * @generated
   */
  EReference getCell_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.PageProperties <em>Page Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page Properties</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageProperties
   * @generated
   */
  EClass getPageProperties();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.PageProperties#getFont <em>Font</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Font</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageProperties#getFont()
   * @see #getPageProperties()
   * @generated
   */
  EReference getPageProperties_Font();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.PageProperties#getFontSize <em>Font Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Font Size</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageProperties#getFontSize()
   * @see #getPageProperties()
   * @generated
   */
  EReference getPageProperties_FontSize();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.PageProperties#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Color</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageProperties#getColor()
   * @see #getPageProperties()
   * @generated
   */
  EReference getPageProperties_Color();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.PageProperties#getBackgroundColor <em>Background Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Background Color</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageProperties#getBackgroundColor()
   * @see #getPageProperties()
   * @generated
   */
  EReference getPageProperties_BackgroundColor();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.PageProperties#getTextStyle <em>Text Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text Style</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageProperties#getTextStyle()
   * @see #getPageProperties()
   * @generated
   */
  EReference getPageProperties_TextStyle();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.PageProperties#getHAlign <em>HAlign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>HAlign</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageProperties#getHAlign()
   * @see #getPageProperties()
   * @generated
   */
  EReference getPageProperties_HAlign();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.PageProperties#getVAlign <em>VAlign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>VAlign</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageProperties#getVAlign()
   * @see #getPageProperties()
   * @generated
   */
  EReference getPageProperties_VAlign();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.PageProperties#getWhiteSpace <em>White Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>White Space</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageProperties#getWhiteSpace()
   * @see #getPageProperties()
   * @generated
   */
  EReference getPageProperties_WhiteSpace();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.PageProperties#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Style</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageProperties#getStyle()
   * @see #getPageProperties()
   * @generated
   */
  EReference getPageProperties_Style();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.PageProperties#getDisplay <em>Display</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Display</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageProperties#getDisplay()
   * @see #getPageProperties()
   * @generated
   */
  EReference getPageProperties_Display();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.PageProperties#getBorder <em>Border</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Border</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageProperties#getBorder()
   * @see #getPageProperties()
   * @generated
   */
  EReference getPageProperties_Border();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.PageProperties#getPadding <em>Padding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Padding</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageProperties#getPadding()
   * @see #getPageProperties()
   * @generated
   */
  EReference getPageProperties_Padding();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.PageProperties#getMargin <em>Margin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Margin</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageProperties#getMargin()
   * @see #getPageProperties()
   * @generated
   */
  EReference getPageProperties_Margin();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.PageProperties#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Visibility</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageProperties#getVisibility()
   * @see #getPageProperties()
   * @generated
   */
  EReference getPageProperties_Visibility();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.PageProperties#getPagebreak <em>Pagebreak</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pagebreak</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageProperties#getPagebreak()
   * @see #getPageProperties()
   * @generated
   */
  EReference getPageProperties_Pagebreak();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.PageProperties#getToc <em>Toc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Toc</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageProperties#getToc()
   * @see #getPageProperties()
   * @generated
   */
  EReference getPageProperties_Toc();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.PageProperties#getBookmark <em>Bookmark</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bookmark</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageProperties#getBookmark()
   * @see #getPageProperties()
   * @generated
   */
  EReference getPageProperties_Bookmark();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.PageProperties#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Width</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageProperties#getWidth()
   * @see #getPageProperties()
   * @generated
   */
  EReference getPageProperties_Width();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.PageProperties#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Height</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageProperties#getHeight()
   * @see #getPageProperties()
   * @generated
   */
  EReference getPageProperties_Height();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.LabelProperties <em>Label Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label Properties</em>'.
   * @see org.xtext.example.mydsl.rDsl.LabelProperties
   * @generated
   */
  EClass getLabelProperties();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.LabelProperties#getFont <em>Font</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Font</em>'.
   * @see org.xtext.example.mydsl.rDsl.LabelProperties#getFont()
   * @see #getLabelProperties()
   * @generated
   */
  EReference getLabelProperties_Font();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.LabelProperties#getFontSize <em>Font Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Font Size</em>'.
   * @see org.xtext.example.mydsl.rDsl.LabelProperties#getFontSize()
   * @see #getLabelProperties()
   * @generated
   */
  EReference getLabelProperties_FontSize();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.LabelProperties#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Color</em>'.
   * @see org.xtext.example.mydsl.rDsl.LabelProperties#getColor()
   * @see #getLabelProperties()
   * @generated
   */
  EReference getLabelProperties_Color();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.LabelProperties#getBackgroundColor <em>Background Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Background Color</em>'.
   * @see org.xtext.example.mydsl.rDsl.LabelProperties#getBackgroundColor()
   * @see #getLabelProperties()
   * @generated
   */
  EReference getLabelProperties_BackgroundColor();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.LabelProperties#getTextStyle <em>Text Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text Style</em>'.
   * @see org.xtext.example.mydsl.rDsl.LabelProperties#getTextStyle()
   * @see #getLabelProperties()
   * @generated
   */
  EReference getLabelProperties_TextStyle();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.LabelProperties#getHAlign <em>HAlign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>HAlign</em>'.
   * @see org.xtext.example.mydsl.rDsl.LabelProperties#getHAlign()
   * @see #getLabelProperties()
   * @generated
   */
  EReference getLabelProperties_HAlign();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.LabelProperties#getVAlign <em>VAlign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>VAlign</em>'.
   * @see org.xtext.example.mydsl.rDsl.LabelProperties#getVAlign()
   * @see #getLabelProperties()
   * @generated
   */
  EReference getLabelProperties_VAlign();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.LabelProperties#getWhiteSpace <em>White Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>White Space</em>'.
   * @see org.xtext.example.mydsl.rDsl.LabelProperties#getWhiteSpace()
   * @see #getLabelProperties()
   * @generated
   */
  EReference getLabelProperties_WhiteSpace();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.LabelProperties#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Style</em>'.
   * @see org.xtext.example.mydsl.rDsl.LabelProperties#getStyle()
   * @see #getLabelProperties()
   * @generated
   */
  EReference getLabelProperties_Style();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.LabelProperties#getDisplay <em>Display</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Display</em>'.
   * @see org.xtext.example.mydsl.rDsl.LabelProperties#getDisplay()
   * @see #getLabelProperties()
   * @generated
   */
  EReference getLabelProperties_Display();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.LabelProperties#getBorder <em>Border</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Border</em>'.
   * @see org.xtext.example.mydsl.rDsl.LabelProperties#getBorder()
   * @see #getLabelProperties()
   * @generated
   */
  EReference getLabelProperties_Border();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.LabelProperties#getPadding <em>Padding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Padding</em>'.
   * @see org.xtext.example.mydsl.rDsl.LabelProperties#getPadding()
   * @see #getLabelProperties()
   * @generated
   */
  EReference getLabelProperties_Padding();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.LabelProperties#getMargin <em>Margin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Margin</em>'.
   * @see org.xtext.example.mydsl.rDsl.LabelProperties#getMargin()
   * @see #getLabelProperties()
   * @generated
   */
  EReference getLabelProperties_Margin();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.LabelProperties#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Visibility</em>'.
   * @see org.xtext.example.mydsl.rDsl.LabelProperties#getVisibility()
   * @see #getLabelProperties()
   * @generated
   */
  EReference getLabelProperties_Visibility();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.LabelProperties#getPagebreak <em>Pagebreak</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pagebreak</em>'.
   * @see org.xtext.example.mydsl.rDsl.LabelProperties#getPagebreak()
   * @see #getLabelProperties()
   * @generated
   */
  EReference getLabelProperties_Pagebreak();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.LabelProperties#getToc <em>Toc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Toc</em>'.
   * @see org.xtext.example.mydsl.rDsl.LabelProperties#getToc()
   * @see #getLabelProperties()
   * @generated
   */
  EReference getLabelProperties_Toc();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.LabelProperties#getBookmark <em>Bookmark</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bookmark</em>'.
   * @see org.xtext.example.mydsl.rDsl.LabelProperties#getBookmark()
   * @see #getLabelProperties()
   * @generated
   */
  EReference getLabelProperties_Bookmark();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.LabelProperties#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Width</em>'.
   * @see org.xtext.example.mydsl.rDsl.LabelProperties#getWidth()
   * @see #getLabelProperties()
   * @generated
   */
  EReference getLabelProperties_Width();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.LabelProperties#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Height</em>'.
   * @see org.xtext.example.mydsl.rDsl.LabelProperties#getHeight()
   * @see #getLabelProperties()
   * @generated
   */
  EReference getLabelProperties_Height();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.LabelProperties#getAlttext <em>Alttext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alttext</em>'.
   * @see org.xtext.example.mydsl.rDsl.LabelProperties#getAlttext()
   * @see #getLabelProperties()
   * @generated
   */
  EReference getLabelProperties_Alttext();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Font <em>Font</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font</em>'.
   * @see org.xtext.example.mydsl.rDsl.Font
   * @generated
   */
  EClass getFont();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Font#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.rDsl.Font#getName()
   * @see #getFont()
   * @generated
   */
  EAttribute getFont_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Font#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.Font#getValue()
   * @see #getFont()
   * @generated
   */
  EAttribute getFont_Value();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.rDsl.Font#getLinkto <em>Linkto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Linkto</em>'.
   * @see org.xtext.example.mydsl.rDsl.Font#getLinkto()
   * @see #getFont()
   * @generated
   */
  EReference getFont_Linkto();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.FontSize <em>Font Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Size</em>'.
   * @see org.xtext.example.mydsl.rDsl.FontSize
   * @generated
   */
  EClass getFontSize();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.FontSize#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.rDsl.FontSize#getName()
   * @see #getFontSize()
   * @generated
   */
  EAttribute getFontSize_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.FontSize#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.FontSize#getValue()
   * @see #getFontSize()
   * @generated
   */
  EReference getFontSize_Value();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.rDsl.FontSize#getLinkto <em>Linkto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Linkto</em>'.
   * @see org.xtext.example.mydsl.rDsl.FontSize#getLinkto()
   * @see #getFontSize()
   * @generated
   */
  EReference getFontSize_Linkto();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.SizeValueUnit <em>Size Value Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Size Value Unit</em>'.
   * @see org.xtext.example.mydsl.rDsl.SizeValueUnit
   * @generated
   */
  EClass getSizeValueUnit();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.SizeValueUnit#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.SizeValueUnit#getValue()
   * @see #getSizeValueUnit()
   * @generated
   */
  EAttribute getSizeValueUnit_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.SizeValue <em>Size Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Size Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.SizeValue
   * @generated
   */
  EClass getSizeValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.SizeValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.SizeValue#getValue()
   * @see #getSizeValue()
   * @generated
   */
  EAttribute getSizeValue_Value();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.SizeValue#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see org.xtext.example.mydsl.rDsl.SizeValue#getUnit()
   * @see #getSizeValue()
   * @generated
   */
  EAttribute getSizeValue_Unit();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.SizeValuePercent <em>Size Value Percent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Size Value Percent</em>'.
   * @see org.xtext.example.mydsl.rDsl.SizeValuePercent
   * @generated
   */
  EClass getSizeValuePercent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.SizeValuePercent#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.SizeValuePercent#getValue()
   * @see #getSizeValuePercent()
   * @generated
   */
  EAttribute getSizeValuePercent_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color</em>'.
   * @see org.xtext.example.mydsl.rDsl.Color
   * @generated
   */
  EClass getColor();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.StringColor <em>String Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Color</em>'.
   * @see org.xtext.example.mydsl.rDsl.StringColor
   * @generated
   */
  EClass getStringColor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.StringColor#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.StringColor#getValue()
   * @see #getStringColor()
   * @generated
   */
  EAttribute getStringColor_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.HexColor <em>Hex Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hex Color</em>'.
   * @see org.xtext.example.mydsl.rDsl.HexColor
   * @generated
   */
  EClass getHexColor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.HexColor#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.HexColor#getValue()
   * @see #getHexColor()
   * @generated
   */
  EAttribute getHexColor_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.RgbColor <em>Rgb Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rgb Color</em>'.
   * @see org.xtext.example.mydsl.rDsl.RgbColor
   * @generated
   */
  EClass getRgbColor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.RgbColor#getR <em>R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R</em>'.
   * @see org.xtext.example.mydsl.rDsl.RgbColor#getR()
   * @see #getRgbColor()
   * @generated
   */
  EAttribute getRgbColor_R();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.RgbColor#getG <em>G</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>G</em>'.
   * @see org.xtext.example.mydsl.rDsl.RgbColor#getG()
   * @see #getRgbColor()
   * @generated
   */
  EAttribute getRgbColor_G();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.RgbColor#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>B</em>'.
   * @see org.xtext.example.mydsl.rDsl.RgbColor#getB()
   * @see #getRgbColor()
   * @generated
   */
  EAttribute getRgbColor_B();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.TextStyle <em>Text Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Style</em>'.
   * @see org.xtext.example.mydsl.rDsl.TextStyle
   * @generated
   */
  EClass getTextStyle();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.TextStyle#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.rDsl.TextStyle#getName()
   * @see #getTextStyle()
   * @generated
   */
  EAttribute getTextStyle_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.TextStyle#isI <em>I</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>I</em>'.
   * @see org.xtext.example.mydsl.rDsl.TextStyle#isI()
   * @see #getTextStyle()
   * @generated
   */
  EAttribute getTextStyle_I();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.TextStyle#isB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>B</em>'.
   * @see org.xtext.example.mydsl.rDsl.TextStyle#isB()
   * @see #getTextStyle()
   * @generated
   */
  EAttribute getTextStyle_B();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.TextStyle#isU <em>U</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>U</em>'.
   * @see org.xtext.example.mydsl.rDsl.TextStyle#isU()
   * @see #getTextStyle()
   * @generated
   */
  EAttribute getTextStyle_U();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.TextStyle#isT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>T</em>'.
   * @see org.xtext.example.mydsl.rDsl.TextStyle#isT()
   * @see #getTextStyle()
   * @generated
   */
  EAttribute getTextStyle_T();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.HAlignment <em>HAlignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>HAlignment</em>'.
   * @see org.xtext.example.mydsl.rDsl.HAlignment
   * @generated
   */
  EClass getHAlignment();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.HAlignment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.rDsl.HAlignment#getName()
   * @see #getHAlignment()
   * @generated
   */
  EAttribute getHAlignment_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.HAlignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.HAlignment#getValue()
   * @see #getHAlignment()
   * @generated
   */
  EAttribute getHAlignment_Value();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.rDsl.HAlignment#getLinkto <em>Linkto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Linkto</em>'.
   * @see org.xtext.example.mydsl.rDsl.HAlignment#getLinkto()
   * @see #getHAlignment()
   * @generated
   */
  EReference getHAlignment_Linkto();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.VAlignment <em>VAlignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>VAlignment</em>'.
   * @see org.xtext.example.mydsl.rDsl.VAlignment
   * @generated
   */
  EClass getVAlignment();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.VAlignment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.rDsl.VAlignment#getName()
   * @see #getVAlignment()
   * @generated
   */
  EAttribute getVAlignment_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.VAlignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.VAlignment#getValue()
   * @see #getVAlignment()
   * @generated
   */
  EAttribute getVAlignment_Value();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.rDsl.VAlignment#getLinkto <em>Linkto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Linkto</em>'.
   * @see org.xtext.example.mydsl.rDsl.VAlignment#getLinkto()
   * @see #getVAlignment()
   * @generated
   */
  EReference getVAlignment_Linkto();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Whitespace <em>Whitespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Whitespace</em>'.
   * @see org.xtext.example.mydsl.rDsl.Whitespace
   * @generated
   */
  EClass getWhitespace();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Whitespace#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.rDsl.Whitespace#getName()
   * @see #getWhitespace()
   * @generated
   */
  EAttribute getWhitespace_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Whitespace#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.Whitespace#getValue()
   * @see #getWhitespace()
   * @generated
   */
  EAttribute getWhitespace_Value();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.rDsl.Whitespace#getLinkto <em>Linkto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Linkto</em>'.
   * @see org.xtext.example.mydsl.rDsl.Whitespace#getLinkto()
   * @see #getWhitespace()
   * @generated
   */
  EReference getWhitespace_Linkto();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Display <em>Display</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Display</em>'.
   * @see org.xtext.example.mydsl.rDsl.Display
   * @generated
   */
  EClass getDisplay();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Display#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.rDsl.Display#getName()
   * @see #getDisplay()
   * @generated
   */
  EAttribute getDisplay_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Display#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.Display#getValue()
   * @see #getDisplay()
   * @generated
   */
  EAttribute getDisplay_Value();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.rDsl.Display#getLinkto <em>Linkto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Linkto</em>'.
   * @see org.xtext.example.mydsl.rDsl.Display#getLinkto()
   * @see #getDisplay()
   * @generated
   */
  EReference getDisplay_Linkto();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Border <em>Border</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Border</em>'.
   * @see org.xtext.example.mydsl.rDsl.Border
   * @generated
   */
  EClass getBorder();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Border#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.rDsl.Border#getName()
   * @see #getBorder()
   * @generated
   */
  EAttribute getBorder_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Border#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.Border#getValue()
   * @see #getBorder()
   * @generated
   */
  EReference getBorder_Value();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.rDsl.Border#getLinkto <em>Linkto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Linkto</em>'.
   * @see org.xtext.example.mydsl.rDsl.Border#getLinkto()
   * @see #getBorder()
   * @generated
   */
  EReference getBorder_Linkto();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.BorderAll <em>Border All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Border All</em>'.
   * @see org.xtext.example.mydsl.rDsl.BorderAll
   * @generated
   */
  EClass getBorderAll();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.BorderSide <em>Border Side</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Border Side</em>'.
   * @see org.xtext.example.mydsl.rDsl.BorderSide
   * @generated
   */
  EClass getBorderSide();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.BorderSide#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.mydsl.rDsl.BorderSide#getRight()
   * @see #getBorderSide()
   * @generated
   */
  EReference getBorderSide_Right();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.BorderSide#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.mydsl.rDsl.BorderSide#getLeft()
   * @see #getBorderSide()
   * @generated
   */
  EReference getBorderSide_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.BorderSide#getTop <em>Top</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Top</em>'.
   * @see org.xtext.example.mydsl.rDsl.BorderSide#getTop()
   * @see #getBorderSide()
   * @generated
   */
  EReference getBorderSide_Top();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.BorderSide#getBottom <em>Bottom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bottom</em>'.
   * @see org.xtext.example.mydsl.rDsl.BorderSide#getBottom()
   * @see #getBorderSide()
   * @generated
   */
  EReference getBorderSide_Bottom();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.BorderLine <em>Border Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Border Line</em>'.
   * @see org.xtext.example.mydsl.rDsl.BorderLine
   * @generated
   */
  EClass getBorderLine();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.BorderLine#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see org.xtext.example.mydsl.rDsl.BorderLine#getStyle()
   * @see #getBorderLine()
   * @generated
   */
  EAttribute getBorderLine_Style();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.BorderLine#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Width</em>'.
   * @see org.xtext.example.mydsl.rDsl.BorderLine#getWidth()
   * @see #getBorderLine()
   * @generated
   */
  EReference getBorderLine_Width();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.BorderLine#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Color</em>'.
   * @see org.xtext.example.mydsl.rDsl.BorderLine#getColor()
   * @see #getBorderLine()
   * @generated
   */
  EReference getBorderLine_Color();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.BorderWidth <em>Border Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Border Width</em>'.
   * @see org.xtext.example.mydsl.rDsl.BorderWidth
   * @generated
   */
  EClass getBorderWidth();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.BorderWidth#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.BorderWidth#getValue()
   * @see #getBorderWidth()
   * @generated
   */
  EReference getBorderWidth_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.WidthTypeValue <em>Width Type Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Width Type Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.WidthTypeValue
   * @generated
   */
  EClass getWidthTypeValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.WidthTypeValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.WidthTypeValue#getValue()
   * @see #getWidthTypeValue()
   * @generated
   */
  EAttribute getWidthTypeValue_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Padding <em>Padding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Padding</em>'.
   * @see org.xtext.example.mydsl.rDsl.Padding
   * @generated
   */
  EClass getPadding();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.IndentAll <em>Indent All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Indent All</em>'.
   * @see org.xtext.example.mydsl.rDsl.IndentAll
   * @generated
   */
  EClass getIndentAll();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.IndentSide <em>Indent Side</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Indent Side</em>'.
   * @see org.xtext.example.mydsl.rDsl.IndentSide
   * @generated
   */
  EClass getIndentSide();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.IndentSide#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.mydsl.rDsl.IndentSide#getRight()
   * @see #getIndentSide()
   * @generated
   */
  EReference getIndentSide_Right();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.IndentSide#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.mydsl.rDsl.IndentSide#getLeft()
   * @see #getIndentSide()
   * @generated
   */
  EReference getIndentSide_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.IndentSide#getTop <em>Top</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Top</em>'.
   * @see org.xtext.example.mydsl.rDsl.IndentSide#getTop()
   * @see #getIndentSide()
   * @generated
   */
  EReference getIndentSide_Top();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.IndentSide#getBottom <em>Bottom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bottom</em>'.
   * @see org.xtext.example.mydsl.rDsl.IndentSide#getBottom()
   * @see #getIndentSide()
   * @generated
   */
  EReference getIndentSide_Bottom();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.IndentValue <em>Indent Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Indent Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.IndentValue
   * @generated
   */
  EClass getIndentValue();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.IndentValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.IndentValue#getValue()
   * @see #getIndentValue()
   * @generated
   */
  EReference getIndentValue_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.PageBreak <em>Page Break</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page Break</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageBreak
   * @generated
   */
  EClass getPageBreak();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.PageBreak#getBefore <em>Before</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Before</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageBreak#getBefore()
   * @see #getPageBreak()
   * @generated
   */
  EAttribute getPageBreak_Before();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.PageBreak#getAfter <em>After</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>After</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageBreak#getAfter()
   * @see #getPageBreak()
   * @generated
   */
  EAttribute getPageBreak_After();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.PageBreak#getInside <em>Inside</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inside</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageBreak#getInside()
   * @see #getPageBreak()
   * @generated
   */
  EAttribute getPageBreak_Inside();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.PageBreak#getInterval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interval</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageBreak#getInterval()
   * @see #getPageBreak()
   * @generated
   */
  EReference getPageBreak_Interval();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.PageBreak#getRepeat <em>Repeat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Repeat</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageBreak#getRepeat()
   * @see #getPageBreak()
   * @generated
   */
  EReference getPageBreak_Repeat();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Visibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Visibility</em>'.
   * @see org.xtext.example.mydsl.rDsl.Visibility
   * @generated
   */
  EClass getVisibility();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Visibility#isShow <em>Show</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Show</em>'.
   * @see org.xtext.example.mydsl.rDsl.Visibility#isShow()
   * @see #getVisibility()
   * @generated
   */
  EAttribute getVisibility_Show();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.LegendVisibility <em>Legend Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Legend Visibility</em>'.
   * @see org.xtext.example.mydsl.rDsl.LegendVisibility
   * @generated
   */
  EClass getLegendVisibility();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.LegendVisibility#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.LegendVisibility#getValue()
   * @see #getLegendVisibility()
   * @generated
   */
  EAttribute getLegendVisibility_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.HideAll <em>Hide All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hide All</em>'.
   * @see org.xtext.example.mydsl.rDsl.HideAll
   * @generated
   */
  EClass getHideAll();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.HideAll#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.rDsl.HideAll#getExpression()
   * @see #getHideAll()
   * @generated
   */
  EReference getHideAll_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.HideAll#getFormat <em>Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Format</em>'.
   * @see org.xtext.example.mydsl.rDsl.HideAll#getFormat()
   * @see #getHideAll()
   * @generated
   */
  EAttribute getHideAll_Format();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.HideForOne <em>Hide For One</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hide For One</em>'.
   * @see org.xtext.example.mydsl.rDsl.HideForOne
   * @generated
   */
  EClass getHideForOne();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.HideForOne#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.HideForOne#getValue()
   * @see #getHideForOne()
   * @generated
   */
  EReference getHideForOne_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.HideForMore <em>Hide For More</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hide For More</em>'.
   * @see org.xtext.example.mydsl.rDsl.HideForMore
   * @generated
   */
  EClass getHideForMore();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.rDsl.HideForMore#getFormat <em>Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Format</em>'.
   * @see org.xtext.example.mydsl.rDsl.HideForMore#getFormat()
   * @see #getHideForMore()
   * @generated
   */
  EAttribute getHideForMore_Format();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.HideForMore#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.rDsl.HideForMore#getExpression()
   * @see #getHideForMore()
   * @generated
   */
  EReference getHideForMore_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.JSExpression <em>JS Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JS Expression</em>'.
   * @see org.xtext.example.mydsl.rDsl.JSExpression
   * @generated
   */
  EClass getJSExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.JSExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.JSExpression#getValue()
   * @see #getJSExpression()
   * @generated
   */
  EReference getJSExpression_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Toc <em>Toc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Toc</em>'.
   * @see org.xtext.example.mydsl.rDsl.Toc
   * @generated
   */
  EClass getToc();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Toc#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Style</em>'.
   * @see org.xtext.example.mydsl.rDsl.Toc#getStyle()
   * @see #getToc()
   * @generated
   */
  EReference getToc_Style();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Toc#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.Toc#getValue()
   * @see #getToc()
   * @generated
   */
  EReference getToc_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Bookmark <em>Bookmark</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bookmark</em>'.
   * @see org.xtext.example.mydsl.rDsl.Bookmark
   * @generated
   */
  EClass getBookmark();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Bookmark#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.rDsl.Bookmark#getExpression()
   * @see #getBookmark()
   * @generated
   */
  EReference getBookmark_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.StyleRef <em>Style Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Style Ref</em>'.
   * @see org.xtext.example.mydsl.rDsl.StyleRef
   * @generated
   */
  EClass getStyleRef();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.rDsl.StyleRef#getRefname <em>Refname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Refname</em>'.
   * @see org.xtext.example.mydsl.rDsl.StyleRef#getRefname()
   * @see #getStyleRef()
   * @generated
   */
  EReference getStyleRef_Refname();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Style <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Style</em>'.
   * @see org.xtext.example.mydsl.rDsl.Style
   * @generated
   */
  EClass getStyle();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.Style#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.rDsl.Style#getName()
   * @see #getStyle()
   * @generated
   */
  EAttribute getStyle_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.rDsl.Style#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.xtext.example.mydsl.rDsl.Style#getProperties()
   * @see #getStyle()
   * @generated
   */
  EReference getStyle_Properties();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Width <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Width</em>'.
   * @see org.xtext.example.mydsl.rDsl.Width
   * @generated
   */
  EClass getWidth();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Width#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.Width#getValue()
   * @see #getWidth()
   * @generated
   */
  EReference getWidth_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Height <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Height</em>'.
   * @see org.xtext.example.mydsl.rDsl.Height
   * @generated
   */
  EClass getHeight();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.Height#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.Height#getValue()
   * @see #getHeight()
   * @generated
   */
  EReference getHeight_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.AltText <em>Alt Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alt Text</em>'.
   * @see org.xtext.example.mydsl.rDsl.AltText
   * @generated
   */
  EClass getAltText();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.rDsl.AltText#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.rDsl.AltText#getExpression()
   * @see #getAltText()
   * @generated
   */
  EReference getAltText_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see org.xtext.example.mydsl.rDsl.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Literal</em>'.
   * @see org.xtext.example.mydsl.rDsl.IntLiteral
   * @generated
   */
  EClass getIntLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.IntLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.IntLiteral#getValue()
   * @see #getIntLiteral()
   * @generated
   */
  EAttribute getIntLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.FloatLiteral <em>Float Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Literal</em>'.
   * @see org.xtext.example.mydsl.rDsl.FloatLiteral
   * @generated
   */
  EClass getFloatLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.FloatLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.FloatLiteral#getValue()
   * @see #getFloatLiteral()
   * @generated
   */
  EAttribute getFloatLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.xtext.example.mydsl.rDsl.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see org.xtext.example.mydsl.rDsl.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.rDsl.BooleanLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.BooleanLiteral#getValue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.NullLiteral <em>Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Literal</em>'.
   * @see org.xtext.example.mydsl.rDsl.NullLiteral
   * @generated
   */
  EClass getNullLiteral();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.rDsl.ID <em>ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ID</em>'.
   * @see org.xtext.example.mydsl.rDsl.ID
   * @generated
   */
  EClass getID();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.rDsl.ID#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.ID#getValue()
   * @see #getID()
   * @generated
   */
  EReference getID_Value();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.STRING <em>STRING</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>STRING</em>'.
   * @see org.xtext.example.mydsl.rDsl.STRING
   * @generated
   */
  EEnum getSTRING();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.ChartSubType <em>Chart Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Chart Sub Type</em>'.
   * @see org.xtext.example.mydsl.rDsl.ChartSubType
   * @generated
   */
  EEnum getChartSubType();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.PositionType <em>Position Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Position Type</em>'.
   * @see org.xtext.example.mydsl.rDsl.PositionType
   * @generated
   */
  EEnum getPositionType();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.OrientationType <em>Orientation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Orientation Type</em>'.
   * @see org.xtext.example.mydsl.rDsl.OrientationType
   * @generated
   */
  EEnum getOrientationType();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.SizeUnit <em>Size Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Size Unit</em>'.
   * @see org.xtext.example.mydsl.rDsl.SizeUnit
   * @generated
   */
  EEnum getSizeUnit();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.LengthUnit <em>Length Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Length Unit</em>'.
   * @see org.xtext.example.mydsl.rDsl.LengthUnit
   * @generated
   */
  EEnum getLengthUnit();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.HalignmentType <em>Halignment Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Halignment Type</em>'.
   * @see org.xtext.example.mydsl.rDsl.HalignmentType
   * @generated
   */
  EEnum getHalignmentType();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.ValignmentType <em>Valignment Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Valignment Type</em>'.
   * @see org.xtext.example.mydsl.rDsl.ValignmentType
   * @generated
   */
  EEnum getValignmentType();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.WhitespaceType <em>Whitespace Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Whitespace Type</em>'.
   * @see org.xtext.example.mydsl.rDsl.WhitespaceType
   * @generated
   */
  EEnum getWhitespaceType();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.DisplayType <em>Display Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Display Type</em>'.
   * @see org.xtext.example.mydsl.rDsl.DisplayType
   * @generated
   */
  EEnum getDisplayType();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.BorderLineStyleType <em>Border Line Style Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Border Line Style Type</em>'.
   * @see org.xtext.example.mydsl.rDsl.BorderLineStyleType
   * @generated
   */
  EEnum getBorderLineStyleType();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.WidthType <em>Width Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Width Type</em>'.
   * @see org.xtext.example.mydsl.rDsl.WidthType
   * @generated
   */
  EEnum getWidthType();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.OutputFormatType <em>Output Format Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Output Format Type</em>'.
   * @see org.xtext.example.mydsl.rDsl.OutputFormatType
   * @generated
   */
  EEnum getOutputFormatType();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.PageBreakType <em>Page Break Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Page Break Type</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageBreakType
   * @generated
   */
  EEnum getPageBreakType();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.PageBreakValue <em>Page Break Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Page Break Value</em>'.
   * @see org.xtext.example.mydsl.rDsl.PageBreakValue
   * @generated
   */
  EEnum getPageBreakValue();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.SortType <em>Sort Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Sort Type</em>'.
   * @see org.xtext.example.mydsl.rDsl.SortType
   * @generated
   */
  EEnum getSortType();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.BorderType <em>Border Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Border Type</em>'.
   * @see org.xtext.example.mydsl.rDsl.BorderType
   * @generated
   */
  EEnum getBorderType();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.TargetType <em>Target Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Target Type</em>'.
   * @see org.xtext.example.mydsl.rDsl.TargetType
   * @generated
   */
  EEnum getTargetType();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.DrillThroughType <em>Drill Through Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Drill Through Type</em>'.
   * @see org.xtext.example.mydsl.rDsl.DrillThroughType
   * @generated
   */
  EEnum getDrillThroughType();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.ColorType <em>Color Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Color Type</em>'.
   * @see org.xtext.example.mydsl.rDsl.ColorType
   * @generated
   */
  EEnum getColorType();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.ParameterControlType <em>Parameter Control Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Parameter Control Type</em>'.
   * @see org.xtext.example.mydsl.rDsl.ParameterControlType
   * @generated
   */
  EEnum getParameterControlType();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.ParameterValueType <em>Parameter Value Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Parameter Value Type</em>'.
   * @see org.xtext.example.mydsl.rDsl.ParameterValueType
   * @generated
   */
  EEnum getParameterValueType();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.ParameterType <em>Parameter Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Parameter Type</em>'.
   * @see org.xtext.example.mydsl.rDsl.ParameterType
   * @generated
   */
  EEnum getParameterType();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Data Type</em>'.
   * @see org.xtext.example.mydsl.rDsl.DataType
   * @generated
   */
  EEnum getDataType();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.StaticParameterSort <em>Static Parameter Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Static Parameter Sort</em>'.
   * @see org.xtext.example.mydsl.rDsl.StaticParameterSort
   * @generated
   */
  EEnum getStaticParameterSort();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.rDsl.AggregatorFunction <em>Aggregator Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Aggregator Function</em>'.
   * @see org.xtext.example.mydsl.rDsl.AggregatorFunction
   * @generated
   */
  EEnum getAggregatorFunction();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RDslFactory getRDslFactory();

} //RDslPackage
