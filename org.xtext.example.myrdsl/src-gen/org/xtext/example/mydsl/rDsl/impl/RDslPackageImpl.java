/**
 */
package org.xtext.example.mydsl.rDsl.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.xtext.example.mydsl.rDsl.RDslFactory;
import org.xtext.example.mydsl.rDsl.RDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RDslPackageImpl extends EPackageImpl implements RDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected String packageFilename = "rDsl.ecore";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datasourcesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datasourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datasourceSampleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datasourceJDBCEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datasourceCSVEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datasetsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datasetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datasetFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleDatasetFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass computedDatasetFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parametersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass staticParameterValuesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass staticParameterValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dynamicParameterValuesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dynamicParameterValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stylesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pageSetupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reportElementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicElementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complexElementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dynamicTextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xDataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass legendEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xAxeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass yAxeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass axeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chartGridEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tickEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorPaletteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass placeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass titleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chartElementPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gridEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass crossTableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cellEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pagePropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontSizeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sizeValueUnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sizeValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sizeValuePercentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hexColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rgbColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textStyleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hAlignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vAlignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whitespaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass displayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass borderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass borderAllEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass borderSideEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass borderLineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass borderWidthEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass widthTypeValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paddingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indentAllEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indentSideEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indentValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pageBreakEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass visibilityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass legendVisibilityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hideAllEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hideForOneEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hideForMoreEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tocEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bookmarkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass styleRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass styleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass widthEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass heightEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass altTextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass floatLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nullLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass idEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum stringEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum chartSubTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum positionTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum orientationTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum sizeUnitEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum lengthUnitEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum halignmentTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum valignmentTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum whitespaceTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum displayTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum borderLineStyleTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum widthTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum outputFormatTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum pageBreakTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum pageBreakValueEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum sortTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum borderTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum targetTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum drillThroughTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum colorTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum parameterControlTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum parameterValueTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum parameterTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum dataTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum staticParameterSortEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum aggregatorFunctionEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RDslPackageImpl()
  {
    super(eNS_URI, RDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link RDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @generated
   */
  public static RDslPackage init()
  {
    if (isInited) return (RDslPackage)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI);

    // Obtain or create and register package
    RDslPackageImpl theRDslPackage = (RDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RDslPackageImpl());

    isInited = true;

    // Load packages
    theRDslPackage.loadPackage();

    // Fix loaded packages
    theRDslPackage.fixPackageContents();

    // Mark meta-data to indicate it can't be changed
    theRDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RDslPackage.eNS_URI, theRDslPackage);
    return theRDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoot()
  {
    if (rootEClass == null)
    {
      rootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(0);
    }
    return rootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoot_Root()
  {
        return (EReference)getRoot().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReport()
  {
    if (reportEClass == null)
    {
      reportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(1);
    }
    return reportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReport_Name()
  {
        return (EAttribute)getReport().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReport_Datasources()
  {
        return (EReference)getReport().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReport_Datasets()
  {
        return (EReference)getReport().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReport_Parameters()
  {
        return (EReference)getReport().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReport_Styles()
  {
        return (EReference)getReport().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReport_Pagesetup()
  {
        return (EReference)getReport().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReport_Body()
  {
        return (EReference)getReport().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReport_ElementProperties()
  {
        return (EReference)getReport().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getelementProperties()
  {
    if (elementPropertiesEClass == null)
    {
      elementPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(2);
    }
    return elementPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getelementProperties_Properties()
  {
        return (EReference)getelementProperties().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementProperty()
  {
    if (elementPropertyEClass == null)
    {
      elementPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(3);
    }
    return elementPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementProperty_Colorpalette()
  {
        return (EReference)getElementProperty().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementProperty_Font()
  {
        return (EReference)getElementProperty().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementProperty_FontSize()
  {
        return (EReference)getElementProperty().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatasources()
  {
    if (datasourcesEClass == null)
    {
      datasourcesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(4);
    }
    return datasourcesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatasources_Datasource()
  {
        return (EReference)getDatasources().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatasource()
  {
    if (datasourceEClass == null)
    {
      datasourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(5);
    }
    return datasourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatasource_Name()
  {
        return (EAttribute)getDatasource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatasource_Type()
  {
        return (EReference)getDatasource().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatasourceSample()
  {
    if (datasourceSampleEClass == null)
    {
      datasourceSampleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(6);
    }
    return datasourceSampleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatasourceSample_Type()
  {
        return (EAttribute)getDatasourceSample().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatasourceJDBC()
  {
    if (datasourceJDBCEClass == null)
    {
      datasourceJDBCEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(7);
    }
    return datasourceJDBCEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatasourceJDBC_Driver()
  {
        return (EAttribute)getDatasourceJDBC().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatasourceJDBC_Url()
  {
        return (EAttribute)getDatasourceJDBC().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatasourceJDBC_User()
  {
        return (EAttribute)getDatasourceJDBC().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatasourceJDBC_Password()
  {
        return (EAttribute)getDatasourceJDBC().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatasourceCSV()
  {
    if (datasourceCSVEClass == null)
    {
      datasourceCSVEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(8);
    }
    return datasourceCSVEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatasourceCSV_Url()
  {
        return (EAttribute)getDatasourceCSV().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatasourceCSV_Charset()
  {
        return (EAttribute)getDatasourceCSV().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatasourceCSV_Delimiter()
  {
        return (EAttribute)getDatasourceCSV().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatasourceCSV_Headerline()
  {
        return (EReference)getDatasourceCSV().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatasets()
  {
    if (datasetsEClass == null)
    {
      datasetsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(9);
    }
    return datasetsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatasets_Dataset()
  {
        return (EReference)getDatasets().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataset()
  {
    if (datasetEClass == null)
    {
      datasetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(10);
    }
    return datasetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataset_Name()
  {
        return (EAttribute)getDataset().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataset_Datasourceref()
  {
        return (EReference)getDataset().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataset_Field()
  {
        return (EReference)getDataset().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataset_Parameter()
  {
        return (EReference)getDataset().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataset_Query()
  {
        return (EAttribute)getDataset().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatasetField()
  {
    if (datasetFieldEClass == null)
    {
      datasetFieldEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(11);
    }
    return datasetFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatasetField_Name()
  {
        return (EAttribute)getDatasetField().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleDatasetField()
  {
    if (simpleDatasetFieldEClass == null)
    {
      simpleDatasetFieldEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(12);
    }
    return simpleDatasetFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComputedDatasetField()
  {
    if (computedDatasetFieldEClass == null)
    {
      computedDatasetFieldEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(13);
    }
    return computedDatasetFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComputedDatasetField_Aggregation()
  {
        return (EAttribute)getComputedDatasetField().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComputedDatasetField_Datatype()
  {
        return (EAttribute)getComputedDatasetField().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComputedDatasetField_Argument()
  {
        return (EReference)getComputedDatasetField().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComputedDatasetField_Filter()
  {
        return (EReference)getComputedDatasetField().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameters()
  {
    if (parametersEClass == null)
    {
      parametersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(14);
    }
    return parametersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameters_Parameter()
  {
        return (EReference)getParameters().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStaticParameterValues()
  {
    if (staticParameterValuesEClass == null)
    {
      staticParameterValuesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(15);
    }
    return staticParameterValuesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStaticParameterValues_Value()
  {
        return (EReference)getStaticParameterValues().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStaticParameterValues_Sort()
  {
        return (EAttribute)getStaticParameterValues().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStaticParameterValues_Sorttype()
  {
        return (EAttribute)getStaticParameterValues().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStaticParameterValue()
  {
    if (staticParameterValueEClass == null)
    {
      staticParameterValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(16);
    }
    return staticParameterValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStaticParameterValue_Label()
  {
        return (EAttribute)getStaticParameterValue().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStaticParameterValue_Value()
  {
        return (EAttribute)getStaticParameterValue().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStaticParameterValue_Default()
  {
        return (EAttribute)getStaticParameterValue().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDynamicParameterValues()
  {
    if (dynamicParameterValuesEClass == null)
    {
      dynamicParameterValuesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(17);
    }
    return dynamicParameterValuesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDynamicParameterValues_Value()
  {
        return (EReference)getDynamicParameterValues().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDynamicParameterValue()
  {
    if (dynamicParameterValueEClass == null)
    {
      dynamicParameterValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(18);
    }
    return dynamicParameterValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDynamicParameterValue_Dataset()
  {
        return (EReference)getDynamicParameterValue().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDynamicParameterValue_Label()
  {
        return (EReference)getDynamicParameterValue().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDynamicParameterValue_Value()
  {
        return (EReference)getDynamicParameterValue().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDynamicParameterValue_Default()
  {
        return (EReference)getDynamicParameterValue().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDynamicParameterValue_Sort()
  {
        return (EReference)getDynamicParameterValue().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDynamicParameterValue_Sorttype()
  {
        return (EAttribute)getDynamicParameterValue().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    if (parameterEClass == null)
    {
      parameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(19);
    }
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Controltype()
  {
        return (EAttribute)getParameter().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Name()
  {
        return (EAttribute)getParameter().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Promt()
  {
        return (EAttribute)getParameter().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Help()
  {
        return (EAttribute)getParameter().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Hide()
  {
        return (EReference)getParameter().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Required()
  {
        return (EReference)getParameter().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Duplicate()
  {
        return (EReference)getParameter().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Valuetype()
  {
        return (EAttribute)getParameter().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Paramtype()
  {
        return (EAttribute)getParameter().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Datatype()
  {
        return (EAttribute)getParameter().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Values()
  {
        return (EReference)getParameter().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterValue()
  {
    if (parameterValueEClass == null)
    {
      parameterValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(20);
    }
    return parameterValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStyles()
  {
    if (stylesEClass == null)
    {
      stylesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(21);
    }
    return stylesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStyles_Style()
  {
        return (EReference)getStyles().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPageSetup()
  {
    if (pageSetupEClass == null)
    {
      pageSetupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(22);
    }
    return pageSetupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageSetup_Properties()
  {
        return (EReference)getPageSetup().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBody()
  {
    if (bodyEClass == null)
    {
      bodyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(23);
    }
    return bodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBody_Elements()
  {
        return (EReference)getBody().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReportElements()
  {
    if (reportElementsEClass == null)
    {
      reportElementsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(24);
    }
    return reportElementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasicElements()
  {
    if (basicElementsEClass == null)
    {
      basicElementsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(25);
    }
    return basicElementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexElements()
  {
    if (complexElementsEClass == null)
    {
      complexElementsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(26);
    }
    return complexElementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabel()
  {
    if (labelEClass == null)
    {
      labelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(27);
    }
    return labelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabel_Name()
  {
        return (EAttribute)getLabel().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabel_Content()
  {
        return (EAttribute)getLabel().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabel_Properties()
  {
        return (EReference)getLabel().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getText()
  {
    if (textEClass == null)
    {
      textEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(28);
    }
    return textEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getText_Name()
  {
        return (EAttribute)getText().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getText_Content()
  {
        return (EAttribute)getText().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getText_Properties()
  {
        return (EReference)getText().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDynamicText()
  {
    if (dynamicTextEClass == null)
    {
      dynamicTextEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(29);
    }
    return dynamicTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDynamicText_Name()
  {
        return (EAttribute)getDynamicText().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDynamicText_Content()
  {
        return (EReference)getDynamicText().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDynamicText_Properties()
  {
        return (EReference)getDynamicText().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getxData()
  {
    if (xDataEClass == null)
    {
      xDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(30);
    }
    return xDataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getxData_Name()
  {
        return (EAttribute)getxData().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getxData_Content()
  {
        return (EReference)getxData().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getxData_Properties()
  {
        return (EReference)getxData().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImage()
  {
    if (imageEClass == null)
    {
      imageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(31);
    }
    return imageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImage_Name()
  {
        return (EAttribute)getImage().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImage_Type()
  {
        return (EAttribute)getImage().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImage_Content()
  {
        return (EReference)getImage().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImage_Properties()
  {
        return (EReference)getImage().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChart()
  {
    if (chartEClass == null)
    {
      chartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(32);
    }
    return chartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChart_Name()
  {
        return (EAttribute)getChart().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChart_Type()
  {
        return (EAttribute)getChart().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChart_Subtype()
  {
        return (EAttribute)getChart().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChart_Dataset()
  {
        return (EReference)getChart().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChart_Properties()
  {
        return (EReference)getChart().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChart_Title()
  {
        return (EReference)getChart().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChart_Legend()
  {
        return (EReference)getChart().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChart_Plot()
  {
        return (EAttribute)getChart().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChart_Axe()
  {
        return (EAttribute)getChart().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChart_Xaxe()
  {
        return (EReference)getChart().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChart_Yaxe()
  {
        return (EReference)getChart().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChart_Colorpalette()
  {
        return (EReference)getChart().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLegend()
  {
    if (legendEClass == null)
    {
      legendEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(33);
    }
    return legendEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLegend_Place()
  {
        return (EReference)getLegend().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLegend_Orientation()
  {
        return (EAttribute)getLegend().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLegend_Title()
  {
        return (EReference)getLegend().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLegend_Visibility()
  {
        return (EReference)getLegend().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXAxe()
  {
    if (xAxeEClass == null)
    {
      xAxeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(34);
    }
    return xAxeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXAxe_Value()
  {
        return (EReference)getXAxe().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getYAxe()
  {
    if (yAxeEClass == null)
    {
      yAxeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(35);
    }
    return yAxeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getYAxe_Value()
  {
        return (EReference)getYAxe().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAxe()
  {
    if (axeEClass == null)
    {
      axeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(36);
    }
    return axeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAxe_Type()
  {
        return (EAttribute)getAxe().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAxe_Data()
  {
        return (EReference)getAxe().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAxe_Groupingby()
  {
        return (EReference)getAxe().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAxe_Title()
  {
        return (EReference)getAxe().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAxe_Line()
  {
        return (EReference)getAxe().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAxe_Majorgrid()
  {
        return (EReference)getAxe().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAxe_Minorgrid()
  {
        return (EReference)getAxe().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLine()
  {
    if (lineEClass == null)
    {
      lineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(37);
    }
    return lineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLine_Value()
  {
        return (EReference)getLine().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChartGrid()
  {
    if (chartGridEClass == null)
    {
      chartGridEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(38);
    }
    return chartGridEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChartGrid_Scale()
  {
        return (EAttribute)getChartGrid().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChartGrid_Value()
  {
        return (EReference)getChartGrid().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChartGrid_Tick()
  {
        return (EReference)getChartGrid().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTick()
  {
    if (tickEClass == null)
    {
      tickEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(39);
    }
    return tickEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTick_Place()
  {
        return (EAttribute)getTick().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTick_Value()
  {
        return (EReference)getTick().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorPalette()
  {
    if (colorPaletteEClass == null)
    {
      colorPaletteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(40);
    }
    return colorPaletteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorPalette_Name()
  {
        return (EAttribute)getColorPalette().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColorPalette_Value()
  {
        return (EReference)getColorPalette().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColorPalette_Linkto()
  {
        return (EReference)getColorPalette().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlace()
  {
    if (placeEClass == null)
    {
      placeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(41);
    }
    return placeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlace_Position()
  {
        return (EAttribute)getPlace().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlace_Anchor()
  {
        return (EAttribute)getPlace().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTitle()
  {
    if (titleEClass == null)
    {
      titleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(42);
    }
    return titleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTitle_Value()
  {
        return (EAttribute)getTitle().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTitle_Place()
  {
        return (EAttribute)getTitle().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTitle_Properties()
  {
        return (EReference)getTitle().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChartElementProperties()
  {
    if (chartElementPropertiesEClass == null)
    {
      chartElementPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(43);
    }
    return chartElementPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChartElementProperties_Padding()
  {
        return (EReference)getChartElementProperties().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChartElementProperties_Border()
  {
        return (EReference)getChartElementProperties().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChartElementProperties_Visibility()
  {
        return (EReference)getChartElementProperties().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChartElementProperties_Font()
  {
        return (EReference)getChartElementProperties().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChartElementProperties_FontSize()
  {
        return (EReference)getChartElementProperties().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChartElementProperties_Color()
  {
        return (EReference)getChartElementProperties().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChartElementProperties_BackgroundColor()
  {
        return (EReference)getChartElementProperties().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChartElementProperties_TextStyle()
  {
        return (EReference)getChartElementProperties().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChartElementProperties_HAlign()
  {
        return (EReference)getChartElementProperties().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChartElementProperties_VAlign()
  {
        return (EReference)getChartElementProperties().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChartElementProperties_WhiteSpace()
  {
        return (EReference)getChartElementProperties().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChartElementProperties_Style()
  {
        return (EReference)getChartElementProperties().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChartElementProperties_Display()
  {
        return (EReference)getChartElementProperties().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getList()
  {
    if (listEClass == null)
    {
      listEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(48);
    }
    return listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getList_Name()
  {
        return (EAttribute)getList().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getList_Properties()
  {
        return (EReference)getList().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getList_Headerelements()
  {
        return (EReference)getList().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getList_Detailelements()
  {
        return (EReference)getList().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getList_Footerelements()
  {
        return (EReference)getList().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGrid()
  {
    if (gridEClass == null)
    {
      gridEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(49);
    }
    return gridEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGrid_Name()
  {
        return (EAttribute)getGrid().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGrid_Properties()
  {
        return (EReference)getGrid().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGrid_Columns()
  {
        return (EReference)getGrid().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGrid_Rows()
  {
        return (EReference)getGrid().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTable()
  {
    if (tableEClass == null)
    {
      tableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(50);
    }
    return tableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTable_Name()
  {
        return (EAttribute)getTable().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTable_Properties()
  {
        return (EReference)getTable().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTable_Dataset()
  {
        return (EReference)getTable().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTable_Columns()
  {
        return (EReference)getTable().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTable_Headerrows()
  {
        return (EReference)getTable().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTable_Detailrows()
  {
        return (EReference)getTable().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTable_Footerrows()
  {
        return (EReference)getTable().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCrossTable()
  {
    if (crossTableEClass == null)
    {
      crossTableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(51);
    }
    return crossTableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCrossTable_Name()
  {
        return (EAttribute)getCrossTable().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCrossTable_Properties()
  {
        return (EReference)getCrossTable().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumn()
  {
    if (columnEClass == null)
    {
      columnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(52);
    }
    return columnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumn_Order()
  {
        return (EAttribute)getColumn().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumn_Properties()
  {
        return (EReference)getColumn().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRow()
  {
    if (rowEClass == null)
    {
      rowEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(53);
    }
    return rowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRow_Order()
  {
        return (EAttribute)getRow().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRow_Properties()
  {
        return (EReference)getRow().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRow_Cells()
  {
        return (EReference)getRow().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCell()
  {
    if (cellEClass == null)
    {
      cellEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(54);
    }
    return cellEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCell_Order()
  {
        return (EAttribute)getCell().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCell_Properties()
  {
        return (EReference)getCell().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCell_Elements()
  {
        return (EReference)getCell().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPageProperties()
  {
    if (pagePropertiesEClass == null)
    {
      pagePropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(55);
    }
    return pagePropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageProperties_Font()
  {
        return (EReference)getPageProperties().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageProperties_FontSize()
  {
        return (EReference)getPageProperties().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageProperties_Color()
  {
        return (EReference)getPageProperties().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageProperties_BackgroundColor()
  {
        return (EReference)getPageProperties().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageProperties_TextStyle()
  {
        return (EReference)getPageProperties().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageProperties_HAlign()
  {
        return (EReference)getPageProperties().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageProperties_VAlign()
  {
        return (EReference)getPageProperties().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageProperties_WhiteSpace()
  {
        return (EReference)getPageProperties().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageProperties_Style()
  {
        return (EReference)getPageProperties().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageProperties_Display()
  {
        return (EReference)getPageProperties().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageProperties_Border()
  {
        return (EReference)getPageProperties().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageProperties_Padding()
  {
        return (EReference)getPageProperties().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageProperties_Margin()
  {
        return (EReference)getPageProperties().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageProperties_Visibility()
  {
        return (EReference)getPageProperties().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageProperties_Pagebreak()
  {
        return (EReference)getPageProperties().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageProperties_Toc()
  {
        return (EReference)getPageProperties().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageProperties_Bookmark()
  {
        return (EReference)getPageProperties().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageProperties_Width()
  {
        return (EReference)getPageProperties().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageProperties_Height()
  {
        return (EReference)getPageProperties().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabelProperties()
  {
    if (labelPropertiesEClass == null)
    {
      labelPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(56);
    }
    return labelPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelProperties_Font()
  {
        return (EReference)getLabelProperties().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelProperties_FontSize()
  {
        return (EReference)getLabelProperties().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelProperties_Color()
  {
        return (EReference)getLabelProperties().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelProperties_BackgroundColor()
  {
        return (EReference)getLabelProperties().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelProperties_TextStyle()
  {
        return (EReference)getLabelProperties().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelProperties_HAlign()
  {
        return (EReference)getLabelProperties().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelProperties_VAlign()
  {
        return (EReference)getLabelProperties().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelProperties_WhiteSpace()
  {
        return (EReference)getLabelProperties().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelProperties_Style()
  {
        return (EReference)getLabelProperties().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelProperties_Display()
  {
        return (EReference)getLabelProperties().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelProperties_Border()
  {
        return (EReference)getLabelProperties().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelProperties_Padding()
  {
        return (EReference)getLabelProperties().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelProperties_Margin()
  {
        return (EReference)getLabelProperties().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelProperties_Visibility()
  {
        return (EReference)getLabelProperties().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelProperties_Pagebreak()
  {
        return (EReference)getLabelProperties().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelProperties_Toc()
  {
        return (EReference)getLabelProperties().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelProperties_Bookmark()
  {
        return (EReference)getLabelProperties().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelProperties_Width()
  {
        return (EReference)getLabelProperties().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelProperties_Height()
  {
        return (EReference)getLabelProperties().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelProperties_Alttext()
  {
        return (EReference)getLabelProperties().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFont()
  {
    if (fontEClass == null)
    {
      fontEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(57);
    }
    return fontEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFont_Name()
  {
        return (EAttribute)getFont().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFont_Value()
  {
        return (EAttribute)getFont().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFont_Linkto()
  {
        return (EReference)getFont().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFontSize()
  {
    if (fontSizeEClass == null)
    {
      fontSizeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(58);
    }
    return fontSizeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFontSize_Name()
  {
        return (EAttribute)getFontSize().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFontSize_Value()
  {
        return (EReference)getFontSize().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFontSize_Linkto()
  {
        return (EReference)getFontSize().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSizeValueUnit()
  {
    if (sizeValueUnitEClass == null)
    {
      sizeValueUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(59);
    }
    return sizeValueUnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSizeValueUnit_Value()
  {
        return (EAttribute)getSizeValueUnit().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSizeValue()
  {
    if (sizeValueEClass == null)
    {
      sizeValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(60);
    }
    return sizeValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSizeValue_Value()
  {
        return (EAttribute)getSizeValue().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSizeValue_Unit()
  {
        return (EAttribute)getSizeValue().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSizeValuePercent()
  {
    if (sizeValuePercentEClass == null)
    {
      sizeValuePercentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(61);
    }
    return sizeValuePercentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSizeValuePercent_Value()
  {
        return (EAttribute)getSizeValuePercent().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColor()
  {
    if (colorEClass == null)
    {
      colorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(62);
    }
    return colorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringColor()
  {
    if (stringColorEClass == null)
    {
      stringColorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(63);
    }
    return stringColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringColor_Value()
  {
        return (EAttribute)getStringColor().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHexColor()
  {
    if (hexColorEClass == null)
    {
      hexColorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(64);
    }
    return hexColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHexColor_Value()
  {
        return (EAttribute)getHexColor().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRgbColor()
  {
    if (rgbColorEClass == null)
    {
      rgbColorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(65);
    }
    return rgbColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRgbColor_R()
  {
        return (EAttribute)getRgbColor().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRgbColor_G()
  {
        return (EAttribute)getRgbColor().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRgbColor_B()
  {
        return (EAttribute)getRgbColor().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextStyle()
  {
    if (textStyleEClass == null)
    {
      textStyleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(66);
    }
    return textStyleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextStyle_Name()
  {
        return (EAttribute)getTextStyle().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextStyle_I()
  {
        return (EAttribute)getTextStyle().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextStyle_B()
  {
        return (EAttribute)getTextStyle().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextStyle_U()
  {
        return (EAttribute)getTextStyle().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextStyle_T()
  {
        return (EAttribute)getTextStyle().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHAlignment()
  {
    if (hAlignmentEClass == null)
    {
      hAlignmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(67);
    }
    return hAlignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHAlignment_Name()
  {
        return (EAttribute)getHAlignment().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHAlignment_Value()
  {
        return (EAttribute)getHAlignment().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHAlignment_Linkto()
  {
        return (EReference)getHAlignment().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVAlignment()
  {
    if (vAlignmentEClass == null)
    {
      vAlignmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(68);
    }
    return vAlignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVAlignment_Name()
  {
        return (EAttribute)getVAlignment().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVAlignment_Value()
  {
        return (EAttribute)getVAlignment().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVAlignment_Linkto()
  {
        return (EReference)getVAlignment().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhitespace()
  {
    if (whitespaceEClass == null)
    {
      whitespaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(69);
    }
    return whitespaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWhitespace_Name()
  {
        return (EAttribute)getWhitespace().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWhitespace_Value()
  {
        return (EAttribute)getWhitespace().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhitespace_Linkto()
  {
        return (EReference)getWhitespace().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisplay()
  {
    if (displayEClass == null)
    {
      displayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(70);
    }
    return displayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDisplay_Name()
  {
        return (EAttribute)getDisplay().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDisplay_Value()
  {
        return (EAttribute)getDisplay().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisplay_Linkto()
  {
        return (EReference)getDisplay().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBorder()
  {
    if (borderEClass == null)
    {
      borderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(71);
    }
    return borderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBorder_Name()
  {
        return (EAttribute)getBorder().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBorder_Value()
  {
        return (EReference)getBorder().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBorder_Linkto()
  {
        return (EReference)getBorder().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBorderAll()
  {
    if (borderAllEClass == null)
    {
      borderAllEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(72);
    }
    return borderAllEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBorderSide()
  {
    if (borderSideEClass == null)
    {
      borderSideEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(73);
    }
    return borderSideEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBorderSide_Right()
  {
        return (EReference)getBorderSide().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBorderSide_Left()
  {
        return (EReference)getBorderSide().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBorderSide_Top()
  {
        return (EReference)getBorderSide().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBorderSide_Bottom()
  {
        return (EReference)getBorderSide().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBorderLine()
  {
    if (borderLineEClass == null)
    {
      borderLineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(74);
    }
    return borderLineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBorderLine_Style()
  {
        return (EAttribute)getBorderLine().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBorderLine_Width()
  {
        return (EReference)getBorderLine().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBorderLine_Color()
  {
        return (EReference)getBorderLine().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBorderWidth()
  {
    if (borderWidthEClass == null)
    {
      borderWidthEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(75);
    }
    return borderWidthEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBorderWidth_Value()
  {
        return (EReference)getBorderWidth().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWidthTypeValue()
  {
    if (widthTypeValueEClass == null)
    {
      widthTypeValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(76);
    }
    return widthTypeValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWidthTypeValue_Value()
  {
        return (EAttribute)getWidthTypeValue().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPadding()
  {
    if (paddingEClass == null)
    {
      paddingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(77);
    }
    return paddingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndentAll()
  {
    if (indentAllEClass == null)
    {
      indentAllEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(78);
    }
    return indentAllEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndentSide()
  {
    if (indentSideEClass == null)
    {
      indentSideEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(79);
    }
    return indentSideEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndentSide_Right()
  {
        return (EReference)getIndentSide().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndentSide_Left()
  {
        return (EReference)getIndentSide().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndentSide_Top()
  {
        return (EReference)getIndentSide().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndentSide_Bottom()
  {
        return (EReference)getIndentSide().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndentValue()
  {
    if (indentValueEClass == null)
    {
      indentValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(80);
    }
    return indentValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndentValue_Value()
  {
        return (EReference)getIndentValue().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPageBreak()
  {
    if (pageBreakEClass == null)
    {
      pageBreakEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(81);
    }
    return pageBreakEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPageBreak_Before()
  {
        return (EAttribute)getPageBreak().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPageBreak_After()
  {
        return (EAttribute)getPageBreak().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPageBreak_Inside()
  {
        return (EAttribute)getPageBreak().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageBreak_Interval()
  {
        return (EReference)getPageBreak().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPageBreak_Repeat()
  {
        return (EReference)getPageBreak().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVisibility()
  {
    if (visibilityEClass == null)
    {
      visibilityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(82);
    }
    return visibilityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVisibility_Show()
  {
        return (EAttribute)getVisibility().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLegendVisibility()
  {
    if (legendVisibilityEClass == null)
    {
      legendVisibilityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(83);
    }
    return legendVisibilityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLegendVisibility_Value()
  {
        return (EAttribute)getLegendVisibility().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHideAll()
  {
    if (hideAllEClass == null)
    {
      hideAllEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(84);
    }
    return hideAllEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHideAll_Expression()
  {
        return (EReference)getHideAll().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHideAll_Format()
  {
        return (EAttribute)getHideAll().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHideForOne()
  {
    if (hideForOneEClass == null)
    {
      hideForOneEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(85);
    }
    return hideForOneEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHideForOne_Value()
  {
        return (EReference)getHideForOne().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHideForMore()
  {
    if (hideForMoreEClass == null)
    {
      hideForMoreEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(86);
    }
    return hideForMoreEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHideForMore_Format()
  {
        return (EAttribute)getHideForMore().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHideForMore_Expression()
  {
        return (EReference)getHideForMore().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJSExpression()
  {
    if (jsExpressionEClass == null)
    {
      jsExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(87);
    }
    return jsExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJSExpression_Value()
  {
        return (EReference)getJSExpression().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getToc()
  {
    if (tocEClass == null)
    {
      tocEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(88);
    }
    return tocEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getToc_Style()
  {
        return (EReference)getToc().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getToc_Value()
  {
        return (EReference)getToc().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBookmark()
  {
    if (bookmarkEClass == null)
    {
      bookmarkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(89);
    }
    return bookmarkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBookmark_Expression()
  {
        return (EReference)getBookmark().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStyleRef()
  {
    if (styleRefEClass == null)
    {
      styleRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(90);
    }
    return styleRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStyleRef_Refname()
  {
        return (EReference)getStyleRef().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStyle()
  {
    if (styleEClass == null)
    {
      styleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(91);
    }
    return styleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStyle_Name()
  {
        return (EAttribute)getStyle().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStyle_Properties()
  {
        return (EReference)getStyle().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWidth()
  {
    if (widthEClass == null)
    {
      widthEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(92);
    }
    return widthEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWidth_Value()
  {
        return (EReference)getWidth().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeight()
  {
    if (heightEClass == null)
    {
      heightEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(93);
    }
    return heightEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHeight_Value()
  {
        return (EReference)getHeight().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAltText()
  {
    if (altTextEClass == null)
    {
      altTextEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(94);
    }
    return altTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAltText_Expression()
  {
        return (EReference)getAltText().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteral()
  {
    if (literalEClass == null)
    {
      literalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(117);
    }
    return literalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntLiteral()
  {
    if (intLiteralEClass == null)
    {
      intLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(118);
    }
    return intLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntLiteral_Value()
  {
        return (EAttribute)getIntLiteral().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFloatLiteral()
  {
    if (floatLiteralEClass == null)
    {
      floatLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(119);
    }
    return floatLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFloatLiteral_Value()
  {
        return (EAttribute)getFloatLiteral().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringLiteral()
  {
    if (stringLiteralEClass == null)
    {
      stringLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(120);
    }
    return stringLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringLiteral_Value()
  {
        return (EAttribute)getStringLiteral().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanLiteral()
  {
    if (booleanLiteralEClass == null)
    {
      booleanLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(121);
    }
    return booleanLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanLiteral_Value()
  {
        return (EAttribute)getBooleanLiteral().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNullLiteral()
  {
    if (nullLiteralEClass == null)
    {
      nullLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(122);
    }
    return nullLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getID()
  {
    if (idEClass == null)
    {
      idEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(123);
    }
    return idEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getID_Value()
  {
        return (EReference)getID().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSTRING()
  {
    if (stringEEnum == null)
    {
      stringEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(44);
    }
    return stringEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getChartSubType()
  {
    if (chartSubTypeEEnum == null)
    {
      chartSubTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(45);
    }
    return chartSubTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPositionType()
  {
    if (positionTypeEEnum == null)
    {
      positionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(46);
    }
    return positionTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOrientationType()
  {
    if (orientationTypeEEnum == null)
    {
      orientationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(47);
    }
    return orientationTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSizeUnit()
  {
    if (sizeUnitEEnum == null)
    {
      sizeUnitEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(95);
    }
    return sizeUnitEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLengthUnit()
  {
    if (lengthUnitEEnum == null)
    {
      lengthUnitEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(96);
    }
    return lengthUnitEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getHalignmentType()
  {
    if (halignmentTypeEEnum == null)
    {
      halignmentTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(97);
    }
    return halignmentTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getValignmentType()
  {
    if (valignmentTypeEEnum == null)
    {
      valignmentTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(98);
    }
    return valignmentTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getWhitespaceType()
  {
    if (whitespaceTypeEEnum == null)
    {
      whitespaceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(99);
    }
    return whitespaceTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDisplayType()
  {
    if (displayTypeEEnum == null)
    {
      displayTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(100);
    }
    return displayTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBorderLineStyleType()
  {
    if (borderLineStyleTypeEEnum == null)
    {
      borderLineStyleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(101);
    }
    return borderLineStyleTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getWidthType()
  {
    if (widthTypeEEnum == null)
    {
      widthTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(102);
    }
    return widthTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOutputFormatType()
  {
    if (outputFormatTypeEEnum == null)
    {
      outputFormatTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(103);
    }
    return outputFormatTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPageBreakType()
  {
    if (pageBreakTypeEEnum == null)
    {
      pageBreakTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(104);
    }
    return pageBreakTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPageBreakValue()
  {
    if (pageBreakValueEEnum == null)
    {
      pageBreakValueEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(105);
    }
    return pageBreakValueEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSortType()
  {
    if (sortTypeEEnum == null)
    {
      sortTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(106);
    }
    return sortTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBorderType()
  {
    if (borderTypeEEnum == null)
    {
      borderTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(107);
    }
    return borderTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTargetType()
  {
    if (targetTypeEEnum == null)
    {
      targetTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(108);
    }
    return targetTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDrillThroughType()
  {
    if (drillThroughTypeEEnum == null)
    {
      drillThroughTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(109);
    }
    return drillThroughTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getColorType()
  {
    if (colorTypeEEnum == null)
    {
      colorTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(110);
    }
    return colorTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getParameterControlType()
  {
    if (parameterControlTypeEEnum == null)
    {
      parameterControlTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(111);
    }
    return parameterControlTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getParameterValueType()
  {
    if (parameterValueTypeEEnum == null)
    {
      parameterValueTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(112);
    }
    return parameterValueTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getParameterType()
  {
    if (parameterTypeEEnum == null)
    {
      parameterTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(113);
    }
    return parameterTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDataType()
  {
    if (dataTypeEEnum == null)
    {
      dataTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(114);
    }
    return dataTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getStaticParameterSort()
  {
    if (staticParameterSortEEnum == null)
    {
      staticParameterSortEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(115);
    }
    return staticParameterSortEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAggregatorFunction()
  {
    if (aggregatorFunctionEEnum == null)
    {
      aggregatorFunctionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(RDslPackage.eNS_URI).getEClassifiers().get(116);
    }
    return aggregatorFunctionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RDslFactory getRDslFactory()
  {
    return (RDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isLoaded = false;

  /**
   * Laods the package and any sub-packages from their serialized form.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void loadPackage()
  {
    if (isLoaded) return;
    isLoaded = true;

    URL url = getClass().getResource(packageFilename);
    if (url == null)
    {
      throw new RuntimeException("Missing serialized package: " + packageFilename);
    }
    URI uri = URI.createURI(url.toString());
    Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
    try
    {
      resource.load(null);
    }
    catch (IOException exception)
    {
      throw new WrappedException(exception);
    }
    initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
    createResource(eNS_URI);
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isFixed = false;

  /**
   * Fixes up the loaded package, to make it appear as if it had been programmatically built.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fixPackageContents()
  {
    if (isFixed) return;
    isFixed = true;
    fixEClassifiers();
  }

  /**
   * Sets the instance class on the given classifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void fixInstanceClass(EClassifier eClassifier)
  {
    if (eClassifier.getInstanceClassName() == null)
    {
      eClassifier.setInstanceClassName("org.xtext.example.mydsl.rDsl." + eClassifier.getName());
      setGeneratedClassName(eClassifier);
    }
  }

} //RDslPackageImpl
